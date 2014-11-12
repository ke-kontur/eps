package ru.acs.fts.eps2.ws.model.responses.crypto;

import ru.acs.fts.eps2.ws.model.responses.Response;
import ru.acs.fts.eps2.ws.model.serviceModel.crypto.DoSign;

public class SignResponse extends Response
{
	private DoSign _didSign;
	
	// @formatter:off
	public void setDidSign( DoSign didSign ) { _didSign = didSign; }
	public DoSign getDidSign( ) { return _didSign; }
	// @formatter:on
}
