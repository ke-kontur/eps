package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_Reqdoc_Info_Ids implements Serializable  // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;

	public Edecl_Reqdoc_Info_Ids(){

    }

    private String envelopeId;
    private String reqDocId;
    private String positionId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getReqDocId() {
        return reqDocId;
    }

    public void setReqDocId(String reqDocId) {
        this.reqDocId = reqDocId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_Reqdoc_Info_Ids ids = (Edecl_Reqdoc_Info_Ids)obj;
        return new EqualsBuilder().append(envelopeId, ids.getEnvelopeId()).
                                   append(reqDocId, ids.getReqDocId()).
                                   append(positionId, ids.getPositionId()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(envelopeId).append(reqDocId).append(positionId).toHashCode();
    }
}
