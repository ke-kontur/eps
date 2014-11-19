package ru.acs.fts.eps2.ws.model.requests.crypto;

import ru.acs.fts.eps2.ws.model.requests.Request;
import ru.acs.fts.eps2.ws.model.serviceModel.crypto.DoSign;

public class SignRequest extends Request
{
	private DoSign _doSign;
	
	// @formatter:off
	public void setDoSign( DoSign doSign ) { _doSign = doSign; }
	public DoSign getDoSign( ) { return _doSign; }
	// @formatter:on
}
