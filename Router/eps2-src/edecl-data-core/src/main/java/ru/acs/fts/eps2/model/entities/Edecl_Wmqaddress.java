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
@Table(name = "EDECL_WMQADDRESS")
public class Edecl_Wmqaddress {
    public Edecl_Wmqaddress(){

    }

    @Id
    @Column(name="WMQA_ID", nullable = false)
    private int id;
    @Column(name="WMQA_TRANSPORTSERVER", length = 15, nullable = false)
    private String transportServer;
    @Column(name="WMQA_LOCALMANAGER", length = 30, nullable = false)
    private String localManager;
    @Column(name="WMQA_LOCALQUEUE", length = 30, nullable = false)
    private String localQueue;
    @Column(name="WMQA_REMOTEMANAGER", length = 30)
    private String remoteManager;
    @Column(name="WMQA_REMOTEQUEUE", length = 30)
    private String remoteQueue;
    @Column(name="WMQA_DESCRIPTION", length = 100)
    private String description;

    public int getId() {
        return id;
    }

    public String getTransportServer() {
        return transportServer;
    }

    public String getLocalManager() {
        return localManager;
    }

    public String getLocalQueue() {
        return localQueue;
    }

    public String getRemoteManager() {
        return remoteManager;
    }

    public String getRemoteQueue() {
        return remoteQueue;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTransportServer(String transportServer) {
        this.transportServer = transportServer;
    }

    public void setLocalManager(String localManager) {
        this.localManager = localManager;
    }

    public void setLocalQueue(String localQueue) {
        this.localQueue = localQueue;
    }

    public void setRemoteManager(String remoteManager) {
        this.remoteManager = remoteManager;
    }

    public void setRemoteQueue(String remoteQueue) {
        this.remoteQueue = remoteQueue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   /*---------------------------------------------------------------------*/
    public String getRemoteWmqAddress(){
        return String.format("wmq://%s/%s", remoteManager, remoteQueue);
    }

    public Edecl_Wmqaddress clone(){
        Edecl_Wmqaddress wmqaddress = new Edecl_Wmqaddress();
        wmqaddress.setDescription(description);
        wmqaddress.setId(id);
        wmqaddress.setLocalManager(localManager);
        wmqaddress.setLocalQueue(localQueue);
        wmqaddress.setRemoteManager(remoteManager);
        wmqaddress.setRemoteQueue(remoteQueue);
        wmqaddress.setTransportServer(transportServer);
        return wmqaddress;
    }
}
