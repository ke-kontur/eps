
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private String goodsNumber;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grossMass;
    private List<ESADContainerType> containerList = new ArrayList<ESADContainerType>();

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� ������ �� ��/���.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� ������ �� ��/���.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GrossMass' element value. ��� ������, ������
     * 
     * @return value
     */
    public String getGrossMass() {
        return grossMass;
    }

    /** 
     * Set the 'GrossMass' element value. ��� ������, ������
     * 
     * @param grossMass
     */
    public void setGrossMass(String grossMass) {
        this.grossMass = grossMass;
    }

    /** 
     * Get the list of 'Container' element items. �������� � ����� ������� �����������
     * 
     * @return list
     */
    public List<ESADContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. �������� � ����� ������� �����������
     * 
     * @param list
     */
    public void setContainerList(List<ESADContainerType> list) {
        containerList = list;
    }
}
