
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ���������� ����������� �� ���������� ���������� � ��� ���������� ����������. 
 */
public class ProcessingDocumentType extends PresentedDocumentType
{
    private String informationCode;
    private LocalDate periodDate;
    private String supplyStatus;
    private AddressType placeProcessing;
    private CUOrganizationType processingOrganization;

    /** 
     * Get the 'InformationCode' element value. ��� ���������� ( 1- ���������� �� �����������  2 - ��)
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. ��� ���������� ( 1- ���������� �� �����������  2 - ��)
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'PeriodDate' element value. ���� �������� ����������.
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. ���� �������� ����������.
     * 
     * @param periodDate
     */
    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    /** 
     * Get the 'SupplyStatus' element value. 11 - ����������� ��������. ����������� ���� �������� ����������� �������� ������, ��� ����������� ����� ������� �� ����������� ��� ���������� ����������. � ��������� ������� �� �����������. 
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. 11 - ����������� ��������. ����������� ���� �������� ����������� �������� ������, ��� ����������� ����� ������� �� ����������� ��� ���������� ����������. � ��������� ������� �� �����������. 
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the 'PlaceProcessing' element value. ����� ���������� �������� �� �����������
     * 
     * @return value
     */
    public AddressType getPlaceProcessing() {
        return placeProcessing;
    }

    /** 
     * Set the 'PlaceProcessing' element value. ����� ���������� �������� �� �����������
     * 
     * @param placeProcessing
     */
    public void setPlaceProcessing(AddressType placeProcessing) {
        this.placeProcessing = placeProcessing;
    }

    /** 
     * Get the 'ProcessingOrganization' element value. ������������ ����, ��������������� �������� �� ����������� �������
     * 
     * @return value
     */
    public CUOrganizationType getProcessingOrganization() {
        return processingOrganization;
    }

    /** 
     * Set the 'ProcessingOrganization' element value. ������������ ����, ��������������� �������� �� ����������� �������
     * 
     * @param processingOrganization
     */
    public void setProcessingOrganization(
            CUOrganizationType processingOrganization) {
        this.processingOrganization = processingOrganization;
    }
}
