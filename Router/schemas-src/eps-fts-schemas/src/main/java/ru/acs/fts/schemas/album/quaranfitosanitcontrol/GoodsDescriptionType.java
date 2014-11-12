
package ru.acs.fts.schemas.album.quaranfitosanitcontrol;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������������� ���������
 */
public class GoodsDescriptionType
{
    private List<String> productNameList = new ArrayList<String>();
    private String TNVED;
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'ProductName' element items. ������������ �������������� ���������
     * 
     * @return list
     */
    public List<String> getProductNameList() {
        return productNameList;
    }

    /** 
     * Set the list of 'ProductName' element items. ������������ �������������� ���������
     * 
     * @param list
     */
    public void setProductNameList(List<String> list) {
        productNameList = list;
    }

    /** 
     * Get the 'TNVED' element value. ��� �� ��� ��
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. ��� �� ��� ��
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'Quantity' element value. ���������� (���) �������������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� (���) �������������� ���������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
