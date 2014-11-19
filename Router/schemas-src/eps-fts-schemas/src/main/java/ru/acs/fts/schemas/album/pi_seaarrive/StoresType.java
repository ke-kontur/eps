
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������� ��������
 */
public class StoresType
{
    private List<String> nameList = new ArrayList<String>();
    private String quantity;
    private String measureUnitQualifier;
    private String storeSign;

    /** 
     * Get the list of 'Name' element items. ������������
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. ������������
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'MeasureUnitQualifier' element value. ������������ ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'MeasureUnitQualifier' element value. ������������ ������� ���������
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }

    /** 
     * Get the 'StoreSign' element value. ������� �������������� �������� � ������������� ����. 1-  ����������������; 2 - �����������; 3 - ���������������.
     * 
     * @return value
     */
    public String getStoreSign() {
        return storeSign;
    }

    /** 
     * Set the 'StoreSign' element value. ������� �������������� �������� � ������������� ����. 1-  ����������������; 2 - �����������; 3 - ���������������.
     * 
     * @param storeSign
     */
    public void setStoreSign(String storeSign) {
        this.storeSign = storeSign;
    }
}
