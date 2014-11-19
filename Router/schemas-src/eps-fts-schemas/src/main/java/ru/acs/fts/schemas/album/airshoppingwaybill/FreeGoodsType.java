
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ������
 */
public class FreeGoodsType
{
    private List<String> nameFreeGoodList = new ArrayList<String>();
    private String PLUCodeFreeGoods;
    private String numberFreeGoods;
    private String numberReturnFreeGoods;

    /** 
     * Get the list of 'NameFreeGoods' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getNameFreeGoodList() {
        return nameFreeGoodList;
    }

    /** 
     * Set the list of 'NameFreeGoods' element items. ������������ ������
     * 
     * @param list
     */
    public void setNameFreeGoodList(List<String> list) {
        nameFreeGoodList = list;
    }

    /** 
     * Get the 'PLUCodeFreeGoods' element value. ��� PLU ������
     * 
     * @return value
     */
    public String getPLUCodeFreeGoods() {
        return PLUCodeFreeGoods;
    }

    /** 
     * Set the 'PLUCodeFreeGoods' element value. ��� PLU ������
     * 
     * @param PLUCodeFreeGoods
     */
    public void setPLUCodeFreeGoods(String PLUCodeFreeGoods) {
        this.PLUCodeFreeGoods = PLUCodeFreeGoods;
    }

    /** 
     * Get the 'NumberFreeGoods' element value. ���������� ������
     * 
     * @return value
     */
    public String getNumberFreeGoods() {
        return numberFreeGoods;
    }

    /** 
     * Set the 'NumberFreeGoods' element value. ���������� ������
     * 
     * @param numberFreeGoods
     */
    public void setNumberFreeGoods(String numberFreeGoods) {
        this.numberFreeGoods = numberFreeGoods;
    }

    /** 
     * Get the 'NumberReturnFreeGoods' element value. ���������� ������������� ������
     * 
     * @return value
     */
    public String getNumberReturnFreeGoods() {
        return numberReturnFreeGoods;
    }

    /** 
     * Set the 'NumberReturnFreeGoods' element value. ���������� ������������� ������
     * 
     * @param numberReturnFreeGoods
     */
    public void setNumberReturnFreeGoods(String numberReturnFreeGoods) {
        this.numberReturnFreeGoods = numberReturnFreeGoods;
    }
}
