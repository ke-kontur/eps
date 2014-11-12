package ru.acs.monitoring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.acs.fts.dto.monitoring.MonitoringInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/monitoring-beans.xml"})
public class SignatureMonitoringProcessTest {
	SignatureMonitoringProcess signatureMonitoringProcess;
	@Test
	public void testRun(){		
		MonitoringInfo info = new MonitoringInfo();
		signatureMonitoringProcess.fillMonitoringInfo(info);
	}

	@Autowired
	public void setSignatureMonitoringProcess(SignatureMonitoringProcess signatureMonitoringProcess) {
		this.signatureMonitoringProcess = signatureMonitoringProcess;
	}
}
