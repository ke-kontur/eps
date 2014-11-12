
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Комплексный тип для указания сведений об отчете, составленном владельцем СВХ (ДО-1 или ДО-2)
 */
public class WareHouseReportLinkDataType
{
    private LocalDate reportDate;
    private String reportNumber;

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
     * Get the 'ReportNumber' element value. Номер отчета (согласно нумерации в информационной системе владельца СВХ)
     * 
     * @return value
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /** 
     * Set the 'ReportNumber' element value. Номер отчета (согласно нумерации в информационной системе владельца СВХ)
     * 
     * @param reportNumber
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }
}
