
package ru.acs.fts.schemas.album.resolutionorigcountrypreference;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������
 */
public class ResolutionDescriptionType
{
    private String decisionSign;
    private String decisionMeaning;
    private List<InfoCountryCodeType> infoCountryCodeList = new ArrayList<InfoCountryCodeType>();

    /** 
     * Get the 'DecisionSign' element value. ������� ������� (1 - � ������ �������������, 0 - � �������������� �������� �����������)
     * 
     * @return value
     */
    public String getDecisionSign() {
        return decisionSign;
    }

    /** 
     * Set the 'DecisionSign' element value. ������� ������� (1 - � ������ �������������, 0 - � �������������� �������� �����������)
     * 
     * @param decisionSign
     */
    public void setDecisionSign(String decisionSign) {
        this.decisionSign = decisionSign;
    }

    /** 
     * Get the 'DecisionMeaning' element value. �������� ������� (1 - ���������� �������� � �� �������, 2 - ���������� �������� � �� ���������������, 3 - �������� ����������� �������������, 4 - �������� ����������� �� �������������)
     * 
     * @return value
     */
    public String getDecisionMeaning() {
        return decisionMeaning;
    }

    /** 
     * Set the 'DecisionMeaning' element value. �������� ������� (1 - ���������� �������� � �� �������, 2 - ���������� �������� � �� ���������������, 3 - �������� ����������� �������������, 4 - �������� ����������� �� �������������)
     * 
     * @param decisionMeaning
     */
    public void setDecisionMeaning(String decisionMeaning) {
        this.decisionMeaning = decisionMeaning;
    }

    /** 
     * Get the list of 'InfoCountryCode' element items. �������� � ��
     * 
     * @return list
     */
    public List<InfoCountryCodeType> getInfoCountryCodeList() {
        return infoCountryCodeList;
    }

    /** 
     * Set the list of 'InfoCountryCode' element items. �������� � ��
     * 
     * @param list
     */
    public void setInfoCountryCodeList(List<InfoCountryCodeType> list) {
        infoCountryCodeList = list;
    }
}
