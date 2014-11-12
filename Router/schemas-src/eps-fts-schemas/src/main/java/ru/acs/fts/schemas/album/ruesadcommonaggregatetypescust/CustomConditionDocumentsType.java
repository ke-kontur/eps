
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ����������, ����������� �  �. 9.1 -9.6 �� ����������� �������, ����� �� ������������ � �������� ��������� �� ����������� �������.
 */
public class CustomConditionDocumentsType extends DocumentBaseType
{
    private String lineNumber;
    private String subLineNumber;
    private String documentModeCode;
    private String informationCode;
    private LocalDate periodDate;
    private LocalDate conditionDate;
    private LocalDate saleDate;
    private LocalDate presentingDate;
    private String goodsStatus;
    private String repairStatus;

    /** 
     * Get the 'LineNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. ����� ������
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'SubLineNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /** 
     * Set the 'SubLineNumber' element value. ����� ���������
     * 
     * @param subLineNumber
     */
    public void setSubLineNumber(String subLineNumber) {
        this.subLineNumber = subLineNumber;
    }

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���� ��������������� ���������(����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���� ��������������� ���������(����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'InformationCode' element value. ��� ���������� ( �� / ���������� �� ����������� / ���������� ��������� ������ �� ��������� � ��.)
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. ��� ���������� ( �� / ���������� �� ����������� / ���������� ��������� ������ �� ��������� � ��.)
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'PeriodDate' element value. ���� �������� ���������� / ���� ��������� ��� ����� �� / ���� ������������ ������ ��� ���������.
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. ���� �������� ���������� / ���� ��������� ��� ����� �� / ���� ������������ ������ ��� ���������.
     * 
     * @param periodDate
     */
    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    /** 
     * Get the 'ConditionDate' element value. ���� ��������.
     * 
     * @return value
     */
    public LocalDate getConditionDate() {
        return conditionDate;
    }

    /** 
     * Set the 'ConditionDate' element value. ���� ��������.
     * 
     * @param conditionDate
     */
    public void setConditionDate(LocalDate conditionDate) {
        this.conditionDate = conditionDate;
    }

    /** 
     * Get the 'SaleDate' element value. ���� ����������.
     * 
     * @return value
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }

    /** 
     * Set the 'SaleDate' element value. ���� ����������.
     * 
     * @param saleDate
     */
    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    /** 
     * Get the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }

    /** 
     * Get the 'GoodsStatus' element value. ������ ������� ��� ������ 1- ����������, 2 - �������� �����������. 
     * 
     * @return value
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /** 
     * Set the 'GoodsStatus' element value. ������ ������� ��� ������ 1- ����������, 2 - �������� �����������. 
     * 
     * @param goodsStatus
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /** 
     * Get the 'RepairStatus' element value. ������� ������� �� ��������� ���������� ���������� ��. 0 - �������� �� ������� �� �������������, 1 - �������� �� ������� �������������
     * 
     * @return value
     */
    public String getRepairStatus() {
        return repairStatus;
    }

    /** 
     * Set the 'RepairStatus' element value. ������� ������� �� ��������� ���������� ���������� ��. 0 - �������� �� ������� �� �������������, 1 - �������� �� ������� �������������
     * 
     * @param repairStatus
     */
    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }
}
