
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Поставка компонентами - Список компонентов
 */
public class ComponentsListType
{
    private List<MechanismUnitType> mechanismUnitList = new ArrayList<MechanismUnitType>();

    /** 
     * Get the list of 'MechanismUnit' element items. Сведения о функциональном блоке или компоненте товара
     * 
     * @return list
     */
    public List<MechanismUnitType> getMechanismUnitList() {
        return mechanismUnitList;
    }

    /** 
     * Set the list of 'MechanismUnit' element items. Сведения о функциональном блоке или компоненте товара
     * 
     * @param list
     */
    public void setMechanismUnitList(List<MechanismUnitType> list) {
        mechanismUnitList = list;
    }
}
