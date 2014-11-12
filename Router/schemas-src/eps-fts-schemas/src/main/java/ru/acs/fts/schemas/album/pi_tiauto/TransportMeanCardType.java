
package ru.acs.fts.schemas.album.pi_tiauto;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.commonleaftypescust.TransportCategoryCodeType;

/** 
 * �������� ������������� ��������. �������� � ������������ ��������
 */
public class TransportMeanCardType extends AutomobileBaseType
{
    private String countryCode;
    private String countryName;
    private String transportMeansTypeCode;
    private TransportCategoryCodeType transportCategoryCode;
    private String stateRegNumber;

    /** 
     * Get the 'CountryCode' element value. ��������� ��� ������ � ������������ � ��������������� ����� ����
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��������� ��� ������ � ������������ � ��������������� ����� ����
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. ������� �������� ������ � ������������ � ��������������� ����� ����
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������� �������� ������ � ������������ � ��������������� ����� ����
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'TransportMeansTypeCode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /** 
     * Set the 'TransportMeansTypeCode' element value. ��� ���� ������������� ��������
     * 
     * @param transportMeansTypeCode
     */
    public void setTransportMeansTypeCode(String transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
    }

    /** 
     * Get the 'TransportCategoryCode' element value. ��� ��������� ��
     * 
     * @return value
     */
    public TransportCategoryCodeType getTransportCategoryCode() {
        return transportCategoryCode;
    }

    /** 
     * Set the 'TransportCategoryCode' element value. ��� ��������� ��
     * 
     * @param transportCategoryCode
     */
    public void setTransportCategoryCode(
            TransportCategoryCodeType transportCategoryCode) {
        this.transportCategoryCode = transportCategoryCode;
    }

    /** 
     * Get the 'StateRegNumber' element value. ��������������� ��������������� �����
     * 
     * @return value
     */
    public String getStateRegNumber() {
        return stateRegNumber;
    }

    /** 
     * Set the 'StateRegNumber' element value. ��������������� ��������������� �����
     * 
     * @param stateRegNumber
     */
    public void setStateRegNumber(String stateRegNumber) {
        this.stateRegNumber = stateRegNumber;
    }
}
