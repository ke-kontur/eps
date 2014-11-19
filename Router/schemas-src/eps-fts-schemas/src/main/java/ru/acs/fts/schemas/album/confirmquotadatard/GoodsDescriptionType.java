
package ru.acs.fts.schemas.album.confirmquotadatard;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.LicenseGoodsType;

/** 
 * �������� � �������
 */
public class GoodsDescriptionType
{
    private String goodsNumber;
    private List<SupplementaryQuantityType> supplementaryQuantityList = new ArrayList<SupplementaryQuantityType>();
    private LicenseGoodsType licenseGoods;

    /** 
     * Get the 'GoodsNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ����� ������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'SupplementaryQuantity' element items. ���������� � ������� ���������
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantityList() {
        return supplementaryQuantityList;
    }

    /** 
     * Set the list of 'SupplementaryQuantity' element items. ���������� � ������� ���������
     * 
     * @param list
     */
    public void setSupplementaryQuantityList(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantityList = list;
    }

    /** 
     * Get the 'LicenseGoods' element value. �������� � ������ �� ���������� ��������������� ���������
     * 
     * @return value
     */
    public LicenseGoodsType getLicenseGoods() {
        return licenseGoods;
    }

    /** 
     * Set the 'LicenseGoods' element value. �������� � ������ �� ���������� ��������������� ���������
     * 
     * @param licenseGoods
     */
    public void setLicenseGoods(LicenseGoodsType licenseGoods) {
        this.licenseGoods = licenseGoods;
    }
}
