
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о новых контейнерах
 */
public class ESADReloadContainerType
{
    private List<String> containerNumberList = new ArrayList<String>();

    /** 
     * Get the list of 'ContainerNumber' element items. Номер нового контейнера
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. Номер нового контейнера
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }
}
