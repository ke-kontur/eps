
package ru.acs.fts.schemas.album.do2reportin;

/** 
 * Комплексный тип для описания соответствия выдаваемого товара таможенному документу
 */
public class DO2GoodCustomDocLinkType
{
    private String goodNumber;
    private String customDocNumber;

    /** 
     * Get the 'GoodNumber' element value. Валовый номер товара по отчету о выдаче
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. Валовый номер товара по отчету о выдаче
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'CustomDocNumber' element value. Порядковый номер таможенного документа в отчете о выдаче
     * 
     * @return value
     */
    public String getCustomDocNumber() {
        return customDocNumber;
    }

    /** 
     * Set the 'CustomDocNumber' element value. Порядковый номер таможенного документа в отчете о выдаче
     * 
     * @param customDocNumber
     */
    public void setCustomDocNumber(String customDocNumber) {
        this.customDocNumber = customDocNumber;
    }
}
