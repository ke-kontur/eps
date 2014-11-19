
package ru.acs.fts.schemas.album.postalmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������� �����������
 */
public class DespatchInfoType
{
    private String despatchNumber;
    private String filingAgency;
    private String destinationAgency;
    private List<String> commentList = new ArrayList<String>();
    private DespatchMeasuresType emptyContainers;
    private DespatchMeasuresType writtenCorrespondence;
    private DespatchMeasuresType uncapacityParcels;
    private DespatchMeasuresType EMS;

    /** 
     * Get the 'DespatchNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getDespatchNumber() {
        return despatchNumber;
    }

    /** 
     * Set the 'DespatchNumber' element value. ����� ������
     * 
     * @param despatchNumber
     */
    public void setDespatchNumber(String despatchNumber) {
        this.despatchNumber = despatchNumber;
    }

    /** 
     * Get the 'FilingAgency' element value. ���������� ������
     * 
     * @return value
     */
    public String getFilingAgency() {
        return filingAgency;
    }

    /** 
     * Set the 'FilingAgency' element value. ���������� ������
     * 
     * @param filingAgency
     */
    public void setFilingAgency(String filingAgency) {
        this.filingAgency = filingAgency;
    }

    /** 
     * Get the 'DestinationAgency' element value. ���������� ����������
     * 
     * @return value
     */
    public String getDestinationAgency() {
        return destinationAgency;
    }

    /** 
     * Set the 'DestinationAgency' element value. ���������� ����������
     * 
     * @param destinationAgency
     */
    public void setDestinationAgency(String destinationAgency) {
        this.destinationAgency = destinationAgency;
    }

    /** 
     * Get the list of 'Comments' element items. ����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. ����������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'EmptyContainers' element value. �������� � �������������� ����������� �������� ������ � ������ ������������ �������� ��������
     * 
     * @return value
     */
    public DespatchMeasuresType getEmptyContainers() {
        return emptyContainers;
    }

    /** 
     * Set the 'EmptyContainers' element value. �������� � �������������� ����������� �������� ������ � ������ ������������ �������� ��������
     * 
     * @param emptyContainers
     */
    public void setEmptyContainers(DespatchMeasuresType emptyContainers) {
        this.emptyContainers = emptyContainers;
    }

    /** 
     * Get the 'WrittenCorrespondence' element value. �������� � �������������� ����������� ���������� ���������������
     * 
     * @return value
     */
    public DespatchMeasuresType getWrittenCorrespondence() {
        return writtenCorrespondence;
    }

    /** 
     * Set the 'WrittenCorrespondence' element value. �������� � �������������� ����������� ���������� ���������������
     * 
     * @param writtenCorrespondence
     */
    public void setWrittenCorrespondence(
            DespatchMeasuresType writtenCorrespondence) {
        this.writtenCorrespondence = writtenCorrespondence;
    }

    /** 
     * Get the 'UncapacityParcels' element value. �������� � �������������� ����������� �� 
     * 
     * @return value
     */
    public DespatchMeasuresType getUncapacityParcels() {
        return uncapacityParcels;
    }

    /** 
     * Set the 'UncapacityParcels' element value. �������� � �������������� ����������� �� 
     * 
     * @param uncapacityParcels
     */
    public void setUncapacityParcels(DespatchMeasuresType uncapacityParcels) {
        this.uncapacityParcels = uncapacityParcels;
    }

    /** 
     * Get the 'EMS' element value. �������� � �������������� ����������� EMS
     * 
     * @return value
     */
    public DespatchMeasuresType getEMS() {
        return EMS;
    }

    /** 
     * Set the 'EMS' element value. �������� � �������������� ����������� EMS
     * 
     * @param EMS
     */
    public void setEMS(DespatchMeasuresType EMS) {
        this.EMS = EMS;
    }
}
