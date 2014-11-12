
package ru.acs.fts.schemas.album.currentimportprolong;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ��������� �� ��������� ������ ���������� �����
 */
public class CurrentImportProlongType extends BaseDocType
{
    private LocalDate initialPeriod;
    private LocalDate dateProlong;
    private String reason;
    private ETDTSNumberType TDTSNumber;
    private List<TransportMeansBaseType> transportList = new ArrayList<TransportMeansBaseType>();
    private PlaceType place;
    private String documentModeID;

    /** 
     * Get the 'InitialPeriod' element value. �������������� ���� ���������� �����
     * 
     * @return value
     */
    public LocalDate getInitialPeriod() {
        return initialPeriod;
    }

    /** 
     * Set the 'InitialPeriod' element value. �������������� ���� ���������� �����
     * 
     * @param initialPeriod
     */
    public void setInitialPeriod(LocalDate initialPeriod) {
        this.initialPeriod = initialPeriod;
    }

    /** 
     * Get the 'DateProlong' element value. ����, �� ������� ���������� �������� ���� ���������� �����
     * 
     * @return value
     */
    public LocalDate getDateProlong() {
        return dateProlong;
    }

    /** 
     * Set the 'DateProlong' element value. ����, �� ������� ���������� �������� ���� ���������� �����
     * 
     * @param dateProlong
     */
    public void setDateProlong(LocalDate dateProlong) {
        this.dateProlong = dateProlong;
    }

    /** 
     * Get the 'Reason' element value. �������
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. �������
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'TDTSNumber' element value. ��������������� ����� ����
     * 
     * @return value
     */
    public ETDTSNumberType getTDTSNumber() {
        return TDTSNumber;
    }

    /** 
     * Set the 'TDTSNumber' element value. ��������������� ����� ����
     * 
     * @param TDTSNumber
     */
    public void setTDTSNumber(ETDTSNumberType TDTSNumber) {
        this.TDTSNumber = TDTSNumber;
    }

    /** 
     * Get the list of 'Transport' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTransportList(List<TransportMeansBaseType> list) {
        transportList = list;
    }

    /** 
     * Get the 'Place' element value. �������� � ����� ������������ ���������� ������������ �������
     * 
     * @return value
     */
    public PlaceType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. �������� � ����� ������������ ���������� ������������ �������
     * 
     * @param place
     */
    public void setPlace(PlaceType place) {
        this.place = place;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
