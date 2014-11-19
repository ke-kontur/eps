
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� �� ������� ���������������� ������� ���� �� ������ ����������� ��������� � ������ � ���
 */
public class RealEstateResponseType extends BaseDocType
{
    private String docSign;
    private String recipient;
    private LocalDate excerptDate;
    private String refusalReasons;
    private List<ExcerptObjectType> excerptObjectList = new ArrayList<ExcerptObjectType>();
    private List<ResourceOrgType> resourceOrgList = new ArrayList<ResourceOrgType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ������� �� ����; 2 - ���������� �������� �� �������; 3 - ����� � ������ ��������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ������� �� ����; 2 - ���������� �������� �� �������; 3 - ����� � ������ ��������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Recipient' element value. �������� ���������� ����������
     * 
     * @return value
     */
    public String getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. �������� ���������� ����������
     * 
     * @param recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'ExcerptDate' element value. ���� �������/�������/���������
     * 
     * @return value
     */
    public LocalDate getExcerptDate() {
        return excerptDate;
    }

    /** 
     * Set the 'ExcerptDate' element value. ���� �������/�������/���������
     * 
     * @param excerptDate
     */
    public void setExcerptDate(LocalDate excerptDate) {
        this.excerptDate = excerptDate;
    }

    /** 
     * Get the 'RefusalReasons' element value. ����� ������
     * 
     * @return value
     */
    public String getRefusalReasons() {
        return refusalReasons;
    }

    /** 
     * Set the 'RefusalReasons' element value. ����� ������
     * 
     * @param refusalReasons
     */
    public void setRefusalReasons(String refusalReasons) {
        this.refusalReasons = refusalReasons;
    }

    /** 
     * Get the list of 'ExcerptObject' element items. ���������� �� ����
     * 
     * @return list
     */
    public List<ExcerptObjectType> getExcerptObjectList() {
        return excerptObjectList;
    }

    /** 
     * Set the list of 'ExcerptObject' element items. ���������� �� ����
     * 
     * @param list
     */
    public void setExcerptObjectList(List<ExcerptObjectType> list) {
        excerptObjectList = list;
    }

    /** 
     * Get the list of 'ResourceOrg' element items. ����� - �������� ����������
     * 
     * @return list
     */
    public List<ResourceOrgType> getResourceOrgList() {
        return resourceOrgList;
    }

    /** 
     * Set the list of 'ResourceOrg' element items. ����� - �������� ����������
     * 
     * @param list
     */
    public void setResourceOrgList(List<ResourceOrgType> list) {
        resourceOrgList = list;
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
