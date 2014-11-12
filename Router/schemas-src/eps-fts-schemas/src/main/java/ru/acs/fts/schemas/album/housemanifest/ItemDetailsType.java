
package ru.acs.fts.schemas.album.housemanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * �������� ������
 */
public class ItemDetailsType
{
    private String houseWaybillNumber;
    private String lineItemNumber;
    private String itemDescription;
    private String itemName;
    private String numberOfPieces;
    private AirportType originLocation;
    private AirportType destinationLocation;
    private SupplementaryQuantityType grossWeight;
    private List<HandlingInformationType> specialHandlingCodeList = new ArrayList<HandlingInformationType>();
    private HouseWBOrgType consignor;
    private HouseWBOrgType consignee;

    /** 
     * Get the 'HouseWaybillNumber' element value. �������� ����� �������� ���������
     * 
     * @return value
     */
    public String getHouseWaybillNumber() {
        return houseWaybillNumber;
    }

    /** 
     * Set the 'HouseWaybillNumber' element value. �������� ����� �������� ���������
     * 
     * @param houseWaybillNumber
     */
    public void setHouseWaybillNumber(String houseWaybillNumber) {
        this.houseWaybillNumber = houseWaybillNumber;
    }

    /** 
     * Get the 'LineItemNumber' element value. ���������� ����� ������ �� ������
     * 
     * @return value
     */
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /** 
     * Set the 'LineItemNumber' element value. ���������� ����� ������ �� ������
     * 
     * @param lineItemNumber
     */
    public void setLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    /** 
     * Get the 'ItemDescription' element value. �������� ������
     * 
     * @return value
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /** 
     * Set the 'ItemDescription' element value. �������� ������
     * 
     * @param itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /** 
     * Get the 'ItemName' element value. ������� ������������ ������
     * 
     * @return value
     */
    public String getItemName() {
        return itemName;
    }

    /** 
     * Set the 'ItemName' element value. ������� ������������ ������
     * 
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /** 
     * Get the 'NumberOfPieces' element value. ����������
     * 
     * @return value
     */
    public String getNumberOfPieces() {
        return numberOfPieces;
    }

    /** 
     * Set the 'NumberOfPieces' element value. ����������
     * 
     * @param numberOfPieces
     */
    public void setNumberOfPieces(String numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    /** 
     * Get the 'OriginLocation' element value. ����� �������������
     * 
     * @return value
     */
    public AirportType getOriginLocation() {
        return originLocation;
    }

    /** 
     * Set the 'OriginLocation' element value. ����� �������������
     * 
     * @param originLocation
     */
    public void setOriginLocation(AirportType originLocation) {
        this.originLocation = originLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. ����� ����������
     * 
     * @return value
     */
    public AirportType getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. ����� ����������
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(AirportType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'GrossWeight' element value. �������� � ���� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. �������� � ���� ������
     * 
     * @param grossWeight
     */
    public void setGrossWeight(SupplementaryQuantityType grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the list of 'SpecialHandlingCode' element items. SPH ����������
     * 
     * @return list
     */
    public List<HandlingInformationType> getSpecialHandlingCodeList() {
        return specialHandlingCodeList;
    }

    /** 
     * Set the list of 'SpecialHandlingCode' element items. SPH ����������
     * 
     * @param list
     */
    public void setSpecialHandlingCodeList(List<HandlingInformationType> list) {
        specialHandlingCodeList = list;
    }

    /** 
     * Get the 'Consignor' element value. ����������������
     * 
     * @return value
     */
    public HouseWBOrgType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������������
     * 
     * @param consignor
     */
    public void setConsignor(HouseWBOrgType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public HouseWBOrgType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(HouseWBOrgType consignee) {
        this.consignee = consignee;
    }
}
