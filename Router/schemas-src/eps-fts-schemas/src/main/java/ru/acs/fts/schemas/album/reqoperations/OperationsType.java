
package ru.acs.fts.schemas.album.reqoperations;

/** 
 * �������� �������� � ��������� ������� � ������������ �������
 */
public class OperationsType
{
    private String value;
    private String remark;

    /** 
     * Get the 'Value' element value. ��������: 0 ��� false - ���, 1 ��� true - ��
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. ��������: 0 ��� false - ���, 1 ��� true - ��
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Remark' element value. ��������� � ���������� ��������� �/��� ��������� �������� ���������� ��������, ������� ��������� ��������
     * 
     * @return value
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Set the 'Remark' element value. ��������� � ���������� ��������� �/��� ��������� �������� ���������� ��������, ������� ��������� ��������
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
