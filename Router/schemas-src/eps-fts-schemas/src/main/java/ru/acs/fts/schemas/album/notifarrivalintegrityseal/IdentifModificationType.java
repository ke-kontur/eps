
package ru.acs.fts.schemas.album.notifarrivalintegrityseal;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Нарушение средств идентификации
 */
public class IdentifModificationType
{
    private String modificationInfo;
    private List<String> containerList = new ArrayList<String>();
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();
    private List<ModifiedIdentifyMeanType> modifiedIdentifyMeanList = new ArrayList<ModifiedIdentifyMeanType>();

    /** 
     * Get the 'ModificationInfo' element value. Описание выявленного факта нарушения средств идентификации
     * 
     * @return value
     */
    public String getModificationInfo() {
        return modificationInfo;
    }

    /** 
     * Set the 'ModificationInfo' element value. Описание выявленного факта нарушения средств идентификации
     * 
     * @param modificationInfo
     */
    public void setModificationInfo(String modificationInfo) {
        this.modificationInfo = modificationInfo;
    }

    /** 
     * Get the list of 'Container' element items. Номер (идентификатор) контейнера(ов), на которых нарушены средства идентификации
     * 
     * @return list
     */
    public List<String> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. Номер (идентификатор) контейнера(ов), на которых нарушены средства идентификации
     * 
     * @param list
     */
    public void setContainerList(List<String> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'TransportMean' element items. Транспортное средство, на котором нарушены средства идентификации
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMean' element items. Транспортное средство, на котором нарушены средства идентификации
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'ModifiedIdentifyMean' element items. Характеристика нарушенного средства идентификации
     * 
     * @return list
     */
    public List<ModifiedIdentifyMeanType> getModifiedIdentifyMeanList() {
        return modifiedIdentifyMeanList;
    }

    /** 
     * Set the list of 'ModifiedIdentifyMean' element items. Характеристика нарушенного средства идентификации
     * 
     * @param list
     */
    public void setModifiedIdentifyMeanList(List<ModifiedIdentifyMeanType> list) {
        modifiedIdentifyMeanList = list;
    }
}
