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
@Table(name = "EDECL_STATUSLIST")
public class Edecl_Statuslist {
    public Edecl_Statuslist(){

    }

    @Id
    @Column(name="ST_CODE", length = 30, nullable = false)
    private String code;
    @Column(name="ST_DESCRIPTION", length = 100, nullable = false)
    private String description;
    @Column(name="ST_EXTDESCRIPTION", length = 100)
    private String extDescription;
    @Column(name="ST_INTDESCRIPTION", length = 100)
    private String intDescription;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtDescription() {
        return extDescription;
    }

    public void setExtDescription(String extDescription) {
        this.extDescription = extDescription;
    }

    public String getIntDescription() {
        return intDescription;
    }

    public void setIntDescription(String intDescription) {
        this.intDescription = intDescription;
    }
}
