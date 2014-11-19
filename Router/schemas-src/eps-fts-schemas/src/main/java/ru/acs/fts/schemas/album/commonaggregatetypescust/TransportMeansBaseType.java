
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������� ��� ��� �������� ������������� �������� � ���������� ����������
 */
public class TransportMeansBaseType
{
    private String VIN;
    private String transportKindCode;
    private String transportMarkCode;
    private String transportIdentifier;
    private String transportMeansNationalityCode;
    private String activeTransportIdentifier;
    private String transportRegNumber;

    /** 
     * Get the 'VIN' element value. ����� ����� (VIN)
     * 
     * @return value
     */
    public String getVIN() {
        return VIN;
    }

    /** 
     * Set the 'VIN' element value. ����� ����� (VIN)
     * 
     * @param VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /** 
     * Get the 'TransportKindCode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getTransportKindCode() {
        return transportKindCode;
    }

    /** 
     * Set the 'TransportKindCode' element value. ��� ���� ������������� ��������
     * 
     * @param transportKindCode
     */
    public void setTransportKindCode(String transportKindCode) {
        this.transportKindCode = transportKindCode;
    }

    /** 
     * Get the 'TransportMarkCode' element value. ��� ����� ������������� ��������
     * 
     * @return value
     */
    public String getTransportMarkCode() {
        return transportMarkCode;
    }

    /** 
     * Set the 'TransportMarkCode' element value. ��� ����� ������������� ��������
     * 
     * @param transportMarkCode
     */
    public void setTransportMarkCode(String transportMarkCode) {
        this.transportMarkCode = transportMarkCode;
    }

    /** 
     * Get the 'TransportIdentifier' element value. �������������. ����� ������������� ��������, ������������ �����, ����� ���������, ����� ������, ����� ���������������� ������ (��������, ������� � �.�.)
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. �������������. ����� ������������� ��������, ������������ �����, ����� ���������, ����� ������, ����� ���������������� ������ (��������, ������� � �.�.)
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� �������������� ����� ����
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� �������������� ����� ����
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. ������������� ��������� ������������� �������� ��� ��������, ������������ � ��.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. ������������� ��������� ������������� �������� ��� ��������, ������������ � ��.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }

    /** 
     * Get the 'TransportRegNumber' element value. ����� ������������� � ����������� ������������� �������� ��� ��
     * 
     * @return value
     */
    public String getTransportRegNumber() {
        return transportRegNumber;
    }

    /** 
     * Set the 'TransportRegNumber' element value. ����� ������������� � ����������� ������������� �������� ��� ��
     * 
     * @param transportRegNumber
     */
    public void setTransportRegNumber(String transportRegNumber) {
        this.transportRegNumber = transportRegNumber;
    }
}
