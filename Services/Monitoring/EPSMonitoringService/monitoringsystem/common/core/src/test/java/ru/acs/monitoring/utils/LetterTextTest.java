package ru.acs.monitoring.utils;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

import junit.framework.Assert;

import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
import org.springframework.ui.velocity.VelocityEngineUtils;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.QueueManagerInfo;
import ru.acs.fts.dto.monitoring.QueueStatus;
import ru.acs.monitoring.common.mail.MailMonitoringInfo;
import ru.acs.monitoring.common.utils.XsltUtils;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;
import ru.acs.monitoring.notification.MailNotifier;


public class LetterTextTest {
	private OXMConverter converter = new OXMConverter();
	
		@Test
		public void testPatternApply() throws Exception{
			XsltUtils xslt = new  XsltUtils();
			InputStream is = LetterTextTest.class.getResourceAsStream("/MonitoringInfo.xml");			
			MonitoringInfo info = (MonitoringInfo)converter.unmarshall(is);
			is.close();
			is = LetterTextTest.class.getResourceAsStream("/MonitoringInfo.xml");			
			MonitoringInfo prev = (MonitoringInfo)converter.unmarshall(is);
			is.close();	
			
			for (QueueManagerInfo mqInfo: prev.getMqMonitoringInfo().getQueueManagerInfos())
				for (QueueStatus qInfo: mqInfo.getQueueStatuses())
					qInfo.setInterval(qInfo.getInterval() + 1); 
			
			//VelocityEngine velocityEngine = new VelocityEngine();						
			String result = buldContent("templates/MonitoringListMail.vm", createModel(new MonitoringInfoWrapper(info, prev)));
			
			System.out.println(result);
			
		}
		
		private Map createModel(MonitoringInfoWrapper info) {
			return new MailNotifier() {
				public Map createModel(MonitoringInfoWrapper info) {
					MailMonitoringInfo inf = createMailMonInf(0, info);					
					return super.createModel(Arrays.asList(inf));
				}
			}.createModel(info);			
		}
		
		private String buldContent(String templateName, Map model) throws Exception{			
			ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			VelocityEngine velocityEngine = (VelocityEngine)context.getBean("velocityEngine");
			
			
			String result = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateName, model);			
			return result;
		}
}
