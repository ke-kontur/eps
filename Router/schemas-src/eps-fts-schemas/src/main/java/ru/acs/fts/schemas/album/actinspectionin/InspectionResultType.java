
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ����������� ��������
 */
public class InspectionResultType
{
    private String seizureFlag;
    private String violationFlag;
    private String ATDAdditions;
    private List<LawDecisionType> lawDecisionList = new ArrayList<LawDecisionType>();
    private List<InspTestActType> inspTestActList = new ArrayList<InspTestActType>();

    /** 
     * Get the 'SeizureFlag' element value. ������� ������ ���� � �������� 0 - ����� � ������� �� ���������� 1 - ����� � ������� ����������
     * 
     * @return value
     */
    public String getSeizureFlag() {
        return seizureFlag;
    }

    /** 
     * Set the 'SeizureFlag' element value. ������� ������ ���� � �������� 0 - ����� � ������� �� ���������� 1 - ����� � ������� ����������
     * 
     * @param seizureFlag
     */
    public void setSeizureFlag(String seizureFlag) {
        this.seizureFlag = seizureFlag;
    }

    /** 
     * Get the 'ViolationFlag' element value. ������� ������� ����������������� ��������������, ����������� � ����������� ����������� ������: "0" - ��� ��������� ����������������� ��������������; "1" - ���� �������� ����������������� ��������������.
     * 
     * @return value
     */
    public String getViolationFlag() {
        return violationFlag;
    }

    /** 
     * Set the 'ViolationFlag' element value. ������� ������� ����������������� ��������������, ����������� � ����������� ����������� ������: "0" - ��� ��������� ����������������� ��������������; "1" - ���� �������� ����������������� ��������������.
     * 
     * @param violationFlag
     */
    public void setViolationFlag(String violationFlag) {
        this.violationFlag = violationFlag;
    }

    /** 
     * Get the 'ATDAdditions' element value. �������� ���������� � ���� ��������
     * 
     * @return value
     */
    public String getATDAdditions() {
        return ATDAdditions;
    }

    /** 
     * Set the 'ATDAdditions' element value. �������� ���������� � ���� ��������
     * 
     * @param ATDAdditions
     */
    public void setATDAdditions(String ATDAdditions) {
        this.ATDAdditions = ATDAdditions;
    }

    /** 
     * Get the list of 'LawDecision' element items. ������ ���� �� ������� �������� �������� ��. ����� ������������ ����� ���� ��������, ����������� �� ���� �������
     * 
     * @return list
     */
    public List<LawDecisionType> getLawDecisionList() {
        return lawDecisionList;
    }

    /** 
     * Set the list of 'LawDecision' element items. ������ ���� �� ������� �������� �������� ��. ����� ������������ ����� ���� ��������, ����������� �� ���� �������
     * 
     * @param list
     */
    public void setLawDecisionList(List<LawDecisionType> list) {
        lawDecisionList = list;
    }

    /** 
     * Get the list of 'InspTestAct' element items. ��� ������ ���� � ��������
     * 
     * @return list
     */
    public List<InspTestActType> getInspTestActList() {
        return inspTestActList;
    }

    /** 
     * Set the list of 'InspTestAct' element items. ��� ������ ���� � ��������
     * 
     * @param list
     */
    public void setInspTestActList(List<InspTestActType> list) {
        inspTestActList = list;
    }
}
