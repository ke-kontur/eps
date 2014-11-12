package ru.acs.fts.dto.soap.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleBodyType", namespace = "urn:customs.ru:SimpleBody:1.0.0", propOrder = {
    "body"
})
@XmlRootElement(name = "SimpleBody", namespace = "urn:customs.ru:SimpleBody:1.0.0")
public class SimpleBody {
	@XmlElement(name = "SimpleBody", namespace = "urn:customs.ru:SimpleBody:1.0.0")
	String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
