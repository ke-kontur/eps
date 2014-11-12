
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� ������� ������� ����������� �������� � ����������
 */
public class SpecialRelationshipType
{
    private String cooperation;
    private String prepayment;
    private String extraDuty;
    private String other;
    private String comments;

    /** 
     * Get the 'Cooperation' element value. ������� ������� ���������� ������� ��������������
     * 
     * @return value
     */
    public String getCooperation() {
        return cooperation;
    }

    /** 
     * Set the 'Cooperation' element value. ������� ������� ���������� ������� ��������������
     * 
     * @param cooperation
     */
    public void setCooperation(String cooperation) {
        this.cooperation = cooperation;
    }

    /** 
     * Get the 'Prepayment' element value. ������� ����, ��� ���������� ������������� �������� ����������
     * 
     * @return value
     */
    public String getPrepayment() {
        return prepayment;
    }

    /** 
     * Set the 'Prepayment' element value. ������� ����, ��� ���������� ������������� �������� ����������
     * 
     * @param prepayment
     */
    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    /** 
     * Get the 'ExtraDuty' element value. ���������� ��������� �������������� ������������� �� ������ ������� �������
     * 
     * @return value
     */
    public String getExtraDuty() {
        return extraDuty;
    }

    /** 
     * Set the 'ExtraDuty' element value. ���������� ��������� �������������� ������������� �� ������ ������� �������
     * 
     * @param extraDuty
     */
    public void setExtraDuty(String extraDuty) {
        this.extraDuty = extraDuty;
    }

    /** 
     * Get the 'Other' element value. ������� ������� ����� ������� ����������� �������� � ����������
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. ������� ������� ����� ������� ����������� �������� � ����������
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'Comments' element value. ���� (������� �����������)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���� (������� �����������)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
