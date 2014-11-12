
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документы, подтверждающие заявленные сведения
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String organizationName;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа(заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа(заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование органа, выдавшего документ. При автомобильных перевозках дополнительно заполняется место составления CMR
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование органа, выдавшего документ. При автомобильных перевозках дополнительно заполняется место составления CMR
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
