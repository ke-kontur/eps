
package ru.acs.fts.schemas.album.rznmedizd;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������� ������������ ����������
 */
public class GoodsDescriptionType
{
    private List<String> goodsNameList = new ArrayList<String>();
    private List<OrganizationType> producerList = new ArrayList<OrganizationType>();
    private ItemType OKP;
    private ItemType category;
    private SecurityClassType _Class;

    /** 
     * Get the list of 'GoodsName' element items. ������������ ������� ������������ ����������
     * 
     * @return list
     */
    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. ������������ ������� ������������ ����������
     * 
     * @param list
     */
    public void setGoodsNameList(List<String> list) {
        goodsNameList = list;
    }

    /** 
     * Get the list of 'Producer' element items. �����������-������������
     * 
     * @return list
     */
    public List<OrganizationType> getProducerList() {
        return producerList;
    }

    /** 
     * Set the list of 'Producer' element items. �����������-������������
     * 
     * @param list
     */
    public void setProducerList(List<OrganizationType> list) {
        producerList = list;
    }

    /** 
     * Get the 'OKP' element value. ��� ���
     * 
     * @return value
     */
    public ItemType getOKP() {
        return OKP;
    }

    /** 
     * Set the 'OKP' element value. ��� ���
     * 
     * @param OKP
     */
    public void setOKP(ItemType OKP) {
        this.OKP = OKP;
    }

    /** 
     * Get the 'Category' element value. ��������� ���
     * 
     * @return value
     */
    public ItemType getCategory() {
        return category;
    }

    /** 
     * Set the 'Category' element value. ��������� ���
     * 
     * @param category
     */
    public void setCategory(ItemType category) {
        this.category = category;
    }

    /** 
     * Get the 'Class' element value. ����� ������������
     * 
     * @return value
     */
    public SecurityClassType get_Class() {
        return _Class;
    }

    /** 
     * Set the 'Class' element value. ����� ������������
     * 
     * @param _class
     */
    public void set_Class(SecurityClassType _class) {
        _Class = _class;
    }
}
