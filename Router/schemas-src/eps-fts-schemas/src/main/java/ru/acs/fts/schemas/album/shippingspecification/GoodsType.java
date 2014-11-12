
package ru.acs.fts.schemas.album.shippingspecification;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.GoodsPlaceType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.GoodsWeightType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;

/** 
 * Товар отгрузочной спецификации
 */
public class GoodsType
{
    private String description;
    private String goodMarking;
    private String articul;
    private String code;
    private String TNVED;
    private List<String> pakageNumberList = new ArrayList<String>();
    private String dimensions;
    private String quantity;
    private String measureUnitQualifierCode;
    private String measureUnitQualifierName;
    private String currencyCode;
    private String price;
    private String cost;
    private String notes;
    private GoodsWeightType weight;
    private ESADContainerType transport;
    private GoodsPlaceType place;
    private DocumentBaseType qualityDocument;

    /** 
     * Get the 'Description' element value. Описание товара текстовое
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание товара текстовое
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'GoodMarking' element value. Марка или модель
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. Марка или модель
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

    /** 
     * Get the 'Articul' element value. Артикул
     * 
     * @return value
     */
    public String getArticul() {
        return articul;
    }

    /** 
     * Set the 'Articul' element value. Артикул
     * 
     * @param articul
     */
    public void setArticul(String articul) {
        this.articul = articul;
    }

    /** 
     * Get the 'Code' element value. Код товара
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код товара
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the list of 'PakageNumber' element items. Номер грузового места
     * 
     * @return list
     */
    public List<String> getPakageNumberList() {
        return pakageNumberList;
    }

    /** 
     * Set the list of 'PakageNumber' element items. Номер грузового места
     * 
     * @param list
     */
    public void setPakageNumberList(List<String> list) {
        pakageNumberList = list;
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
     * Get the 'Quantity' element value. Количество товара в единицах измерения
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара в единицах измерения
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Название единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Название единицы измерения
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Price' element value. Цена товара
     * 
     * @return value
     */
    public String getPrice() {
        return price;
    }

    /** 
     * Set the 'Price' element value. Цена товара
     * 
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** 
     * Get the 'Cost' element value. Стоимость товара
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость товара
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Notes' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Дополнительная информация
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'Weight' element value. Вес нетто и брутто в кг
     * 
     * @return value
     */
    public GoodsWeightType getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Вес нетто и брутто в кг
     * 
     * @param weight
     */
    public void setWeight(GoodsWeightType weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'Transport' element value. Информация о транспорте
     * 
     * @return value
     */
    public ESADContainerType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. Информация о транспорте
     * 
     * @param transport
     */
    public void setTransport(ESADContainerType transport) {
        this.transport = transport;
    }

    /** 
     * Get the 'Place' element value. Описание грузовых мест
     * 
     * @return value
     */
    public GoodsPlaceType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Описание грузовых мест
     * 
     * @param place
     */
    public void setPlace(GoodsPlaceType place) {
        this.place = place;
    }

    /** 
     * Get the 'QualityDocument' element value. Документ о качестве
     * 
     * @return value
     */
    public DocumentBaseType getQualityDocument() {
        return qualityDocument;
    }

    /** 
     * Set the 'QualityDocument' element value. Документ о качестве
     * 
     * @param qualityDocument
     */
    public void setQualityDocument(DocumentBaseType qualityDocument) {
        this.qualityDocument = qualityDocument;
    }
}
