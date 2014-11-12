
package ru.acs.fts.schemas.album.cmr;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � ���������� ������ ����������
 */
public class ConsigneeCustomsType
{
    private String destinationOfficeName;
    private String warehouseName;
    private String destinationOfficeIdenifier;
    private String warehouseLicenceID;
    private LocalDate warehouseLicenceDate;
    private AddressType warehousePostalAddress;

    /** 
     * Get the 'DestinationOfficeName' element value. ������������ ����� �������� �������� ktam.dbf
     * 
     * @return value
     */
    public String getDestinationOfficeName() {
        return destinationOfficeName;
    }

    /** 
     * Set the 'DestinationOfficeName' element value. ������������ ����� �������� �������� ktam.dbf
     * 
     * @param destinationOfficeName
     */
    public void setDestinationOfficeName(String destinationOfficeName) {
        this.destinationOfficeName = destinationOfficeName;
    }

    /** 
     * Get the 'WarehouseName' element value. �������� ��� ��� �� 
     * 
     * @return value
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /** 
     * Set the 'WarehouseName' element value. �������� ��� ��� �� 
     * 
     * @param warehouseName
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    /** 
     * Get the 'DestinationOfficeIdenifier' element value. ��� ����������� ������ ����������, � ������� ������������ �������� ����������� ����� ��������
     * 
     * @return value
     */
    public String getDestinationOfficeIdenifier() {
        return destinationOfficeIdenifier;
    }

    /** 
     * Set the 'DestinationOfficeIdenifier' element value. ��� ����������� ������ ����������, � ������� ������������ �������� ����������� ����� ��������
     * 
     * @param destinationOfficeIdenifier
     */
    public void setDestinationOfficeIdenifier(String destinationOfficeIdenifier) {
        this.destinationOfficeIdenifier = destinationOfficeIdenifier;
    }

    /** 
     * Get the 'WarehouseLicenceID' element value. ����� ������������� � ��������� � ������
     * 
     * @return value
     */
    public String getWarehouseLicenceID() {
        return warehouseLicenceID;
    }

    /** 
     * Set the 'WarehouseLicenceID' element value. ����� ������������� � ��������� � ������
     * 
     * @param warehouseLicenceID
     */
    public void setWarehouseLicenceID(String warehouseLicenceID) {
        this.warehouseLicenceID = warehouseLicenceID;
    }

    /** 
     * Get the 'WarehouseLicenceDate' element value. ���� ��������� � ������
     * 
     * @return value
     */
    public LocalDate getWarehouseLicenceDate() {
        return warehouseLicenceDate;
    }

    /** 
     * Set the 'WarehouseLicenceDate' element value. ���� ��������� � ������
     * 
     * @param warehouseLicenceDate
     */
    public void setWarehouseLicenceDate(LocalDate warehouseLicenceDate) {
        this.warehouseLicenceDate = warehouseLicenceDate;
    }

    /** 
     * Get the 'WarehousePostalAddress' element value. �������� ����� ��� ��� �� 
     * 
     * @return value
     */
    public AddressType getWarehousePostalAddress() {
        return warehousePostalAddress;
    }

    /** 
     * Set the 'WarehousePostalAddress' element value. �������� ����� ��� ��� �� 
     * 
     * @param warehousePostalAddress
     */
    public void setWarehousePostalAddress(AddressType warehousePostalAddress) {
        this.warehousePostalAddress = warehousePostalAddress;
    }
}
