
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� � ��������, ������� ���������� ������������ ��� ���������� ���������� ���������, ���������� ������� �������.
 */
public class DocumentReqType
{
    private List<String> docsDescriptionList = new ArrayList<String>();
    private String docDateLimit;

    /** 
     * Get the list of 'DocsDescription' element items. �������� ��������
     * 
     * @return list
     */
    public List<String> getDocsDescriptionList() {
        return docsDescriptionList;
    }

    /** 
     * Set the list of 'DocsDescription' element items. �������� ��������
     * 
     * @param list
     */
    public void setDocsDescriptionList(List<String> list) {
        docsDescriptionList = list;
    }

    /** 
     * Get the 'DocDateLimit' element value. ���� �������������� ��������� ��������
     * 
     * @return value
     */
    public String getDocDateLimit() {
        return docDateLimit;
    }

    /** 
     * Set the 'DocDateLimit' element value. ���� �������������� ��������� ��������
     * 
     * @param docDateLimit
     */
    public void setDocDateLimit(String docDateLimit) {
        this.docDateLimit = docDateLimit;
    }
}
