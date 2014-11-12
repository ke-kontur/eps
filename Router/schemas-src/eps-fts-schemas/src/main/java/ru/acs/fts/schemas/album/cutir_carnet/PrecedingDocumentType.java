
package ru.acs.fts.schemas.album.cutir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������������� ���������
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
     * Get the 'PrecedingDocumentID' element value. �������������� ������������� ��������������� ���������
     * 
     * @return value
     */
    public String getPrecedingDocumentID() {
        return precedingDocumentID;
    }

    /** 
     * Set the 'PrecedingDocumentID' element value. �������������� ������������� ��������������� ���������
     * 
     * @param precedingDocumentID
     */
    public void setPrecedingDocumentID(String precedingDocumentID) {
        this.precedingDocumentID = precedingDocumentID;
    }

    /** 
     * Get the 'PrecedingDocumentCustomsCode' element value. ��� ����������� ������ ��������������� ���������
     * 
     * @return value
     */
    public String getPrecedingDocumentCustomsCode() {
        return precedingDocumentCustomsCode;
    }

    /** 
     * Set the 'PrecedingDocumentCustomsCode' element value. ��� ����������� ������ ��������������� ���������
     * 
     * @param precedingDocumentCustomsCode
     */
    public void setPrecedingDocumentCustomsCode(
            String precedingDocumentCustomsCode) {
        this.precedingDocumentCustomsCode = precedingDocumentCustomsCode;
    }

    /** 
     * Get the 'PrecedingDocumentDate' element value. �������������� �������� - ���� 
     * 
     * @return value
     */
    public LocalDate getPrecedingDocumentDate() {
        return precedingDocumentDate;
    }

    /** 
     * Set the 'PrecedingDocumentDate' element value. �������������� �������� - ���� 
     * 
     * @param precedingDocumentDate
     */
    public void setPrecedingDocumentDate(LocalDate precedingDocumentDate) {
        this.precedingDocumentDate = precedingDocumentDate;
    }

    /** 
     * Get the 'PrecedingDocumentNumber' element value. �������������� �������� - ��������������� ����� ��������� / ����� ��������� ��� ��������
     * 
     * @return value
     */
    public String getPrecedingDocumentNumber() {
        return precedingDocumentNumber;
    }

    /** 
     * Set the 'PrecedingDocumentNumber' element value. �������������� �������� - ��������������� ����� ��������� / ����� ��������� ��� ��������
     * 
     * @param precedingDocumentNumber
     */
    public void setPrecedingDocumentNumber(String precedingDocumentNumber) {
        this.precedingDocumentNumber = precedingDocumentNumber;
    }

    /** 
     * Get the 'PrecedingDocumentGoodsNumeric' element value. ����� ������ � �������������� ��������� 
     * 
     * @return value
     */
    public String getPrecedingDocumentGoodsNumeric() {
        return precedingDocumentGoodsNumeric;
    }

    /** 
     * Set the 'PrecedingDocumentGoodsNumeric' element value. ����� ������ � �������������� ��������� 
     * 
     * @param precedingDocumentGoodsNumeric
     */
    public void setPrecedingDocumentGoodsNumeric(
            String precedingDocumentGoodsNumeric) {
        this.precedingDocumentGoodsNumeric = precedingDocumentGoodsNumeric;
    }

    /** 
     * Get the 'PrecedingDocumentName' element value. ������������ ��������������� ���������
     * 
     * @return value
     */
    public String getPrecedingDocumentName() {
        return precedingDocumentName;
    }

    /** 
     * Set the 'PrecedingDocumentName' element value. ������������ ��������������� ���������
     * 
     * @param precedingDocumentName
     */
    public void setPrecedingDocumentName(String precedingDocumentName) {
        this.precedingDocumentName = precedingDocumentName;
    }

    /** 
     * Get the 'PrecedingDocumentModeCode' element value. ��� ���� ��������������� ��������� � ������������ � ��������������� ����� ����������
     * 
     * @return value
     */
    public String getPrecedingDocumentModeCode() {
        return precedingDocumentModeCode;
    }

    /** 
     * Set the 'PrecedingDocumentModeCode' element value. ��� ���� ��������������� ��������� � ������������ � ��������������� ����� ����������
     * 
     * @param precedingDocumentModeCode
     */
    public void setPrecedingDocumentModeCode(String precedingDocumentModeCode) {
        this.precedingDocumentModeCode = precedingDocumentModeCode;
    }

    /** 
     * Get the 'LineNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. ���������� ����� ������
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
