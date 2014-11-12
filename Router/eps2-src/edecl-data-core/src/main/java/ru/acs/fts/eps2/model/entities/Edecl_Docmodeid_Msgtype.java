package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@IdClass(Edecl_Docmodeid_Msgtype_Ids.class)
@Table(name = "EDECL_DOCMODEID_MSGTYPE")
public class Edecl_Docmodeid_Msgtype {
    public Edecl_Docmodeid_Msgtype(){

    }

    @Id
    @Column(name="MI_MT_DOCMODEID", nullable = false, length = 30)
    private String docModeId;
    @Id
    @Column(name="MI_MT_MSGTYPE", length = 9, nullable = false)
    private String msgType;

    public String getDocModeId() {
        return docModeId;
    }

    public String getMsgType() {
        return msgType;
    }
}
