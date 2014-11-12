
package ru.acs.fts.schemas.album.factintermediatelanding;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * ����������� � ����� ���������� �������
 */
public class FactIntermediateLandingType extends BaseDocType
{
    private String UIN;
    private CUCustomsType customs;
    private FlightType flight;
    private String documentModeID;

    /** 
     * Get the 'UIN' element value. ���
     * 
     * @return value
     */
    public String getUIN() {
        return UIN;
    }

    /** 
     * Set the 'UIN' element value. ���
     * 
     * @param UIN
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Flight' element value. �������� � �����
     * 
     * @return value
     */
    public FlightType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. �������� � �����
     * 
     * @param flight
     */
    public void setFlight(FlightType flight) {
        this.flight = flight;
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
