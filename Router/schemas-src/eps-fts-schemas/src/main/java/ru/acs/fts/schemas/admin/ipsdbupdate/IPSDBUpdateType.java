
package ru.acs.fts.schemas.admin.ipsdbupdate;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Обновление справочника ИПС ВЭД
 */
public class IPSDBUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private IPSListType IPSInfo;
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
     * Get the 'IPSInfo' element value. Сведения об ИПС ВЭД
     * 
     * @return value
     */
    public IPSListType getIPSInfo() {
        return IPSInfo;
    }

    /** 
     * Set the 'IPSInfo' element value. Сведения об ИПС ВЭД
     * 
     * @param IPSInfo
     */
    public void setIPSInfo(IPSListType IPSInfo) {
        this.IPSInfo = IPSInfo;
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
