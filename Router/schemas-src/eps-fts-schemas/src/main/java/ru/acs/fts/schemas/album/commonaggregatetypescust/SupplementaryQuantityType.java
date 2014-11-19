
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ���������� � �������������� ������� ���������
 */
public class SupplementaryQuantityType
{
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ � ������� ���������
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � ������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. �������� ����������� ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. �������� ����������� ������� ���������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� � ������������ � ��������� ���������, ������������ � �� ��� ��
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� � ������������ � ��������� ���������, ������������ � �� ��� ��
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }
}
