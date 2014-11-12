
package ru.acs.fts.schemas.album.reqcorrecteddata;

import java.util.ArrayList;
import java.util.List;

/** 
 * Документ с ошибками
 */
public class BadDocumentType
{
    private String docID;
    private String docName;
    private String docModeID;
    private List<ListErrorType> listErrorList = new ArrayList<ListErrorType>();

    /** 
     * Get the 'DocID' element value. Уникальный идентификатор документа с ошибками.
     * 
     * @return value
     */
    public String getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. Уникальный идентификатор документа с ошибками.
     * 
     * @param docID
     */
    public void setDocID(String docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'DocName' element value. Название документа с ошибками
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. Название документа с ошибками
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'DocModeID' element value. Код вида ошибочного документа  (значение атрибута DocumentModeID).
     * 
     * @return value
     */
    public String getDocModeID() {
        return docModeID;
    }

    /** 
     * Set the 'DocModeID' element value. Код вида ошибочного документа  (значение атрибута DocumentModeID).
     * 
     * @param docModeID
     */
    public void setDocModeID(String docModeID) {
        this.docModeID = docModeID;
    }

    /** 
     * Get the list of 'ListError' element items. Список ошибок, подлежащих исправлению
     * 
     * @return list
     */
    public List<ListErrorType> getListErrorList() {
        return listErrorList;
    }

    /** 
     * Set the list of 'ListError' element items. Список ошибок, подлежащих исправлению
     * 
     * @param list
     */
    public void setListErrorList(List<ListErrorType> list) {
        listErrorList = list;
    }
}
