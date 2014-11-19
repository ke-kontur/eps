
package ru.acs.fts.schemas.album.oilproductionconfirmation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Результат обработки запроса на выдачу из приказов Минэнерго России и писем, подтверждающих факт добычи нефти с определенными физико-химическими характеристиками с определенных месторождений
 */
public class OilProductionConfirmationType extends BaseDocType
{
    private String statusCode;
    private String statusComment;
    private CUOrganizationType receiver;
    private ConsignmentInfoType consignmentInfo;
    private String documentModeID;

    /** 
     * Get the 'StatusCode' element value. Код статуса
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'StatusCode' element value. Код статуса
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /** 
     * Get the 'StatusComment' element value. Комментарий статуса
     * 
     * @return value
     */
    public String getStatusComment() {
        return statusComment;
    }

    /** 
     * Set the 'StatusComment' element value. Комментарий статуса
     * 
     * @param statusComment
     */
    public void setStatusComment(String statusComment) {
        this.statusComment = statusComment;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'ConsignmentInfo' element value. Сведения о поставке
     * 
     * @return value
     */
    public ConsignmentInfoType getConsignmentInfo() {
        return consignmentInfo;
    }

    /** 
     * Set the 'ConsignmentInfo' element value. Сведения о поставке
     * 
     * @param consignmentInfo
     */
    public void setConsignmentInfo(ConsignmentInfoType consignmentInfo) {
        this.consignmentInfo = consignmentInfo;
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
