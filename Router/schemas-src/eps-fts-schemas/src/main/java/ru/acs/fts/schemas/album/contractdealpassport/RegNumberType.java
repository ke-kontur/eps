
package ru.acs.fts.schemas.album.contractdealpassport;

/** 
 * Номер ПС
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
     * Get the 'RegistrationPeriod' element value. Период в котором оформлен ПС (gg - год, mm - номер месяца).
     * 
     * @return value
     */
    public String getRegistrationPeriod() {
        return registrationPeriod;
    }

    /** 
     * Set the 'RegistrationPeriod' element value. Период в котором оформлен ПС (gg - год, mm - номер месяца).
     * 
     * @param registrationPeriod
     */
    public void setRegistrationPeriod(String registrationPeriod) {
        this.registrationPeriod = registrationPeriod;
    }

    /** 
     * Get the 'PSSerialNumber' element value. Порядковый номер ПС
     * 
     * @return value
     */
    public String getPSSerialNumber() {
        return PSSerialNumber;
    }

    /** 
     * Set the 'PSSerialNumber' element value. Порядковый номер ПС
     * 
     * @param PSSerialNumber
     */
    public void setPSSerialNumber(String PSSerialNumber) {
        this.PSSerialNumber = PSSerialNumber;
    }

    /** 
     * Get the 'BankRegistrationNumber' element value. Регистрационный номер уполномоченного банка в соответствии с Книгой государственной регистрации кредитных организаций (КГРКО)
     * 
     * @return value
     */
    public String getBankRegistrationNumber() {
        return bankRegistrationNumber;
    }

    /** 
     * Set the 'BankRegistrationNumber' element value. Регистрационный номер уполномоченного банка в соответствии с Книгой государственной регистрации кредитных организаций (КГРКО)
     * 
     * @param bankRegistrationNumber
     */
    public void setBankRegistrationNumber(String bankRegistrationNumber) {
        this.bankRegistrationNumber = bankRegistrationNumber;
    }

    /** 
     * Get the 'AffiliateSerialNumber' element value. Порядковый номер уполномоченного банка в соответствии с КГРКО / (GU(Код ОКАТО))
     * 
     * @return value
     */
    public String getAffiliateSerialNumber() {
        return affiliateSerialNumber;
    }

    /** 
     * Set the 'AffiliateSerialNumber' element value. Порядковый номер уполномоченного банка в соответствии с КГРКО / (GU(Код ОКАТО))
     * 
     * @param affiliateSerialNumber
     */
    public void setAffiliateSerialNumber(String affiliateSerialNumber) {
        this.affiliateSerialNumber = affiliateSerialNumber;
    }

    /** 
     * Get the 'ContractCode' element value. Код вида контракта
     * 
     * @return value
     */
    public String getContractCode() {
        return contractCode;
    }

    /** 
     * Set the 'ContractCode' element value. Код вида контракта
     * 
     * @param contractCode
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /** 
     * Get the 'ResidentSign' element value. Признак резидента, оформившего ПС
     * 
     * @return value
     */
    public String getResidentSign() {
        return residentSign;
    }

    /** 
     * Set the 'ResidentSign' element value. Признак резидента, оформившего ПС
     * 
     * @param residentSign
     */
    public void setResidentSign(String residentSign) {
        this.residentSign = residentSign;
    }
}
