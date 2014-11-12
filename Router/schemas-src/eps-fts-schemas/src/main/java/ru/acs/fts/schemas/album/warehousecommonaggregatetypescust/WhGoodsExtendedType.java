
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� ��� ��� ������������ �������� �������� � �������
 */
public class WhGoodsExtendedType extends WhGoodType
{
    private String goodsWHNumber;
    private String comments;
    private String MPOCaseNumder;
    private WHSuppQuantityType mpoBillBruttoVolQuant;
    private WHAngarType keepingPlace;
    private WHKeepingLimitType keepingLimit;
    private List<WHCustomsControlType> customsControlList = new ArrayList<WHCustomsControlType>();

    /** 
     * Get the 'GoodsWHNumber' element value. ��������� ����� ������ (����� 5 ������)
     * 
     * @return value
     */
    public String getGoodsWHNumber() {
        return goodsWHNumber;
    }

    /** 
     * Set the 'GoodsWHNumber' element value. ��������� ����� ������ (����� 5 ������)
     * 
     * @param goodsWHNumber
     */
    public void setGoodsWHNumber(String goodsWHNumber) {
        this.goodsWHNumber = goodsWHNumber;
    }

    /** 
     * Get the 'Comments' element value. ���������� �� �������� �������� (����� 11 ������)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���������� �� �������� �������� (����� 11 ������)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'MPOCaseNumder' element value. ����� ������� ���, 29 ������
     * 
     * @return value
     */
    public String getMPOCaseNumder() {
        return MPOCaseNumder;
    }

    /** 
     * Set the 'MPOCaseNumder' element value. ����� ������� ���, 29 ������
     * 
     * @param MPOCaseNumder
     */
    public void setMPOCaseNumder(String MPOCaseNumder) {
        this.MPOCaseNumder = MPOCaseNumder;
    }

    /** 
     * Get the 'MpoBillBruttoVolQuant' element value. ��� ������ ��� (������� ���) �� ���������������� ����������. ����������� � ������ ��������� ��� �������� �� ��������� �������� �������������� ����, ���������, ��������� � ���������� �������������� ���
     * 
     * @return value
     */
    public WHSuppQuantityType getMpoBillBruttoVolQuant() {
        return mpoBillBruttoVolQuant;
    }

    /** 
     * Set the 'MpoBillBruttoVolQuant' element value. ��� ������ ��� (������� ���) �� ���������������� ����������. ����������� � ������ ��������� ��� �������� �� ��������� �������� �������������� ����, ���������, ��������� � ���������� �������������� ���
     * 
     * @param mpoBillBruttoVolQuant
     */
    public void setMpoBillBruttoVolQuant(
            WHSuppQuantityType mpoBillBruttoVolQuant) {
        this.mpoBillBruttoVolQuant = mpoBillBruttoVolQuant;
    }

    /** 
     * Get the 'KeepingPlace' element value. �������� ����� �������� �������
     * 
     * @return value
     */
    public WHAngarType getKeepingPlace() {
        return keepingPlace;
    }

    /** 
     * Set the 'KeepingPlace' element value. �������� ����� �������� �������
     * 
     * @param keepingPlace
     */
    public void setKeepingPlace(WHAngarType keepingPlace) {
        this.keepingPlace = keepingPlace;
    }

    /** 
     * Get the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @return value
     */
    public WHKeepingLimitType getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(WHKeepingLimitType keepingLimit) {
        this.keepingLimit = keepingLimit;
    }

    /** 
     * Get the list of 'CustomsControls' element items. �������� � �������� ����� ����������� ��������
     * 
     * @return list
     */
    public List<WHCustomsControlType> getCustomsControlList() {
        return customsControlList;
    }

    /** 
     * Set the list of 'CustomsControls' element items. �������� � �������� ����� ����������� ��������
     * 
     * @param list
     */
    public void setCustomsControlList(List<WHCustomsControlType> list) {
        customsControlList = list;
    }
}
