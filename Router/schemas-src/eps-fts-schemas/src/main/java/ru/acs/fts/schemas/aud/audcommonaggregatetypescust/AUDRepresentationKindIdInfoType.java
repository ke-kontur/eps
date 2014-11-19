
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация об идентификаторе вида представления (для визуализации документа).
 */
public class AUDRepresentationKindIdInfoType
{
    private String representationKindId;

    /** 
     * Get the 'RepresentationKindId' element value. Идентификатор вида представления.
     * 
     * @return value
     */
    public String getRepresentationKindId() {
        return representationKindId;
    }

    /** 
     * Set the 'RepresentationKindId' element value. Идентификатор вида представления.
     * 
     * @param representationKindId
     */
    public void setRepresentationKindId(String representationKindId) {
        this.representationKindId = representationKindId;
    }
}
