
package ru.acs.fts.schemas.album.gtdobligationin;

/** 
 * ���������, �������������� ������ ���������� ��������.
 */
public class ConfPaytDocumentsType
{
    private String payDocument;
    private String notRequiredPayment;
    private ObligDecisionType obligDecision;

    /** 
     * Get the 'PayDocument' element value. ������� �������� ����������� ������ ���������� ��������
     * 
     * @return value
     */
    public String getPayDocument() {
        return payDocument;
    }

    /** 
     * Set the 'PayDocument' element value. ������� �������� ����������� ������ ���������� ��������
     * 
     * @param payDocument
     */
    public void setPayDocument(String payDocument) {
        this.payDocument = payDocument;
    }

    /** 
     * Get the 'NotRequiredPayment' element value. ������� ����, ��� ����������� ������ ���������� �������� �� ���������
     * 
     * @return value
     */
    public String getNotRequiredPayment() {
        return notRequiredPayment;
    }

    /** 
     * Set the 'NotRequiredPayment' element value. ������� ����, ��� ����������� ������ ���������� �������� �� ���������
     * 
     * @param notRequiredPayment
     */
    public void setNotRequiredPayment(String notRequiredPayment) {
        this.notRequiredPayment = notRequiredPayment;
    }

    /** 
     * Get the 'ObligDecision' element value. ������� �� ������� �������
     * 
     * @return value
     */
    public ObligDecisionType getObligDecision() {
        return obligDecision;
    }

    /** 
     * Set the 'ObligDecision' element value. ������� �� ������� �������
     * 
     * @param obligDecision
     */
    public void setObligDecision(ObligDecisionType obligDecision) {
        this.obligDecision = obligDecision;
    }
}
