
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * ������������ ��������
 */
public class SCVVTransportMeansType
{
    private String transportIdentifier;
    private String trailerIdentifier;
    private String secondTrailerIdentifier;
    private String transportModeCode;
    private String transportMeansNationalityCode;
    private String transportTraditionalName;

    /** 
     * Get the 'TransportIdentifier' element value. ������������� (�����) ��������� ������������� ��������.
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. ������������� (�����) ��������� ������������� ��������.
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TrailerIdentifier' element value. ������������� (�����) ���������� ������������� ��������.
     * 
     * @return value
     */
    public String getTrailerIdentifier() {
        return trailerIdentifier;
    }

    /** 
     * Set the 'TrailerIdentifier' element value. ������������� (�����) ���������� ������������� ��������.
     * 
     * @param trailerIdentifier
     */
    public void setTrailerIdentifier(String trailerIdentifier) {
        this.trailerIdentifier = trailerIdentifier;
    }

    /** 
     * Get the 'SecondTrailerIdentifier' element value. ������������� (�����) ������� ���������� ������������� ��������
     * 
     * @return value
     */
    public String getSecondTrailerIdentifier() {
        return secondTrailerIdentifier;
    }

    /** 
     * Set the 'SecondTrailerIdentifier' element value. ������������� (�����) ������� ���������� ������������� ��������
     * 
     * @param secondTrailerIdentifier
     */
    public void setSecondTrailerIdentifier(String secondTrailerIdentifier) {
        this.secondTrailerIdentifier = secondTrailerIdentifier;
    }

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� ��������������� �������������� ����� ����.
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� ��������������� �������������� ����� ����.
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }

    /** 
     * Get the 'TransportTraditionalName' element value. ������������ ������������ ������������� ��������. �� �������������� ����� ���������� � ��������������� �������.. 
     * 
     * @return value
     */
    public String getTransportTraditionalName() {
        return transportTraditionalName;
    }

    /** 
     * Set the 'TransportTraditionalName' element value. ������������ ������������ ������������� ��������. �� �������������� ����� ���������� � ��������������� �������.. 
     * 
     * @param transportTraditionalName
     */
    public void setTransportTraditionalName(String transportTraditionalName) {
        this.transportTraditionalName = transportTraditionalName;
    }
}
