
package ru.acs.fts.schemas.album.contractdealpassport;

/** 
 * ����� ��
 */
public class RegNumberType
{
    private String registrationPeriod;
    private String PSSerialNumber;
    private String bankRegistrationNumber;
    private String affiliateSerialNumber;
    private String contractCode;
    private String residentSign;

    /** 
     * Get the 'RegistrationPeriod' element value. ������ � ������� �������� �� (gg - ���, mm - ����� ������).
     * 
     * @return value
     */
    public String getRegistrationPeriod() {
        return registrationPeriod;
    }

    /** 
     * Set the 'RegistrationPeriod' element value. ������ � ������� �������� �� (gg - ���, mm - ����� ������).
     * 
     * @param registrationPeriod
     */
    public void setRegistrationPeriod(String registrationPeriod) {
        this.registrationPeriod = registrationPeriod;
    }

    /** 
     * Get the 'PSSerialNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public String getPSSerialNumber() {
        return PSSerialNumber;
    }

    /** 
     * Set the 'PSSerialNumber' element value. ���������� ����� ��
     * 
     * @param PSSerialNumber
     */
    public void setPSSerialNumber(String PSSerialNumber) {
        this.PSSerialNumber = PSSerialNumber;
    }

    /** 
     * Get the 'BankRegistrationNumber' element value. ��������������� ����� ��������������� ����� � ������������ � ������ ��������������� ����������� ��������� ����������� (�����)
     * 
     * @return value
     */
    public String getBankRegistrationNumber() {
        return bankRegistrationNumber;
    }

    /** 
     * Set the 'BankRegistrationNumber' element value. ��������������� ����� ��������������� ����� � ������������ � ������ ��������������� ����������� ��������� ����������� (�����)
     * 
     * @param bankRegistrationNumber
     */
    public void setBankRegistrationNumber(String bankRegistrationNumber) {
        this.bankRegistrationNumber = bankRegistrationNumber;
    }

    /** 
     * Get the 'AffiliateSerialNumber' element value. ���������� ����� ��������������� ����� � ������������ � ����� / (GU(��� �����))
     * 
     * @return value
     */
    public String getAffiliateSerialNumber() {
        return affiliateSerialNumber;
    }

    /** 
     * Set the 'AffiliateSerialNumber' element value. ���������� ����� ��������������� ����� � ������������ � ����� / (GU(��� �����))
     * 
     * @param affiliateSerialNumber
     */
    public void setAffiliateSerialNumber(String affiliateSerialNumber) {
        this.affiliateSerialNumber = affiliateSerialNumber;
    }

    /** 
     * Get the 'ContractCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getContractCode() {
        return contractCode;
    }

    /** 
     * Set the 'ContractCode' element value. ��� ���� ���������
     * 
     * @param contractCode
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /** 
     * Get the 'ResidentSign' element value. ������� ���������, ����������� ��
     * 
     * @return value
     */
    public String getResidentSign() {
        return residentSign;
    }

    /** 
     * Set the 'ResidentSign' element value. ������� ���������, ����������� ��
     * 
     * @param residentSign
     */
    public void setResidentSign(String residentSign) {
        this.residentSign = residentSign;
    }
}
