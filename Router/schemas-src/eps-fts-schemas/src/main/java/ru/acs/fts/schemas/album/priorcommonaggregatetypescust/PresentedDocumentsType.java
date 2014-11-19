
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ƒокументы, подтверждающие за€вленные сведени€
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String organizationName;

    /** 
     * Get the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа(заполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44)
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа(заполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44)
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'OrganizationName' element value. Ќаименование органа, выдавшего документ. ѕри автомобильных перевозках дополнительно заполн€етс€ место составлени€ CMR
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Ќаименование органа, выдавшего документ. ѕри автомобильных перевозках дополнительно заполн€етс€ место составлени€ CMR
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
