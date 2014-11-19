
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * ����� �������������
 */
public class AWBNumberType
{
    private String airlineIATACode;
    private String documentNumber;
    private String airlineSign;

    /** 
     * Get the 'AirlineIATACode' element value. IATA-��� ������������. ��������
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. IATA-��� ������������. ��������
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'DocumentNumber' element value. �������� ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. �������� ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'AirlineSign' element value. ������� ����, ��� ��������������, �������������� ���������, �������� ������ ����
     * 
     * @return value
     */
    public String getAirlineSign() {
        return airlineSign;
    }

    /** 
     * Set the 'AirlineSign' element value. ������� ����, ��� ��������������, �������������� ���������, �������� ������ ����
     * 
     * @param airlineSign
     */
    public void setAirlineSign(String airlineSign) {
        this.airlineSign = airlineSign;
    }
}
