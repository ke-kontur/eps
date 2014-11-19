
package ru.acs.fts.schemas.album.goodsnoarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContainerNumberType;

/** 
 * Товарная партия
 */
public class GoodsShipmentType
{
    private List<PresentDocumentType> presentDocumentList = new ArrayList<PresentDocumentType>();
    private List<ContainerNumberType> containerNumberList = new ArrayList<ContainerNumberType>();

    /** 
     * Get the list of 'PresentDocument' element items. Представленный документ
     * 
     * @return list
     */
    public List<PresentDocumentType> getPresentDocumentList() {
        return presentDocumentList;
    }

    /** 
     * Set the list of 'PresentDocument' element items. Представленный документ
     * 
     * @param list
     */
    public void setPresentDocumentList(List<PresentDocumentType> list) {
        presentDocumentList = list;
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
