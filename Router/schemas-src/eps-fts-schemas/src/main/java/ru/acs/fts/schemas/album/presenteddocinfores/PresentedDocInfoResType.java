
package ru.acs.fts.schemas.album.presenteddocinfores;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Информация о разрешительных документах, указанных в графе 44
 */
public class PresentedDocInfoResType extends BaseDocType
{
    private List<PresentedDocType> presentedDocList = new ArrayList<PresentedDocType>();
    private String documentModeID;

    /** 
     * Get the list of 'PresentedDoc' element items. Сведения о разрешительных документах
     * 
     * @return list
     */
    public List<PresentedDocType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDoc' element items. Сведения о разрешительных документах
     * 
     * @param list
     */
    public void setPresentedDocList(List<PresentedDocType> list) {
        presentedDocList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
