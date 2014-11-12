
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о номере контейнера
 */
public class ContainerInfoType
{
    private String containerNumber;
    private String containerKind;
    private List<String> sealList = new ArrayList<String>();

    /** 
     * Get the 'ContainerNumber' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. Номер контейнера
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    /** 
     * Get the 'ContainerKind' element value. Тип контейнера
     * 
     * @return value
     */
    public String getContainerKind() {
        return containerKind;
    }

    /** 
     * Set the 'ContainerKind' element value. Тип контейнера
     * 
     * @param containerKind
     */
    public void setContainerKind(String containerKind) {
        this.containerKind = containerKind;
    }

    /** 
     * Get the list of 'Seals' element items. Сведения о номере пломбы
     * 
     * @return list
     */
    public List<String> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seals' element items. Сведения о номере пломбы
     * 
     * @param list
     */
    public void setSealList(List<String> list) {
        sealList = list;
    }
}
