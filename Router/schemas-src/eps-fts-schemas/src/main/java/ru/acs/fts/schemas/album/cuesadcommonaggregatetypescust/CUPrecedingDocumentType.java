
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������������� ���������
 */
public class CUPrecedingDocumentType extends PrecedingDocumentType
{
    private String netWeightQuantity;
    private String customsCountryCode;
    private String addNumberPart;
    private String customsCost;
    private String netWeight;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'NetWeightQuantity' element value. ����� ����� ������, ��������� � ������ �������������� ������. ��� ��/����� ����� ������, ��������������� ��� ������������ �������������� ������
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ����� ����� ������, ��������� � ������ �������������� ������. ��� ��/����� ����� ������, ��������������� ��� ������������ �������������� ������
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'AddNumberPart' element value. �������������� �������� - �������������� ������������ ������ (����������� ��� �������� ������ ������������� � ������ ���������� ���������� ("��") ). ��� ��
     * 
     * @return value
     */
    public String getAddNumberPart() {
        return addNumberPart;
    }

    /** 
     * Set the 'AddNumberPart' element value. �������������� �������� - �������������� ������������ ������ (����������� ��� �������� ������ ������������� � ������ ���������� ���������� ("��") ). ��� ��
     * 
     * @param addNumberPart
     */
    public void setAddNumberPart(String addNumberPart) {
        this.addNumberPart = addNumberPart;
    }

    /** 
     * Get the 'CustomsCost' element value. ���������� ��������� ������, ��������� � �� 45 �������������� ��
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. ���������� ��������� ������, ��������� � �� 45 �������������� ��
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'NetWeight' element value. ����� ����� ������, ��������� � �� 38 �������������� ��
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ����� ����� ������, ��������� � �� 38 �������������� ��
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
