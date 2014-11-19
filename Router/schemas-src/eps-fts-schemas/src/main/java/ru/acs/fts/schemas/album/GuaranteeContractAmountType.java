
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предоставление общей суммы денежных средств по банковской гарантии
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:GuaranteeContractAmount:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GuaranteeContractAmountType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="ReserveDate"/>
 *         &lt;xs:element type="xs:string" name="ReserveAmount"/>
 *         &lt;xs:element type="xs:string" name="ResAmount"/>
 *         &lt;xs:element type="xs:string" name="ContractNumber"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1004116E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GuaranteeContractAmountType extends BaseDocType
{
    private String reserveDate;
    private String reserveAmount;
    private String resAmount;
    private String contractNumber;
    private String documentModeID;

    /** 
     * Get the 'ReserveDate' element value. Дата и время формирования гарантии
     * 
     * @return value
     */
    public String getReserveDate() {
        return reserveDate;
    }

    /** 
     * Set the 'ReserveDate' element value. Дата и время формирования гарантии
     * 
     * @param reserveDate
     */
    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    /** 
     * Get the 'ReserveAmount' element value. Общая сумма действующей гарантии.
     * 
     * @return value
     */
    public String getReserveAmount() {
        return reserveAmount;
    }

    /** 
     * Set the 'ReserveAmount' element value. Общая сумма действующей гарантии.
     * 
     * @param reserveAmount
     */
    public void setReserveAmount(String reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    /** 
     * Get the 'ResAmount' element value. Неиспользованный остаток гарантии
     * 
     * @return value
     */
    public String getResAmount() {
        return resAmount;
    }

    /** 
     * Set the 'ResAmount' element value. Неиспользованный остаток гарантии
     * 
     * @param resAmount
     */
    public void setResAmount(String resAmount) {
        this.resAmount = resAmount;
    }

    /** 
     * Get the 'ContractNumber' element value. Номер договора поручительства
     * 
     * @return value
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /** 
     * Set the 'ContractNumber' element value. Номер договора поручительства
     * 
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
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
