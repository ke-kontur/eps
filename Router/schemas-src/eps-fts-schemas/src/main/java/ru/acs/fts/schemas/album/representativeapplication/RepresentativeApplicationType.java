
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * ��������� ����������� �������������, ������������ � �������� ������������ ���������� ����������/������ ������������ �������
 */
public class RepresentativeApplicationType extends BaseDocType
{
    private String destinationCountry;
    private String totalGoodsNumber;
    private RepresentativeType representative;
    private String applicationSign;
    private GTDIDType applicationRegNumber;
    private WarehousePlaceType warehousePlace;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������. ��������� ��� �� �������������� ����� ����
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������. ��������� ��� �� �������������� ����� ����
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. ����� ������������ �������
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'Representative' element value. ���������� �������������
     * 
     * @return value
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. ���������� �������������
     * 
     * @param representative
     */
    public void setRepresentative(RepresentativeType representative) {
        this.representative = representative;
    }

    /** 
     * Get the 'ApplicationSign' element value. ��� �������: 0 - ������ ������������ �������, 1- ������ ������������ ������� 
     * 
     * @return value
     */
    public String getApplicationSign() {
        return applicationSign;
    }

    /** 
     * Set the 'ApplicationSign' element value. ��� �������: 0 - ������ ������������ �������, 1- ������ ������������ ������� 
     * 
     * @param applicationSign
     */
    public void setApplicationSign(String applicationSign) {
        this.applicationSign = applicationSign;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �������, ���� ������ ������������
     * 
     * @return value
     */
    public GTDIDType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �������, ���� ������ ������������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(GTDIDType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'WarehousePlace' element value. ����� �������� ���, �� ������� ��������� ������
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. ����� �������� ���, �� ������� ��������� ������
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the list of 'Consignment' element items. �������� � ������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. �������� � ������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
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
