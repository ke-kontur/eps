package ru.acs.fts.eps2.engine.restWs.crypto.requests;

import ru.acs.fts.eps2.engine.restWs.crypto.serviceModel.DoSign;

public class SignRequest extends Request
{
	private DoSign _doSign;
	
	// @formatter:off
	public void setDoSign( DoSign doSign ) { _doSign = doSign; }
	public DoSign getDoSign( ) { return _doSign; }
	// @formatter:on
}
