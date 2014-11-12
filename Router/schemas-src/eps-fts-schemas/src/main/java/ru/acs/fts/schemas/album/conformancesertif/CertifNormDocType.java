
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� ���������, �� ������������ ������� ������������ ������������
 */
public class CertifNormDocType
{
    private List<String> docsDescriptionList = new ArrayList<String>();

    /** 
     * Get the list of 'DocsDescription' element items. ����������� ����������� ����������
     * 
     * @return list
     */
    public List<String> getDocsDescriptionList() {
        return docsDescriptionList;
    }

    /** 
     * Set the list of 'DocsDescription' element items. ����������� ����������� ����������
     * 
     * @param list
     */
    public void setDocsDescriptionList(List<String> list) {
        docsDescriptionList = list;
    }
}
