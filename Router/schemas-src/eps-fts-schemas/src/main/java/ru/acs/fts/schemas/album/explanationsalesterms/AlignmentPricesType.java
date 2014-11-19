
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������������ ���� ������.
 */
public class AlignmentPricesType
{
    private String negotiations;
    private String correspondence;
    private String negotiationsCorrespondence;
    private String negotiationsComments;

    /** 
     * Get the 'Negotiations' element value. ������� ������������ ���� ������ ����� ������ ����������� �������������� �������� � ����������
     * 
     * @return value
     */
    public String getNegotiations() {
        return negotiations;
    }

    /** 
     * Set the 'Negotiations' element value. ������� ������������ ���� ������ ����� ������ ����������� �������������� �������� � ����������
     * 
     * @param negotiations
     */
    public void setNegotiations(String negotiations) {
        this.negotiations = negotiations;
    }

    /** 
     * Get the 'Correspondence' element value. ������� ������������ ���� ������ �� ���������
     * 
     * @return value
     */
    public String getCorrespondence() {
        return correspondence;
    }

    /** 
     * Set the 'Correspondence' element value. ������� ������������ ���� ������ �� ���������
     * 
     * @param correspondence
     */
    public void setCorrespondence(String correspondence) {
        this.correspondence = correspondence;
    }

    /** 
     * Get the 'NegotiationsCorrespondence' element value. ������� ������������ ���� ������ ����� ������ ����������� �������������� �������� � ���������� � �� ���������
     * 
     * @return value
     */
    public String getNegotiationsCorrespondence() {
        return negotiationsCorrespondence;
    }

    /** 
     * Set the 'NegotiationsCorrespondence' element value. ������� ������������ ���� ������ ����� ������ ����������� �������������� �������� � ���������� � �� ���������
     * 
     * @param negotiationsCorrespondence
     */
    public void setNegotiationsCorrespondence(String negotiationsCorrespondence) {
        this.negotiationsCorrespondence = negotiationsCorrespondence;
    }

    /** 
     * Get the 'NegotiationsComments' element value. ����� ������ ����������� �������������� �������� � ���������� (������� ��� � ��� ����������)
     * 
     * @return value
     */
    public String getNegotiationsComments() {
        return negotiationsComments;
    }

    /** 
     * Set the 'NegotiationsComments' element value. ����� ������ ����������� �������������� �������� � ���������� (������� ��� � ��� ����������)
     * 
     * @param negotiationsComments
     */
    public void setNegotiationsComments(String negotiationsComments) {
        this.negotiationsComments = negotiationsComments;
    }
}
