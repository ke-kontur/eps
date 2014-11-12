
package ru.acs.fts.schemas.album.pi_consignment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.GoodsPackagingType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodMarking;
    private String goodsTNVEDCode;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String totalCost;
    private List<DocumentsType> documentList = new ArrayList<DocumentsType>();
    private GoodsPackagingType goodsPackingInfo;

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара 
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара 
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodMarking' element value. Артикул (код товара, номер по каталогу производителя) 
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. Артикул (код товара, номер по каталогу производителя) 
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'TotalCost' element value. Стоимость товаров в соответствии с коммерческими документами
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Стоимость товаров в соответствии с коммерческими документами
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the list of 'Documents' element items. Документы
     * 
     * @return list
     */
    public List<DocumentsType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Documents' element items. Документы
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentsType> list) {
        documentList = list;
    }

    /** 
     * Get the 'GoodsPackingInfo' element value. Сведения о грузовых местах/упаковке товаров
     * 
     * @return value
     */
    public GoodsPackagingType getGoodsPackingInfo() {
        return goodsPackingInfo;
    }

    /** 
     * Set the 'GoodsPackingInfo' element value. Сведения о грузовых местах/упаковке товаров
     * 
     * @param goodsPackingInfo
     */
    public void setGoodsPackingInfo(GoodsPackagingType goodsPackingInfo) {
        this.goodsPackingInfo = goodsPackingInfo;
    }
}
