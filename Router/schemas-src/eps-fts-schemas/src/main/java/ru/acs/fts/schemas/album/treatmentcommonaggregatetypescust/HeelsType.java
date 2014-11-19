
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������
 */
public class HeelsType
{
    private List<String> heelsInfoList = new ArrayList<String>();
    private String heelsOutProcedure;
    private List<TreatProductsType> heelsItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'HeelsInfo' element items. �������������� �������� �  ��. "�������"
     * 
     * @return list
     */
    public List<String> getHeelsInfoList() {
        return heelsInfoList;
    }

    /** 
     * Set the list of 'HeelsInfo' element items. �������������� �������� �  ��. "�������"
     * 
     * @param list
     */
    public void setHeelsInfoList(List<String> list) {
        heelsInfoList = list;
    }

    /** 
     * Get the 'HeelsOutProcedure' element value. ����� ������� ��������
     * 
     * @return value
     */
    public String getHeelsOutProcedure() {
        return heelsOutProcedure;
    }

    /** 
     * Set the 'HeelsOutProcedure' element value. ����� ������� ��������
     * 
     * @param heelsOutProcedure
     */
    public void setHeelsOutProcedure(String heelsOutProcedure) {
        this.heelsOutProcedure = heelsOutProcedure;
    }

    /** 
     * Get the list of 'HeelsItem' element items. ������� - �������� ������
     * 
     * @return list
     */
    public List<TreatProductsType> getHeelsItemList() {
        return heelsItemList;
    }

    /** 
     * Set the list of 'HeelsItem' element items. ������� - �������� ������
     * 
     * @param list
     */
    public void setHeelsItemList(List<TreatProductsType> list) {
        heelsItemList = list;
    }
}
