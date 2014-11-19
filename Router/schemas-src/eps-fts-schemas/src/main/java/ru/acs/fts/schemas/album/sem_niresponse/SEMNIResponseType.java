
package ru.acs.fts.schemas.album.sem_niresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Ответ сервиса NI
 */
public class SEMNIResponseType extends BaseDocType
{
    private String message;
    private List<ResDeclarationsType> resDeclarationList = new ArrayList<ResDeclarationsType>();
    private String documentModeID;

    /** 
     * Get the 'Message' element value. Сообщение о статусе обработки
     * 
     * @return value
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Set the 'Message' element value. Сообщение о статусе обработки
     * 
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * Get the list of 'ResDeclarations' element items. Обработанные декларации
     * 
     * @return list
     */
    public List<ResDeclarationsType> getResDeclarationList() {
        return resDeclarationList;
    }

    /** 
     * Set the list of 'ResDeclarations' element items. Обработанные декларации
     * 
     * @param list
     */
    public void setResDeclarationList(List<ResDeclarationsType> list) {
        resDeclarationList = list;
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
