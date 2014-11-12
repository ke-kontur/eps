package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@IdClass(Edecl_Substatus_State_Ids.class)
@Table(name = "EDECL_SUBSTATUS_STATE")
public class Edecl_Substatus_State implements Serializable 
{
	private static final long serialVersionUID = 1L;

	public Edecl_Substatus_State(){

    }

    @Id
    @Column(name="SUBST_ST_DOCUMENTID", length = 36, nullable = false)
    private String documentId;
    @Id
    @Column(name="SUBST_ST_PROCESSID", length = 36, nullable = false)
    private String processId;
    @Id
    @Column(name="SUBST_ST_STCODE", length = 36, nullable = false)
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
}
