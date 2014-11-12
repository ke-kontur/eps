
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о виде представления (для визуализации документа).
 */
public class AUDRepresentationKindCommonInfoType
        extends
            AUDRepresentationKindIdInfoType
{
    private String description;

    /** 
     * Get the 'Description' element value. Описание представления.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание представления.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
