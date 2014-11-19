
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� ��������� ������ �� ��
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTRevealedRisksType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="SoftVersion"/>
 *         &lt;xs:element type="ns:ProfileInfoType" name="ProfileInfo" minOccurs="0" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:HashInfoType" name="HashInfo" minOccurs="0" maxOccurs="unbounded"/>
 *         &lt;xs:choice>
 *           &lt;xs:element type="ns1:GTDIDType" name="DTNumber"/>
 *           &lt;xs:element type="ns:MPORegNumberType" name="MPONumber"/>
 *           &lt;xs:element type="ns1:GTDIDType" name="WHDocInventoryNumber" minOccurs="0"/>
 *         &lt;/xs:choice>
 *         &lt;xs:element type="ns:DocumentType" name="Consigments"/>
 *         &lt;xs:element type="ns:DocBodyType" name="BodySemantica" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1006216E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DTRevealedRisksType extends BaseDocType
{
    private String softVersion;
    private List<ProfileInfoType> profileInfoList = new ArrayList<ProfileInfoType>();
    private List<HashInfoType> hashInfoList = new ArrayList<HashInfoType>();
    private int choiceSelect = -1;
    private static final int DT_NUMBER_CHOICE = 0;
    private static final int MPO_NUMBER_CHOICE = 1;
    private static final int WH_DOC_INVENTORY_NUMBER_CHOICE = 2;
    private GTDIDType DTNumber;
    private MPORegNumberType MPONumber;
    private GTDIDType WHDocInventoryNumber;
    private DocumentType consigments;
    private DocBodyType bodySemantica;
    private String documentModeID;

    /** 
     * Get the 'SoftVersion' element value. ������ ������ �� "������ ��������� ������ ���" ������ ���
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. ������ ������ �� "������ ��������� ������ ���" ������ ���
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the list of 'ProfileInfo' element items. ���������� ������� �����
     * 
     * @return list
     */
    public List<ProfileInfoType> getProfileInfoList() {
        return profileInfoList;
    }

    /** 
     * Set the list of 'ProfileInfo' element items. ���������� ������� �����
     * 
     * @param list
     */
    public void setProfileInfoList(List<ProfileInfoType> list) {
        profileInfoList = list;
    }

    /** 
     * Get the list of 'HashInfo' element items. ���������� �� ������. ����������
     * 
     * @return list
     */
    public List<HashInfoType> getHashInfoList() {
        return hashInfoList;
    }

    /** 
     * Set the list of 'HashInfo' element items. ���������� �� ������. ����������
     * 
     * @param list
     */
    public void setHashInfoList(List<HashInfoType> list) {
        hashInfoList = list;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if DTNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTNumber() {
        return choiceSelect == DT_NUMBER_CHOICE;
    }

    /** 
     * Get the 'DTNumber' element value. ��������������� ����� ��/������� ��������-������
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ��������������� ����� ��/������� ��������-������
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        setChoiceSelect(DT_NUMBER_CHOICE);
        this.DTNumber = DTNumber;
    }

    /** 
     * Check if MPONumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifMPONumber() {
        return choiceSelect == MPO_NUMBER_CHOICE;
    }

    /** 
     * Get the 'MPONumber' element value. ��������������� ����� ���
     * 
     * @return value
     */
    public MPORegNumberType getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPONumber' element value. ��������������� ����� ���
     * 
     * @param MPONumber
     */
    public void setMPONumber(MPORegNumberType MPONumber) {
        setChoiceSelect(MPO_NUMBER_CHOICE);
        this.MPONumber = MPONumber;
    }

    /** 
     * Check if WHDocInventoryNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifWHDocInventoryNumber() {
        return choiceSelect == WH_DOC_INVENTORY_NUMBER_CHOICE;
    }

    /** 
     * Get the 'WHDocInventoryNumber' element value. ��������������� ����� ����������, �������������� ��� ��������� ������� �� ��
     * 
     * @return value
     */
    public GTDIDType getWHDocInventoryNumber() {
        return WHDocInventoryNumber;
    }

    /** 
     * Set the 'WHDocInventoryNumber' element value. ��������������� ����� ����������, �������������� ��� ��������� ������� �� ��
     * 
     * @param WHDocInventoryNumber
     */
    public void setWHDocInventoryNumber(GTDIDType WHDocInventoryNumber) {
        setChoiceSelect(WH_DOC_INVENTORY_NUMBER_CHOICE);
        this.WHDocInventoryNumber = WHDocInventoryNumber;
    }

    /** 
     * Get the 'Consigments' element value. �������� � ���������� ������ �� ������� (-�) ������ � ���������
     * 
     * @return value
     */
    public DocumentType getConsigments() {
        return consigments;
    }

    /** 
     * Set the 'Consigments' element value. �������� � ���������� ������ �� ������� (-�) ������ � ���������
     * 
     * @param consigments
     */
    public void setConsigments(DocumentType consigments) {
        this.consigments = consigments;
    }

    /** 
     * Get the 'BodySemantica' element value. ����� �� ��� "���������" �� ������ �������������� ������� ����������� ��
     * 
     * @return value
     */
    public DocBodyType getBodySemantica() {
        return bodySemantica;
    }

    /** 
     * Set the 'BodySemantica' element value. ����� �� ��� "���������" �� ������ �������������� ������� ����������� ��
     * 
     * @param bodySemantica
     */
    public void setBodySemantica(DocBodyType bodySemantica) {
        this.bodySemantica = bodySemantica;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
