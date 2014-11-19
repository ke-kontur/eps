
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * �������� �� ������� �����, ���������� � ���������� ��������. ����������� � ������, ���� ����� ����������� � �������� ���������
 */
public class ESADProductQuantityQuotaType
{
    private String quotaQuantity;
    private String quotaMeasureUnitQualifierCode;
    private String quotaMeasurementName;

    /** 
     * Get the 'QuotaQuantity' element value. ������� ����� � ������� ���������
     * 
     * @return value
     */
    public String getQuotaQuantity() {
        return quotaQuantity;
    }

    /** 
     * Set the 'QuotaQuantity' element value. ������� ����� � ������� ���������
     * 
     * @param quotaQuantity
     */
    public void setQuotaQuantity(String quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    /** 
     * Get the 'QuotaMeasureUnitQualifierCode' element value. ��� ������� ��������� ����� � ������������ � ��������������� ������ ���������
     * 
     * @return value
     */
    public String getQuotaMeasureUnitQualifierCode() {
        return quotaMeasureUnitQualifierCode;
    }

    /** 
     * Set the 'QuotaMeasureUnitQualifierCode' element value. ��� ������� ��������� ����� � ������������ � ��������������� ������ ���������
     * 
     * @param quotaMeasureUnitQualifierCode
     */
    public void setQuotaMeasureUnitQualifierCode(
            String quotaMeasureUnitQualifierCode) {
        this.quotaMeasureUnitQualifierCode = quotaMeasureUnitQualifierCode;
    }

    /** 
     * Get the 'QuotaMeasurementName' element value. ������������ ������� ��������� �����
     * 
     * @return value
     */
    public String getQuotaMeasurementName() {
        return quotaMeasurementName;
    }

    /** 
     * Set the 'QuotaMeasurementName' element value. ������������ ������� ��������� �����
     * 
     * @param quotaMeasurementName
     */
    public void setQuotaMeasurementName(String quotaMeasurementName) {
        this.quotaMeasurementName = quotaMeasurementName;
    }
}
