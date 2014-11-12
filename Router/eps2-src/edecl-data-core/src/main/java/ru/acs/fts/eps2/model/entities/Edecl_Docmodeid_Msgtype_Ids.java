package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_Docmodeid_Msgtype_Ids implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;

	public Edecl_Docmodeid_Msgtype_Ids(){

    }

    private String docModeId;
    private String msgType;

    public String getDocModeId() {
        return docModeId;
    }

    public String getMsgType() {
        return msgType;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_Docmodeid_Msgtype_Ids ids = (Edecl_Docmodeid_Msgtype_Ids)obj;
        return new EqualsBuilder().append(docModeId, ids.getDocModeId()).
                                   append(msgType, ids.getMsgType()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(docModeId).append(msgType).toHashCode();
    }

    public void setDocModeId(String docModeId) {
        this.docModeId = docModeId;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
