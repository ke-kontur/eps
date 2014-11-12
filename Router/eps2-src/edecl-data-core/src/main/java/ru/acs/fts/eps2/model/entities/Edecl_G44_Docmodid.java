package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@IdClass(Edecl_G44_Docmodid_Ids.class)
@Table(name = "EDECL_G44_DOCMODID")
public class Edecl_G44_Docmodid {
    public Edecl_G44_Docmodid(){

    }

    @Id
    @Column(name="G44DMI_DOCCODE", nullable = false, length = 30)
    private String docCode;
    @Id
    @Column(name="G44DMI_DOCMODEID", length = 30, nullable = false)
    private String docModeId;

    public String getDocCode() {
        return docCode;
    }

    public String getDocModeId() {
        return docModeId;
    }
}
