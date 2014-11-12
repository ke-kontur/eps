package router.aly;

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

		// alyBusinessProcess

		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		ds.setURL( "jdbc:oracle:thin:@192.168.23.155:1521:EPS2");
		ds.setUser( "EPS_CAA_DEV" );
		ds.setPassword( "EPS_CAA_DEV" );
		
		bld.bind( "alyBusinessProcess", ds );

		// epsBusinessProcess

		ds = new OracleConnectionPoolDataSource();
		ds.setURL( "jdbc:oracle:thin:@192.168.23.155:1521:EPS2");
		ds.setUser( "EPS_CAA_DEV" );
		ds.setPassword( "EPS_CAA_DEV" );
		
		bld.bind( "epsBusinessProcess", ds );

		com.atomikos.icatch.jta.UserTransactionManager jtaTM = new com.atomikos.icatch.jta.UserTransactionManager();
		bld.bind( "java:comp/TransactionManager", jtaTM );
		bld.bind( "weblogic.transaction.TransactionManager", jtaTM );
		
		// alyConfig
		
		bld.bind( "alyConfig/RestEventSrvUrl", new JNDIProperty( "http://eps1:9000/event-service/" ) );
		bld.bind( "alyConfig/RestCryptoSrvUrl", new JNDIProperty( "http://eps1:9000/crypto-service/" ) );
		bld.bind( "alyConfig/TransportServerAddress", new JNDIProperty( "wmq://MRDEKK.MANAGER/ALY.OUTPUT.QUEUE" ) );
		
		// alyMqConfig
		
		bld.bind( "alyMqConfig/JmsConnectionFactory", getCF( "MRDEKK.MANAGER", "localhost", 1414, "SYSTEM.DEF.SVRCONN" ) );
		
		bld.bind( "alyMqConfig/AlyErrorQueue", getQ( "ALY.ERROR.QUEUE" ) );
		bld.bind( "alyMqConfig/AlyInputQueue", getQ( "ALY.INPUT.QUEUE" ) );
		bld.bind( "alyMqConfig/AlyOutputQueue", getQ( "ALY.OUTPUT.QUEUE" ) );
		
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
