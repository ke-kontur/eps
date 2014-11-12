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
@Table(name = "EDECL_RCD")
public class Edecl_Rcd {
    public Edecl_Rcd(){

    }

    @Id
    @Column(name="RCD_CODE", length = 3, nullable = false, columnDefinition = "CHAR(3) NOT NULL")
    private String code;
    @Column(name="RCD_DESCRIPTION", length = 20)
    private String description;
    @Column(name="RCD_WMQADDRESS", nullable = false)
    private int wmqAddress;
    @Column(name="RCD_TRANSPORTADDRESS", length = 100)
    private String transportAddress;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getWmqAddress() {
        return wmqAddress;
    }

    public String getTransportAddress() {
        return transportAddress;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWmqAddress(int wmqAddress) {
        this.wmqAddress = wmqAddress;
    }

    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }
}
