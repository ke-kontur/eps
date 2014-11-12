
package ru.acs.fts.schemas.admin.intexchresult;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/** 
 * Элемент, содержащий результат выполнения операции (положительный или отрицательный)
 */
public class ResponseType
{
    private String refDocumentID;
    private LocalDate createDate;
    private LocalTime createTime;
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
     * Get the 'CreateDate' element value. Дата создания документа
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. Дата создания документа
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'CreateTime' element value. Время создания документа
     * 
     * @return value
     */
    public LocalTime getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value. Время создания документа
     * 
     * @param createTime
     */
    public void setCreateTime(LocalTime createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the list of 'ResultInformation' element items. Код возврата при обработке сообщения, результат выполнения операции (запрос к ЭАД, запрос статуса/истории процесса)
     * 
     * @return list
     */
    public List<ResultInformationType> getResultInformationList() {
        return resultInformationList;
    }

    /** 
     * Set the list of 'ResultInformation' element items. Код возврата при обработке сообщения, результат выполнения операции (запрос к ЭАД, запрос статуса/истории процесса)
     * 
     * @param list
     */
    public void setResultInformationList(List<ResultInformationType> list) {
        resultInformationList = list;
    }
}
