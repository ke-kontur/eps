package router.aud;

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
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

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

		// epsBusinessProcess

		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		ds.setURL( "jdbc:oracle:thin:@192.168.23.155:1521:AUDDBG");
		ds.setUser( "AUD_MOSCOW" );
		ds.setPassword( "AUD_MOSCOW" );

		bld.bind( "audBusinessProcess", ds );

		com.atomikos.icatch.jta.UserTransactionManager jtaTM = new com.atomikos.icatch.jta.UserTransactionManager();
		bld.bind( "java:comp/TransactionManager", jtaTM );
		bld.bind( "weblogic.transaction.TransactionManager", jtaTM );

		// archiveConfig

		bld.bind( "archiveConfig/Config/TransportServerAddress", new JNDIProperty( "WMQ://MRDEKK.MANAGER/AUD.SERVER.IN" ) );
		bld.bind( "archiveConfig/Config/RestEventSrvUrl", new JNDIProperty( "http://eps1:9000/event-service/" ) );
		bld.bind( "archiveConfig/Config/RestStructSrvUrl", new JNDIProperty( "http://eps1:9000/strcontrol-service/" ) );
		bld.bind( "archiveConfig/Config/RestCryptoSrvUrl", new JNDIProperty( "http://eps1:9000/crypto-service/" ) );

		// archiveMqConfig

		bld.bind( "archiveMqConfig/ArchiveConnectionFactory", getCF( "MRDEKK.MANAGER", "localhost", 1414, "SYSTEM.DEF.SVRCONN" ) );

		bld.bind( "archiveMqConfig/ArchiveErrorQueue", getQ( "AUD.SERVER.ERRORS" ) );
		bld.bind( "archiveMqConfig/ArchiveInputQueue", getQ( "AUD.SERVER.IN" ) );
		bld.bind( "archiveMqConfig/ArchiveOutputQueue", getQ( "AUD.SERVER.OUT" ) );

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
