
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о контейнерах.
 */
public class ContainerType
{
    private String containerQuantity;
    private List<String> containerIdentificatorList = new ArrayList<String>();

    /** 
     * Get the 'ContainerQuantity' element value. Количество контейнеров. 
     * 
     * @return value
     */
    public String getContainerQuantity() {
        return containerQuantity;
    }

    /** 
     * Set the 'ContainerQuantity' element value. Количество контейнеров. 
     * 
     * @param containerQuantity
     */
    public void setContainerQuantity(String containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    /** 
     * Get the list of 'ContainerIdentificator' element items. Номер (идентификатор) контейнера.
     * 
     * @return list
     */
    public List<String> getContainerIdentificatorList() {
        return containerIdentificatorList;
    }

    /** 
     * Set the list of 'ContainerIdentificator' element items. Номер (идентификатор) контейнера.
     * 
     * @param list
     */
    public void setContainerIdentificatorList(List<String> list) {
        containerIdentificatorList = list;
    }
}
