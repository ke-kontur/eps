
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.GoodsLocationPlaceType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * �����, �� �������� ����������� ����� ���� ��� ��������.
 */
public class AddressThievingSamplingType
{
    private WarehousePlaceType warehousePlace;
    private GoodsLocationPlaceType goodsLocationPlace;

    /** 
     * Get the 'WarehousePlace' element value. �������� � ��������/ ������������� ������.
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. �������� � ��������/ ������������� ������.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
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
