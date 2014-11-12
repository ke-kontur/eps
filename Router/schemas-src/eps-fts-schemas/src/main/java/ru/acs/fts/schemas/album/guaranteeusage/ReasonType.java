
package ru.acs.fts.schemas.album.guaranteeusage;

/** 
 * ������� ��������� ���������� ��������� ��������� �����������
 */
public class ReasonType
{
    private String name;
    private String comment;
    private String decisionCode;

    /** 
     * Get the 'Name' element value. ������������ �������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ �������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Comment' element value. �����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. �����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'DecisionCode' element value. ��� ������� � ������������ � ��������������� �������, ����������� ����������� ��������
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. ��� ������� � ������������ � ��������������� �������, ����������� ����������� ��������
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }
}
