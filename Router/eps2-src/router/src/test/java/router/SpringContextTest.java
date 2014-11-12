package router;

import java.sql.SQLException;

import javax.jms.JMSException;
import javax.naming.NamingException;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.mock.jndi.SimpleNamingContextBuilder;

import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQXAQueueConnectionFactory;

//import ru.acs.fts.eps2.util.jndi.JNDIProperty;

@SuppressWarnings( "deprecation" )
public class SpringContextTest
{
	@BeforeClass
	public static void predefine( ) 
		throws NamingException, SQLException, JMSException
	{
		/*SimpleNamingContextBuilder bld = new SimpleNamingContextBuilder( );

		// eps2jconfig

		bld.bind( "eps2jconfig/Config/extGateTransmitionTransportServer", new JNDIProperty( "localhost" ) );
		bld.bind( "eps2jconfig/Config/extGateTransmitionLocalManager", new JNDIProperty( "MRDEKK.MANAGER" ) );
		bld.bind( "eps2jconfig/Config/extGateTransmitionLocalQueue", new JNDIProperty( "QM_TEST" ) );
		bld.bind( "eps2jconfig/Config/extGateTransmitionRemoteManager", new JNDIProperty( "QM_TEST" ) );
		bld.bind( "eps2jconfig/Config/extGateTransmitionRemoteQueue", new JNDIProperty( "GW.FROM.CUSTOMS" ) );

		bld.bind( "eps2jconfig/Config/rzdPollingTransportServer", new JNDIProperty( "localhost" ) );
		bld.bind( "eps2jconfig/Config/rzdPollingLocalManager", new JNDIProperty( "MRDEKK.MANAGER" ) );
		bld.bind( "eps2jconfig/Config/rzdPollingLocalQueue", new JNDIProperty( "RZD.TO" ) );
		bld.bind( "eps2jconfig/Config/rzdPollingRemoteManager", new JNDIProperty( "MRDEKK.MANAGER" ) );
		bld.bind( "eps2jconfig/Config/rzdPollingRemoteQueue", new JNDIProperty( "RZD.TO" ) );
		bld.bind( "eps2jconfig/Config/RzdPollingSenderTransportAddress", new JNDIProperty( "wmq://RU.FTS.ASVD.COMM/RZD.FROM" ) );
		bld.bind( "eps2jconfig/Config/RzdPollingReceiverTransportAddress", new JNDIProperty( "wmq://RU.FTS.ASVD.COMM/RZD.TO" ) );

		bld.bind( "eps2jconfig/Config/extGateSmtpAddress", new JNDIProperty( "smtp://gateway/box" ) );
		bld.bind( "eps2jconfig/Config/extGateWmqAddress", new JNDIProperty( "wmq://MRDEKK.MANAGER/TO.DECLARANT" ) );
		bld.bind( "eps2jconfig/Config/kastoReceiveAddress", new JNDIProperty( "wmq://MRDEKK.MANAGER/EPS.CUSTOMS.FROM" ) );
		bld.bind( "eps2jconfig/Config/epsReceiveAddress", new JNDIProperty( "wmq://MRDEKK.MANAGER/EPS.EPS.FROM" ) );
		bld.bind( "eps2jconfig/Config/epsReceiveAdminAddress", new JNDIProperty( "wmq://MRDEKK.MANAGER/EPS.ADMIN.FROM" ) );

		bld.bind( "eps2jconfig/Config/epsSenderAdminCustomsCode", new JNDIProperty( "12345678" ) );
		bld.bind( "eps2jconfig/Config/epsSenderAdminExchangeType", new JNDIProperty( "19200" ) );

		bld.bind( "eps2jconfig/Config/asktt2CustomsCode", new JNDIProperty( "10000001" ) );
		bld.bind( "eps2jconfig/Config/asktt2ExchType", new JNDIProperty( "524000" ) );
		bld.bind( "eps2jconfig/Config/MalakhitCustomsCode", new JNDIProperty( "44332211" ) );
		bld.bind( "eps2jconfig/Config/MalakhitExchType", new JNDIProperty( "19200" ) );

		bld.bind( "eps2jconfig/Config/rtuCodes", new JNDIProperty( "10000001,777*" ) );
		bld.bind( "eps2jconfig/Config/processNotFullContainerList", new JNDIProperty( "!CMN.11025" ) );
		bld.bind( "eps2jconfig/Config/EpsCustomsCode", new JNDIProperty( "90909090" ) );
		bld.bind( "eps2jconfig/Config/RzdPollingParticipantId", new JNDIProperty( "1027739046502" ) );

		bld.bind( "eps2jconfig/Config/BalancerQueueManager", new JNDIProperty( "MRDEKK.MANAGER" ) );
		bld.bind( "eps2jconfig/Config/BalancerHeartbeatQueue", new JNDIProperty( "EPS.EPS.FROM" ) );
		bld.bind( "eps2jconfig/Config/BalancerEpsQueue", new JNDIProperty( "EPS.EPS.FROM" ) );

		bld.bind( "eps2jconfig/Config/replyQMgr", new JNDIProperty( "MRDEKK.MANAGER" ) );
		bld.bind( "eps2jconfig/Config/ReplyQ", new JNDIProperty( "COA.RECIEPT" ) );
		bld.bind( "eps2jconfig/Config/CoaNeed", new JNDIProperty( "true" ) );
		bld.bind( "eps2jconfig/Config/CodNeed", new JNDIProperty( "false" ) );
		bld.bind( "eps2jconfig/Config/CoaCodFullData", new JNDIProperty( "true" ) );

		bld.bind( "eps2jconfig/Config/RestEventSrvUrl", new JNDIProperty( "http://eps1:9000/event-service/" ) );
		bld.bind( "eps2jconfig/Config/RestStructSrvUrl", new JNDIProperty( "http://eps1:9000/strcontrol-service/" ) );
		bld.bind( "eps2jconfig/Config/RestCryptoSrvUrl", new JNDIProperty( "http://eps1:9000/crypto-service/" ) );

		bld.bind( "eps2jconfig/Config/UseHeartbeat", new JNDIProperty( "true" ) );
		bld.bind( "eps2jconfig/Config/HeartbeatInterval", new JNDIProperty( "60000" ) );
		bld.bind( "eps2jconfig/Config/HeartbeatDescription", new JNDIProperty( "WLS(local)" ) );

		bld.bind( "eps2jconfig/Config/UseEventService", new JNDIProperty( "true" ) );
		bld.bind( "eps2jconfig/Config/DoRzdPolling", new JNDIProperty( "true" ) );
		bld.bind( "eps2jconfig/Config/DoAdminPolling", new JNDIProperty( "true" ) );
		bld.bind( "eps2jconfig/Config/DoEadManifestCleanup", new JNDIProperty( "true" ) );

		bld.bind( "eps2jconfig/Config/EnsureDestinations", new JNDIProperty( "" ) );

		// epsBusinessProcess

		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		ds.setURL( "jdbc:oracle:thin:@192.168.23.155:1521:EPS2");
		ds.setUser( "EPS_CAA_DEV" );
		ds.setPassword( "EPS_CAA_DEV" );

		bld.bind( "epsBusinessProcess", ds );

		com.atomikos.icatch.jta.UserTransactionManager jtaTM = new com.atomikos.icatch.jta.UserTransactionManager();
		bld.bind( "java:comp/TransactionManager", jtaTM );
		bld.bind( "weblogic.transaction.TransactionManager", jtaTM );

		// eps2config (MQ)

		bld.bind( "eps2config/RouterConnectionFactory", getCF( "MRDEKK.MANAGER", "localhost", 1414, "SYSTEM.DEF.SVRCONN" ) );

		bld.bind( "eps2config/mq-connection-send-error-recv", getQ( "ERROR.RECV" ) );
		bld.bind( "eps2config/mq-connection-send-error-dbsave", getQ( "ERROR.DBSAVE" ) );
		bld.bind( "eps2config/mq-connection-send-error-auth", getQ( "ERROR.AUTH" ) );
		bld.bind( "eps2config/mq-connection-send-error-structure", getQ( "ERROR.STR" ) );
		bld.bind( "eps2config/mq-connection-send-error-fatal", getQ( "ERROR.FATAL" ) );

		bld.bind( "eps2config/RouterQueue5401325decl", getQ( "EPS5401.DECLARANT.FROM" ) );
		bld.bind( "eps2config/RouterQueue5401325customs", getQ( "EPS5401.CUSTOMS.FROM" ) );
		bld.bind( "eps2config/RouterQueue5401325eps", getQ( "EPS5401.EPS.FROM" ) );
		bld.bind( "eps2config/RouterQueue5401325admin", getQ( "EPS5401.ADMIN.FROM" ) );

		bld.activate( );*/
	}
	
	@Test
	public void springContextCanLoad( )
	{
		/*XmlBeanFactory factory = new XmlBeanFactory( new ClassPathResource( "testContext.xml" ) );

		for ( String beanName : factory.getBeanDefinitionNames( ) )
		{
			BeanDefinition beanDefinition = factory.getBeanDefinition( beanName );
			if ( !beanDefinition.isAbstract( ) && !beanDefinition.isPrototype( ) )
			{
				Object bean = factory.getBean( beanName );
				Assert.assertNotNull( bean );
			}
		}*/
	}

	private static MQXAQueueConnectionFactory getCF( String queueManager, String hostname, int port, String channel ) 
		throws JMSException
	{
		MQXAQueueConnectionFactory cf = new MQXAQueueConnectionFactory( );

		cf.setTransportType( 0 ); // binding connection
		cf.setQueueManager( queueManager );
		cf.setHostName( hostname );
		cf.setPort( port );
		cf.setChannel( channel );

		return cf;
	}

	private static MQQueue getQ( String name ) 
		throws JMSException
	{
		MQQueue q = new MQQueue( );

		q.setBaseQueueName( name );
		q.setCCSID( 1208 );

		return q;
	}
}
