
package ru.acs.fts.schemas.album.goodsclassificationdecision;

/** 
 * ��������������� ����� �������
 */
public class RegistryNumberType
{
    private String GTDId;
    private String GTDPosition;
    private String position;

    /** 
     * Get the 'GTDId' element value. ���������� ����� ��
     * 
     * @return value
     */
    public String getGTDId() {
        return GTDId;
    }

    /** 
     * Set the 'GTDId' element value. ���������� ����� ��
     * 
     * @param GTDId
     */
    public void setGTDId(String GTDId) {
        this.GTDId = GTDId;
    }

    /** 
     * Get the 'GTDPosition' element value. ���������� ����� ������ �� ��
     * 
     * @return value
     */
    public String getGTDPosition() {
        return GTDPosition;
    }

    /** 
     * Set the 'GTDPosition' element value. ���������� ����� ������ �� ��
     * 
     * @param GTDPosition
     */
    public void setGTDPosition(String GTDPosition) {
        this.GTDPosition = GTDPosition;
    }

    /** 
     * Get the 'Position' element value. ���������� ����� ������. "0", ���� �� ���������� "������ ������ �� ��" �������������� ���� �����. "1" � �.�., ���� �� ���������� "������ ������ �� ��" ��������������� ��������� �������.
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� ����� ������. "0", ���� �� ���������� "������ ������ �� ��" �������������� ���� �����. "1" � �.�., ���� �� ���������� "������ ������ �� ��" ��������������� ��������� �������.
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
