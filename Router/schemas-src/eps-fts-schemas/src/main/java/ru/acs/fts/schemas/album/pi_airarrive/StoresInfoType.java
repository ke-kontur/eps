
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ����������� ��������
 */
public class StoresInfoType
{
    private List<SuppliesStocksDescriptionType> operatingList = new ArrayList<SuppliesStocksDescriptionType>();
    private List<SuppliesStocksDescriptionType> soldList = new ArrayList<SuppliesStocksDescriptionType>();
    private List<SuppliesStocksDescriptionType> consumerList = new ArrayList<SuppliesStocksDescriptionType>();

    /** 
     * Get the list of 'Operating' element items. ���������������� �������
     * 
     * @return list
     */
    public List<SuppliesStocksDescriptionType> getOperatingList() {
        return operatingList;
    }

    /** 
     * Set the list of 'Operating' element items. ���������������� �������
     * 
     * @param list
     */
    public void setOperatingList(List<SuppliesStocksDescriptionType> list) {
        operatingList = list;
    }

    /** 
     * Get the list of 'Sold' element items. ����������� �������
     * 
     * @return list
     */
    public List<SuppliesStocksDescriptionType> getSoldList() {
        return soldList;
    }

    /** 
     * Set the list of 'Sold' element items. ����������� �������
     * 
     * @param list
     */
    public void setSoldList(List<SuppliesStocksDescriptionType> list) {
        soldList = list;
    }

    /** 
     * Get the list of 'Consumer' element items. ��������������� �������
     * 
     * @return list
     */
    public List<SuppliesStocksDescriptionType> getConsumerList() {
        return consumerList;
    }

    /** 
     * Set the list of 'Consumer' element items. ��������������� �������
     * 
     * @param list
     */
    public void setConsumerList(List<SuppliesStocksDescriptionType> list) {
        consumerList = list;
    }
}
