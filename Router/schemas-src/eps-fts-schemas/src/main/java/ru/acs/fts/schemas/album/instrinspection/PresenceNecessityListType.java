
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Перечень лиц, присутствие (участие) которых необходимо при (в) проведении таможенного досмотра
 */
public class PresenceNecessityListType
{
    private OrganizationBaseType controlOrganization;
    private List<ControlPersonType> controlPersonList = new ArrayList<ControlPersonType>();

    /** 
     * Get the 'ControlOrganization' element value. Наименование таможенного органа (иного контролирующего органа и (или) организации)
     * 
     * @return value
     */
    public OrganizationBaseType getControlOrganization() {
        return controlOrganization;
    }

    /** 
     * Set the 'ControlOrganization' element value. Наименование таможенного органа (иного контролирующего органа и (или) организации)
     * 
     * @param controlOrganization
     */
    public void setControlOrganization(OrganizationBaseType controlOrganization) {
        this.controlOrganization = controlOrganization;
    }

    /** 
     * Get the list of 'ControlPerson' element items. Сведения о должностном лице
     * 
     * @return list
     */
    public List<ControlPersonType> getControlPersonList() {
        return controlPersonList;
    }

    /** 
     * Set the list of 'ControlPerson' element items. Сведения о должностном лице
     * 
     * @param list
     */
    public void setControlPersonList(List<ControlPersonType> list) {
        controlPersonList = list;
    }
}
