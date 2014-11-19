
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� �������� �������� �� ������, ������������ ���������� ��� (��-1 ��� ��-2)
 */
public class WareHouseReportLinkDataType
{
    private LocalDate reportDate;
    private String reportNumber;

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
     * Get the 'ReportNumber' element value. ����� ������ (�������� ��������� � �������������� ������� ��������� ���)
     * 
     * @return value
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /** 
     * Set the 'ReportNumber' element value. ����� ������ (�������� ��������� � �������������� ������� ��������� ���)
     * 
     * @param reportNumber
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }
}
