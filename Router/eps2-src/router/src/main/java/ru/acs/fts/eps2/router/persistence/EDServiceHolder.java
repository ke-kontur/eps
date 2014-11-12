package ru.acs.fts.eps2.router.persistence;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.eps2.model.services.AlbumDocListService;
import ru.acs.fts.eps2.model.services.AlyService;
import ru.acs.fts.eps2.model.services.AudService;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.DocModeMessageService;
import ru.acs.fts.eps2.model.services.EcopService;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.model.services.ExtRtuRoutingService;
import ru.acs.fts.eps2.model.services.G44Service;
import ru.acs.fts.eps2.model.services.IpslistService;
import ru.acs.fts.eps2.model.services.IpstechService;
import ru.acs.fts.eps2.model.services.MsgListService;
import ru.acs.fts.eps2.model.services.ParticipantService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.RzdService;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.model.services.SoftVersionService;
import ru.acs.fts.eps2.model.services.StateModelTypeService;
import ru.acs.fts.eps2.model.services.StateTransmissionService;
import ru.acs.fts.eps2.model.services.StatusListService;
import ru.acs.fts.eps2.model.services.UdCustListService;
import ru.acs.fts.eps2.model.services.WmqAddressService;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.persistence.operators.ProcedureOperator;

public class EDServiceHolder extends ServiceHolder
{
	private CustomsService _customsService;

	private EdarchService _edarchService;

	private EnvelopeService _envelopeService;

	private ErrListService _errListService;

	private MsgListService _msgListService;

	private AlbumDocListService _albumDocListService;

	private ParticipantService _participantService;

	private ProcedureService _procedureService;

	private AudService _audService;

	private StateTransmissionService _stateTransmissionService;

	private UdCustListService _udCustListService;

	private G44Service _g44Service;

	private Marshaller _marshaller;
	private Unmarshaller _unmarshaller;

	private EcopService _ecopService;

	private EnvelopeOperator _envelopeOperator;

	private StatusListService _statusListService;

	private ProcedureOperator _procedureOperator;

	private SoftVersionService _softVersionService;

	private CustomsOperator _customsOperator;

	private IpslistService _ipslistService;

	private IpstechService _ipsTechService;

	private WmqAddressService _wmqAddressService;

	private ExtRtuRoutingService _extRtuRoutingService;

	private DocModeMessageService _docModeMessageService;

	private EdarchOperator _edarchOperator;

	private RzdService _rzdService;

	private AlyService _alyService;

	private StateModelTypeService _stateModelTypeService;

	// @formatter:off
	@Required
	public void setCustomsService( CustomsService customsService ) { _customsService = customsService; }
	public CustomsService getCustomsService( ) { return _customsService; }
	
	@Required
	public void setEdarchService( EdarchService edarchService ) { _edarchService = edarchService; }
	public EdarchService getEdarchService( ) { return _edarchService; }
	
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { _envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return _envelopeService; }
	
	@Required
	public void setErrListService( ErrListService errListService ) { _errListService = errListService; }
	public ErrListService getErrListService() { return _errListService; }
	
	@Required
	public void setMsgListService( MsgListService msgListService ) { _msgListService = msgListService; }
	public MsgListService getMsgListService( ) { return _msgListService; }
	
	@Required
	public void setAlbumDocListService( AlbumDocListService albumDocListService ) { _albumDocListService = albumDocListService; }
	public AlbumDocListService getAlbumDocListService( ) { return _albumDocListService; }
	
	@Required
	public void setProcedureService( ProcedureService procedureService ) { _procedureService = procedureService; }
	public ProcedureService getProcedureService( ) { return _procedureService; }
	
	@Required
	public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required
	public void setStateTransmissionService( StateTransmissionService stateTransmissionService ) { _stateTransmissionService = stateTransmissionService; }
	public StateTransmissionService getStateTransmissionService( ) { return _stateTransmissionService; }
	
	@Required
	public void setUdCustListService( UdCustListService udCustListService ) { _udCustListService = udCustListService; }
	public UdCustListService getUdCustListService( ) { return _udCustListService; }
	
	@Required
	public void setParticipantService( ParticipantService participantService ) { _participantService = participantService; }
	public ParticipantService getParticipantService( ) { return _participantService; }
	
	@Required
	public void setG44Service( G44Service g44Service ) { _g44Service = g44Service; }
	public G44Service getG44Service( ) { return _g44Service; }
	
	@Required
	public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }

	@Required
	public EcopService getEcopService( ) {	return _ecopService; }
	public void setEcopService( EcopService ecopService ) { this._ecopService = ecopService;	}
	
	@Required
	public void setEnvelopeOperator( EnvelopeOperator envelopeManager ) { _envelopeOperator = envelopeManager; }
	public EnvelopeOperator getEnvelopeOperator( ) { return _envelopeOperator; }
	
	@Required
	public void setStatusListService( StatusListService service ) { _statusListService = service; }
	public StatusListService getStatusListService( ) { return _statusListService; }
	
	@Required
	public void setProcedureOperator( ProcedureOperator operator ) { _procedureOperator = operator; }
	public ProcedureOperator getProcedureOperator( ) { return _procedureOperator; }
	
	@Required
	public void setSoftVersionService( SoftVersionService service ) { _softVersionService = service; }
	public SoftVersionService getSoftVersionService( ) { return _softVersionService; }
	
	@Required
	public void setCustomsOperator( CustomsOperator operator ) { _customsOperator = operator; }
	public CustomsOperator getCustomsOperator( ) { return _customsOperator; }
	
	@Required
	public void setIpslistService( IpslistService service ) { _ipslistService = service; }
	public IpslistService getIpslistService( ) { return _ipslistService; }
	
	@Required
	public void setIpsTechService( IpstechService service ) { _ipsTechService = service; }
	public IpstechService getIpstechService( ) { return _ipsTechService; }
	
	@Required
	public void setWmqAddressService( WmqAddressService service ) { _wmqAddressService = service; }
	public WmqAddressService getWmqAddressService( ) { return _wmqAddressService; }
	
	@Required
	public void setExtRtuRoutingService( ExtRtuRoutingService service ) { _extRtuRoutingService = service; }
	public ExtRtuRoutingService getExtRtuRoutingService( ) { return _extRtuRoutingService; }
	
	@Required
	public void setDocModeMessageService( DocModeMessageService service ) { _docModeMessageService = service; }
	public DocModeMessageService getDocModeMessageService( ) { return _docModeMessageService; }
	
	@Required
	public void setEdarchOperator( EdarchOperator operator ) { _edarchOperator = operator; }
	public EdarchOperator getEdarchOperator( ) { return _edarchOperator; }
	
	@Required
	public void setRzdService( RzdService rzdService ) { _rzdService = rzdService; }
	public RzdService getRzdService( ) { return _rzdService; }
	
	public void setStateModelTypeService( StateModelTypeService stateModelTypeService ) { _stateModelTypeService = stateModelTypeService; }
	public StateModelTypeService getStateModelTypeService( ) { return _stateModelTypeService; }
	
	@Required
	public void setAlyService( AlyService alyService ) { _alyService = alyService; }
	public AlyService getAlyService( ) { return _alyService; }
	// @formatter:on
}
