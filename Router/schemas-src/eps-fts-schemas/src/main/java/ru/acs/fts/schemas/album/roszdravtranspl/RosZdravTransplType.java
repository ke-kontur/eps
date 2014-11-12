
package ru.acs.fts.schemas.album.roszdravtranspl;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� �� ������ ���������� (����������) �� ���� �������� ����� � ��������������� ��������� ������ � ����� ���������� ������������� ��������������
 */
public class RosZdravTransplType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private List<ConclusionType> conclusionList = new ArrayList<ConclusionType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the list of 'Conclusion' element items. �������� � ����������� �� ���� �������� ����� � ��������������� ��������� ������ � ����� ���������� ������������� ��������������
     * 
     * @return list
     */
    public List<ConclusionType> getConclusionList() {
        return conclusionList;
    }

    /** 
     * Set the list of 'Conclusion' element items. �������� � ����������� �� ���� �������� ����� � ��������������� ��������� ������ � ����� ���������� ������������� ��������������
     * 
     * @param list
     */
    public void setConclusionList(List<ConclusionType> list) {
        conclusionList = list;
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
