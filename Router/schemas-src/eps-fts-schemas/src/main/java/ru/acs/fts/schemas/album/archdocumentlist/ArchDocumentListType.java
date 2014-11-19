
package ru.acs.fts.schemas.album.archdocumentlist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * Список документов в архиве декларанта
 */
public class ArchDocumentListType extends ArchBaseType
{
    private List<ArchDocumentType> documentInfoList = new ArrayList<ArchDocumentType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentInfo' element items. Информация о документе
     * 
     * @return list
     */
    public List<ArchDocumentType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. Информация о документе
     * 
     * @param list
     */
    public void setDocumentInfoList(List<ArchDocumentType> list) {
        documentInfoList = list;
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
