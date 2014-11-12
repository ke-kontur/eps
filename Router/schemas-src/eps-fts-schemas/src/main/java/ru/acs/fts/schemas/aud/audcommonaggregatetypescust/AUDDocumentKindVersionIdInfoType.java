
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация для идентификации версии вида документа.
 */
public class AUDDocumentKindVersionIdInfoType extends AUDDocumentKindIdInfoType
{
    private String appliedDocumentKindVersionId;

    /** 
     * Get the 'AppliedDocumentKindVersionId' element value. Идентификатор версии вида прикладных документов. Значение должно быть равно идентификатору пространства имен XML прикладного документа (корневого элемента документа).
     * 
     * @return value
     */
    public String getAppliedDocumentKindVersionId() {
        return appliedDocumentKindVersionId;
    }

    /** 
     * Set the 'AppliedDocumentKindVersionId' element value. Идентификатор версии вида прикладных документов. Значение должно быть равно идентификатору пространства имен XML прикладного документа (корневого элемента документа).
     * 
     * @param appliedDocumentKindVersionId
     */
    public void setAppliedDocumentKindVersionId(
            String appliedDocumentKindVersionId) {
        this.appliedDocumentKindVersionId = appliedDocumentKindVersionId;
    }
}
