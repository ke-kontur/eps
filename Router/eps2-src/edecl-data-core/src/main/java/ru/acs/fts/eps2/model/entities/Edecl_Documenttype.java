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
@Table(name = "EDECL_DOCUMENTTYPE")
public class Edecl_Documenttype {
   public Edecl_Documenttype(){

   }

   @Id
   @Column(name="DCMT_CODEDOCUMENT", length = 18, nullable = false)
   private String codeDocument;
   @Column(name="DCMT_NAMEDOCUMENT", length = 250, nullable = false)
   private String nameDocument;

    public String getCodeDocument() {
        return codeDocument;
    }

    public String getNameDocument() {
        return nameDocument;
    }
}
