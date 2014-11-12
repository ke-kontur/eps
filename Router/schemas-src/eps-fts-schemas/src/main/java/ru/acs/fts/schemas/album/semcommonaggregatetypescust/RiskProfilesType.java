
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Список выявленных на товаре профилей риска
 */
public class RiskProfilesType
{
    private RiskProfileRegNumberType riskProfileRegNumber;
    private List<RiskProfileDescriptionType> riskProfileDescriptionList = new ArrayList<RiskProfileDescriptionType>();

    /** 
     * Get the 'RiskProfileRegNumber' element value. ИД профиля риска
     * 
     * @return value
     */
    public RiskProfileRegNumberType getRiskProfileRegNumber() {
        return riskProfileRegNumber;
    }

    /** 
     * Set the 'RiskProfileRegNumber' element value. ИД профиля риска
     * 
     * @param riskProfileRegNumber
     */
    public void setRiskProfileRegNumber(
            RiskProfileRegNumberType riskProfileRegNumber) {
        this.riskProfileRegNumber = riskProfileRegNumber;
    }

    /** 
     * Get the list of 'RiskProfileDescription' element items. Описание неформализованных индикаторов профиля риска
     * 
     * @return list
     */
    public List<RiskProfileDescriptionType> getRiskProfileDescriptionList() {
        return riskProfileDescriptionList;
    }

    /** 
     * Set the list of 'RiskProfileDescription' element items. Описание неформализованных индикаторов профиля риска
     * 
     * @param list
     */
    public void setRiskProfileDescriptionList(
            List<RiskProfileDescriptionType> list) {
        riskProfileDescriptionList = list;
    }
}
