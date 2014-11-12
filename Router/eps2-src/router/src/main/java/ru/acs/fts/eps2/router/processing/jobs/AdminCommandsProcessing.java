package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Ips_Tech;
import ru.acs.fts.eps2.model.entities.Edecl_Ipslist;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.Edecl_Udcustlist;
import ru.acs.fts.eps2.model.entities.Edmac_Organization;
import ru.acs.fts.eps2.model.entities.Edmac_Person;
import ru.acs.fts.eps2.model.services.ParticipantService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.AdminCommandsHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.admin.ipsdbupdate.IPSDBUpdateType;
import ru.acs.fts.schemas.admin.ipsdbupdate.IPSTechType;
import ru.acs.fts.schemas.admin.orgdbupdate.DocumentGroundConnectionType;
import ru.acs.fts.schemas.admin.orgdbupdate.OrgDBUpdateType;
import ru.acs.fts.schemas.admin.orgdbupdate.OrgInfoType;
import ru.acs.fts.schemas.admin.orgdbupdate.PersonInfoType;
import ru.acs.fts.schemas.admin.orgdbupdate.PtpcInfoType;
import ru.acs.fts.schemas.admin.udcustlistupdate.UDCustListUpdateType;
import ru.acs.fts.schemas.admin.updatedb_result.RowResultType;
import ru.acs.fts.schemas.admin.updatedb_result.UpdateDBResultType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminCommandsProcessing extends EDJob
{
	protected static final Logger log = LoggerFactory.getLogger( AdminCommandsProcessing.class );
	
	private static String resultCode = "00.00000.00";
	private static String resultDescription = "Обработка документа успешно завершена.";

	protected final String action = "Бизнес-обработка команды админа";	
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;
	
	private static Date minDate;

	private ParticipantService participantService;
	
	private CustomsOperator customsOperator;

	@Required
	public void setParticipantService( ParticipantService participantService ) { this.participantService = participantService; }
	public ParticipantService getParticipantService( ) { return participantService; }
	
	@Required
	public void setCustomsOperator( CustomsOperator operator ) { customsOperator = operator; }
	public CustomsOperator getCustomsOperator( ) { return customsOperator; }
	
	static
	{
		DateFormat df = new SimpleDateFormat( "yyyy-MM-dd" );
		try
		{
			minDate = df.parse( "0001-01-01" );
		}
		catch ( ParseException e )
		{
		}
	}

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String messageType = recvEnv.getMessageType( );
		BaseDocType incomeDocument = recvEnv.getDocument( ).getDocumentAsClass( BaseDocType.class );

		jobBatchContext.put(
			jobContext.getString( ContextConstants.NOTIFICIATION_MESSAGE ),
			AdminCommandsHelper.createUtilMessage(
				recvEnv, incomeDocument.getDocumentID( ),
				MessageType.ADM_00002, resultCode, resultDescription
			)
		);

		if ( messageType.equals( MessageType.ADM_10002 ) )
		{
			ProcessAdm10002( incomeDocument );

			jobBatchContext.put(
				jobContext.getString( ContextConstants.ENVELOPE_NAME ),
				create10002Response( recvEnv, incomeDocument ) 
			);
		}
		else if ( messageType.equals( MessageType.ADM_10003 ) )
		{
			ProcessAdm10003( incomeDocument, jobBatchContext );
					
			jobBatchContext.put(
				jobContext.getString( ContextConstants.ENVELOPE_NAME ),
				create10003Response( recvEnv, incomeDocument ) 
			);
		}
		else if ( messageType.endsWith( MessageType.ADM_10004 ) )
		{
			ProcessAdm10004( incomeDocument, jobBatchContext );

			jobBatchContext.put(
				jobContext.getString( ContextConstants.ENVELOPE_NAME ),
				create10004Response( recvEnv, incomeDocument ) 
			);
		}
		else
		{
			log.error( String.format( "Неизвестный тип команды %s", messageType ) );
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private EDEnvelope create10002Response( EDEnvelope recvEnv, BaseDocType recvDoc ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		OrgDBUpdateType epsDbUpdate = ( OrgDBUpdateType )recvDoc;
		
		UpdateDBResultType result = new UpdateDBResultType( );
		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( epsDbUpdate.getDocumentID( ) );
		result.setDocumentModeID( DocumentModeIDs.UPDATE_DB_RESULT );
		result.setResultCode( resultCode );
		
		List< String > resultDescriptions = new ArrayList< String >( );
		resultDescriptions.add( resultDescription );
		result.setResultDescriptionList( resultDescriptions );

		OrgInfoType infoOrg = epsDbUpdate.getOrgInfo( );
		
		RowResultType resultItem = new RowResultType( );
		resultItem.setInfoCode( "ORGANIZATION" );
		resultItem.setRowID( infoOrg.getOrganizationID( ) );
		resultItem.setResultCode( resultCode );
		
		resultDescriptions = new ArrayList< String >( );
		resultDescriptions.add( resultDescription );
		resultItem.setResultDescriptionList( resultDescriptions );

		List< RowResultType > rowResults = new ArrayList< RowResultType >( );
		rowResults.add( resultItem );
		result.setRowResultList( rowResults );
		
		log.info( String.format(
			"В сообщение ADM.00002 добавлен отчет для организации с ID = %s",
			infoOrg.getOrganizationID( ) 
		) );
		
		if ( infoOrg.getParticipantInfoList( ) != null )
		{
			for ( PtpcInfoType participantInfo : infoOrg.getParticipantInfoList( ) )
			{
				resultItem = new RowResultType( );
				resultItem.setInfoCode( "PARTICIPANT" );
				resultItem.setRowID( participantInfo.getParticipantID( ) );
				resultItem.setResultCode( resultCode );
				
				resultDescriptions = new ArrayList< String >( );
				resultDescriptions.add( resultDescription );
				resultItem.setResultDescriptionList( resultDescriptions );

				rowResults.add( resultItem );
				
				log.info( String.format( 
					"В сообщение ADM.00002 добавлен отчет для участника с ID = %s",
					participantInfo.getParticipantID( ) 
				) );
			}
		}
		
		if ( infoOrg.getPersonInfoList( ) != null )
		{
			for ( PersonInfoType personInfoType : infoOrg.getPersonInfoList( ) )
			{
				resultItem = new RowResultType( );
				resultItem.setInfoCode( "PERSON" );
				resultItem.setRowID( personInfoType.getPersonID( ) );
				resultItem.setResultCode( resultCode );
				
				resultDescriptions = new ArrayList< String >( );
				resultDescriptions.add( resultDescription );
				resultItem.setResultDescriptionList( resultDescriptions );

				rowResults.add( resultItem );
				
				log.info( String.format(
					"В сообщение ADM.00002 добавлен отчет для персоны с ID = %s",
					personInfoType.getPersonID( ) 
				) );
			}
		}
		
		return AdminCommandsHelper
			.createEnvelopeToAdmin( MessageType.ADM_00004, recvEnv, result ); 
	}

	private EDEnvelope create10003Response( EDEnvelope recvEnv, BaseDocType recvDoc ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		IPSDBUpdateType epsDbUpdate = ( IPSDBUpdateType )recvDoc;
		
		UpdateDBResultType result = new UpdateDBResultType( );
		
		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( epsDbUpdate.getDocumentID( ) );
		result.setResultCode( resultCode );
		result.setDocumentModeID( DocumentModeIDs.UPDATE_DB_RESULT );
		
		List< String > resultDescriptions = new ArrayList< String >( );
		resultDescriptions.add( resultDescription );
		result.setResultDescriptionList( resultDescriptions );
		
		List< RowResultType > rowResults = new ArrayList< RowResultType >( );
		result.setRowResultList( rowResults );
		
		if ( epsDbUpdate.getIPSInfo( ).getIPSTechInfoList( ) != null )
		{
			for ( IPSTechType ipsTech : epsDbUpdate.getIPSInfo( ).getIPSTechInfoList( ) )
			{
				RowResultType resultItem = new RowResultType( );
				
				resultItem.setInfoCode( "IPS_TECH" );
				resultItem.setRowID( ipsTech.getRecordID( ) );
				resultItem.setResultCode( resultCode );
				
				resultDescriptions = new ArrayList< String >( );
				resultDescriptions.add( resultDescription );
				resultItem.setResultDescriptionList( resultDescriptions );
				
				rowResults.add( resultItem );
			}
		}
		
		return AdminCommandsHelper
			.createEnvelopeToAdmin( MessageType.ADM_00004, recvEnv, result );
	}

	private EDEnvelope create10004Response( EDEnvelope recvEnv, BaseDocType recvDoc ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		UDCustListUpdateType epsDbUpdate = ( UDCustListUpdateType )recvDoc;
		
		UpdateDBResultType result = new UpdateDBResultType( );
		
		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( epsDbUpdate.getDocumentID( ) );
		result.setResultCode( resultCode );
		result.setDocumentModeID( DocumentModeIDs.UPDATE_DB_RESULT );
		
		List< String > resultDescriptions = new ArrayList< String >( );
		resultDescriptions.add( resultDescription );
		result.setResultDescriptionList( resultDescriptions );
		
		RowResultType resultItem = new RowResultType( );
		
		resultItem.setInfoCode( "UDCUSTLIST" );
		resultItem.setRowID( epsDbUpdate.getRecID( ) );
		resultItem.setResultCode( resultCode );
		
		resultDescriptions = new ArrayList< String >( );
		resultDescriptions.add( resultDescription );
		resultItem.setResultDescriptionList( resultDescriptions );
		
		List< RowResultType > rowResults = new ArrayList< RowResultType >( );
		rowResults.add( resultItem );
		result.setRowResultList( rowResults );
		
		return AdminCommandsHelper
			.createEnvelopeToAdmin( MessageType.ADM_00004, recvEnv, result );
	}

	private void ProcessAdm10004( BaseDocType recvDoc, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		UDCustListUpdateType epsDbUpdate = ( UDCustListUpdateType )recvDoc;
		
		Edecl_Udcustlist udcustlist = new Edecl_Udcustlist( );
		
		udcustlist.setId( epsDbUpdate.getRecID( ) );
		
		if ( epsDbUpdate.getEndDate( ) != null )
			udcustlist.setEndDate( epsDbUpdate.getEndDate( ).toDate( ) );
		
		if ( epsDbUpdate.getStartDate( ) != null )
			udcustlist.setStartDate( epsDbUpdate.getStartDate( ).toDate( ) );
		
		if ( epsDbUpdate.getCustomsIn( ) != null )
		{
			udcustlist.setIntCustCode( epsDbUpdate.getCustomsIn( ).getCode( ) );
			udcustlist.setIntCustName( epsDbUpdate.getCustomsIn( ).getOfficeName( ) );
		}
		
		if ( epsDbUpdate.getCustomsOut( ) != null )
		{
			udcustlist.setExtCustCode( epsDbUpdate.getCustomsOut( ).getCode( ) );
			udcustlist.setExtCustName( epsDbUpdate.getCustomsOut( ).getOfficeName( ) );
		}
		
		if ( epsDbUpdate.getDocumentGroundConnect( ) != null )
		{
			udcustlist.setAccInfoConnect( epsDbUpdate.getDocumentGroundConnect( ).getDocumentNumber( ) );
			udcustlist.setCodeDocumentConnect( epsDbUpdate.getDocumentGroundConnect( ).getDocumentCode( ) );
			
			if ( epsDbUpdate.getDocumentGroundConnect( ).getDocumentDate( ) != null )
			{
				udcustlist.setContractDateConnect( 
					epsDbUpdate.getDocumentGroundConnect( ).getDocumentDate( ).toDate( )
				);
			}
		}
		
		if ( epsDbUpdate.getDocumentGroundDisconnect( ) != null )
		{
			udcustlist.setAccInfoConnect( 
				epsDbUpdate.getDocumentGroundDisconnect( ).getDocumentNumber( ) 
			);
			
			udcustlist.setCodeDocumentConnect( 
				epsDbUpdate.getDocumentGroundDisconnect( ).getDocumentCode( ) 
			);
			
			if ( epsDbUpdate.getDocumentGroundDisconnect( ).getDocumentDate( ) != null )
			{
				udcustlist.setContractDateDisconnect( 
					epsDbUpdate.getDocumentGroundConnect( ).getDocumentDate( ).toDate( )
				);
			}
		}
		
		if ( null != epsDbUpdate.getCommentList( ) )
		{
			StringBuilder stringBuilder = new StringBuilder( );
			for ( String comment : epsDbUpdate.getCommentList( ) )
			{
				if ( comment.equals( "" ) )
					break;
				
				stringBuilder.append( comment ).append( " " );
			}
		
			udcustlist.setComments( stringBuilder.toString( ) );
		}
		
		jobBatchContext.getServiceHolder( ).getUdCustListService( ).merge( udcustlist );
	}

	private void ProcessAdm10003( BaseDocType recvDoc, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		IPSDBUpdateType epsDbUpdate = ( IPSDBUpdateType )recvDoc;
		
		if ( epsDbUpdate.getIPSInfo( ) == null )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00071_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Ipslist ipslist = new Edecl_Ipslist( );
		ipslist.setComments( epsDbUpdate.getIPSInfo( ).getComments( ) );
		
		if ( epsDbUpdate.getIPSInfo( ).getCreateDate( ) != null )
		{
			ipslist.setCreateDate( epsDbUpdate.getIPSInfo( ).getCreateDate( ).toDate( ) );
		}
		
		ipslist.setDescription( epsDbUpdate.getIPSInfo( ).getIPSDescription( ) );
		ipslist.setId( epsDbUpdate.getIPSInfo( ).getIPSID( ) );
		ipslist.setWriteOrg( epsDbUpdate.getIPSInfo( ).getIPSProgrammerOrg( ) );
		
		jobBatchContext.getServiceHolder( ).getIpslistService( ).merge( ipslist );
		
		for ( IPSTechType ipsTechType : epsDbUpdate.getIPSInfo( ).getIPSTechInfoList( ) )
		{			
			Edecl_Ips_Tech ipsTech = new Edecl_Ips_Tech( );
			
			if ( ipsTechType.getCreateDate( ) != null )
				ipsTech.setCreateDate( ipsTechType.getCreateDate( ).toDate( ) );
			
			if ( ipsTechType.getChDateTime( ) != null )
				ipsTech.setChangeDateTime( ipsTechType.getChDateTime( ).toDate( ) );
			
			ipsTech.setComments( ipsTechType.getComments( ) );
			
			if ( ipsTechType.getCloseFlag( ) != null )
				ipsTech.setCloseFlag( ipsTechType.getCloseFlag( ).intValue( ) );
			
			if ( ipsTechType.getEndDate( ) != null )
				ipsTech.setEndDate( ipsTechType.getEndDate( ).toDate( ) );
			
			if ( ipsTechType.getIPSCertDate( ) != null )
				ipsTech.setCertDate( ipsTechType.getIPSCertDate( ).toDate( ) );
			
			ipsTech.setCertNum( ipsTechType.getIPSCertNumber( ) );
			ipsTech.setRecordId( ipsTechType.getRecordID( ) );
			
			if ( ipsTechType.getStartDate( ) != null )
				ipsTech.setBeginDate( ipsTechType.getStartDate( ).toDate( ) );
			
			ipsTech.setTchListId( ipsTechType.getTechID( ) );
			ipsTech.setIpsId( ipslist.getId( ) );
			
			jobBatchContext.getServiceHolder( ).getIpstechService( ).merge( ipsTech );
		}
	}

	private void ProcessAdm10002( BaseDocType recvDoc ) 
		throws Exception
	{
		OrgDBUpdateType epsDbUpdate = ( OrgDBUpdateType )recvDoc;
		OrgInfoType infoOrg = epsDbUpdate.getOrgInfo( );
		
		Edmac_Organization org = participantService.getOrganization( infoOrg.getOrganizationID( ) );
		
		log.debug( String.format(
			"Сохранены изменения для организации с ID = %s",
			infoOrg.getOrganizationID( ) 
		) );
		
		if ( org == null )
			org = new Edmac_Organization( );
		
		fillOrganization( infoOrg, org );
		
		participantService.merge( org );

		if ( infoOrg.getParticipantInfoList( ) != null )
		{
			log.debug( String.format(
				"Количество участников для сохранения = %d",
				infoOrg.getParticipantInfoList( ).size( ) 
			) );
			
			for ( PtpcInfoType ptpcInfoType : infoOrg.getParticipantInfoList( ) )
			{
				Edecl_Participant participant = participantService.getParticipant( 
					ptpcInfoType.getParticipantID( ) 
				); 
				
				if ( participant == null )
				{
					participant = new Edecl_Participant( );
					
					log.debug( String.format(
						"Участник с ID = %s не найден в БД и будет создан новый",
						ptpcInfoType.getParticipantID( )
					) );
				}
				
				fillParticipant( ptpcInfoType, participant, org.getOrgId( ) );
				
				participantService.merge( participant );
				
				log.debug( String.format(
					"Сохранены изменения для участника с ID = %s",
					ptpcInfoType.getParticipantID( ) 
				) );
			}
		}
		else
		{
			log.debug( "В документе ADM.10002 не задано ни одного участника ВЭД" );
		}
		
		if ( infoOrg.getPersonInfoList( ) != null )
		{
			log.debug( String.format(
				"Количество персон для сохранения = %d",
				infoOrg.getPersonInfoList( ).size( ) 
			) );
			
			for ( PersonInfoType personInfoType : infoOrg.getPersonInfoList( ) )
			{
				Edmac_Person person = participantService.getPerson( personInfoType.getPersonID( ) ); 
				
				if ( person == null )
				{
					person = new Edmac_Person( );
					
					log.debug( String.format(
						"Участник с ID = %s не найден в БД и будет создан новый",
						personInfoType.getPersonID( )
					) );
				}
				
				fillPerson( personInfoType, person, org.getOrgId( ) );
				
				participantService.merge( person );
				
				log.debug( String.format( 
					"Сохранены изменения для персоны с ID = %s",
					personInfoType.getPersonID( ) 
				) );
			}
		}
		else
		{
			log.debug( "В документе ADM.10002 не задано ни одной персоны ВЭД" );
		}
	}

	private void fillParticipant( PtpcInfoType ptpcInfo, Edecl_Participant participant, String orgId )
	{
		participant.setParticipantId( ptpcInfo.getParticipantID( ) );
		participant.setName( ptpcInfo.getPTPCName( ) );
		
		participant.setAccessMode( 
			( ptpcInfo.getAccessModeFlag( ) == null ) ? null : ptpcInfo.getAccessModeFlag( ).toString( ) );
		
		participant.setFullStateAccessMode( ptpcInfo.getFullStateAccessFlag( ) );
		participant.setTransportAddress( ptpcInfo.getTransportAddress( ) );
		participant.setTransferType( ptpcInfo.getTransferType( ) );
		participant.setOrgId( orgId );
		
		if ( ptpcInfo.getEndDate( ) != null )
		{
			Date endDate = ptpcInfo.getEndDate( ).toDate( );
			if ( ! endDate.equals( minDate ) )
			{
				participant.setEndDate( endDate );
			}
		}
		else
		{
			participant.setEndDate( null );
		}
		
		participant.setStartDate( ptpcInfo.getStartDate( ).toDate( ) );
		participant.setIpSid( ptpcInfo.getIPSID( ) );
		
		if ( ptpcInfo.getChDateTime( ) != null )
		{
			Date changeDate = ptpcInfo.getChDateTime( ).toDate( );
			if ( ! changeDate.equals( minDate ) )
			{
				participant.setChangeDateTine( changeDate );
			}
		}
		
		participant.setInfBrokerId( ptpcInfo.getBrokerID( ) );
		participant.setAddress( ptpcInfo.getAddress( ) );
		
		if ( ptpcInfo.getGroundConnectionPtpc( ) != null )
		{
			participant.setAccInfo( ptpcInfo.getGroundConnectionPtpc( ).getDocumentNumber( ) );
			participant.setCodeDocument( ptpcInfo.getGroundConnectionPtpc( ).getDocumentCode( ) );
			
			if ( ptpcInfo.getGroundConnectionPtpc( ).getDocumentDate( ) != null )
			{
				Date contractDate = ptpcInfo.getGroundConnectionPtpc( ).getDocumentDate( ).toDate( );
				
				if ( ! contractDate.equals( minDate ) )
				{
					participant.setContractDate( contractDate );
				}
			}
		}
		
		participant.setChangeAccessReason( ptpcInfo.getGhangeAccessReason( ) );
	}

	private void fillPerson( PersonInfoType personInfo, Edmac_Person person, String orgId )
	{
		person.setPersonId( personInfo.getPersonID( ) );
		person.setOrgId( orgId );
		person.setLastName( personInfo.getPrsnLastName( ) );
		//person.setFirstName( personInfo.getPrsnSecondName( ) );
		person.setFirstName( personInfo.getPrsnName( ) );
		person.setContactPhone( personInfo.getContactPhone( ) );
		person.setEmail( personInfo.getEMAIL( ) );
		person.setComments( personInfo.getComments( ) );
		
		if ( personInfo.getChDateTime( ) != null )
		{
			Date changeDate = personInfo.getChDateTime( ).toDate( );
			
			if ( ! changeDate.equals( minDate ) )
			{
				person.setChangeDateTime( changeDate );
			}
		}
		
		person.setPersonClose( personInfo.getPersonCloseFlag( ).intValue( ) );
	}

	private void fillOrganization( OrgInfoType infoOrg, Edmac_Organization org )
	{
		org.setOrgName( infoOrg.getOrgName( ) );
		org.setOrgMail( infoOrg.getOrgMail( ) );
		org.setInn( infoOrg.getINN( ) );
		org.setOrgN( infoOrg.getOGRN( ) );
		org.setKpp( infoOrg.getKPP( ) );
		org.setComments( infoOrg.getComments( ) );
		
		if ( infoOrg.getChDateTime( ) != null )
		{
			Date changeDateTime = infoOrg.getChDateTime( ).toDate( );
			
			if ( ! changeDateTime.equals( minDate ) )
			{
				org.setChangeDatetime( changeDateTime );
			}
		}
		else
		{
			org.setChangeDatetime( null );
		}
		
		org.setInfBrokerFlag( infoOrg.getInfBrokerFlag( ).intValue( ) );
		
		DocumentGroundConnectionType documentGroundConnectionType = infoOrg.getGroundConnectionOrg( );
		
		if ( documentGroundConnectionType != null )
		{
			org.setAccInfo( documentGroundConnectionType.getDocumentNumber( ) );
			org.setCodeDocument( documentGroundConnectionType.getDocumentCode( ) );
			
			if ( documentGroundConnectionType.getDocumentDate( ) != null )
			{
				Date documentDate = documentGroundConnectionType.getDocumentDate( ).toDate( );
				
				if ( ! documentDate.equals( minDate ) )
				{
					org.setContractDate( documentDate );
				}
			}
			else
			{
				org.setContractDate( null );
			}
		}
		
		org.setOrgId( infoOrg.getOrganizationID( ) );
	}
}
