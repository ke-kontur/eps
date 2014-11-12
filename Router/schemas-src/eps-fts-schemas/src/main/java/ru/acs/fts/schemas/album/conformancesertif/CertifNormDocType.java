
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Нормативные документы, на соответствие которым производится сертификация
 */
public class CertifNormDocType
{
    private List<String> docsDescriptionList = new ArrayList<String>();

    /** 
     * Get the list of 'DocsDescription' element items. Обозначение нормативных документов
     * 
     * @return list
     */
    public List<String> getDocsDescriptionList() {
        return docsDescriptionList;
    }

    /** 
     * Set the list of 'DocsDescription' element items. Обозначение нормативных документов
     * 
     * @param list
     */
    public void setDocsDescriptionList(List<String> list) {
        docsDescriptionList = list;
    }
}
