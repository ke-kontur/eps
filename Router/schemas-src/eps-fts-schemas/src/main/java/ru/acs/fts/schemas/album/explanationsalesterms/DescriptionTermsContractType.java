
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� ������� ��������.
 */
public class DescriptionTermsContractType
{
    private String vaule;
    private String answerYES;

    /** 
     * Get the 'Vaule' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @return value
     */
    public String getVaule() {
        return vaule;
    }

    /** 
     * Set the 'Vaule' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @param vaule
     */
    public void setVaule(String vaule) {
        this.vaule = vaule;
    }

    /** 
     * Get the 'AnswerYES' element value. � ������ ������ ��  ������� �����������
     * 
     * @return value
     */
    public String getAnswerYES() {
        return answerYES;
    }

    /** 
     * Set the 'AnswerYES' element value. � ������ ������ ��  ������� �����������
     * 
     * @param answerYES
     */
    public void setAnswerYES(String answerYES) {
        this.answerYES = answerYES;
    }
}
