package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_ALBUM_DOCLIST")
public class Edecl_Album_Doclist {
    public Edecl_Album_Doclist(){

    }

    @Id
    @Column(name="DOCUMENTMODEID", length = 30, nullable = false)
    private String docuementModeID;
    @Column(name="ALBUM_DOCDESCIPTION", length = 250)
    private String documentDescription;

    public String getDocuementModeID() {
        return docuementModeID;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }
}
