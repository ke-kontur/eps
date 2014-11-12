
package ru.acs.fts.schemas.album.certificatepreciousmetal;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ���������
 */
public class GoodsInfoType
{
    private List<String> goodsNameList = new ArrayList<String>();
    private String goodsKind;
    private String goodsMark;
    private String goodsTNVEDCode;
    private String goodsOKP;

    /** 
     * Get the list of 'GoodsName' element items. ������������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. ������������ ���������
     * 
     * @param list
     */
    public void setGoodsNameList(List<String> list) {
        goodsNameList = list;
    }

    /** 
     * Get the 'GoodsKind' element value. ��� ���������
     * 
     * @return value
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /** 
     * Set the 'GoodsKind' element value. ��� ���������
     * 
     * @param goodsKind
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }

    /** 
     * Get the 'GoodsMark' element value. ����� ���������
     * 
     * @return value
     */
    public String getGoodsMark() {
        return goodsMark;
    }

    /** 
     * Set the 'GoodsMark' element value. ����� ���������
     * 
     * @param goodsMark
     */
    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsOKP' element value. ��� ���������
     * 
     * @return value
     */
    public String getGoodsOKP() {
        return goodsOKP;
    }

    /** 
     * Set the 'GoodsOKP' element value. ��� ���������
     * 
     * @param goodsOKP
     */
    public void setGoodsOKP(String goodsOKP) {
        this.goodsOKP = goodsOKP;
    }
}
