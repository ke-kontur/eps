
package ru.acs.fts.schemas.admin.int_dtrequest;

import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Запрос предварительной декларации на товары
 */
public class INTDTRequestType extends BaseDocType
{
    private String softVersionID;
    private GTDIDType DT;
    private String requestCustomsCode;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'SoftVersionID' element value.
     * 
     * @return value
     */
    public String getSoftVersionID() {
        return softVersionID;
    }

    /** 
     * Set the 'SoftVersionID' element value.
     * 
     * @param softVersionID
     */
    public void setSoftVersionID(String softVersionID) {
        this.softVersionID = softVersionID;
    }

    /** 
     * Get the 'DT' element value.
     * 
     * @return value
     */
    public GTDIDType getDT() {
        return DT;
    }

    /** 
     * Set the 'DT' element value.
     * 
     * @param DT
     */
    public void setDT(GTDIDType DT) {
        this.DT = DT;
    }

    /** 
     * Get the 'RequestCustomsCode' element value.
     * 
     * @return value
     */
    public String getRequestCustomsCode() {
        return requestCustomsCode;
    }

    /** 
     * Set the 'RequestCustomsCode' element value.
     * 
     * @param requestCustomsCode
     */
    public void setRequestCustomsCode(String requestCustomsCode) {
        this.requestCustomsCode = requestCustomsCode;
    }

    /** 
     * Get the 'CustomsPerson' element value.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value.
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
