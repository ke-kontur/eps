
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ����������������� ���������� ����� (���) ���������� ���������
 */
public class ITNKZType
{
    private String categoryCode;
    private String KATOCode;
    private String RNN;
    private String ITNReserv;

    /** 
     * Get the 'CategoryCode' element value. ��������� ����. ����������� �������� ��� ��������� ���� �������� ������������� ���������� ��� ������������� � ����������� � �������� ��������������� ���������������
     * 
     * @return value
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /** 
     * Set the 'CategoryCode' element value. ��������� ����. ����������� �������� ��� ��������� ���� �������� ������������� ���������� ��� ������������� � ����������� � �������� ��������������� ���������������
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /** 
     * Get the 'KATOCode' element value. ��� ����. �����������  ��� ���� � ������������ � ��������������� ����� ���������������-��������������� ��������
     * 
     * @return value
     */
    public String getKATOCode() {
        return KATOCode;
    }

    /** 
     * Set the 'KATOCode' element value. ��� ����. �����������  ��� ���� � ������������ � ��������������� ����� ���������������-��������������� ��������
     * 
     * @param KATOCode
     */
    public void setKATOCode(String KATOCode) {
        this.KATOCode = KATOCode;
    }

    /** 
     * Get the 'RNN' element value. ���. ��������������� ��������� �����, ������������� ���������� �������� ���������� ���������
     * 
     * @return value
     */
    public String getRNN() {
        return RNN;
    }

    /** 
     * Set the 'RNN' element value. ���. ��������������� ��������� �����, ������������� ���������� �������� ���������� ���������
     * 
     * @param RNN
     */
    public void setRNN(String RNN) {
        this.RNN = RNN;
    }

    /** 
     * Get the 'ITNReserv' element value. ������ ��� ���
     * 
     * @return value
     */
    public String getITNReserv() {
        return ITNReserv;
    }

    /** 
     * Set the 'ITNReserv' element value. ������ ��� ���
     * 
     * @param ITNReserv
     */
    public void setITNReserv(String ITNReserv) {
        this.ITNReserv = ITNReserv;
    }
}
