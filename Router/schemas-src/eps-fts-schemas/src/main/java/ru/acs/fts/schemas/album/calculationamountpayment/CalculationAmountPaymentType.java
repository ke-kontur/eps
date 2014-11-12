
package ru.acs.fts.schemas.album.calculationamountpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Расчет размера обеспечения уплаты таможенных платежей
 */
public class CalculationAmountPaymentType extends BaseDocType
{
    private String numberSheet;
    private String total;
    private String quantity;
    private List<DescriptionGoodsType> descriptionGoodList = new ArrayList<DescriptionGoodsType>();
    private GTDIDType GTDID;
    private CustomsPersonType customsPersonSignature;
    private String documentModeID;

    /** 
     * Get the 'NumberSheet' element value. Порядковый номер листа
     * 
     * @return value
     */
    public String getNumberSheet() {
        return numberSheet;
    }

    /** 
     * Set the 'NumberSheet' element value. Порядковый номер листа
     * 
     * @param numberSheet
     */
    public void setNumberSheet(String numberSheet) {
        this.numberSheet = numberSheet;
    }

    /** 
     * Get the 'Total' element value. Итого: размер обеспечения по ДТ
     * 
     * @return value
     */
    public String getTotal() {
        return total;
    }

    /** 
     * Set the 'Total' element value. Итого: размер обеспечения по ДТ
     * 
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /** 
     * Get the 'Quantity' element value. Количество товаров, в отношении которых требуется обеспечение
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товаров, в отношении которых требуется обеспечение
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'DescriptionGoods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<DescriptionGoodsType> getDescriptionGoodList() {
        return descriptionGoodList;
    }

    /** 
     * Set the list of 'DescriptionGoods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setDescriptionGoodList(List<DescriptionGoodsType> list) {
        descriptionGoodList = list;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер  ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер  ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
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
