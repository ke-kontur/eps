
package ru.acs.fts.schemas.album.expiredadditionallist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� ��������������� ������� ���������� � �������� ��������������, ������������� ������� ��� ����������� ������ ���������� ������, ������� ��� ���������� �������� ������� ���������� � ����� � ���������� ����� �������� ����������.
 */
public class ExpiredAdditionalListType extends BaseDocType
{
    private List<ExpiredAdditionalInfoType> expiredAdditionalInfoList = new ArrayList<ExpiredAdditionalInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'ExpiredAdditionalInfo' element items. �������� � ���������� � �������� ��������������, ������������� �������� � �������� ����������� ���������� � ����� � ���������� ����� ��������.
     * 
     * @return list
     */
    public List<ExpiredAdditionalInfoType> getExpiredAdditionalInfoList() {
        return expiredAdditionalInfoList;
    }

    /** 
     * Set the list of 'ExpiredAdditionalInfo' element items. �������� � ���������� � �������� ��������������, ������������� �������� � �������� ����������� ���������� � ����� � ���������� ����� ��������.
     * 
     * @param list
     */
    public void setExpiredAdditionalInfoList(
            List<ExpiredAdditionalInfoType> list) {
        expiredAdditionalInfoList = list;
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
