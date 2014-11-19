
package ru.acs.fts.schemas.album.custprocessinginvent;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;

/** 
 * ����� ����������, ����������� � ��������� �� ����������� �������
 */
public class CustProcessingInventType extends BaseDocType
{
    private String inqDocumentID;
    private TreatmentOrganizationType declarant;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private String documentModeID;

    /** 
     * Get the 'InqDocumentID' element value. ���������� ������������� ��������� �� �����������
     * 
     * @return value
     */
    public String getInqDocumentID() {
        return inqDocumentID;
    }

    /** 
     * Set the 'InqDocumentID' element value. ���������� ������������� ��������� �� �����������
     * 
     * @param inqDocumentID
     */
    public void setInqDocumentID(String inqDocumentID) {
        this.inqDocumentID = inqDocumentID;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ���������
     * 
     * @return value
     */
    public TreatmentOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ���������
     * 
     * @param declarant
     */
    public void setDeclarant(TreatmentOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the list of 'InventDocument' element items. �������� ��  �����
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. �������� ��  �����
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
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
