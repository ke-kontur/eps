
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������������� ����������� �������
 */
public class CUMarkExcisableGoodsType
{
    private List<String> seryList = new ArrayList<String>();
    private String number;
    private List<String> quantityMarkList = new ArrayList<String>();

    /** 
     * Get the list of 'Series' element items. ����� �����
     * 
     * @return list
     */
    public List<String> getSeryList() {
        return seryList;
    }

    /** 
     * Set the list of 'Series' element items. ����� �����
     * 
     * @param list
     */
    public void setSeryList(List<String> list) {
        seryList = list;
    }

    /** 
     * Get the 'Number' element value. ����� �����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� �����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the list of 'QuantityMark' element items. ���������� �������� �����
     * 
     * @return list
     */
    public List<String> getQuantityMarkList() {
        return quantityMarkList;
    }

    /** 
     * Set the list of 'QuantityMark' element items. ���������� �������� �����
     * 
     * @param list
     */
    public void setQuantityMarkList(List<String> list) {
        quantityMarkList = list;
    }
}
