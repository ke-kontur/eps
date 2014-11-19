
package ru.acs.fts.schemas.album.infringer;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ������� �����������
 */
public class InFringerType extends BaseDocType
{
    private String docSign;
    private List<ViolatorsListType> violatorsList = new ArrayList<ViolatorsListType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ��������� (0 - �������� �� ������� �����������; 1 - �������� �� ������� ����������� - ������� �� ������ ������)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ��������� (0 - �������� �� ������� �����������; 1 - �������� �� ������� ����������� - ������� �� ������ ������)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'ViolatorsList' element items. ������ �������� �� ������� �����������
     * 
     * @return list
     */
    public List<ViolatorsListType> getViolatorsList() {
        return violatorsList;
    }

    /** 
     * Set the list of 'ViolatorsList' element items. ������ �������� �� ������� �����������
     * 
     * @param list
     */
    public void setViolatorsList(List<ViolatorsListType> list) {
        violatorsList = list;
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
