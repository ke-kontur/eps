
package ru.acs.fts.schemas.album.guaranteecalculationresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * Результат расчета сумм обеспечения уплаты таможенных пошлин, налогов
 */
public class GuaranteeCalculationResultType extends BaseDocType
{
    private String documentDateTime;
    private TotalAmountType totalAmount;
    private TotalAmountType totalDeltaAmount;
    private List<GoodsAmountType> goodsAmountList = new ArrayList<GoodsAmountType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. Дата и время формирования электронного документа.
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время формирования электронного документа.
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'TotalAmount' element value. Общие суммы обеспечения, рассчитанные по запросу
     * 
     * @return value
     */
    public TotalAmountType getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общие суммы обеспечения, рассчитанные по запросу
     * 
     * @param totalAmount
     */
    public void setTotalAmount(TotalAmountType totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'TotalDeltaAmount' element value. Общие суммы обеспечения, рассчитанные по запросу (за вычетом уже уплаченных сумм)
     * 
     * @return value
     */
    public TotalAmountType getTotalDeltaAmount() {
        return totalDeltaAmount;
    }

    /** 
     * Set the 'TotalDeltaAmount' element value. Общие суммы обеспечения, рассчитанные по запросу (за вычетом уже уплаченных сумм)
     * 
     * @param totalDeltaAmount
     */
    public void setTotalDeltaAmount(TotalAmountType totalDeltaAmount) {
        this.totalDeltaAmount = totalDeltaAmount;
    }

    /** 
     * Get the list of 'GoodsAmount' element items. Результат расчета сумм обеспечения по товару
     * 
     * @return list
     */
    public List<GoodsAmountType> getGoodsAmountList() {
        return goodsAmountList;
    }

    /** 
     * Set the list of 'GoodsAmount' element items. Результат расчета сумм обеспечения по товару
     * 
     * @param list
     */
    public void setGoodsAmountList(List<GoodsAmountType> list) {
        goodsAmountList = list;
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
