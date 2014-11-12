package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_NOTUNIQ_MSG_DOC")
public class Edecl_Notuniq_Msg_Doc {
    public Edecl_Notuniq_Msg_Doc(){

    }

    @Id
    @Column(name="NUDOC_RECORDID", length = 36, nullable = false)
    private String recordId;
    @Column(name="NUDOC_DOCUMENTID", length = 36)
    private String documentId;
    @Column(name="NUDOC_REFMAINDOC", length = 36)
    private String refMainDoc;
    @Column(name="NUDOC_DOCUMENTMODEID", length = 30)
    private String documentModeId;
    @Column(name="NUDOC_REFDOCUMENTID", length = 36)
    private String refDocumentId;

    @Transient
    private Boolean needSave;

    public Boolean isNeedSave() { // NO_UCD (unused code)
        return needSave;
    }

    public void setNeedSave(Boolean needSave) {
       this.needSave = needSave;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getDocumentModeId() {
        return documentModeId;
    }

    public void setDocumentModeId(String documentModeId) {
        this.documentModeId = documentModeId;
    }

    public String getRefDocumentId() {
        return refDocumentId;
    }

    public void setRefDocumentId(String refDocumentId) {
        this.refDocumentId = refDocumentId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getRefMainDoc() {
        return refMainDoc;
    }

    public void setRefMainDoc(String refMainDoc) {
        this.refMainDoc = refMainDoc;
    }
}
