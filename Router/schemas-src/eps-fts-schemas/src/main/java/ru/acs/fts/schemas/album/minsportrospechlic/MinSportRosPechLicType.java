
package ru.acs.fts.schemas.album.minsportrospechlic;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Ответ на запрос документов о подтверждении целевого назначения материалов
 */
public class MinSportRosPechLicType extends BaseDocType
{
    private String docSign;
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - ответ на запрос справки (Роспечать); 2 - ответ на запрос письма (Минспорттуризм России); 3 - ответ на запрос на получение изменений
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - ответ на запрос справки (Роспечать); 2 - ответ на запрос письма (Минспорттуризм России); 3 - ответ на запрос на получение изменений
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'Document' element items. Документ
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Документ
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
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
