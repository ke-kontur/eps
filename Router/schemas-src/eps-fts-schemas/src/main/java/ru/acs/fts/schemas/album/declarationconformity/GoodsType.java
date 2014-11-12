
package ru.acs.fts.schemas.album.declarationconformity;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о продукции
 */
public class GoodsType extends AppendsType
{
    private String productCode;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String seriesSign;
    private String normDocs;
    private List<ManufacturerType> manufacturerList = new ArrayList<ManufacturerType>();
    private List<GoodsInformationType> goodsInformationList = new ArrayList<GoodsInformationType>();
    private TypeDeclarationType typeDeclaration;
    private DocumentBaseType contract;

    /** 
     * Get the 'ProductCode' element value. Код продукции по ОК005 - Общероссийскому классификатору продукции
     * 
     * @return value
     */
    public String getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'ProductCode' element value. Код продукции по ОК005 - Общероссийскому классификатору продукции
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
     * Get the list of 'GoodsDescription' element items. Описание товара текстовое (наименование, тип, вид, марка продукции, обозначение стандарта, технических условий или иного документа, по которому она выпускается (для импортной продукции ссылка на документ необязательна. Для партии и единичного изделия приводят номер и размер партии или номер изделия, номер и дату выдачи накладной, договора (контракта), документа о качестве и т.п.)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара текстовое (наименование, тип, вид, марка продукции, обозначение стандарта, технических условий или иного документа, по которому она выпускается (для импортной продукции ссылка на документ необязательна. Для партии и единичного изделия приводят номер и размер партии или номер изделия, номер и дату выдачи накладной, договора (контракта), документа о качестве и т.п.)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SeriesSign' element value. Признак: 1 - "единичное изделие", 2 - "партия", 3 - "серийный выпуск"
     * 
     * @return value
     */
    public String getSeriesSign() {
        return seriesSign;
    }

    /** 
     * Set the 'SeriesSign' element value. Признак: 1 - "единичное изделие", 2 - "партия", 3 - "серийный выпуск"
     * 
     * @param seriesSign
     */
    public void setSeriesSign(String seriesSign) {
        this.seriesSign = seriesSign;
    }

    /** 
     * Get the 'NormDocs' element value. Обозначение документов, на основании которых изготовлена продукция
     * 
     * @return value
     */
    public String getNormDocs() {
        return normDocs;
    }

    /** 
     * Set the 'NormDocs' element value. Обозначение документов, на основании которых изготовлена продукция
     * 
     * @param normDocs
     */
    public void setNormDocs(String normDocs) {
        this.normDocs = normDocs;
    }

    /** 
     * Get the list of 'Manufacturer' element items. Сведения о изготовителе
     * 
     * @return list
     */
    public List<ManufacturerType> getManufacturerList() {
        return manufacturerList;
    }

    /** 
     * Set the list of 'Manufacturer' element items. Сведения о изготовителе
     * 
     * @param list
     */
    public void setManufacturerList(List<ManufacturerType> list) {
        manufacturerList = list;
    }

    /** 
     * Get the list of 'GoodsInformation' element items. Характеристика товара
     * 
     * @return list
     */
    public List<GoodsInformationType> getGoodsInformationList() {
        return goodsInformationList;
    }

    /** 
     * Set the list of 'GoodsInformation' element items. Характеристика товара
     * 
     * @param list
     */
    public void setGoodsInformationList(List<GoodsInformationType> list) {
        goodsInformationList = list;
    }

    /** 
     * Get the 'TypeDeclaration' element value. Сведения о типе объекта декларирования
     * 
     * @return value
     */
    public TypeDeclarationType getTypeDeclaration() {
        return typeDeclaration;
    }

    /** 
     * Set the 'TypeDeclaration' element value. Сведения о типе объекта декларирования
     * 
     * @param typeDeclaration
     */
    public void setTypeDeclaration(TypeDeclarationType typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }

    /** 
     * Get the 'Contract' element value. Сведения о контракте
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Сведения о контракте
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
