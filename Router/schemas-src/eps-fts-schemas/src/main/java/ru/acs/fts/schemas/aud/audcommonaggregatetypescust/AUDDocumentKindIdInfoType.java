
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация для идентификации вида документа.
 */
public class AUDDocumentKindIdInfoType
{
    private String appliedDocumentKindId;

    /** 
     * Get the 'AppliedDocumentKindId' element value. Идентификатор вида прикладных документов. Значение должно быть равно значению атрибута 'DocumentModeID' ("Идентификатор вида документа. Код документа в Альбоме форматов.") прикладного документа.
     * 
     * @return value
     */
    public String getAppliedDocumentKindId() {
        return appliedDocumentKindId;
    }

    /** 
     * Set the 'AppliedDocumentKindId' element value. Идентификатор вида прикладных документов. Значение должно быть равно значению атрибута 'DocumentModeID' ("Идентификатор вида документа. Код документа в Альбоме форматов.") прикладного документа.
     * 
     * @param appliedDocumentKindId
     */
    public void setAppliedDocumentKindId(String appliedDocumentKindId) {
        this.appliedDocumentKindId = appliedDocumentKindId;
    }
}
