
package ru.acs.fts.schemas.album.notifarrivalintegrityseal;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ��������� ������� �������������
 */
public class IdentifModificationType
{
    private String modificationInfo;
    private List<String> containerList = new ArrayList<String>();
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();
    private List<ModifiedIdentifyMeanType> modifiedIdentifyMeanList = new ArrayList<ModifiedIdentifyMeanType>();

    /** 
     * Get the 'ModificationInfo' element value. �������� ����������� ����� ��������� ������� �������������
     * 
     * @return value
     */
    public String getModificationInfo() {
        return modificationInfo;
    }

    /** 
     * Set the 'ModificationInfo' element value. �������� ����������� ����� ��������� ������� �������������
     * 
     * @param modificationInfo
     */
    public void setModificationInfo(String modificationInfo) {
        this.modificationInfo = modificationInfo;
    }

    /** 
     * Get the list of 'Container' element items. ����� (�������������) ����������(��), �� ������� �������� �������� �������������
     * 
     * @return list
     */
    public List<String> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. ����� (�������������) ����������(��), �� ������� �������� �������� �������������
     * 
     * @param list
     */
    public void setContainerList(List<String> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'TransportMean' element items. ������������ ��������, �� ������� �������� �������� �������������
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMean' element items. ������������ ��������, �� ������� �������� �������� �������������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'ModifiedIdentifyMean' element items. �������������� ����������� �������� �������������
     * 
     * @return list
     */
    public List<ModifiedIdentifyMeanType> getModifiedIdentifyMeanList() {
        return modifiedIdentifyMeanList;
    }

    /** 
     * Set the list of 'ModifiedIdentifyMean' element items. �������������� ����������� �������� �������������
     * 
     * @param list
     */
    public void setModifiedIdentifyMeanList(List<ModifiedIdentifyMeanType> list) {
        modifiedIdentifyMeanList = list;
    }
}
