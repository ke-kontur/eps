
package ru.acs.fts.schemas.album.guaranteeresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о результате обработки запроса статуса процесса работы с дополнением к договору поручительства.
 */
public class GuaranteeResultType extends BaseDocType
{
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String resultCategory;
    private String statusDescription;
    private String documentModeID;

    /** 
     * Get the 'ResultCode' element value. Код возврата
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Код возврата
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the list of 'ResultDescription' element items. Текстовое описание
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. Текстовое описание
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the 'ResultCategory' element value. Степень критичности ошибки. Код или мнемоническое описание.
     * 
     * @return value
     */
    public String getResultCategory() {
        return resultCategory;
    }

    /** 
     * Set the 'ResultCategory' element value. Степень критичности ошибки. Код или мнемоническое описание.
     * 
     * @param resultCategory
     */
    public void setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
    }

    /** 
     * Get the 'StatusDescription' element value. Описание статуса процесса работы с дополнением к договору поручительства.
     * 
     * @return value
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /** 
     * Set the 'StatusDescription' element value. Описание статуса процесса работы с дополнением к договору поручительства.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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
