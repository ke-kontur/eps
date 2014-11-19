
package ru.acs.fts.schemas.album.previousconviction;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения о наличии судимости у руководителя и сотрудников юридического лица
 */
public class PreviousConvictionType extends BaseDocType
{
    private OrganizationType organization;
    private ResultInfoType resultInfo;
    private String documentModeID;

    /** 
     * Get the 'Organization' element value. Сведения об организации/физ. лице (юр. лицо/ИП)
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Сведения об организации/физ. лице (юр. лицо/ИП)
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'ResultInfo' element value. Сведения о постановке лица на учет
     * 
     * @return value
     */
    public ResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. Сведения о постановке лица на учет
     * 
     * @param resultInfo
     */
    public void setResultInfo(ResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
