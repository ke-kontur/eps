
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Характеристика товаров в группе
 */
public class GoodsGroupInformationType
{
    private String manufacturer;
    private String tradeMark;
    private String goodsMark;
    private String goodsModel;
    private String goodsMarking;
    private String goodsStandard;
    private String goodsSort;
    private String woodSortiment;
    private String woodKind;
    private String dimensions;
    private LocalDate dateIssue;
    private List<String> serialNumberList = new ArrayList<String>();
    private SupplementaryQuantityType goodsGroupQuantity;

    /** 
     * Get the 'Manufacturer' element value. Сведения о производителе
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Сведения о производителе
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
     * 
     * @return value
     */
    public String getTradeMark() {
        return tradeMark;
    }

    /** 
     * Set the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
     * 
     * @param tradeMark
     */
    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    /** 
     * Get the 'GoodsMark' element value. Марка товара
     * 
     * @return value
     */
    public String getGoodsMark() {
        return goodsMark;
    }

    /** 
     * Set the 'GoodsMark' element value. Марка товара
     * 
     * @param goodsMark
     */
    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    /** 
     * Get the 'GoodsModel' element value. Модель товара
     * 
     * @return value
     */
    public String getGoodsModel() {
        return goodsModel;
    }

    /** 
     * Set the 'GoodsModel' element value. Модель товара
     * 
     * @param goodsModel
     */
    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    /** 
     * Get the 'GoodsMarking' element value. Артикул товара
     * 
     * @return value
     */
    public String getGoodsMarking() {
        return goodsMarking;
    }

    /** 
     * Set the 'GoodsMarking' element value. Артикул товара
     * 
     * @param goodsMarking
     */
    public void setGoodsMarking(String goodsMarking) {
        this.goodsMarking = goodsMarking;
    }

    /** 
     * Get the 'GoodsStandard' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @return value
     */
    public String getGoodsStandard() {
        return goodsStandard;
    }

    /** 
     * Set the 'GoodsStandard' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @param goodsStandard
     */
    public void setGoodsStandard(String goodsStandard) {
        this.goodsStandard = goodsStandard;
    }

    /** 
     * Get the 'GoodsSort' element value. Сорт / Сорт или группа сортов (для лесо- и пиломатериалов)
     * 
     * @return value
     */
    public String getGoodsSort() {
        return goodsSort;
    }

    /** 
     * Set the 'GoodsSort' element value. Сорт / Сорт или группа сортов (для лесо- и пиломатериалов)
     * 
     * @param goodsSort
     */
    public void setGoodsSort(String goodsSort) {
        this.goodsSort = goodsSort;
    }

    /** 
     * Get the 'WoodSortiment' element value. Наименование сортимента (для лесоматериалов товарной позиции 4403)
     * 
     * @return value
     */
    public String getWoodSortiment() {
        return woodSortiment;
    }

    /** 
     * Set the 'WoodSortiment' element value. Наименование сортимента (для лесоматериалов товарной позиции 4403)
     * 
     * @param woodSortiment
     */
    public void setWoodSortiment(String woodSortiment) {
        this.woodSortiment = woodSortiment;
    }

    /** 
     * Get the 'WoodKind' element value. Порода древесины
     * 
     * @return value
     */
    public String getWoodKind() {
        return woodKind;
    }

    /** 
     * Set the 'WoodKind' element value. Порода древесины
     * 
     * @param woodKind
     */
    public void setWoodKind(String woodKind) {
        this.woodKind = woodKind;
    }

    /** 
     * Get the 'Dimensions' element value. Размеры
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Размеры
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'DateIssue' element value. Дата выпуска
     * 
     * @return value
     */
    public LocalDate getDateIssue() {
        return dateIssue;
    }

    /** 
     * Set the 'DateIssue' element value. Дата выпуска
     * 
     * @param dateIssue
     */
    public void setDateIssue(LocalDate dateIssue) {
        this.dateIssue = dateIssue;
    }

    /** 
     * Get the list of 'SerialNumber' element items. Серийный номер
     * 
     * @return list
     */
    public List<String> getSerialNumberList() {
        return serialNumberList;
    }

    /** 
     * Set the list of 'SerialNumber' element items. Серийный номер
     * 
     * @param list
     */
    public void setSerialNumberList(List<String> list) {
        serialNumberList = list;
    }

    /** 
     * Get the 'GoodsGroupQuantity' element value. Количество товаров. Гр.31 первый подраздел
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsGroupQuantity() {
        return goodsGroupQuantity;
    }

    /** 
     * Set the 'GoodsGroupQuantity' element value. Количество товаров. Гр.31 первый подраздел
     * 
     * @param goodsGroupQuantity
     */
    public void setGoodsGroupQuantity(
            SupplementaryQuantityType goodsGroupQuantity) {
        this.goodsGroupQuantity = goodsGroupQuantity;
    }
}
