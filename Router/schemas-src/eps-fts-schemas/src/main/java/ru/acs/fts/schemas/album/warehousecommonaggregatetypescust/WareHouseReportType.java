
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Комплексный тип для описания документа, составляемого при помещении, в процессе временного хранения товаров и при выпуске товаров со складов временного хранения.
 */
public class WareHouseReportType extends BaseDocType
{
    private String mainTransportModeCode;
    private String reportNumber;
    private LocalDate reportDate;
    private String reportTime;
    private String modificationDateTime;
    private WHCustomRegisterDocumentDataType customRegistration;
    private WarehouseOwnerType warehouseOwner;

    /** 
     * Get the 'MainTransportModeCode' element value. Код вида основного ТС (по классификатору видов транспорта и транспортировки товаров)
     * 
     * @return value
     */
    public String getMainTransportModeCode() {
        return mainTransportModeCode;
    }

    /** 
     * Set the 'MainTransportModeCode' element value. Код вида основного ТС (по классификатору видов транспорта и транспортировки товаров)
     * 
     * @param mainTransportModeCode
     */
    public void setMainTransportModeCode(String mainTransportModeCode) {
        this.mainTransportModeCode = mainTransportModeCode;
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
     * Get the 'ModificationDateTime' element value. Дата и время последней модификации документа. Временная часть содержит локальное время отправителя без указания часового пояса
     * 
     * @return value
     */
    public String getModificationDateTime() {
        return modificationDateTime;
    }

    /** 
     * Set the 'ModificationDateTime' element value. Дата и время последней модификации документа. Временная часть содержит локальное время отправителя без указания часового пояса
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(String modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
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
}
