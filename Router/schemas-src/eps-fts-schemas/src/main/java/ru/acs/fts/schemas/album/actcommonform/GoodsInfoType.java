
package ru.acs.fts.schemas.album.actcommonform;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������
 */
public class GoodsInfoType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String carriage;
    private String container;

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'Carriage' element value. ����� ������
     * 
     * @return value
     */
    public String getCarriage() {
        return carriage;
    }

    /** 
     * Set the 'Carriage' element value. ����� ������
     * 
     * @param carriage
     */
    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }

    /** 
     * Get the 'Container' element value. ����� ����������
     * 
     * @return value
     */
    public String getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. ����� ����������
     * 
     * @param container
     */
    public void setContainer(String container) {
        this.container = container;
    }
}
