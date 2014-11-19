
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Идентификационный таможенный номер (ИТН) Республика Казахстан
 */
public class ITNKZType
{
    private String categoryCode;
    private String KATOCode;
    private String RNN;
    private String ITNReserv;

    /** 
     * Get the 'CategoryCode' element value. Категория лица. Двухзначный цифровой код категории лица согласно учредительным документам или свидетельству о регистрации в качестве индивидуального предпринимателя
     * 
     * @return value
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /** 
     * Set the 'CategoryCode' element value. Категория лица. Двухзначный цифровой код категории лица согласно учредительным документам или свидетельству о регистрации в качестве индивидуального предпринимателя
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /** 
     * Get the 'KATOCode' element value. Код КАТО. Двухзначный  код КАТО в соответствии с классификатором кодов административно-территориальных объектов
     * 
     * @return value
     */
    public String getKATOCode() {
        return KATOCode;
    }

    /** 
     * Set the 'KATOCode' element value. Код КАТО. Двухзначный  код КАТО в соответствии с классификатором кодов административно-территориальных объектов
     * 
     * @param KATOCode
     */
    public void setKATOCode(String KATOCode) {
        this.KATOCode = KATOCode;
    }

    /** 
     * Get the 'RNN' element value. РНН. Регистрационный налоговый номер, присваиваемый налоговыми органами Республики Казахстан
     * 
     * @return value
     */
    public String getRNN() {
        return RNN;
    }

    /** 
     * Set the 'RNN' element value. РНН. Регистрационный налоговый номер, присваиваемый налоговыми органами Республики Казахстан
     * 
     * @param RNN
     */
    public void setRNN(String RNN) {
        this.RNN = RNN;
    }

    /** 
     * Get the 'ITNReserv' element value. Резерв для ИТН
     * 
     * @return value
     */
    public String getITNReserv() {
        return ITNReserv;
    }

    /** 
     * Set the 'ITNReserv' element value. Резерв для ИТН
     * 
     * @param ITNReserv
     */
    public void setITNReserv(String ITNReserv) {
        this.ITNReserv = ITNReserv;
    }
}
