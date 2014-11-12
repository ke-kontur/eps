
package ru.acs.fts.schemas.album.reservedamountrelease;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения о дополнении к договору поручительства
 */
public class AdditionalInfoType
{
    private String guarantor;
    private LocalDate validityDate;
    private String GRN;
    private String additionalID;
    private GTDIDType additionalNumber;

    /** 
     * Get the 'Guarantor' element value. Наименование поручителя
     * 
     * @return value
     */
    public String getGuarantor() {
        return guarantor;
    }

    /** 
     * Set the 'Guarantor' element value. Наименование поручителя
     * 
     * @param guarantor
     */
    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    /** 
     * Get the 'ValidityDate' element value. Cрок, до истечения которого возможно использование дополнения в целях обеспечения уплаты таможенных пошлин, налогов при таможенном транзите товаров.
     * 
     * @return value
     */
    public LocalDate getValidityDate() {
        return validityDate;
    }

    /** 
     * Set the 'ValidityDate' element value. Cрок, до истечения которого возможно использование дополнения в целях обеспечения уплаты таможенных пошлин, налогов при таможенном транзите товаров.
     * 
     * @param validityDate
     */
    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    /** 
     * Get the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @return value
     */
    public String getAdditionalID() {
        return additionalID;
    }

    /** 
     * Set the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @param additionalID
     */
    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
    }

    /** 
     * Get the 'AdditionalNumber' element value. Присвоенный номер дополнения к договору поручительства
     * 
     * @return value
     */
    public GTDIDType getAdditionalNumber() {
        return additionalNumber;
    }

    /** 
     * Set the 'AdditionalNumber' element value. Присвоенный номер дополнения к договору поручительства
     * 
     * @param additionalNumber
     */
    public void setAdditionalNumber(GTDIDType additionalNumber) {
        this.additionalNumber = additionalNumber;
    }
}
