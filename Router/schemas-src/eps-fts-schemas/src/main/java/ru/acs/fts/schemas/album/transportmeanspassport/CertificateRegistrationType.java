
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;

/** 
 * ������������� � ����������� ��
 */
public class CertificateRegistrationType
{
    private String series;
    private String number;
    private String regSign;
    private LocalDate regData;
    private String issuedGIBDD;
    private String regionCode;

    /** 
     * Get the 'Series' element value. �����
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. �����
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'Number' element value. �����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. �����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'RegSign' element value. ��������������� �����
     * 
     * @return value
     */
    public String getRegSign() {
        return regSign;
    }

    /** 
     * Set the 'RegSign' element value. ��������������� �����
     * 
     * @param regSign
     */
    public void setRegSign(String regSign) {
        this.regSign = regSign;
    }

    /** 
     * Get the 'RegData' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getRegData() {
        return regData;
    }

    /** 
     * Set the 'RegData' element value. ���� �����������
     * 
     * @param regData
     */
    public void setRegData(LocalDate regData) {
        this.regData = regData;
    }

    /** 
     * Get the 'IssuedGIBDD' element value. ������ �����
     * 
     * @return value
     */
    public String getIssuedGIBDD() {
        return issuedGIBDD;
    }

    /** 
     * Set the 'IssuedGIBDD' element value. ������ �����
     * 
     * @param issuedGIBDD
     */
    public void setIssuedGIBDD(String issuedGIBDD) {
        this.issuedGIBDD = issuedGIBDD;
    }

    /** 
     * Get the 'RegionCode' element value. ��� �������
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. ��� �������
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
