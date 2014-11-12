
package ru.acs.fts.schemas.album.guaranteedocreqres;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.AmountType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.CustomsGuaranteeDocType;

/** 
 * Информация о документе обеспечения
 */
public class DocumentInfoType extends CustomsGuaranteeDocType
{
    private String status;
    private LocalDate expirationDate;
    private String guaranteeType;
    private AmountType amount;
    private CUOrganizationType liableTrader;
    private CustomsType registrationCustoms;

    /** 
     * Get the 'Status' element value. Статусное состояние документа обеспечения
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статусное состояние документа обеспечения
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия обеспечения
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия обеспечения
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'GuaranteeType' element value. Тип обеспечения: 0 - простое, 1 - генеральное
     * 
     * @return value
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /** 
     * Set the 'GuaranteeType' element value. Тип обеспечения: 0 - простое, 1 - генеральное
     * 
     * @param guaranteeType
     */
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    /** 
     * Get the 'Amount' element value. Сумма обеспечения
     * 
     * @return value
     */
    public AmountType getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма обеспечения
     * 
     * @param amount
     */
    public void setAmount(AmountType amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'LiableTrader' element value. Информация о гаранте/поручителе или залогодателе
     * 
     * @return value
     */
    public CUOrganizationType getLiableTrader() {
        return liableTrader;
    }

    /** 
     * Set the 'LiableTrader' element value. Информация о гаранте/поручителе или залогодателе
     * 
     * @param liableTrader
     */
    public void setLiableTrader(CUOrganizationType liableTrader) {
        this.liableTrader = liableTrader;
    }

    /** 
     * Get the 'RegistrationCustoms' element value. Код таможенного органа, в котором зарегистрировано обеспечение
     * 
     * @return value
     */
    public CustomsType getRegistrationCustoms() {
        return registrationCustoms;
    }

    /** 
     * Set the 'RegistrationCustoms' element value. Код таможенного органа, в котором зарегистрировано обеспечение
     * 
     * @param registrationCustoms
     */
    public void setRegistrationCustoms(CustomsType registrationCustoms) {
        this.registrationCustoms = registrationCustoms;
    }
}
