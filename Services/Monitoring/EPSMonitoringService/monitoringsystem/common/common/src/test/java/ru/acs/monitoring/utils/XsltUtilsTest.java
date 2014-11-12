package ru.acs.monitoring.utils;

import java.io.InputStream;

import org.junit.Test;

import ru.acs.monitoring.common.utils.XsltUtils;


public class XsltUtilsTest {
		@Test
		public void testTransform() throws Exception{
			XsltUtils xslt = new  XsltUtils();
			InputStream is = XsltUtilsTest.class.getResourceAsStream("/MonInfo2.xml");
			byte[] xml= new byte[is.available()];
			is.read(xml);
			System.out.println(xslt.transformMonitoringInfoAsStr(xml));
		}
}
