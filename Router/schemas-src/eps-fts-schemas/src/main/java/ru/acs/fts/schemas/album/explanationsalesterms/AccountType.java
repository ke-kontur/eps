
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����� �� ����� �������� ������ ������,��������� �� ���������������� ���������
 */
public class AccountType
{
    private String type;
    private String other;

    /** 
     * Get the 'Type' element value. ��� ������ �������. "0" - ������������, "1" - ������, "2" - ���������, "3" - ����
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� ������ �������. "0" - ������������, "1" - ������, "2" - ���������, "3" - ����
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Other' element value. ����� ������ ��� ������ �������� "����"
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. ����� ������ ��� ������ �������� "����"
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }
}
