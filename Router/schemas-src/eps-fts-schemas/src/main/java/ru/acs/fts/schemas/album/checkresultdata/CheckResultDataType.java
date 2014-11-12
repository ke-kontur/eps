
package ru.acs.fts.schemas.album.checkresultdata;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения о результатах проверки данных весогабаритного контроля с данными разрешительных документов
 */
public class CheckResultDataType extends BaseDocType
{
    private String requestId;
    private String statusCode;
    private List<ResultType> resultList = new ArrayList<ResultType>();
    private String documentModeID;

    /** 
     * Get the 'RequestId' element value. Уникальный идентификатор запроса
     * 
     * @return value
     */
    public String getRequestId() {
        return requestId;
    }

    /** 
     * Set the 'RequestId' element value. Уникальный идентификатор запроса
     * 
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /** 
     * Get the 'StatusCode' element value. Статус результата выполнения запроса: 1 - Ошибка в параметрах запроса; 2 - Положительный результат проверки; 3 - Не найдено действующее разрешение по гос.номеру АТС (или найдено более одного разрешения); 4 - Указанное разрешение не зарегистрировано; 5 - Параметры АТС, дата или место проезда не соответствуют указанным в разрешении
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'StatusCode' element value. Статус результата выполнения запроса: 1 - Ошибка в параметрах запроса; 2 - Положительный результат проверки; 3 - Не найдено действующее разрешение по гос.номеру АТС (или найдено более одного разрешения); 4 - Указанное разрешение не зарегистрировано; 5 - Параметры АТС, дата или место проезда не соответствуют указанным в разрешении
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /** 
     * Get the list of 'Result' element items. Ошибки по результатам проверки
     * 
     * @return list
     */
    public List<ResultType> getResultList() {
        return resultList;
    }

    /** 
     * Set the list of 'Result' element items. Ошибки по результатам проверки
     * 
     * @param list
     */
    public void setResultList(List<ResultType> list) {
        resultList = list;
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
