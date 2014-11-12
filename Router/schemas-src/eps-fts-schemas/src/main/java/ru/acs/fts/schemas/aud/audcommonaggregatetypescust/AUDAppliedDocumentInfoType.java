
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о документе от прикладной системы.
 */
public class AUDAppliedDocumentInfoType extends AUDAppliedDocumentIdType
{
    private String description;
    private AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfoOpt;

    /** 
     * Get the 'Description' element value. Описание документа.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание документа.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'DocumentKindVersionIdInfoOpt' element value. Информация для идентификации версии вида документа.
     * 
     * @return value
     */
    public AUDDocumentKindVersionIdInfoOptType getDocumentKindVersionIdInfoOpt() {
        return documentKindVersionIdInfoOpt;
    }

    /** 
     * Set the 'DocumentKindVersionIdInfoOpt' element value. Информация для идентификации версии вида документа.
     * 
     * @param documentKindVersionIdInfoOpt
     */
    public void setDocumentKindVersionIdInfoOpt(
            AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfoOpt) {
        this.documentKindVersionIdInfoOpt = documentKindVersionIdInfoOpt;
    }
}
