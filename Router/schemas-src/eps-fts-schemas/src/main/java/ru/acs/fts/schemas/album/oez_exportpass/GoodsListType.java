
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� �������
 */
public class GoodsListType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String weighQuantity;
    private String packagesQuantity;
    private String packagingKind;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<GoodsStatusType> goodsStatuList = new ArrayList<GoodsStatusType>();

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'WeighQuantity' element value. ��� ������ � ��. 
     * 
     * @return value
     */
    public String getWeighQuantity() {
        return weighQuantity;
    }

    /** 
     * Set the 'WeighQuantity' element value. ��� ������ � ��. 
     * 
     * @param weighQuantity
     */
    public void setWeighQuantity(String weighQuantity) {
        this.weighQuantity = weighQuantity;
    }

    /** 
     * Get the 'PackagesQuantity' element value. ���������� �������� ����.
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. ���������� �������� ����.
     * 
     * @param packagesQuantity
     */
    public void setPackagesQuantity(String packagesQuantity) {
        this.packagesQuantity = packagesQuantity;
    }

    /** 
     * Get the 'PackagingKind' element value. ��� ��������
     * 
     * @return value
     */
    public String getPackagingKind() {
        return packagingKind;
    }

    /** 
     * Set the 'PackagingKind' element value. ��� ��������
     * 
     * @param packagingKind
     */
    public void setPackagingKind(String packagingKind) {
        this.packagingKind = packagingKind;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� ������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'GoodsStatus' element items. ������ ������ �� 7
     * 
     * @return list
     */
    public List<GoodsStatusType> getGoodsStatuList() {
        return goodsStatuList;
    }

    /** 
     * Set the list of 'GoodsStatus' element items. ������ ������ �� 7
     * 
     * @param list
     */
    public void setGoodsStatuList(List<GoodsStatusType> list) {
        goodsStatuList = list;
    }
}
