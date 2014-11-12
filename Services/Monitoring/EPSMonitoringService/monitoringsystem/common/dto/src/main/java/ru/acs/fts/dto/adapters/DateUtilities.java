package ru.acs.fts.dto.adapters;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public final class DateUtilities {
	private DateUtilities() {
	}

	public static Date xmlToGregorianDate(XmlDateTimeAdapter xmlDate) {
		return xmlToGregorianDate(xmlDate.getCalendar());
	}

	public static Date xmlToGregorianDate(XMLGregorianCalendar xmlDate) {
		return xmlDate.toGregorianCalendar().getTime();
	}

	public static XmlDateTimeAdapter gregorianToXml(Calendar calendar) {
		try {
			XMLGregorianCalendar newXMLGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					(GregorianCalendar) calendar);
			return XmlDateTimeAdapter.constructAdapter(newXMLGregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public static XmlDateTimeAdapter xmlCalendar() {
		return gregorianToXml(GregorianCalendar.getInstance());
	}

	public static XmlDateTimeAdapter gregorianToXml(Date date) {
		GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();
		calendar.setTime(date);
		return gregorianToXml(calendar);
	}

	public static Date getCurrDate(XmlDateTimeAdapter xmlDate) {
		Calendar currTime = xmlDate.getCalendar().toGregorianCalendar();
		Calendar currDate = new GregorianCalendar(currTime.get(Calendar.YEAR), currTime.get(Calendar.MONTH), currTime
				.get(Calendar.DATE));
		return currDate.getTime();
	}

}
