
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������
 */
public class PaymentType
{
    private String freeServiceSign;
    private List<PresentedDocsType> reasonsDocumentList = new ArrayList<PresentedDocsType>();

    /** 
     * Get the 'FreeServiceSign' element value. ������� ������� ����� �� ������������� �������������� �������� � ������������ �� ������� 8 ������ � ����������� (122-��)
     * 
     * @return value
     */
    public String getFreeServiceSign() {
        return freeServiceSign;
    }

    /** 
     * Set the 'FreeServiceSign' element value. ������� ������� ����� �� ������������� �������������� �������� � ������������ �� ������� 8 ������ � ����������� (122-��)
     * 
     * @param freeServiceSign
     */
    public void setFreeServiceSign(String freeServiceSign) {
        this.freeServiceSign = freeServiceSign;
    }

    /** 
     * Get the list of 'ReasonsDocuments' element items. ��������� ��������� ��������� �������� ��� ������
     * 
     * @return list
     */
    public List<PresentedDocsType> getReasonsDocumentList() {
        return reasonsDocumentList;
    }

    /** 
     * Set the list of 'ReasonsDocuments' element items. ��������� ��������� ��������� �������� ��� ������
     * 
     * @param list
     */
    public void setReasonsDocumentList(List<PresentedDocsType> list) {
        reasonsDocumentList = list;
    }
}
