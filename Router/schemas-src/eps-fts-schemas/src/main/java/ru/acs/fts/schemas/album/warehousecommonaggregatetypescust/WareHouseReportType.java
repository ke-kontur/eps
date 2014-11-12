
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� ��� ��� �������� ���������, ������������� ��� ���������, � �������� ���������� �������� ������� � ��� ������� ������� �� ������� ���������� ��������.
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
     * Get the 'MainTransportModeCode' element value. ��� ���� ��������� �� (�� �������������� ����� ���������� � ��������������� �������)
     * 
     * @return value
     */
    public String getMainTransportModeCode() {
        return mainTransportModeCode;
    }

    /** 
     * Set the 'MainTransportModeCode' element value. ��� ���� ��������� �� (�� �������������� ����� ���������� � ��������������� �������)
     * 
     * @param mainTransportModeCode
     */
    public void setMainTransportModeCode(String mainTransportModeCode) {
        this.mainTransportModeCode = mainTransportModeCode;
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
     * Get the 'ModificationDateTime' element value. ���� � ����� ��������� ����������� ���������. ��������� ����� �������� ��������� ����� ����������� ��� �������� �������� �����
     * 
     * @return value
     */
    public String getModificationDateTime() {
        return modificationDateTime;
    }

    /** 
     * Set the 'ModificationDateTime' element value. ���� � ����� ��������� ����������� ���������. ��������� ����� �������� ��������� ����� ����������� ��� �������� �������� �����
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(String modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
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
}
