
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� ��� ���  �������� �������� � ������ �������, ���������� �� ��, �������� ������������ ����������
 */
public class WHShipmentInfoType extends WhTransportDocType
{
    private List<WhGoodsExtendedType> goodList = new ArrayList<WhGoodsExtendedType>();
    private List<WHContainerExtendedType> containerList = new ArrayList<WHContainerExtendedType>();
    private List<WHGoodContLinkType> goodContLinkList = new ArrayList<WHGoodContLinkType>();

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<WhGoodsExtendedType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<WhGoodsExtendedType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'Containers' element items. �������� � �����������
     * 
     * @return list
     */
    public List<WHContainerExtendedType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Containers' element items. �������� � �����������
     * 
     * @param list
     */
    public void setContainerList(List<WHContainerExtendedType> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'GoodContLinks' element items. �������� � ���������� ������� � �����������
     * 
     * @return list
     */
    public List<WHGoodContLinkType> getGoodContLinkList() {
        return goodContLinkList;
    }

    /** 
     * Set the list of 'GoodContLinks' element items. �������� � ���������� ������� � �����������
     * 
     * @param list
     */
    public void setGoodContLinkList(List<WHGoodContLinkType> list) {
        goodContLinkList = list;
    }
}
