
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DriverInformationType;

/** 
 * Сведения о перевозчике товаров
 */
public class ESADoutCarrierPType extends CUOrganizationType
{
    private List<DriverInformationType> ESADDriverInformationList = new ArrayList<DriverInformationType>();

    /** 
     * Get the list of 'ESADDriverInformation' element items. Информация о водителях транспортных средств
     * 
     * @return list
     */
    public List<DriverInformationType> getESADDriverInformationList() {
        return ESADDriverInformationList;
    }

    /** 
     * Set the list of 'ESADDriverInformation' element items. Информация о водителях транспортных средств
     * 
     * @param list
     */
    public void setESADDriverInformationList(List<DriverInformationType> list) {
        ESADDriverInformationList = list;
    }
}
