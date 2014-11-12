
package ru.acs.fts.schemas.admin.orgdbupdate;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Загрузка справочника организаций / точек подключения
 */
public class OrgDBUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private OrgInfoType orgInfo;
    private String documentModeID;

    /** 
     * Get the 'CreateDateTime' element value. Дата  и время  создания  выгрузки
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. Дата  и время  создания  выгрузки
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'OrgInfo' element value. Информация об организации
     * 
     * @return value
     */
    public OrgInfoType getOrgInfo() {
        return orgInfo;
    }

    /** 
     * Set the 'OrgInfo' element value. Информация об организации
     * 
     * @param orgInfo
     */
    public void setOrgInfo(OrgInfoType orgInfo) {
        this.orgInfo = orgInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
