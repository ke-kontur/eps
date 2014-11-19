
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Параметры фильтра на реквизит документа.
 */
public class AUDAttributeFilterParamsType extends AUDUniversalFilterType
{
    private String attributeId;

    /** 
     * Get the 'AttributeId' element value. Идентификатор реквизита, на который накладывается фильтр.
     * 
     * @return value
     */
    public String getAttributeId() {
        return attributeId;
    }

    /** 
     * Set the 'AttributeId' element value. Идентификатор реквизита, на который накладывается фильтр.
     * 
     * @param attributeId
     */
    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }
}
