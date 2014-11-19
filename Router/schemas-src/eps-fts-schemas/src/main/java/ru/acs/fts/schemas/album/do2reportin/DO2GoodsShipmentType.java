
package ru.acs.fts.schemas.album.do2reportin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhCustomDocumentType;

/** 
 * ����������� ��� ��� �������� �������, ����������� �� ������ �� ������ ��2
 */
public class DO2GoodsShipmentType
{
    private String MPOSign;
    private List<WhCustomDocumentType> customsDocList = new ArrayList<WhCustomDocumentType>();
    private List<DO2GoodType> goodList = new ArrayList<DO2GoodType>();
    private List<DO2GoodCustomDocLinkType> goodsCustomDocsLinkList = new ArrayList<DO2GoodCustomDocLinkType>();

    /** 
     * Get the 'MPOSign' element value. ������� ���������� ���
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. ������� ���������� ���
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the list of 'CustomsDocs' element items. ���������� ���������, �� ��������� ������� �������������� ������
     * 
     * @return list
     */
    public List<WhCustomDocumentType> getCustomsDocList() {
        return customsDocList;
    }

    /** 
     * Set the list of 'CustomsDocs' element items. ���������� ���������, �� ��������� ������� �������������� ������
     * 
     * @param list
     */
    public void setCustomsDocList(List<WhCustomDocumentType> list) {
        customsDocList = list;
    }

    /** 
     * Get the list of 'Goods' element items. ���������� ������
     * 
     * @return list
     */
    public List<DO2GoodType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. ���������� ������
     * 
     * @param list
     */
    public void setGoodList(List<DO2GoodType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'GoodsCustomDocsLinks' element items. ������ � ������������ ���������� ������� �������� ���������� ����������
     * 
     * @return list
     */
    public List<DO2GoodCustomDocLinkType> getGoodsCustomDocsLinkList() {
        return goodsCustomDocsLinkList;
    }

    /** 
     * Set the list of 'GoodsCustomDocsLinks' element items. ������ � ������������ ���������� ������� �������� ���������� ����������
     * 
     * @param list
     */
    public void setGoodsCustomDocsLinkList(List<DO2GoodCustomDocLinkType> list) {
        goodsCustomDocsLinkList = list;
    }
}
