
package ru.acs.fts.schemas.album.liquidationapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ������, ���������� �� ������� � (���) ��������
 */
public class WasteProductsType
{
    private List<String> wasteDescriptionList = new ArrayList<String>();
    private String wasteCode;
    private List<String> liquidationMethodList = new ArrayList<String>();
    private String wasteSign;
    private SupplementaryQuantityType wasteQuantity;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();

    /** 
     * Get the list of 'WasteDescription' element items. ������������ ������ � ������������ � ����������� ����������������� ��������� �������
     * 
     * @return list
     */
    public List<String> getWasteDescriptionList() {
        return wasteDescriptionList;
    }

    /** 
     * Set the list of 'WasteDescription' element items. ������������ ������ � ������������ � ����������� ����������������� ��������� �������
     * 
     * @param list
     */
    public void setWasteDescriptionList(List<String> list) {
        wasteDescriptionList = list;
    }

    /** 
     * Get the 'WasteCode' element value. ��� ������ � ������������ � ����������� ����������������� ��������� �������
     * 
     * @return value
     */
    public String getWasteCode() {
        return wasteCode;
    }

    /** 
     * Set the 'WasteCode' element value. ��� ������ � ������������ � ����������� ����������������� ��������� �������
     * 
     * @param wasteCode
     */
    public void setWasteCode(String wasteCode) {
        this.wasteCode = wasteCode;
    }

    /** 
     * Get the list of 'LiquidationMethod' element items. ������ �����������
     * 
     * @return list
     */
    public List<String> getLiquidationMethodList() {
        return liquidationMethodList;
    }

    /** 
     * Set the list of 'LiquidationMethod' element items. ������ �����������
     * 
     * @param list
     */
    public void setLiquidationMethodList(List<String> list) {
        liquidationMethodList = list;
    }

    /** 
     * Get the 'WasteSign' element value. ������� ������������� �������: 0 - ������; 1 - ��������
     * 
     * @return value
     */
    public String getWasteSign() {
        return wasteSign;
    }

    /** 
     * Set the 'WasteSign' element value. ������� ������������� �������: 0 - ������; 1 - ��������
     * 
     * @param wasteSign
     */
    public void setWasteSign(String wasteSign) {
        this.wasteSign = wasteSign;
    }

    /** 
     * Get the 'WasteQuantity' element value. ���������� �������
     * 
     * @return value
     */
    public SupplementaryQuantityType getWasteQuantity() {
        return wasteQuantity;
    }

    /** 
     * Set the 'WasteQuantity' element value. ���������� �������
     * 
     * @param wasteQuantity
     */
    public void setWasteQuantity(SupplementaryQuantityType wasteQuantity) {
        this.wasteQuantity = wasteQuantity;
    }

    /** 
     * Get the list of 'PackingInformation' element items. �������� �� ��������
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. �������� �� ��������
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the list of 'Consignment' element items. �������� � ������ �������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. �������� � ������ �������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }
}
