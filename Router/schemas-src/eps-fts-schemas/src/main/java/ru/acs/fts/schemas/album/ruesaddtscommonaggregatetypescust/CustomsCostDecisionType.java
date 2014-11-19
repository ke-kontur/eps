
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� � ������� �� ���������� ���������.
 */
public class CustomsCostDecisionType
{
    private String decisionCode;
    private String LNP;
    private LocalDate dateInf;
    private String decisionDescription;

    /** 
     * Get the 'DecisionCode' element value. ��� ������� � ���������� ���������
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. ��� ������� � ���������� ���������
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'LNP' element value. ���
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ���
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'DateInf' element value. ����
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ����
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'DecisionDescription' element value. �������� ��������� �������.
     * 
     * @return value
     */
    public String getDecisionDescription() {
        return decisionDescription;
    }

    /** 
     * Set the 'DecisionDescription' element value. �������� ��������� �������.
     * 
     * @param decisionDescription
     */
    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }
}
