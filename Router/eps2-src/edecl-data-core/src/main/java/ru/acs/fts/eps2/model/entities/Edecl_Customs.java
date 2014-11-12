package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_CUSTOMS")
public class Edecl_Customs {
    public Edecl_Customs(){

    }

    @Id
    @Column(name="CUST_CODE", length = 8, nullable = false)
    private String customCode;
    @Column(name="CUST_EXCHANGETYPE", length = 8, nullable = false)
    private String customExchange;
    @Column(name="CUST_NAME", length = 50)
    private String name;
    @Column(name="CUST_TRANSPORTADDRESS", length = 100)
    private String transportAddress;
    @Column(name="CUST_WMQADDRESS", nullable = false)
    private int wmqAddress;
    @Column(name="CUST_REF_CODE", length=8)
    private String refCode;
    @Column(name="CUST_REF_NAME", length=50)
    private String refName;
    @Column(name="CUST_KASTOID")
    private int kastoId;
    @Temporal(TemporalType.DATE)
    @Column(name="CUST_STARTDATE", nullable = false)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @Column(name="CUST_ENDDATE")
    private Date endDate;

    public String getCustomCode() {
        return customCode;
    }

    public String getCustomExchange() {
        return customExchange;
    }

    public String getName() {
        return name;
    }

    public String getTransportAddress() {
        return transportAddress;
    }

    public String getRefCode() {
        return refCode;
    }

    public String getRefName() {
        return refName;
    }

    public int getKastoId() {
        return kastoId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getWmqAddress() {
        return wmqAddress;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public void setCustomExchange(String customExchange) {
        this.customExchange = customExchange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }

    public void setWmqAddress(int wmqAddress) {
        this.wmqAddress = wmqAddress;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public void setKastoId(int kastoId) {
        this.kastoId = kastoId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
