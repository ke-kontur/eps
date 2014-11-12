package ru.acs.fts.eps2.model.entities;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDECL_ERRLIST")
public class Edecl_Errlist {
    public Edecl_Errlist(){

    }

   @Id
   @Column(name="ERR_ERRCODE", length = 12, nullable = false)
   private String errCode;
   @Column(name="ERR_PUBLICDESCRIPTION", length = 150)
   private String publicDescription;
   @Column(name="ERR_PRIVATEDESCRIPTION", length = 150)
   private String privateDescription;
   @Column(name="ERR_CATEGORY", length = 38)
   private Integer category;

    public String getErrCode() {
        return errCode;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public String getPrivateDescription() {
        return privateDescription;
    }

    public Integer getCategory() {
        return category;
    }
}
