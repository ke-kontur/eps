
package ru.acs.fts.schemas.album.gtdobligation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;

/** 
 * ������, ������ ������� ������ ����������� ���������
 */
public class ObligationGoodsType extends CUESADGoodsItemType
{
    private String militaryProductCategoryCode;
    private String originCountrySign;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<SupplementaryQuantityType> supplementaryQuantity12List = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'MilitaryProductCategoryCode' element value. ��������� ��������� �������� ����������
     * 
     * @return value
     */
    public String getMilitaryProductCategoryCode() {
        return militaryProductCategoryCode;
    }

    /** 
     * Set the 'MilitaryProductCategoryCode' element value. ��������� ��������� �������� ����������
     * 
     * @param militaryProductCategoryCode
     */
    public void setMilitaryProductCategoryCode(
            String militaryProductCategoryCode) {
        this.militaryProductCategoryCode = militaryProductCategoryCode;
    }

    /** 
     * Get the 'OriginCountrySign' element value. ������� ���� ������ �������������: 0 - ��������� ��� alpha-2 �� �������������� OKSMT; 1 - ��������� ��� EU
     * 
     * @return value
     */
    public String getOriginCountrySign() {
        return originCountrySign;
    }

    /** 
     * Set the 'OriginCountrySign' element value. ������� ���� ������ �������������: 0 - ��������� ��� alpha-2 �� �������������� OKSMT; 1 - ��������� ��� EU
     * 
     * @param originCountrySign
     */
    public void setOriginCountrySign(String originCountrySign) {
        this.originCountrySign = originCountrySign;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'SupplementaryQuantity12' element items. ���������� ������ � �������������� ������� ��������� (1,2)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantity12List() {
        return supplementaryQuantity12List;
    }

    /** 
     * Set the list of 'SupplementaryQuantity12' element items. ���������� ������ � �������������� ������� ��������� (1,2)
     * 
     * @param list
     */
    public void setSupplementaryQuantity12List(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantity12List = list;
    }
}
