
package ru.acs.fts.schemas.aud.aud_registryresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDPacketInfoType;

/** 
 * Сведения  о пакете, помещенном  в  архив
 */
public class RegistryPacketInfoType extends AUDPacketInfoType
{
    private List<RegistryRowType> registryRowList = new ArrayList<RegistryRowType>();

    /** 
     * Get the list of 'RegistryRow' element items. Информация  о документах
     * 
     * @return list
     */
    public List<RegistryRowType> getRegistryRowList() {
        return registryRowList;
    }

    /** 
     * Set the list of 'RegistryRow' element items. Информация  о документах
     * 
     * @param list
     */
    public void setRegistryRowList(List<RegistryRowType> list) {
        registryRowList = list;
    }
}
