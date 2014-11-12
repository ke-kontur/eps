
package ru.acs.fts.schemas.album.sq_docresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предоставление документа по запросу из ФОИВ
 */
public class SQDocResponseType extends BaseDocType
{
    private String requestPositionID;
    private String requestPositionNumeric;
    private List<DocResponseType> docResponseList = new ArrayList<DocResponseType>();
    private String documentModeID;

    /** 
     * Get the 'RequestPositionID' element value. Идентификатор позиции в исходном запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Идентификатор позиции в исходном запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'RequestPositionNumeric' element value. Порядковый номер позиции в исходном запросе 
     * 
     * @return value
     */
    public String getRequestPositionNumeric() {
        return requestPositionNumeric;
    }

    /** 
     * Set the 'RequestPositionNumeric' element value. Порядковый номер позиции в исходном запросе 
     * 
     * @param requestPositionNumeric
     */
    public void setRequestPositionNumeric(String requestPositionNumeric) {
        this.requestPositionNumeric = requestPositionNumeric;
    }

    /** 
     * Get the list of 'DocResponse' element items. Запрашиваемые документы
     * 
     * @return list
     */
    public List<DocResponseType> getDocResponseList() {
        return docResponseList;
    }

    /** 
     * Set the list of 'DocResponse' element items. Запрашиваемые документы
     * 
     * @param list
     */
    public void setDocResponseList(List<DocResponseType> list) {
        docResponseList = list;
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
