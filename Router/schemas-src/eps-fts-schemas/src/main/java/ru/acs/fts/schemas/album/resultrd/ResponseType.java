
package ru.acs.fts.schemas.album.resultrd;

import java.util.ArrayList;
import java.util.List;

/** 
 * Элемент, содержащий результат выполнения операции (положительный или отрицательный)
 */
public class ResponseType
{
    private String refDocumentID;
    private List<ResultInformationType> resultInformationList = new ArrayList<ResultInformationType>();

    /** 
     * Get the 'RefDocumentID' element value. Идентификатор документа, в котором была допущена ошибка.
     * 
     * @return value
     */
    public String getRefDocumentID() {
        return refDocumentID;
    }

    /** 
     * Set the 'RefDocumentID' element value. Идентификатор документа, в котором была допущена ошибка.
     * 
     * @param refDocumentID
     */
    public void setRefDocumentID(String refDocumentID) {
        this.refDocumentID = refDocumentID;
    }

    /** 
     * Get the list of 'ResultInformation' element items. Код возврата при обработке сообщения, результат выполнения операции
     * 
     * @return list
     */
    public List<ResultInformationType> getResultInformationList() {
        return resultInformationList;
    }

    /** 
     * Set the list of 'ResultInformation' element items. Код возврата при обработке сообщения, результат выполнения операции
     * 
     * @param list
     */
    public void setResultInformationList(List<ResultInformationType> list) {
        resultInformationList = list;
    }
}
