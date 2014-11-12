
package ru.acs.fts.schemas.album.notifaddcontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * «апрашиваемый документ
 */
public class ReqDocumentType extends DocumentBaseType
{
    private String requestPositionID;
    private String docCode;

    /** 
     * Get the 'RequestPositionID' element value. »дентификатор позиции в запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. »дентификатор позиции в запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'DocCode' element value.  од вида запрашиваемого документа (заполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value.  од вида запрашиваемого документа (заполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
}
