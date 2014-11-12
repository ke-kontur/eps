
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Описание несоответствия веса товара сведениям, заявленным в товаросопроводительных документах
 */
public class BruttoVolQuantType
{
    private WHSuppQuantityType bruttoVolQuantByDocs;
    private WHSuppQuantityType bruttoVolQuantByFact;

    /** 
     * Get the 'BruttoVolQuantByDocs' element value. Вес брутто/объем согласно товаросопроводительным документам
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuantByDocs() {
        return bruttoVolQuantByDocs;
    }

    /** 
     * Set the 'BruttoVolQuantByDocs' element value. Вес брутто/объем согласно товаросопроводительным документам
     * 
     * @param bruttoVolQuantByDocs
     */
    public void setBruttoVolQuantByDocs(WHSuppQuantityType bruttoVolQuantByDocs) {
        this.bruttoVolQuantByDocs = bruttoVolQuantByDocs;
    }

    /** 
     * Get the 'BruttoVolQuantByFact' element value. Вес брутто/объем фактический
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuantByFact() {
        return bruttoVolQuantByFact;
    }

    /** 
     * Set the 'BruttoVolQuantByFact' element value. Вес брутто/объем фактический
     * 
     * @param bruttoVolQuantByFact
     */
    public void setBruttoVolQuantByFact(WHSuppQuantityType bruttoVolQuantByFact) {
        this.bruttoVolQuantByFact = bruttoVolQuantByFact;
    }
}
