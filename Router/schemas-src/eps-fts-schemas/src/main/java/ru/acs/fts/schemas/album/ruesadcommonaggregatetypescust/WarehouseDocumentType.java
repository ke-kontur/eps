
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� � �������� ����������� ������, ���������� ������, ���������� �� �������� �������� ������������ ��������, ������ ��������� ������� ��� ����� ����������� ������. ��. 44 � 9.2, �. 9.5.
 */
public class WarehouseDocumentType extends PresentedDocumentType
{
    private String subLineNumber;
    private String documentModeCode;
    private LocalDate periodDate;
    private LocalDate conditionDate;
    private LocalDate saleDate;

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
     * Get the 'DocumentModeCode' element value. ��� ���������:1-�������� �� ���������� ���������� ������. 2-������������� � ��������� � ������ ���������� ���������� �������. 3- ������ �������.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������:1-�������� �� ���������� ���������� ������. 2-������������� � ��������� � ������ ���������� ���������� �������. 3- ������ �������.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'PeriodDate' element value. ���� �������� ���������� / ���� ��������� ��� ����� �� 
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. ���� �������� ���������� / ���� ��������� ��� ����� �� 
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
}
