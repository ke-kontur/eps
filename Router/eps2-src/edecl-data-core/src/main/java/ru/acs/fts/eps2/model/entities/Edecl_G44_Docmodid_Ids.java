package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_G44_Docmodid_Ids implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;

	public Edecl_G44_Docmodid_Ids(){

    }

    private String docCode;
    private String docModeId;

    public String getDocCode() {
        return docCode;
    }

    public String getDocModeId() {
        return docModeId;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_G44_Docmodid_Ids ids = (Edecl_G44_Docmodid_Ids)obj;
        return new EqualsBuilder().append(docCode, ids.getDocCode()).
                                   append(docModeId, ids.getDocModeId()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(docCode).append(docModeId).toHashCode();
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public void setDocModeId(String docModeId) {
        this.docModeId = docModeId;
    }
}
