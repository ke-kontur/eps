
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� � �������� ��������� � ������ ������� ��� ������� �����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RepresApplicChange:5.4.3" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RepresApplicChangeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:RepresentativeType" name="Representative"/>
 *         &lt;xs:element type="xs:string" name="ChangeType"/>
 *         &lt;xs:element type="ns1:GTDIDType" name="ApplicationRegNumber"/>
 *         &lt;xs:element type="ns:ConsignmentType" name="Consignment"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1006200E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RepresApplicChangeType extends BaseDocType
{
    private RepresentativeType representative;
    private String changeType;
    private GTDIDType applicationRegNumber;
    private ConsignmentType1 consignment;
    private String documentModeID;

    /** 
     * Get the 'Representative' element value.
     * 
     * @return value
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value.
     * 
     * @param representative
     */
    public void setRepresentative(RepresentativeType representative) {
        this.representative = representative;
    }

    /** 
     * Get the 'ChangeType' element value. ��������� ��� �������������: 0 - ����������� ������, 1 - ������, 2 - ���������� ����������� ��������
     * 
     * @return value
     */
    public String getChangeType() {
        return changeType;
    }

    /** 
     * Set the 'ChangeType' element value. ��������� ��� �������������: 0 - ����������� ������, 1 - ������, 2 - ���������� ����������� ��������
     * 
     * @param changeType
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ��������������� �������
     * 
     * @return value
     */
    public GTDIDType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ��������������� �������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(GTDIDType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'Consignment' element value. �������� � ������������� ������
     * 
     * @return value
     */
    public ConsignmentType1 getConsignment() {
        return consignment;
    }

    /** 
     * Set the 'Consignment' element value. �������� � ������������� ������
     * 
     * @param consignment
     */
    public void setConsignment(ConsignmentType1 consignment) {
        this.consignment = consignment;
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
