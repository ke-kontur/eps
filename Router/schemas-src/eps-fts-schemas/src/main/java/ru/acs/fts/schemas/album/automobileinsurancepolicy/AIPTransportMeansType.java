
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType;

/** 
 * �������� � ������������ �������� 
 */
public class AIPTransportMeansType
{
    private String transportStateSignID;
    private String model;
    private String mark;
    private String markCode;
    private String VINID;
    private String offtakeYear;
    private TransportMeansPassportType AIPTransportMeansPassport;

    /** 
     * Get the 'TransportStateSignID' element value. ��������������� ���� ������������� ��������
     * 
     * @return value
     */
    public String getTransportStateSignID() {
        return transportStateSignID;
    }

    /** 
     * Set the 'TransportStateSignID' element value. ��������������� ���� ������������� ��������
     * 
     * @param transportStateSignID
     */
    public void setTransportStateSignID(String transportStateSignID) {
        this.transportStateSignID = transportStateSignID;
    }

    /** 
     * Get the 'Model' element value. �����, ������
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. �����, ������
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. ������������ ����� � ���������
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������������ ����� � ���������
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'MarkCode' element value. ��� ����� 
     * 
     * @return value
     */
    public String getMarkCode() {
        return markCode;
    }

    /** 
     * Set the 'MarkCode' element value. ��� ����� 
     * 
     * @param markCode
     */
    public void setMarkCode(String markCode) {
        this.markCode = markCode;
    }

    /** 
     * Get the 'VINID' element value. ����������������� ����� (VIN)
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. ����������������� ����� (VIN)
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'OfftakeYear' element value. ��� ������������ ������������� ��������
     * 
     * @return value
     */
    public String getOfftakeYear() {
        return offtakeYear;
    }

    /** 
     * Set the 'OfftakeYear' element value. ��� ������������ ������������� ��������
     * 
     * @param offtakeYear
     */
    public void setOfftakeYear(String offtakeYear) {
        this.offtakeYear = offtakeYear;
    }

    /** 
     * Get the 'AIPTransportMeansPassport' element value. ����� � ����� �������� ������������� ��������
     * 
     * @return value
     */
    public TransportMeansPassportType getAIPTransportMeansPassport() {
        return AIPTransportMeansPassport;
    }

    /** 
     * Set the 'AIPTransportMeansPassport' element value. ����� � ����� �������� ������������� ��������
     * 
     * @param AIPTransportMeansPassport
     */
    public void setAIPTransportMeansPassport(
            TransportMeansPassportType AIPTransportMeansPassport) {
        this.AIPTransportMeansPassport = AIPTransportMeansPassport;
    }
}
