
package ru.acs.fts.schemas.album.oez_report;

/** 
 * ������� 1. �����, �������� � ������������ � ���������� ������� ���
 */
public class Table1GoodsType extends GoodsBaseType
{
    private QuantityPutType put;
    private Table1QuantityUsedType used;

    /** 
     * Get the 'Put' element value. ���������� ������, ���������� ��� ���������� ����� ��������� ���������� ����
     * 
     * @return value
     */
    public QuantityPutType getPut() {
        return put;
    }

    /** 
     * Set the 'Put' element value. ���������� ������, ���������� ��� ���������� ����� ��������� ���������� ����
     * 
     * @param put
     */
    public void setPut(QuantityPutType put) {
        this.put = put;
    }

    /** 
     * Get the 'Used' element value. ������������� �������, ���������� ��� ���������� ����� ��������� ���������� ����
     * 
     * @return value
     */
    public Table1QuantityUsedType getUsed() {
        return used;
    }

    /** 
     * Set the 'Used' element value. ������������� �������, ���������� ��� ���������� ����� ��������� ���������� ����
     * 
     * @param used
     */
    public void setUsed(Table1QuantityUsedType used) {
        this.used = used;
    }
}
