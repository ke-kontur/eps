
package ru.acs.fts.schemas.album.reqwhgoodsprolong;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Заявление о продлении сроков временного хранения товаров
 */
public class ReqWHGoodsProlongType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String regNumber;
    private List<String> reasonList = new ArrayList<String>();
    private List<GoodsReasonType> goodsReasonList = new ArrayList<GoodsReasonType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата подачи заявления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата подачи заявления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время подачи заявления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время подачи заявления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'RegNumber' element value. Регистрационный номер заявления
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Регистрационный номер заявления
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the list of 'Reason' element items. Обоснование
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Обоснование
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the list of 'GoodsReason' element items. Основание продления срока по каждому товару
     * 
     * @return list
     */
    public List<GoodsReasonType> getGoodsReasonList() {
        return goodsReasonList;
    }

    /** 
     * Set the list of 'GoodsReason' element items. Основание продления срока по каждому товару
     * 
     * @param list
     */
    public void setGoodsReasonList(List<GoodsReasonType> list) {
        goodsReasonList = list;
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
