package ru.acs.fts.dto.adapters;

import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.XMLGregorianCalendar;

import java.util.Calendar;

public class XmlDateTimeAdapter {
	private String plainValue;
	private XMLGregorianCalendar calendar;

	public String getPlainValue() {
		return plainValue;
	}

	public void setPlainValue(String plainValue) {
		this.plainValue = plainValue;
	}

	public XMLGregorianCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(XMLGregorianCalendar calendar) {
		this.calendar = calendar;
	}

	public static XmlDateTimeAdapter parseDate(String s) {
		Calendar parsedDate = DatatypeConverter.parseDate(s);
		XmlDateTimeAdapter adapter = DateUtilities.gregorianToXml(parsedDate);
		adapter.setPlainValue(s);
		return adapter;
	}

	public static String printDate(XmlDateTimeAdapter dt) {
		return dt.getPlainValue();
	}

	public static XmlDateTimeAdapter constructAdapter(XMLGregorianCalendar calendar) {
		XmlDateTimeAdapter adapter = new XmlDateTimeAdapter();
		adapter.setCalendar(calendar);
		adapter.setPlainValue(calendar.toXMLFormat());
		return adapter;
	}
}
