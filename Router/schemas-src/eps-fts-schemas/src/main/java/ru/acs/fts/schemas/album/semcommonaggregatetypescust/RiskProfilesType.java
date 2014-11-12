
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ���������� �� ������ �������� �����
 */
public class RiskProfilesType
{
    private RiskProfileRegNumberType riskProfileRegNumber;
    private List<RiskProfileDescriptionType> riskProfileDescriptionList = new ArrayList<RiskProfileDescriptionType>();

    /** 
     * Get the 'RiskProfileRegNumber' element value. �� ������� �����
     * 
     * @return value
     */
    public RiskProfileRegNumberType getRiskProfileRegNumber() {
        return riskProfileRegNumber;
    }

    /** 
     * Set the 'RiskProfileRegNumber' element value. �� ������� �����
     * 
     * @param riskProfileRegNumber
     */
    public void setRiskProfileRegNumber(
            RiskProfileRegNumberType riskProfileRegNumber) {
        this.riskProfileRegNumber = riskProfileRegNumber;
    }

    /** 
     * Get the list of 'RiskProfileDescription' element items. �������� ����������������� ����������� ������� �����
     * 
     * @return list
     */
    public List<RiskProfileDescriptionType> getRiskProfileDescriptionList() {
        return riskProfileDescriptionList;
    }

    /** 
     * Set the list of 'RiskProfileDescription' element items. �������� ����������������� ����������� ������� �����
     * 
     * @param list
     */
    public void setRiskProfileDescriptionList(
            List<RiskProfileDescriptionType> list) {
        riskProfileDescriptionList = list;
    }
}
