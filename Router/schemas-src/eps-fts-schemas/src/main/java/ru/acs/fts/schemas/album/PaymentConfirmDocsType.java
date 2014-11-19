
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� � ��������� ����������, �������������� ������ ���������� ��������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PaymentConfirmDocs:5.4.5" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentConfirmDocsType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="Comment" minOccurs="0"/>
 *         &lt;xs:element type="ns:TPORegNumberType" name="TPORegNumber" minOccurs="0"/>
 *         &lt;xs:element type="ns:DocIDType" name="DocID"/>
 *         &lt;xs:element type="ns:PaymentDocumentType" name="PaymentDocument" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:PayerType" name="Payer"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1004114E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentConfirmDocsType extends BaseDocType
{
    private String comment;
    private TPORegNumberType1 TPORegNumber;
    private DocIDType docID;
    private List<PaymentDocumentType> paymentDocumentList = new ArrayList<PaymentDocumentType>();
    private PayerType1 payer;
    private String documentModeID;

    /** 
     * Get the 'Comment' element value. ����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. ����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'TPORegNumber' element value. ���������� ����� ���
     * 
     * @return value
     */
    public TPORegNumberType1 getTPORegNumber() {
        return TPORegNumber;
    }

    /** 
     * Set the 'TPORegNumber' element value. ���������� ����� ���
     * 
     * @param TPORegNumber
     */
    public void setTPORegNumber(TPORegNumberType1 TPORegNumber) {
        this.TPORegNumber = TPORegNumber;
    }

    /** 
     * Get the 'DocID' element value. ���������������  ����� ����������� ���������, �� ��������� �������� �������������� ���������� ��������������
     * 
     * @return value
     */
    public DocIDType getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. ���������������  ����� ����������� ���������, �� ��������� �������� �������������� ���������� ��������������
     * 
     * @param docID
     */
    public void setDocID(DocIDType docID) {
        this.docID = docID;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @return list
     */
    public List<PaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<PaymentDocumentType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the 'Payer' element value. ��������� �����������
     * 
     * @return value
     */
    public PayerType1 getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. ��������� �����������
     * 
     * @param payer
     */
    public void setPayer(PayerType1 payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
