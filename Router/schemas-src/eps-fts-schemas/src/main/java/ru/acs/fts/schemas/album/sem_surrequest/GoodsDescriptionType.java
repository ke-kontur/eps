
package ru.acs.fts.schemas.album.sem_surrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.GoodsType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.RiskProfilesType;

/** 
 * ������������ �������
 */
public class GoodsDescriptionType extends GoodsType
{
    private List<RiskProfilesType> riskProfileList = new ArrayList<RiskProfilesType>();

    /** 
     * Get the list of 'RiskProfiles' element items. ������ ���������� �� ������ �������� �����
     * 
     * @return list
     */
    public List<RiskProfilesType> getRiskProfileList() {
        return riskProfileList;
    }

    /** 
     * Set the list of 'RiskProfiles' element items. ������ ���������� �� ������ �������� �����
     * 
     * @param list
     */
    public void setRiskProfileList(List<RiskProfilesType> list) {
        riskProfileList = list;
    }
}
