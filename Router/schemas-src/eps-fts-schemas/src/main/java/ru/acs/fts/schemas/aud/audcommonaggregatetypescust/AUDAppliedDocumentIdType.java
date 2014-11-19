
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о прикладном идентификаторе документа.
 */
public class AUDAppliedDocumentIdType
{
    private String appliedDocumentId;

    /** 
     * Get the 'AppliedDocumentId' element value. Прикладной идентификатор документа. Значение должно быть равно значению 'DocumentID' ("Уникальный идентификатор документа") прикладного документа.
     * 
     * @return value
     */
    public String getAppliedDocumentId() {
        return appliedDocumentId;
    }

    /** 
     * Set the 'AppliedDocumentId' element value. Прикладной идентификатор документа. Значение должно быть равно значению 'DocumentID' ("Уникальный идентификатор документа") прикладного документа.
     * 
     * @param appliedDocumentId
     */
    public void setAppliedDocumentId(String appliedDocumentId) {
        this.appliedDocumentId = appliedDocumentId;
    }
}
