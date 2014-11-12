package ru.acs.fts.eps2.engine.data.envelope;

public enum BusinessProperties {
	EnvelopeContext("EnvelopeContext"),
	DocumentContext("DocumentContext"),
	InitialEnvelopeId("InitialEnvelopeId");
	
	String propertyName; // NO_UCD (unused code)
	BusinessProperties(String propertyName)
	{
		this.propertyName=propertyName;
	}
	
}
