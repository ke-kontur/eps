
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * Сведения об оформлении, о переводе и закрытии ПС
 */
public class AdditionalInfoType
{
    private String bankRegistrationNumber;
    private String affilianceRegistrationNumber;
    private LocalDate transferDate;
    private LocalDate closingDate;
    private String closingReasons;
    private String notaryAttorneyRegNumber;

    /** 
     * Get the 'BankRegistrationNumber' element value. Регистрационный номер уполномоченного банка, территориального учреждения Банка России, оформившего ПС (принявшего на обслуживание оформленный ранее в другом уполномоченном банке ПС)
     * 
     * @return value
     */
    public String getBankRegistrationNumber() {
        return bankRegistrationNumber;
    }

    /** 
     * Set the 'BankRegistrationNumber' element value. Регистрационный номер уполномоченного банка, территориального учреждения Банка России, оформившего ПС (принявшего на обслуживание оформленный ранее в другом уполномоченном банке ПС)
     * 
     * @param bankRegistrationNumber
     */
    public void setBankRegistrationNumber(String bankRegistrationNumber) {
        this.bankRegistrationNumber = bankRegistrationNumber;
    }

    /** 
     * Get the 'AffilianceRegistrationNumber' element value. Регистрационный номер филиала банка, оформившего ПС (принявшего на обслуживание оформленный ранее в другом уполномоченном банке ПС)
     * 
     * @return value
     */
    public String getAffilianceRegistrationNumber() {
        return affilianceRegistrationNumber;
    }

    /** 
     * Set the 'AffilianceRegistrationNumber' element value. Регистрационный номер филиала банка, оформившего ПС (принявшего на обслуживание оформленный ранее в другом уполномоченном банке ПС)
     * 
     * @param affilianceRegistrationNumber
     */
    public void setAffilianceRegistrationNumber(
            String affilianceRegistrationNumber) {
        this.affilianceRegistrationNumber = affilianceRegistrationNumber;
    }

    /** 
     * Get the 'TransferDate' element value. Дата принятия ПС при переводе на обслуживание другим уполномоченным банком.
     * 
     * @return value
     */
    public LocalDate getTransferDate() {
        return transferDate;
    }

    /** 
     * Set the 'TransferDate' element value. Дата принятия ПС при переводе на обслуживание другим уполномоченным банком.
     * 
     * @param transferDate
     */
    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    /** 
     * Get the 'ClosingDate' element value. Дата закрытия ПС
     * 
     * @return value
     */
    public LocalDate getClosingDate() {
        return closingDate;
    }

    /** 
     * Set the 'ClosingDate' element value. Дата закрытия ПС
     * 
     * @param closingDate
     */
    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    /** 
     * Get the 'ClosingReasons' element value. Основание закрытия ПС
     * 
     * @return value
     */
    public String getClosingReasons() {
        return closingReasons;
    }

    /** 
     * Set the 'ClosingReasons' element value. Основание закрытия ПС
     * 
     * @param closingReasons
     */
    public void setClosingReasons(String closingReasons) {
        this.closingReasons = closingReasons;
    }

    /** 
     * Get the 'NotaryAttorneyRegNumber' element value. Регистрационный номер нотариуса/адвоката
     * 
     * @return value
     */
    public String getNotaryAttorneyRegNumber() {
        return notaryAttorneyRegNumber;
    }

    /** 
     * Set the 'NotaryAttorneyRegNumber' element value. Регистрационный номер нотариуса/адвоката
     * 
     * @param notaryAttorneyRegNumber
     */
    public void setNotaryAttorneyRegNumber(String notaryAttorneyRegNumber) {
        this.notaryAttorneyRegNumber = notaryAttorneyRegNumber;
    }
}
