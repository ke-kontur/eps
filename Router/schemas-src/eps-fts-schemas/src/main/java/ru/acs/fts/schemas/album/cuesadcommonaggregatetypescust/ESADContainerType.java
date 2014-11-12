
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о контейнерах
 */
public class ESADContainerType
{
    private String containerQuantity;
    private String containerKind;
    private List<ContainerNumberType> containerNumberList = new ArrayList<ContainerNumberType>();

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
     * Get the 'ContainerKind' element value. Тип контейнера в соответствии с классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getContainerKind() {
        return containerKind;
    }

    /** 
     * Set the 'ContainerKind' element value. Тип контейнера в соответствии с классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param containerKind
     */
    public void setContainerKind(String containerKind) {
        this.containerKind = containerKind;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @return list
     */
    public List<ContainerNumberType> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @param list
     */
    public void setContainerNumberList(List<ContainerNumberType> list) {
        containerNumberList = list;
    }
}
