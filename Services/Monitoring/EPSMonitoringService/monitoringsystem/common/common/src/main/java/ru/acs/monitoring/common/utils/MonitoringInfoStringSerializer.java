package ru.acs.monitoring.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.monitoring.MonitoringRuntimeException;

public class MonitoringInfoStringSerializer {
	public String serialize(MonitoringInfo info) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		OXMConverter om = new OXMConverter();
		om.marshall(info, bos);
		try {
			return new String(bos.toByteArray(), "UTF-8").toString();
		} catch (UnsupportedEncodingException e) {
			throw new MonitoringRuntimeException("Ошибка преобразования строк: кодировка UTF-8 не поддерживается.",e);
		}		
	}
}
