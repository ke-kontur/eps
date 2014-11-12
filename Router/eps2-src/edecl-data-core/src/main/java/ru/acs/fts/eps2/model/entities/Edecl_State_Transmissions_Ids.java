package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_State_Transmissions_Ids implements Serializable
{
	private static final long serialVersionUID = 1L;

	public Edecl_State_Transmissions_Ids(){

    }

    private String stateCode;
    private String softVersionId;
    private String resultStateCode;
    private String incomingMsgCode;
    private String eventName;

    public String getStateCode() {
        return stateCode;
    }

    public String getSoftVersionId() {
        return softVersionId;
    }

    public String getResultStateCode() {
        return resultStateCode;
    }

    public String getIncomingMsgCode() {
        return incomingMsgCode;
    }

    public String getEventName() {
        return eventName;
    }

     public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_State_Transmissions_Ids ids = (Edecl_State_Transmissions_Ids)obj;
        return new EqualsBuilder().append(stateCode, ids.getStateCode()).
                                   append(softVersionId, ids.getSoftVersionId()).
                                   append(resultStateCode, ids.getResultStateCode()).
                                   append(incomingMsgCode, ids.getIncomingMsgCode()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(stateCode).append(softVersionId).
                append(resultStateCode).append(incomingMsgCode).toHashCode();
    }
}
