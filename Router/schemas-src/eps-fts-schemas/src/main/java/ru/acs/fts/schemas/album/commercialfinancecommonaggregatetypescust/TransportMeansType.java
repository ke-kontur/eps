
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * �������� ������������� ��������/���������� ��� ��������� ������
 */
public class TransportMeansType
{
    private String number;
    private String modeCode;
    private String nationalityCode;
    private String moverIndicator;

    /** 
     * Get the 'Number' element value. ����� ������������� ��������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ������������� ��������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ModeCode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. ��� ���� ������������� ��������
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'NationalityCode' element value. ��� ������ �������������� ����������
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'NationalityCode' element value. ��� ������ �������������� ����������
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    /** 
     * Get the 'MoverIndicator' element value. ������� �������� ������������� ��������
     * 
     * @return value
     */
    public String getMoverIndicator() {
        return moverIndicator;
    }

    /** 
     * Set the 'MoverIndicator' element value. ������� �������� ������������� ��������
     * 
     * @param moverIndicator
     */
    public void setMoverIndicator(String moverIndicator) {
        this.moverIndicator = moverIndicator;
    }
}
