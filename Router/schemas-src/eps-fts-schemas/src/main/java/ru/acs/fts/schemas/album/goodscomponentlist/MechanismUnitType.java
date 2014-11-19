
package ru.acs.fts.schemas.album.goodscomponentlist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ComponentDescriptionType;

/** 
 * Сведения о функциональном блоке
 */
public class MechanismUnitType extends ComponentDescriptionType
{
    private String unitDescription;
    private List<MechUnitPartType> mechUnitPartList = new ArrayList<MechUnitPartType>();

    /** 
     * Get the 'UnitDescription' element value. Наименование ФБ / Раздела списка (ПРОЧИЕ КОМПОНЕНТЫ)
     * 
     * @return value
     */
    public String getUnitDescription() {
        return unitDescription;
    }

    /** 
     * Set the 'UnitDescription' element value. Наименование ФБ / Раздела списка (ПРОЧИЕ КОМПОНЕНТЫ)
     * 
     * @param unitDescription
     */
    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    /** 
     * Get the list of 'MechUnitPart' element items. Сведения о компоненте функционального блока
     * 
     * @return list
     */
    public List<MechUnitPartType> getMechUnitPartList() {
        return mechUnitPartList;
    }

    /** 
     * Set the list of 'MechUnitPart' element items. Сведения о компоненте функционального блока
     * 
     * @param list
     */
    public void setMechUnitPartList(List<MechUnitPartType> list) {
        mechUnitPartList = list;
    }
}
