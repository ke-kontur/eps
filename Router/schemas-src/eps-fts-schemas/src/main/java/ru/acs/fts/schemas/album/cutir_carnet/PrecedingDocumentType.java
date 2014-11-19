
package ru.acs.fts.schemas.album.cutir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Предшествующие документы
 */
public class PrecedingDocumentType
{
    private String precedingDocumentID;
    private String precedingDocumentCustomsCode;
    private LocalDate precedingDocumentDate;
    private String precedingDocumentNumber;
    private String precedingDocumentGoodsNumeric;
    private String precedingDocumentName;
    private String precedingDocumentModeCode;
    private String lineNumber;
    private String netWeightQuantity;
    private String customsCountryCode;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'PrecedingDocumentID' element value. Дополнительный идентификатор предшествующего документа
     * 
     * @return value
     */
    public String getPrecedingDocumentID() {
        return precedingDocumentID;
    }

    /** 
     * Set the 'PrecedingDocumentID' element value. Дополнительный идентификатор предшествующего документа
     * 
     * @param precedingDocumentID
     */
    public void setPrecedingDocumentID(String precedingDocumentID) {
        this.precedingDocumentID = precedingDocumentID;
    }

    /** 
     * Get the 'PrecedingDocumentCustomsCode' element value. Код таможенного органа предшествующего документа
     * 
     * @return value
     */
    public String getPrecedingDocumentCustomsCode() {
        return precedingDocumentCustomsCode;
    }

    /** 
     * Set the 'PrecedingDocumentCustomsCode' element value. Код таможенного органа предшествующего документа
     * 
     * @param precedingDocumentCustomsCode
     */
    public void setPrecedingDocumentCustomsCode(
            String precedingDocumentCustomsCode) {
        this.precedingDocumentCustomsCode = precedingDocumentCustomsCode;
    }

    /** 
     * Get the 'PrecedingDocumentDate' element value. Предшествующий документ - дата 
     * 
     * @return value
     */
    public LocalDate getPrecedingDocumentDate() {
        return precedingDocumentDate;
    }

    /** 
     * Set the 'PrecedingDocumentDate' element value. Предшествующий документ - дата 
     * 
     * @param precedingDocumentDate
     */
    public void setPrecedingDocumentDate(LocalDate precedingDocumentDate) {
        this.precedingDocumentDate = precedingDocumentDate;
    }

    /** 
     * Get the 'PrecedingDocumentNumber' element value. Предшествующий документ - регистрационный номер документа / номер документа при транзите
     * 
     * @return value
     */
    public String getPrecedingDocumentNumber() {
        return precedingDocumentNumber;
    }

    /** 
     * Set the 'PrecedingDocumentNumber' element value. Предшествующий документ - регистрационный номер документа / номер документа при транзите
     * 
     * @param precedingDocumentNumber
     */
    public void setPrecedingDocumentNumber(String precedingDocumentNumber) {
        this.precedingDocumentNumber = precedingDocumentNumber;
    }

    /** 
     * Get the 'PrecedingDocumentGoodsNumeric' element value. Номер товара в предшествующем документе 
     * 
     * @return value
     */
    public String getPrecedingDocumentGoodsNumeric() {
        return precedingDocumentGoodsNumeric;
    }

    /** 
     * Set the 'PrecedingDocumentGoodsNumeric' element value. Номер товара в предшествующем документе 
     * 
     * @param precedingDocumentGoodsNumeric
     */
    public void setPrecedingDocumentGoodsNumeric(
            String precedingDocumentGoodsNumeric) {
        this.precedingDocumentGoodsNumeric = precedingDocumentGoodsNumeric;
    }

    /** 
     * Get the 'PrecedingDocumentName' element value. Наименование предшествующего документа
     * 
     * @return value
     */
    public String getPrecedingDocumentName() {
        return precedingDocumentName;
    }

    /** 
     * Set the 'PrecedingDocumentName' element value. Наименование предшествующего документа
     * 
     * @param precedingDocumentName
     */
    public void setPrecedingDocumentName(String precedingDocumentName) {
        this.precedingDocumentName = precedingDocumentName;
    }

    /** 
     * Get the 'PrecedingDocumentModeCode' element value. Код вида предшествующего документа в соответствии с классификатором видов документов
     * 
     * @return value
     */
    public String getPrecedingDocumentModeCode() {
        return precedingDocumentModeCode;
    }

    /** 
     * Set the 'PrecedingDocumentModeCode' element value. Код вида предшествующего документа в соответствии с классификатором видов документов
     * 
     * @param precedingDocumentModeCode
     */
    public void setPrecedingDocumentModeCode(String precedingDocumentModeCode) {
        this.precedingDocumentModeCode = precedingDocumentModeCode;
    }

    /** 
     * Get the 'LineNumber' element value. Порядковый номер строки
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Порядковый номер строки
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
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
     * Get the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код страны таможенного органа
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
