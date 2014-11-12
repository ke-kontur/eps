
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * �������� �������������� ���������� ������ � �������������� ������� ��������� ���������, ���������� � ���������������������� ����������
 */
public class GoodsQuantityType
{
    private WHSuppQuantityType goodsQuantityByDocs;
    private WHSuppQuantityType goodsQuantityByFact;

    /** 
     * Get the 'GoodsQuantityByDocs' element value. ���������� ������ � �������������� ������� ��������� �������� ���������������������� ����������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsQuantityByDocs() {
        return goodsQuantityByDocs;
    }

    /** 
     * Set the 'GoodsQuantityByDocs' element value. ���������� ������ � �������������� ������� ��������� �������� ���������������������� ����������
     * 
     * @param goodsQuantityByDocs
     */
    public void setGoodsQuantityByDocs(WHSuppQuantityType goodsQuantityByDocs) {
        this.goodsQuantityByDocs = goodsQuantityByDocs;
    }

    /** 
     * Get the 'GoodsQuantityByFact' element value. ���������� ������ � �������������� ������� �����������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsQuantityByFact() {
        return goodsQuantityByFact;
    }

    /** 
     * Set the 'GoodsQuantityByFact' element value. ���������� ������ � �������������� ������� �����������
     * 
     * @param goodsQuantityByFact
     */
    public void setGoodsQuantityByFact(WHSuppQuantityType goodsQuantityByFact) {
        this.goodsQuantityByFact = goodsQuantityByFact;
    }
}
