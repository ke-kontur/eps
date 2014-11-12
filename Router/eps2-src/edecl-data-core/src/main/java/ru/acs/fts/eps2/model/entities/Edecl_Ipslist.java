package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_IPSLIST")
public class Edecl_Ipslist {
    public Edecl_Ipslist(){

    }

    @Id
    @Column(name="IPSL_ID", length = 36, nullable = false)
    private String id;
    @Column(name="IPSL_DESCRIPTION", length = 250, nullable = false)
    private String description;
    @Column(name="IPSL_WRITERORG", length = 150)
    private String writeOrg;
    @Column(name="IPSL_COMMENTS", length = 250)
    private String comments;
    @Temporal(TemporalType.DATE)
    @Column(name="IPSL_CREATEDATE")
    private Date createDate;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getWriteOrg() {
        return writeOrg;
    }

    public String getComments() {
        return comments;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWriteOrg(String writeOrg) {
        this.writeOrg = writeOrg;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
