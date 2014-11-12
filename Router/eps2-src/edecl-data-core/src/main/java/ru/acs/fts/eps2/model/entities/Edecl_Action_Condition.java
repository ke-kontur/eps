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
@Table(name = "EDECL_ACTION_CONDITION")
@Deprecated
public class Edecl_Action_Condition { // NO_UCD (marked for remove)
    public Edecl_Action_Condition(){

    }

    @Id
    @Column(name="AC_NAME", length = 100, nullable = false)
    private String name;
    @Column(name="AC_DESCRIPTION", length = 100)
    private String description;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
