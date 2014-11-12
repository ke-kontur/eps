
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDDocumentAttributeValueKindType;

/** 
 * Информация о реквизите документа.
 */
public class AUDDocumentAttributeInfoType
        extends
            AUDDocumentAttributeIdInfoType
{
    private String description;
    private AUDDocumentAttributeValueKindType valueKind;

    /** 
     * Get the 'Description' element value. Название реквизита (краткое описание).
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Название реквизита (краткое описание).
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'ValueKind' element value. Тип значения реквизита.
     * 
     * @return value
     */
    public AUDDocumentAttributeValueKindType getValueKind() {
        return valueKind;
    }

    /** 
     * Set the 'ValueKind' element value. Тип значения реквизита.
     * 
     * @param valueKind
     */
    public void setValueKind(AUDDocumentAttributeValueKindType valueKind) {
        this.valueKind = valueKind;
    }
}
