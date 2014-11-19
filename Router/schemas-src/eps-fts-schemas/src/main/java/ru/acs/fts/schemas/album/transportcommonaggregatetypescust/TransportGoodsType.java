
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;

/** 
 * �������� ������
 */
public class TransportGoodsType extends TransportGoodsBaseType
{
    private String goodsNumeric;
    private String goodsNomenclatureCode;
    private List<String> hazardousCargoCodeList = new ArrayList<String>();
    private String volumeQuantity;

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsNomenclatureCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsNomenclatureCode() {
        return goodsNomenclatureCode;
    }

    /** 
     * Set the 'GoodsNomenclatureCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsNomenclatureCode
     */
    public void setGoodsNomenclatureCode(String goodsNomenclatureCode) {
        this.goodsNomenclatureCode = goodsNomenclatureCode;
    }

    /** 
     * Get the list of 'HazardousCargoCode' element items. ��� ������ ��������� ����� �� �����/����� ��� ������� ������
     * 
     * @return list
     */
    public List<String> getHazardousCargoCodeList() {
        return hazardousCargoCodeList;
    }

    /** 
     * Set the list of 'HazardousCargoCode' element items. ��� ������ ��������� ����� �� �����/����� ��� ������� ������
     * 
     * @param list
     */
    public void setHazardousCargoCodeList(List<String> list) {
        hazardousCargoCodeList = list;
    }

    /** 
     * Get the 'VolumeQuantity' element value. ����� ������ (�����) � ����������
     * 
     * @return value
     */
    public String getVolumeQuantity() {
        return volumeQuantity;
    }

    /** 
     * Set the 'VolumeQuantity' element value. ����� ������ (�����) � ����������
     * 
     * @param volumeQuantity
     */
    public void setVolumeQuantity(String volumeQuantity) {
        this.volumeQuantity = volumeQuantity;
    }
}
