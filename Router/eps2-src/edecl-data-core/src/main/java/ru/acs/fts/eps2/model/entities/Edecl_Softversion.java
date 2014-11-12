package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_SOFTVERSION")
public class Edecl_Softversion {
    public Edecl_Softversion(){

    }

    @Id
    @Column(name="SV_SOFTVERSIONID", length = 100, nullable = false)
    private String softVersionId;
    @Temporal(TemporalType.DATE)
    @Column(name="SV_BEGINDATE", nullable = false)
    private Date beginDate;
    @Temporal(TemporalType.DATE)
    @Column(name="SV_ENDDATE", nullable = false)
    private Date endDate;

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getSoftVersionId() {
        return softVersionId;
    }
}
