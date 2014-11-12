
package ru.acs.fts.schemas.album.transferpersonexplanation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документы, на основании которых перемещается товар
 */
public class TransferDocsType
{
    private List<DocumentBaseType> presentDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'PresentDoc' element items. Сведения о документе
     * 
     * @return list
     */
    public List<DocumentBaseType> getPresentDocList() {
        return presentDocList;
    }

    /** 
     * Set the list of 'PresentDoc' element items. Сведения о документе
     * 
     * @param list
     */
    public void setPresentDocList(List<DocumentBaseType> list) {
        presentDocList = list;
    }
}
