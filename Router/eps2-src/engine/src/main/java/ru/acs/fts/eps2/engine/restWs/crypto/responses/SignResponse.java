package ru.acs.fts.eps2.engine.restWs.crypto.responses;

import ru.acs.fts.eps2.engine.restWs.crypto.serviceModel.DoSign;

public class SignResponse extends Response
{
	private DoSign _didSign;
	
	// @formatter:off
	public void setDidSign( DoSign didSign ) { _didSign = didSign; }
	public DoSign getDidSign( ) { return _didSign; }
	// @formatter:on
}
