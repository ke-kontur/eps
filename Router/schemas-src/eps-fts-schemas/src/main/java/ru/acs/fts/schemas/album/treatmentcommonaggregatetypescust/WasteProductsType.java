
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ �����������
 */
public class WasteProductsType
{
    private List<String> wasteProductsInfoList = new ArrayList<String>();
    private List<String> wasteIdentMethodList = new ArrayList<String>();
    private String wasteOutProcedure;
    private List<TreatProductsType> wasteProductsItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'WasteProductsInfo' element items. �������������� ���������� � ����� "������ �����������"
     * 
     * @return list
     */
    public List<String> getWasteProductsInfoList() {
        return wasteProductsInfoList;
    }

    /** 
     * Set the list of 'WasteProductsInfo' element items. �������������� ���������� � ����� "������ �����������"
     * 
     * @param list
     */
    public void setWasteProductsInfoList(List<String> list) {
        wasteProductsInfoList = list;
    }

    /** 
     * Get the list of 'WasteIdentMethod' element items. ������� ������������� ������� � �������
     * 
     * @return list
     */
    public List<String> getWasteIdentMethodList() {
        return wasteIdentMethodList;
    }

    /** 
     * Set the list of 'WasteIdentMethod' element items. ������� ������������� ������� � �������
     * 
     * @param list
     */
    public void setWasteIdentMethodList(List<String> list) {
        wasteIdentMethodList = list;
    }

    /** 
     * Get the 'WasteOutProcedure' element value. ����� ������� �������
     * 
     * @return value
     */
    public String getWasteOutProcedure() {
        return wasteOutProcedure;
    }

    /** 
     * Set the 'WasteOutProcedure' element value. ����� ������� �������
     * 
     * @param wasteOutProcedure
     */
    public void setWasteOutProcedure(String wasteOutProcedure) {
        this.wasteOutProcedure = wasteOutProcedure;
    }

    /** 
     * Get the list of 'WasteProductsItem' element items. ������ ����������� - �������� ������
     * 
     * @return list
     */
    public List<TreatProductsType> getWasteProductsItemList() {
        return wasteProductsItemList;
    }

    /** 
     * Set the list of 'WasteProductsItem' element items. ������ ����������� - �������� ������
     * 
     * @param list
     */
    public void setWasteProductsItemList(List<TreatProductsType> list) {
        wasteProductsItemList = list;
    }
}
