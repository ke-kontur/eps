
package ru.acs.fts.schemas.album.bartertransactionpasport;

/** 
 * ����� �������� ��������� ������ 
 */
public class PasportIDType
{
    private String sign;
    private String OKPOID;
    private String number3;
    private String number10;

    /** 
     * Get the 'Sign' element value. ������� ������ (������ ����� 3) 
     * 
     * @return value
     */
    public String getSign() {
        return sign;
    }

    /** 
     * Set the 'Sign' element value. ������� ������ (������ ����� 3) 
     * 
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /** 
     * Get the 'OKPOID' element value. ��� ���� ���������� ��������������� ���� ������    
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ���� ���������� ��������������� ���� ������    
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'Number3' element value. ����� ���������������� �������� ��������� ������
     * 
     * @return value
     */
    public String getNumber3() {
        return number3;
    }

    /** 
     * Set the 'Number3' element value. ����� ���������������� �������� ��������� ������
     * 
     * @param number3
     */
    public void setNumber3(String number3) {
        this.number3 = number3;
    }

    /** 
     * Get the 'Number10' element value. ����� ��������������� �������� ��������� ������, ����������� ����������� �������������� ����������������� 
     * 
     * @return value
     */
    public String getNumber10() {
        return number10;
    }

    /** 
     * Set the 'Number10' element value. ����� ��������������� �������� ��������� ������, ����������� ����������� �������������� ����������������� 
     * 
     * @param number10
     */
    public void setNumber10(String number10) {
        this.number10 = number10;
    }
}
