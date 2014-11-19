
package ru.acs.fts.schemas.album.revealedrisks;

/** 
 * ���� �� ���������������� ���������������, ��������� ����
 */
public class AdministrativeInfractionType
{
    private String lineNumber;
    private String pointCode;
    private String kodeksPunkt;
    private String kodeksPartPunkt;

    /** 
     * Get the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� ����� 
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� ����� 
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'KodeksPunkt' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������), ���������� ������� ���������� ��������� (�� ������)
     * 
     * @return value
     */
    public String getKodeksPunkt() {
        return kodeksPunkt;
    }

    /** 
     * Set the 'KodeksPunkt' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������), ���������� ������� ���������� ��������� (�� ������)
     * 
     * @param kodeksPunkt
     */
    public void setKodeksPunkt(String kodeksPunkt) {
        this.kodeksPunkt = kodeksPunkt;
    }

    /** 
     * Get the 'KodeksPartPunkt' element value. ����� ����� ������ ���� ������, �� ������
     * 
     * @return value
     */
    public String getKodeksPartPunkt() {
        return kodeksPartPunkt;
    }

    /** 
     * Set the 'KodeksPartPunkt' element value. ����� ����� ������ ���� ������, �� ������
     * 
     * @param kodeksPartPunkt
     */
    public void setKodeksPartPunkt(String kodeksPartPunkt) {
        this.kodeksPartPunkt = kodeksPartPunkt;
    }
}
