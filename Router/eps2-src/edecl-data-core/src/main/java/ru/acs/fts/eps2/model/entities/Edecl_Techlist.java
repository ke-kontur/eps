package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_TECHLIST")
public class Edecl_Techlist {
    public Edecl_Techlist(){

    }

    @Id
    @Column(name="TCHL_ID", length = 36, nullable = false)
    private String id;
    @Temporal(TemporalType.DATE)
    @Column(name="TCHL_BEGINDATE", nullable = false)
    private Date beginDate;
    @Temporal(TemporalType.DATE)
    @Column(name="TCHL_ENDDATE", nullable = false)
    private Date endDate;
    @Column(name="TCHL_MASK", length = 250, nullable = false)
    private String mask;

    public String getId() {
        return id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getMask() {
        return mask;
    }
}
