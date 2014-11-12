
package ru.acs.fts.schemas.album.bdrd_report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Результаты сверки сведений
 */
public class CheckResultType
{
    private String dataSource;
    private String quotaPosibilitySign;
    private String goodsNumber;
    private String numeric;
    private List<String> DTGoodsDescriptionList = new ArrayList<String>();
    private String DTGoodsTNVEDCode;
    private List<String> RDGoodsDescriptionList = new ArrayList<String>();
    private String RDGoodsTNVEDCode;
    private List<SupplementaryQuantityType> DTSupplementaryQuantityList = new ArrayList<SupplementaryQuantityType>();
    private List<SupplementaryQuantityType> RDSupplementaryQuantityList = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'DataSource' element value. Источник получения сведений (ФОИВ)
     * 
     * @return value
     */
    public String getDataSource() {
        return dataSource;
    }

    /** 
     * Set the 'DataSource' element value. Источник получения сведений (ФОИВ)
     * 
     * @param dataSource
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /** 
     * Get the 'QuotaPosibilitySign' element value. Признак возможности списания квоты
     * 
     * @return value
     */
    public String getQuotaPosibilitySign() {
        return quotaPosibilitySign;
    }

    /** 
     * Set the 'QuotaPosibilitySign' element value. Признак возможности списания квоты
     * 
     * @param quotaPosibilitySign
     */
    public void setQuotaPosibilitySign(String quotaPosibilitySign) {
        this.quotaPosibilitySign = quotaPosibilitySign;
    }

    /** 
     * Get the 'GoodsNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Номер товара по ДТ
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the list of 'DT_GoodsDescription' element items. Описание товара по ДТ
     * 
     * @return list
     */
    public List<String> getDTGoodsDescriptionList() {
        return DTGoodsDescriptionList;
    }

    /** 
     * Set the list of 'DT_GoodsDescription' element items. Описание товара по ДТ
     * 
     * @param list
     */
    public void setDTGoodsDescriptionList(List<String> list) {
        DTGoodsDescriptionList = list;
    }

    /** 
     * Get the 'DT_GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС по ДТ
     * 
     * @return value
     */
    public String getDTGoodsTNVEDCode() {
        return DTGoodsTNVEDCode;
    }

    /** 
     * Set the 'DT_GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС по ДТ
     * 
     * @param DTGoodsTNVEDCode
     */
    public void setDTGoodsTNVEDCode(String DTGoodsTNVEDCode) {
        this.DTGoodsTNVEDCode = DTGoodsTNVEDCode;
    }

    /** 
     * Get the list of 'RD_GoodsDescription' element items. Описание товара по РД
     * 
     * @return list
     */
    public List<String> getRDGoodsDescriptionList() {
        return RDGoodsDescriptionList;
    }

    /** 
     * Set the list of 'RD_GoodsDescription' element items. Описание товара по РД
     * 
     * @param list
     */
    public void setRDGoodsDescriptionList(List<String> list) {
        RDGoodsDescriptionList = list;
    }

    /** 
     * Get the 'RD_GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС по РД
     * 
     * @return value
     */
    public String getRDGoodsTNVEDCode() {
        return RDGoodsTNVEDCode;
    }

    /** 
     * Set the 'RD_GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС по РД
     * 
     * @param RDGoodsTNVEDCode
     */
    public void setRDGoodsTNVEDCode(String RDGoodsTNVEDCode) {
        this.RDGoodsTNVEDCode = RDGoodsTNVEDCode;
    }

    /** 
     * Get the list of 'DT_SupplementaryQuantity' element items. Количество товара по ДТ
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getDTSupplementaryQuantityList() {
        return DTSupplementaryQuantityList;
    }

    /** 
     * Set the list of 'DT_SupplementaryQuantity' element items. Количество товара по ДТ
     * 
     * @param list
     */
    public void setDTSupplementaryQuantityList(
            List<SupplementaryQuantityType> list) {
        DTSupplementaryQuantityList = list;
    }

    /** 
     * Get the list of 'RD_SupplementaryQuantity' element items. Количество товара по РД
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getRDSupplementaryQuantityList() {
        return RDSupplementaryQuantityList;
    }

    /** 
     * Set the list of 'RD_SupplementaryQuantity' element items. Количество товара по РД
     * 
     * @param list
     */
    public void setRDSupplementaryQuantityList(
            List<SupplementaryQuantityType> list) {
        RDSupplementaryQuantityList = list;
    }
}
