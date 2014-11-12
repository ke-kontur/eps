package ru.acs.monitoring.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.transform.TransformerException;

import ru.acs.commons.ru.acs.commons.XsltProcessor;
import ru.acs.monitoring.MonitoringRuntimeException;

/**
 * Утилитный класс для XSLT трансформации
 * @author fmv
 *
 */
public class XsltUtils {
		
		/**
		 * Трансформировать с помощью xslt
		 * @param monInfo
		 * @return
		 */
		public byte[] transformMonitoringInfo(byte[] monInfo){
			InputStream xslt =  XsltUtils.class.getResourceAsStream("/xslt/MonitoringInfo.xslt");
			if (xslt==null){
				throw new MonitoringRuntimeException("Ошибка XSLT преобразования: не найден XSLT файл преобразования");
			}
			InputStream xml  =  new ByteArrayInputStream(monInfo);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			try {
				XsltProcessor.getInstance().convert(xml,xslt, bos);
			} catch (TransformerException e) {
				throw new MonitoringRuntimeException("Ошибка XSLT преобразования: "+e.getMessage(),e);
			}		
			return bos.toByteArray();
		}
		
		public String transformMonitoringInfoAsStr(byte[] monInfo){
			try {
				return new String(transformMonitoringInfo(monInfo),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new MonitoringRuntimeException("Ошибка преобразования строк: кодировка UTF-8 не поддерживается.",e);
			}
		}
		
		public String transformMonitoringInfoAsStr(String monInfo) {
			try {
				return new String(transformMonitoringInfo(monInfo.getBytes("UTF-8")),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new MonitoringRuntimeException("Ошибка преобразования строк: кодировка UTF-8 не поддерживается.",e);
			}
		}
}
