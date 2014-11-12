
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * ������������ �������� � ���������� ����������
 */
public class TDTransportMeansType
{
    private String TMNumber;
    private String VINID;
    private String modeCode;
    private String nationalityCode;

    /** 
     * Get the 'TMNumber' element value. ����� (��������) ������������� ��������
     * 
     * @return value
     */
    public String getTMNumber() {
        return TMNumber;
    }

    /** 
     * Set the 'TMNumber' element value. ����� (��������) ������������� ��������
     * 
     * @param TMNumber
     */
    public void setTMNumber(String TMNumber) {
        this.TMNumber = TMNumber;
    }

    /** 
     * Get the 'VINID' element value. ����� VIN ������������� ��������
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. ����� VIN ������������� ��������
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'ModeCode' element value. ��� ���� ������������� ��������.
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. ��� ���� ������������� ��������.
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'NationalityCode' element value. ��� ������ �������������� ����������.
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'NationalityCode' element value. ��� ������ �������������� ����������.
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }
}
