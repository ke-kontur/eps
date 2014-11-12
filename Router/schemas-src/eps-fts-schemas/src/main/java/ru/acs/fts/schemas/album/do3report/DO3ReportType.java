
package ru.acs.fts.schemas.album.do3report;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomRegisterDocumentDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * ����� � ������ ������� � ��� �� ����� ��3
 */
public class DO3ReportType extends BaseDocType
{
    private LocalDate reportBegingDate;
    private LocalDate reportEndDate;
    private String addSheetsNumber;
    private String reportNumber;
    private LocalDate reportDate;
    private String reportTime;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private WHCustomRegisterDocumentDataType customRegistration;
    private WarehouseOwnerType warehouseOwner;
    private String documentModeID;

    /** 
     * Get the 'ReportBegingDate' element value. ���� ������ ��������� �������
     * 
     * @return value
     */
    public LocalDate getReportBegingDate() {
        return reportBegingDate;
    }

    /** 
     * Set the 'ReportBegingDate' element value. ���� ������ ��������� �������
     * 
     * @param reportBegingDate
     */
    public void setReportBegingDate(LocalDate reportBegingDate) {
        this.reportBegingDate = reportBegingDate;
    }

    /** 
     * Get the 'ReportEndDate' element value. ���� ��������� ��������� �������
     * 
     * @return value
     */
    public LocalDate getReportEndDate() {
        return reportEndDate;
    }

    /** 
     * Set the 'ReportEndDate' element value. ���� ��������� ��������� �������
     * 
     * @param reportEndDate
     */
    public void setReportEndDate(LocalDate reportEndDate) {
        this.reportEndDate = reportEndDate;
    }

    /** 
     * Get the 'AddSheetsNumber' element value. ���������� ���������� ������ ������
     * 
     * @return value
     */
    public String getAddSheetsNumber() {
        return addSheetsNumber;
    }

    /** 
     * Set the 'AddSheetsNumber' element value. ���������� ���������� ������ ������
     * 
     * @param addSheetsNumber
     */
    public void setAddSheetsNumber(String addSheetsNumber) {
        this.addSheetsNumber = addSheetsNumber;
    }

    /** 
     * Get the 'ReportNumber' element value. ����� ������. ������������� ����������� �������� ��������� ���
     * 
     * @return value
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /** 
     * Set the 'ReportNumber' element value. ����� ������. ������������� ����������� �������� ��������� ���
     * 
     * @param reportNumber
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    /** 
     * Get the 'ReportDate' element value. ���� ����������� ������
     * 
     * @return value
     */
    public LocalDate getReportDate() {
        return reportDate;
    }

    /** 
     * Set the 'ReportDate' element value. ���� ����������� ������
     * 
     * @param reportDate
     */
    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    /** 
     * Get the 'ReportTime' element value. ����� ����������� ������
     * 
     * @return value
     */
    public String getReportTime() {
        return reportTime;
    }

    /** 
     * Set the 'ReportTime' element value. ����� ����������� ������
     * 
     * @param reportTime
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'CustomRegistration' element value. ������ � ����������� ������ � ���������� ������
     * 
     * @return value
     */
    public WHCustomRegisterDocumentDataType getCustomRegistration() {
        return customRegistration;
    }

    /** 
     * Set the 'CustomRegistration' element value. ������ � ����������� ������ � ���������� ������
     * 
     * @param customRegistration
     */
    public void setCustomRegistration(
            WHCustomRegisterDocumentDataType customRegistration) {
        this.customRegistration = customRegistration;
    }

    /** 
     * Get the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
