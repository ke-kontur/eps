
package ru.acs.fts.schemas.album.do3report;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomRegisterDocumentDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * Отчет о выдаче товаров с СВХ по форме ДО3
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
     * Get the 'ReportBegingDate' element value. Дата начала отчетного периода
     * 
     * @return value
     */
    public LocalDate getReportBegingDate() {
        return reportBegingDate;
    }

    /** 
     * Set the 'ReportBegingDate' element value. Дата начала отчетного периода
     * 
     * @param reportBegingDate
     */
    public void setReportBegingDate(LocalDate reportBegingDate) {
        this.reportBegingDate = reportBegingDate;
    }

    /** 
     * Get the 'ReportEndDate' element value. Дата окончания отчетного периода
     * 
     * @return value
     */
    public LocalDate getReportEndDate() {
        return reportEndDate;
    }

    /** 
     * Set the 'ReportEndDate' element value. Дата окончания отчетного периода
     * 
     * @param reportEndDate
     */
    public void setReportEndDate(LocalDate reportEndDate) {
        this.reportEndDate = reportEndDate;
    }

    /** 
     * Get the 'AddSheetsNumber' element value. Количество добавочных листов отчета
     * 
     * @return value
     */
    public String getAddSheetsNumber() {
        return addSheetsNumber;
    }

    /** 
     * Set the 'AddSheetsNumber' element value. Количество добавочных листов отчета
     * 
     * @param addSheetsNumber
     */
    public void setAddSheetsNumber(String addSheetsNumber) {
        this.addSheetsNumber = addSheetsNumber;
    }

    /** 
     * Get the 'ReportNumber' element value. Номер отчета. Присваивается оформляющей системой владельца СВХ
     * 
     * @return value
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /** 
     * Set the 'ReportNumber' element value. Номер отчета. Присваивается оформляющей системой владельца СВХ
     * 
     * @param reportNumber
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    /** 
     * Get the 'ReportDate' element value. Дата составления отчета
     * 
     * @return value
     */
    public LocalDate getReportDate() {
        return reportDate;
    }

    /** 
     * Set the 'ReportDate' element value. Дата составления отчета
     * 
     * @param reportDate
     */
    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    /** 
     * Get the 'ReportTime' element value. Время составления отчета
     * 
     * @return value
     */
    public String getReportTime() {
        return reportTime;
    }

    /** 
     * Set the 'ReportTime' element value. Время составления отчета
     * 
     * @param reportTime
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'CustomRegistration' element value. Данные о регистрации отчета в таможенном органе
     * 
     * @return value
     */
    public WHCustomRegisterDocumentDataType getCustomRegistration() {
        return customRegistration;
    }

    /** 
     * Set the 'CustomRegistration' element value. Данные о регистрации отчета в таможенном органе
     * 
     * @param customRegistration
     */
    public void setCustomRegistration(
            WHCustomRegisterDocumentDataType customRegistration) {
        this.customRegistration = customRegistration;
    }

    /** 
     * Get the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
