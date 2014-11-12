
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Описание несоответствия кода товара по ТН ВЭД сведениям, заявленным в товаросопроводительных документах
 */
public class GoodsTNVEDCodeType
{
    private String TNVEDCodeByDocs;
    private String TNVEDCodeByFact;

    /** 
     * Get the 'TNVEDCodeByDocs' element value. Код товара по ТН ВЭД ТС согласно товаросопроводительным документам
     * 
     * @return value
     */
    public String getTNVEDCodeByDocs() {
        return TNVEDCodeByDocs;
    }

    /** 
     * Set the 'TNVEDCodeByDocs' element value. Код товара по ТН ВЭД ТС согласно товаросопроводительным документам
     * 
     * @param TNVEDCodeByDocs
     */
    public void setTNVEDCodeByDocs(String TNVEDCodeByDocs) {
        this.TNVEDCodeByDocs = TNVEDCodeByDocs;
    }

    /** 
     * Get the 'TNVEDCodeByFact' element value. Код товара по ТН ВЭД ТС фактический
     * 
     * @return value
     */
    public String getTNVEDCodeByFact() {
        return TNVEDCodeByFact;
    }

    /** 
     * Set the 'TNVEDCodeByFact' element value. Код товара по ТН ВЭД ТС фактический
     * 
     * @param TNVEDCodeByFact
     */
    public void setTNVEDCodeByFact(String TNVEDCodeByFact) {
        this.TNVEDCodeByFact = TNVEDCodeByFact;
    }
}
