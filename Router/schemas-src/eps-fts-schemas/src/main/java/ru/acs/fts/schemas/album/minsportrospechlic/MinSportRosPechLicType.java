
package ru.acs.fts.schemas.album.minsportrospechlic;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� �� ������ ���������� � ������������� �������� ���������� ����������
 */
public class MinSportRosPechLicType extends BaseDocType
{
    private String docSign;
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ����� �� ������ ������� (���������); 2 - ����� �� ������ ������ (�������������� ������); 3 - ����� �� ������ �� ��������� ���������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ����� �� ������ ������� (���������); 2 - ����� �� ������ ������ (�������������� ������); 3 - ����� �� ������ �� ��������� ���������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'Document' element items. ��������
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. ��������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
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
