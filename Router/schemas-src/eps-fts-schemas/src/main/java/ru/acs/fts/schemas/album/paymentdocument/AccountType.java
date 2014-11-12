
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * Номер лицевого счета плательщика
 */
public class AccountType
{
    private String customsCode;
    private LocalDate date;
    private String INN;
    private String KPP;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, открывшего лицевой счет участника ВЭД
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, открывшего лицевой счет участника ВЭД
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'Date' element value. Дата открытия лицевого счета участника ВЭД
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата открытия лицевого счета участника ВЭД
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. КПП - Код причины постановки на учет.
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП - Код причины постановки на учет.
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }
}
