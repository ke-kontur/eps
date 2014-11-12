
package ru.acs.fts.schemas.album.ed_container;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������-���������
 */
public class EDContainerType extends BaseDocType
{
    private String fullSetIndicator;
    private List<String> xindicatorList = new ArrayList<String>();
    private List<ContainerDocType> containerDocList = new ArrayList<ContainerDocType>();
    private String documentModeID;

    /** 
     * Get the 'FullSetIndicator' element value. ������� ������� ��������� ����������. ������������ � �������� ������������ ��������������. ��� ������� ������� ���������� �� �����������.
     * 
     * @return value
     */
    public String getFullSetIndicator() {
        return fullSetIndicator;
    }

    /** 
     * Set the 'FullSetIndicator' element value. ������� ������� ��������� ����������. ������������ � �������� ������������ ��������������. ��� ������� ������� ���������� �� �����������.
     * 
     * @param fullSetIndicator
     */
    public void setFullSetIndicator(String fullSetIndicator) {
        this.fullSetIndicator = fullSetIndicator;
    }

    /** 
     * Get the list of 'Xindicator' element items. ������. ������������ � ����������� ������������� ��������.
     * 
     * @return list
     */
    public List<String> getXindicatorList() {
        return xindicatorList;
    }

    /** 
     * Set the list of 'Xindicator' element items. ������. ������������ � ����������� ������������� ��������.
     * 
     * @param list
     */
    public void setXindicatorList(List<String> list) {
        xindicatorList = list;
    }

    /** 
     * Get the list of 'ContainerDoc' element items.
     * 
     * @return list
     */
    public List<ContainerDocType> getContainerDocList() {
        return containerDocList;
    }

    /** 
     * Set the list of 'ContainerDoc' element items.
     * 
     * @param list
     */
    public void setContainerDocList(List<ContainerDocType> list) {
        containerDocList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
