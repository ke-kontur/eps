
package ru.acs.fts.schemas.album.oez_report;

/** 
 * ������� ��� ��� ������� �� ���� �������� ������. �������� ����� ��� ���� ������� ����, ������� ��/���. ������� ���� ������ ������ ������������� �� ����� ���� 
 */
public class GoodsBaseType extends GoodsWithoutStatusBaseType
{
    private String status;

    /** 
     * Get the 'Status' element value. ������ ������: 0 - ���������� (���), 1 - ����������� (��)
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������ ������: 0 - ���������� (���), 1 - ����������� (��)
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
