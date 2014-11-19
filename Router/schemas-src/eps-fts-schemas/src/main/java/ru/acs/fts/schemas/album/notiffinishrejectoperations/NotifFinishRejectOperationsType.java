
package ru.acs.fts.schemas.album.notiffinishrejectoperations;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ���������� ��������/�� ������ � ���������� �������� � ��������� ������� � ������������ �������
 */
public class NotifFinishRejectOperationsType extends BaseDocType
{
    private String documentSign;
    private List<String> operationDescriptionList = new ArrayList<String>();
    private GTDIDType GTDNumber;
    private DeclarantType declarant;
    private CUCustomsType customsOffice;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. �������: 0 - �����, 1 - ����������
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. �������: 0 - �����, 1 - ����������
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the list of 'OperationDescription' element items. �������� (����������� � ������ ������ � ���������� ����������� ���� ��������): 1 - ���������������, 2 - �����������, 3 - ���� ����������� ���������� �������, 4 - ��������, 5 - ��������, 6 - ����������, 7 - ����������� ������������ ��������, 8 - �������� ��������, 9 - ��������, 10 - ������������, 11- �������� ���������, �������� � ������ ����,  ��� ��������� ��� ����� ���������� ������, 12 - ���������� �������� ������ �� ��������� ����� � (���) ������������� �������
     * 
     * @return list
     */
    public List<String> getOperationDescriptionList() {
        return operationDescriptionList;
    }

    /** 
     * Set the list of 'OperationDescription' element items. �������� (����������� � ������ ������ � ���������� ����������� ���� ��������): 1 - ���������������, 2 - �����������, 3 - ���� ����������� ���������� �������, 4 - ��������, 5 - ��������, 6 - ����������, 7 - ����������� ������������ ��������, 8 - �������� ��������, 9 - ��������, 10 - ������������, 11- �������� ���������, �������� � ������ ����,  ��� ��������� ��� ����� ���������� ������, 12 - ���������� �������� ������ �� ��������� ����� � (���) ������������� �������
     * 
     * @param list
     */
    public void setOperationDescriptionList(List<String> list) {
        operationDescriptionList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ����� ���������� ����������
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������/���� ����, ���������� ������������ � ��������� ������� � (���) ������������ �������, � �� ��������������.
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������/���� ����, ���������� ������������ � ��������� ������� � (���) ������������ �������, � �� ��������������.
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'CustomsOffice' element value. ����������� �����
     * 
     * @return value
     */
    public CUCustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ����������� �����
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CUCustomsType customsOffice) {
        this.customsOffice = customsOffice;
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
