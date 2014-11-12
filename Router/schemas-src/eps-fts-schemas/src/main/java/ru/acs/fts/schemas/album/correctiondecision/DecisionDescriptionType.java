
package ru.acs.fts.schemas.album.correctiondecision;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ��������� �������
 */
public class DecisionDescriptionType
{
    private String informationCode;
    private String violationCode;
    private List<String> descriptionTextList = new ArrayList<String>();

    /** 
     * Get the 'InformationCode' element value. ��� ����������: 
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. ��� ����������: 
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'ViolationCode' element value. ��� ���� ����������� ��������� ����������� ����������������. (GR0311)
     * 
     * @return value
     */
    public String getViolationCode() {
        return violationCode;
    }

    /** 
     * Set the 'ViolationCode' element value. ��� ���� ����������� ��������� ����������� ����������������. (GR0311)
     * 
     * @param violationCode
     */
    public void setViolationCode(String violationCode) {
        this.violationCode = violationCode;
    }

    /** 
     * Get the list of 'DescriptionText' element items. ����������� ���������� (������������) ���
     * 
     * @return list
     */
    public List<String> getDescriptionTextList() {
        return descriptionTextList;
    }

    /** 
     * Set the list of 'DescriptionText' element items. ����������� ���������� (������������) ���
     * 
     * @param list
     */
    public void setDescriptionTextList(List<String> list) {
        descriptionTextList = list;
    }
}
