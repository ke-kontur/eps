
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �����������
 */
public class TrResultType
{
    private List<String> trResultInfoList = new ArrayList<String>();
    private List<String> identificationMethodList = new ArrayList<String>();
    private List<TreatProductsType> trResultItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'TrResultInfo' element items. �������������� ���������� � ��������� �����������
     * 
     * @return list
     */
    public List<String> getTrResultInfoList() {
        return trResultInfoList;
    }

    /** 
     * Set the list of 'TrResultInfo' element items. �������������� ���������� � ��������� �����������
     * 
     * @param list
     */
    public void setTrResultInfoList(List<String> list) {
        trResultInfoList = list;
    }

    /** 
     * Get the list of 'IdentificationMethod' element items. ������� ������������� ������� � ��������� �����������
     * 
     * @return list
     */
    public List<String> getIdentificationMethodList() {
        return identificationMethodList;
    }

    /** 
     * Set the list of 'IdentificationMethod' element items. ������� ������������� ������� � ��������� �����������
     * 
     * @param list
     */
    public void setIdentificationMethodList(List<String> list) {
        identificationMethodList = list;
    }

    /** 
     * Get the list of 'TrResultItem' element items. �������� ������ - �������� �����������
     * 
     * @return list
     */
    public List<TreatProductsType> getTrResultItemList() {
        return trResultItemList;
    }

    /** 
     * Set the list of 'TrResultItem' element items. �������� ������ - �������� �����������
     * 
     * @param list
     */
    public void setTrResultItemList(List<TreatProductsType> list) {
        trResultItemList = list;
    }
}
