
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ќормативные документы, на соответствие которым производитс€ сертификаци€
 */
public class CertifNormDocType
{
    private List<String> docsDescriptionList = new ArrayList<String>();

    /** 
     * Get the list of 'DocsDescription' element items. ќбозначение нормативных документов
     * 
     * @return list
     */
    public List<String> getDocsDescriptionList() {
        return docsDescriptionList;
    }

    /** 
     * Set the list of 'DocsDescription' element items. ќбозначение нормативных документов
     * 
     * @param list
     */
    public void setDocsDescriptionList(List<String> list) {
        docsDescriptionList = list;
    }
}
