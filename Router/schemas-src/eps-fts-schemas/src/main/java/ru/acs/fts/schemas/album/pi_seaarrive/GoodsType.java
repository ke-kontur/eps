
package ru.acs.fts.schemas.album.pi_seaarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;

/** 
 * �������� � �������
 */
public class GoodsType extends GoodsBaseType
{
    private String cargoPlace;
    private String marking;
    private String goodsBoardPlace;

    /** 
     * Get the 'CargoPlace' element value. ����� ���������� �������� ����
     * 
     * @return value
     */
    public String getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. ����� ���������� �������� ����
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(String cargoPlace) {
        this.cargoPlace = cargoPlace;
    }

    /** 
     * Get the 'Marking' element value. ����� � ����� �����.
     * 
     * @return value
     */
    public String getMarking() {
        return marking;
    }

    /** 
     * Set the 'Marking' element value. ����� � ����� �����.
     * 
     * @param marking
     */
    public void setMarking(String marking) {
        this.marking = marking;
    }

    /** 
     * Get the 'GoodsBoardPlace' element value. �������� ���������� ������ �� �����
     * 
     * @return value
     */
    public String getGoodsBoardPlace() {
        return goodsBoardPlace;
    }

    /** 
     * Set the 'GoodsBoardPlace' element value. �������� ���������� ������ �� �����
     * 
     * @param goodsBoardPlace
     */
    public void setGoodsBoardPlace(String goodsBoardPlace) {
        this.goodsBoardPlace = goodsBoardPlace;
    }
}
