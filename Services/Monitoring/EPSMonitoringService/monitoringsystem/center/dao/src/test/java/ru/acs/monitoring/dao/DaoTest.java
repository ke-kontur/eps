package ru.acs.monitoring.dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.MonitoringInfoData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/beans.xml" })
public class DaoTest {

	ConnectionDAO connectionDAO;
	MonitoringInfoDAO monitoringInfoDAO;
	MessageKindDAO messageKindDAO;
	MessageProcessingStatDAO messageProcessingStatDAO;
	MessageProcessingSystemDAO messageProcessingSystemDAO;
	
	@Test
	@Transactional
	// @Rollback(false)
	public void test1() {
		Assert.assertNotNull(connectionDAO);
		Connection conn = createConnection("xxx");
		connectionDAO.save(conn);
		Assert.assertNotNull(conn.getId());
		conn = connectionDAO.update(conn);
		Assert.assertTrue(1 <= connectionDAO.findAll().size());
		Assert.assertNotNull(connectionDAO.findById(conn.getId()));
	}

	private Connection createConnection(String name) {
		Connection conn = new Connection();
		conn.setName(name);
		conn.setActive(Boolean.TRUE);
		byte reqType = 0;
		conn.setRequestType(Byte.valueOf(reqType));
		conn.setWsUrl("1");
		return conn;
	}

	@Test
	@Transactional
	// @Rollback(false)
	public void testMonitoringInfo() {
		Assert.assertNotNull(connectionDAO);
		MonitoringInf info = createMonitoringInf();
		monitoringInfoDAO.save(info);
		Assert.assertTrue(1 <= monitoringInfoDAO.findAll().size());
		Assert.assertNotNull(monitoringInfoDAO.findById(info.getId()));
		monitoringInfoDAO.findLast();
	}
	Logger log = Logger.getLogger(DaoTest.class);
	@Test
	@Transactional
	// @Rollback(false)
	public void testfindLastMonitoringInfo() {
		List<MonitoringInf> result = monitoringInfoDAO.findLast();
		for (MonitoringInf inf: result)
			log.debug(inf.getId());
	}

	private MonitoringInf createMonitoringInf() {
		MonitoringInf info = new MonitoringInf();
		info.setSeverity("INFO");
		info.setSystemId("192.12.3.31");
		info.setSystemName("ssss");
		info.setUpdateDate(Calendar.getInstance().getTime());
		MonitoringInfoData data = new MonitoringInfoData(); 
		data.setMonitoringInfoXML("<sss>asdadada</sss>");
		info.setMonitoringInfoData(data);
		return info;
	}

	@Test
	@Transactional
	public void testLastInfo() {
		Connection conn = createConnection("xxx");
		connectionDAO.save(conn);
		Connection conn2 = createConnection("xxx2");
		connectionDAO.save(conn2);
		MonitoringInf info = createMonitoringInf();
		info.setConnection(conn);
		monitoringInfoDAO.save(info);
		Long id01 =info.getId();
		info = createMonitoringInf();
		info.setConnection(conn);
		monitoringInfoDAO.save(info);
		Long id1 = info.getId();
		Assert.assertNotNull(id1);
		info = createMonitoringInf();
		info.setConnection(conn2);
		monitoringInfoDAO.save(info);
		Long id02 =info.getId();
		info = createMonitoringInf();
		info.setConnection(conn2);
		monitoringInfoDAO.save(info);
		Long id2 = info.getId();
		List<MonitoringInf> miList = monitoringInfoDAO.findLast();
		Assert.assertEquals(2, miList.size());
		assertContainsId(id1, miList);
		assertContainsId(id2, miList);
		assertNotContainsId(id01, miList);
		miList.get(0).getMonitoringInfoData().getMonitoringInfoXML();
		miList = monitoringInfoDAO.findPreLast();
		Assert.assertEquals(2, miList.size());
		assertContainsId(id01, miList);
		assertContainsId(id02, miList);
	}
	
	
	@Test
	public void testFindMonInfo(){
		Calendar cal = GregorianCalendar.getInstance();
		Calendar cal2 = GregorianCalendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Assert.assertNotNull(monitoringInfoDAO.find(cal2.getTime(),cal.getTime(), null, "ERROR", 20, 10).size());
	}
	@Test
	@Transactional
	public void testMessageKind(){
		MessageKind kind = createMessageKind();
		Assert.assertEquals(1,messageKindDAO.findAll().size());
		MessageKind kind2 = messageKindDAO.find(kind.getCode(),kind.getSystem());
		Assert.assertNotNull(kind2);
		Assert.assertEquals(kind.getId(), kind2.getId());
	}
	
	public MessageKind createMessageKind(){
		Connection conn  = createConnection("1");
		connectionDAO.save(conn);
		MessageProcessingSystem system = new MessageProcessingSystem();
		system.setConnection(conn);
		system.setName("system1");
		messageProcessingSystemDAO.save(system);
		MessageKind kind = new MessageKind();
		kind.setCode("MESS.1");
		kind.setDescription("descr");
		kind.setSystem(system);
		messageKindDAO.save(kind);
		return kind;
	}
	
	
	@Test
	@Transactional
	public void testMessageProcessingSystem(){
		Connection conn  = createConnection("1");
		connectionDAO.save(conn);
		MessageProcessingSystem system = new MessageProcessingSystem();
		system.setConnection(conn);
		system.setName("system1");
		messageProcessingSystemDAO.save(system);
		Assert.assertNotNull(messageProcessingSystemDAO.find(system.getName(), conn));
	}
	
	@Test
	@Transactional
	public void testMessageProcessingStat(){
		MessageProcessingStat stat = new MessageProcessingStat();
		stat.setSuccess(new Long(10));
		stat.setFlkError(new Long(4));
		stat.setError(new Long(2));
		stat.setMessageKind(createMessageKind());
		stat.setSystem(stat.getMessageKind().getSystem());
		Calendar currTime = GregorianCalendar.getInstance();
		Calendar currDate  = new GregorianCalendar(currTime.get(Calendar.YEAR) ,currTime.get(Calendar.MONTH),currTime.get(Calendar.DATE));
		stat.setStatDate(currDate.getTime());
		messageProcessingStatDAO.save(stat);
		Assert.assertEquals(1,messageProcessingStatDAO.findAll().size());
		currDate  = new GregorianCalendar(currDate.get(Calendar.YEAR) ,currDate.get(Calendar.MONTH),currDate.get(Calendar.DATE));
		Assert.assertNotNull(messageProcessingStatDAO.find(stat.getMessageKind(), currDate.getTime()));
	}
	
	private void assertContainsId(Long id, List<MonitoringInf> miList) {
		if (!checkContainsId(id, miList)) {
			Assert.fail("Массив должен содержать докумнт с id=" + id);
		}
	}
	private void assertNotContainsId(Long id, List<MonitoringInf> miList) {
		if (checkContainsId(id, miList)) {
			Assert.fail("Массив не должен содержать докумнт с id=" + id);
		}
	}

	private boolean checkContainsId(Long id, List<MonitoringInf> miList) {
		for (MonitoringInf monitoringInf : miList) {
			if (id.equals(monitoringInf.getId())) {
				return true;
			}
		}
		return false;
	}

	@Autowired
	public void setConnectionDAO(ConnectionDAO connectionDAO) {
		this.connectionDAO = connectionDAO;
	}

	@Autowired
	public void setMonitoringInfoDAO(MonitoringInfoDAO monitoringInfoDAO) {
		this.monitoringInfoDAO = monitoringInfoDAO;
	}

	@Autowired
	public void setMessageKindDAO(MessageKindDAO messageKindDAO) {
		this.messageKindDAO = messageKindDAO;
	}

	@Autowired
	public void setMessageProcessingStatDAO(MessageProcessingStatDAO messageProcessingStatDAO) {
		this.messageProcessingStatDAO = messageProcessingStatDAO;
	}

	@Autowired
	public void setMessageProcessingSystemDAO(MessageProcessingSystemDAO messageProcessingSystemDAO) {
		this.messageProcessingSystemDAO = messageProcessingSystemDAO;
	}
}
