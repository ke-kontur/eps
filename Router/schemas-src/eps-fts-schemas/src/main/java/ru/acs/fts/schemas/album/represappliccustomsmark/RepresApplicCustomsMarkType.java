
package ru.acs.fts.schemas.album.represappliccustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ������� ��������� ����������� �������������
 */
public class RepresApplicCustomsMarkType extends BaseDocType
{
    private GTDIDType applicationRegNumber;
    private CustomsPersonType customsPerson;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ���������
     * 
     * @return value
     */
    public GTDIDType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ���������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(GTDIDType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'Consignment' element items. �������� � ������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. �������� � ������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
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
