
package ru.acs.fts.schemas.aud.aud_registryresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDPacketInfoType;

/** 
 * ��������  � ������, ����������  �  �����
 */
public class RegistryPacketInfoType extends AUDPacketInfoType
{
    private List<RegistryRowType> registryRowList = new ArrayList<RegistryRowType>();

    /** 
     * Get the list of 'RegistryRow' element items. ����������  � ����������
     * 
     * @return list
     */
    public List<RegistryRowType> getRegistryRowList() {
        return registryRowList;
    }

    /** 
     * Set the list of 'RegistryRow' element items. ����������  � ����������
     * 
     * @param list
     */
    public void setRegistryRowList(List<RegistryRowType> list) {
        registryRowList = list;
    }
}
