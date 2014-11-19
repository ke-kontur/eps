
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Информация ИСС "Малахит"
 */
public class ResponseMCAType extends BaseDocType
{
    private DocumentHeadType documentHead;
    private DocumentBodyType documentBody;
    private List<PersonSignatureType> documentSignList = new ArrayList<PersonSignatureType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentHead' element value. Заголовок документа
     * 
     * @return value
     */
    public DocumentHeadType getDocumentHead() {
        return documentHead;
    }

    /** 
     * Set the 'DocumentHead' element value. Заголовок документа
     * 
     * @param documentHead
     */
    public void setDocumentHead(DocumentHeadType documentHead) {
        this.documentHead = documentHead;
    }

    /** 
     * Get the 'DocumentBody' element value. Тело документа
     * 
     * @return value
     */
    public DocumentBodyType getDocumentBody() {
        return documentBody;
    }

    /** 
     * Set the 'DocumentBody' element value. Тело документа
     * 
     * @param documentBody
     */
    public void setDocumentBody(DocumentBodyType documentBody) {
        this.documentBody = documentBody;
    }

    /** 
     * Get the list of 'DocumentSign' element items. Подписи
     * 
     * @return list
     */
    public List<PersonSignatureType> getDocumentSignList() {
        return documentSignList;
    }

    /** 
     * Set the list of 'DocumentSign' element items. Подписи
     * 
     * @param list
     */
    public void setDocumentSignList(List<PersonSignatureType> list) {
        documentSignList = list;
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
