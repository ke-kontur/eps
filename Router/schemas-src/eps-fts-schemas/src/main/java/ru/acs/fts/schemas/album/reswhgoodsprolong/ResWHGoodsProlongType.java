
package ru.acs.fts.schemas.album.reswhgoodsprolong;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Решение, принятое по заявлению о продлении сроков временного хранения товаров
 */
public class ResWHGoodsProlongType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String regNumber;
    private List<GoodsDecisionType> goodsDecisionList = new ArrayList<GoodsDecisionType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления решения
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления решения
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время  направления решения
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время  направления решения
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
     * Get the list of 'GoodsDecision' element items. Решение продления срока по каждому товару
     * 
     * @return list
     */
    public List<GoodsDecisionType> getGoodsDecisionList() {
        return goodsDecisionList;
    }

    /** 
     * Set the list of 'GoodsDecision' element items. Решение продления срока по каждому товару
     * 
     * @param list
     */
    public void setGoodsDecisionList(List<GoodsDecisionType> list) {
        goodsDecisionList = list;
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
