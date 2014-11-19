
package ru.acs.fts.schemas.album.inspectionreqres;

/** 
 * �������, �������� ���������� ����������� �� ����������� �������������� ��������
 */
public class InspectionDecisionType
{
    private String type;
    private String decision;

    /** 
     * Get the 'Type' element value. ��� �������: 0 - ������� �� ����������; 1 - ���� �������� (����������); 2 - ����� �������� (����������); 3 - ������� �������� (����������); 4 - ���� �������� (������); 5 - ����� �������� (������); 6 - ������� �������� (������); 7 - ��������� �� ������������ ������� (������); 8 - ������� ���������� �� ����������� �������� (����������); 9 - ���� �������� (������)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� �������: 0 - ������� �� ����������; 1 - ���� �������� (����������); 2 - ����� �������� (����������); 3 - ������� �������� (����������); 4 - ���� �������� (������); 5 - ����� �������� (������); 6 - ������� �������� (������); 7 - ��������� �� ������������ ������� (������); 8 - ������� ���������� �� ����������� �������� (����������); 9 - ���� �������� (������)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Decision' element value. ����� �������
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. ����� �������
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }
}
