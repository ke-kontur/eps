package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */
@Entity
@Table(name = "AUDIT_EDECL_IPSLIST")
public class Audit_Edecl_Ipslist { // NO_UCD (for future use)
    public Audit_Edecl_Ipslist(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "AIPSL_AID", nullable = false)
    private Long aId;
    @Column(name = "AIPSL_IPSLID", length = 36, nullable = false)
    private String ipslId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AIPSL_CHDATE", length = 6, nullable = false)
    private Date changeDate;
    @Column(name = "AIPSL_CHUSER", length = 50, nullable = false)
    private String chUser;
    @Column(name = "AIPSL_CHDESCRIPTION", length = 250, nullable = false)
    private String chDescription;
    @Column(name = "AIPSL_CHTYPE", length = 1, nullable = false)
    private Integer chType;
    @Column(name = "AIPSL_PUBLISHED", length = 1, nullable = false)
    private Integer published;
    @Column(name = "AIPSL_DESCRIPTION", length = 250, nullable = true)
    private String description;
    @Column(name = "AIPSL_WRITERORG", length = 150, nullable = true)
    private String writeOrg;
    @Column(name = "AIPSL_COMMENTS", length = 250, nullable = true)
    private String comments;
    @Column(name = "AIPSL_MSG_ENVELOPEID", length = 36, nullable = true)
    private String envelopeId;
    @Column(name = "AIPSL_MSG_DOCUMENTID", length = 36, nullable = true)
    private String documentId;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getIpslId() {
        return ipslId;
    }

    public void setIpslId(String ipslId) {
        this.ipslId = ipslId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getChUser() {
        return chUser;
    }

    public void setChUser(String chUser) {
        this.chUser = chUser;
    }

    public String getChDescription() {
        return chDescription;
    }

    public void setChDescription(String chDescription) {
        this.chDescription = chDescription;
    }

    public Integer getChType() {
        return chType;
    }

    public void setChType(Integer chType) {
        this.chType = chType;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWriteOrg() {
        return writeOrg;
    }

    public void setWriteOrg(String writeOrg) {
        this.writeOrg = writeOrg;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
