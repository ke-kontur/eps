
package ru.acs.fts.schemas.album.notifgoodsarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * �������� �������
 */
public class ArriveGoodsType extends GoodsBaseType
{
    private String invoicedCost;
    private String contractCurrencyCode;
    private WHSuppQuantityType volume;
    private List<WHSuppQuantityType> supplementaryQuantityList = new ArrayList<WHSuppQuantityType>();
    private ArrivePackingInformationType arrivePackingInformation;

    /** 
     * Get the 'InvoicedCost' element value. ��������� ��������� / ���� ������
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ��������� ��������� / ���� ������
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. ����������� ��������� ��� ������ ��������� ��������� / ����. 
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ����������� ��������� ��� ������ ��������� ��������� / ����. 
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'Volume' element value. ����� ������
     * 
     * @return value
     */
    public WHSuppQuantityType getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. ����� ������
     * 
     * @param volume
     */
    public void setVolume(WHSuppQuantityType volume) {
        this.volume = volume;
    }

    /** 
     * Get the list of 'SupplementaryQuantity' element items. ���-�� ������ � �������������� ��������  ���������
     * 
     * @return list
     */
    public List<WHSuppQuantityType> getSupplementaryQuantityList() {
        return supplementaryQuantityList;
    }

    /** 
     * Set the list of 'SupplementaryQuantity' element items. ���-�� ������ � �������������� ��������  ���������
     * 
     * @param list
     */
    public void setSupplementaryQuantityList(List<WHSuppQuantityType> list) {
        supplementaryQuantityList = list;
    }

    /** 
     * Get the 'ArrivePackingInformation' element value. ���������� �� ���������
     * 
     * @return value
     */
    public ArrivePackingInformationType getArrivePackingInformation() {
        return arrivePackingInformation;
    }

    /** 
     * Set the 'ArrivePackingInformation' element value. ���������� �� ���������
     * 
     * @param arrivePackingInformation
     */
    public void setArrivePackingInformation(
            ArrivePackingInformationType arrivePackingInformation) {
        this.arrivePackingInformation = arrivePackingInformation;
    }
}
