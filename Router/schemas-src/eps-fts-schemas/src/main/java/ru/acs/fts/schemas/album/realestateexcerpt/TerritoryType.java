
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ��
 */
public class TerritoryType
{
    private String isRussiaTerritory;
    private List<String> regionCodeList = new ArrayList<String>();

    /** 
     * Get the 'IsRussiaTerritory' element value. ������� ����������������/���������� �� ���� ���������� ��
     * 
     * @return value
     */
    public String getIsRussiaTerritory() {
        return isRussiaTerritory;
    }

    /** 
     * Set the 'IsRussiaTerritory' element value. ������� ����������������/���������� �� ���� ���������� ��
     * 
     * @param isRussiaTerritory
     */
    public void setIsRussiaTerritory(String isRussiaTerritory) {
        this.isRussiaTerritory = isRussiaTerritory;
    }

    /** 
     * Get the list of 'RegionCode' element items. ������ (���)
     * 
     * @return list
     */
    public List<String> getRegionCodeList() {
        return regionCodeList;
    }

    /** 
     * Set the list of 'RegionCode' element items. ������ (���)
     * 
     * @param list
     */
    public void setRegionCodeList(List<String> list) {
        regionCodeList = list;
    }
}
