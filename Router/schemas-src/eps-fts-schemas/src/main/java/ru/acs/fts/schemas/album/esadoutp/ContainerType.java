
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о контейнерах
 */
public class ContainerType
{
    private String containerQuantity;
    private List<ContainerInfoType> containerInfoList = new ArrayList<ContainerInfoType>();

    /** 
     * Get the 'ContainerQuantity' element value. Количество контейнеров
     * 
     * @return value
     */
    public String getContainerQuantity() {
        return containerQuantity;
    }

    /** 
     * Set the 'ContainerQuantity' element value. Количество контейнеров
     * 
     * @param containerQuantity
     */
    public void setContainerQuantity(String containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    /** 
     * Get the list of 'ContainerInfo' element items. Информация о номере контейнера
     * 
     * @return list
     */
    public List<ContainerInfoType> getContainerInfoList() {
        return containerInfoList;
    }

    /** 
     * Set the list of 'ContainerInfo' element items. Информация о номере контейнера
     * 
     * @param list
     */
    public void setContainerInfoList(List<ContainerInfoType> list) {
        containerInfoList = list;
    }
}
