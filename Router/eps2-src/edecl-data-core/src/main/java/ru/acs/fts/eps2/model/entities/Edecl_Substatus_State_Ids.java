package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_Substatus_State_Ids implements Serializable 
{
	private static final long serialVersionUID = 1L;

	public Edecl_Substatus_State_Ids(){

    }

    private String documentId;
    private String processId;
    private String stCode;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_Substatus_State_Ids ids = (Edecl_Substatus_State_Ids)obj;
        return new EqualsBuilder().append(documentId, ids.getDocumentId()).
                                   append(processId, ids.getProcessId()).
                                   append(stCode, ids.getStCode()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(documentId).append(processId).append(stCode).toHashCode();
    }
}
