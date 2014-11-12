/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.acs.monitoring.services;

import java.util.Collection;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.acs.monitoring.domain.Connection;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/beans-services.xml","/beans.xml"})
public class ConnectionsServiceTest {
		private static final Log LOG = LogFactory.getLog(ConnectionsServiceTest.class);

		ConnectionsService service;

        Connection connection;

        @Before public void setUp() {
            connection = new Connection();

            connection.setName("AGENT");
            connection.setRoutingAddr("test://test.address");
            connection.setActive(true);
            connection.setDisplay(true);
            connection.setRequestType((byte) 0);
        }

        @Test
        @Transactional @Rollback(false)
        public void testContains() {
            Assert.assertFalse(service.contains(connection));
        }

        @Test
        @Transactional @Rollback(false)
        public void testSave() {
            Assert.assertFalse(service.contains(connection));
                service.save(connection);
            Assert.assertTrue(service.contains(connection));
            Assert.assertNotNull(connection.getId());
        }

        @Test
		@Transactional @Rollback(false)
		public void testGetAll(){
			Collection<Connection> connections = service.getAll();

            Assert.assertTrue(connections.size() > 0);
		}

// Configuration

		@Autowired public void setService(ConnectionsService service) {
            this.service = service;
		}
}