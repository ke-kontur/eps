
package ru.acs.fts.schemas.album.commissioninspection;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.GoodsLocationPlaceType;

/** 
 * ��������������� �������.
 */
public class GoodsLocationType
{
    private CIWarehousePlaceType warehousePlace;
    private GoodsLocationPlaceType goodsLocationPlace;

    /** 
     * Get the 'WarehousePlace' element value. ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @return value
     */
    public CIWarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(CIWarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the 'GoodsLocationPlace' element value. �������� � ��������������� ������. (����� ����������, ���� �����).
     * 
     * @return value
     */
    public GoodsLocationPlaceType getGoodsLocationPlace() {
        return goodsLocationPlace;
    }

    /** 
     * Set the 'GoodsLocationPlace' element value. �������� � ��������������� ������. (����� ����������, ���� �����).
     * 
     * @param goodsLocationPlace
     */
    public void setGoodsLocationPlace(GoodsLocationPlaceType goodsLocationPlace) {
        this.goodsLocationPlace = goodsLocationPlace;
    }
}
