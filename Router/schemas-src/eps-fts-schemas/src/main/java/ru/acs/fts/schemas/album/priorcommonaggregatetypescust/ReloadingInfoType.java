
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ����������� ����������� ������� ��� ���� �������� ��������� � ����
 */
public class ReloadingInfoType
{
    private String reloadCountryCode;
    private String reloadCountryName;
    private String reloadCustomsCode;
    private String reloadCustomsName;
    private String containerIndicator;
    private List<String> containerIDList = new ArrayList<String>();
    private List<TransportMeansType> reloadTransportMeanList = new ArrayList<TransportMeansType>();

    /** 
     * Get the 'ReloadCountryCode' element value. ��� ������ ���������� �������
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. ��� ������ ���������� �������
     * 
     * @param reloadCountryCode
     */
    public void setReloadCountryCode(String reloadCountryCode) {
        this.reloadCountryCode = reloadCountryCode;
    }

    /** 
     * Get the 'ReloadCountryName' element value. ������������ ������ ���������� ������
     * 
     * @return value
     */
    public String getReloadCountryName() {
        return reloadCountryName;
    }

    /** 
     * Set the 'ReloadCountryName' element value. ������������ ������ ���������� ������
     * 
     * @param reloadCountryName
     */
    public void setReloadCountryName(String reloadCountryName) {
        this.reloadCountryName = reloadCountryName;
    }

    /** 
     * Get the 'ReloadCustomsCode' element value. ��� ����������� ������ ���������� �������
     * 
     * @return value
     */
    public String getReloadCustomsCode() {
        return reloadCustomsCode;
    }

    /** 
     * Set the 'ReloadCustomsCode' element value. ��� ����������� ������ ���������� �������
     * 
     * @param reloadCustomsCode
     */
    public void setReloadCustomsCode(String reloadCustomsCode) {
        this.reloadCustomsCode = reloadCustomsCode;
    }

    /** 
     * Get the 'ReloadCustomsName' element value. ������������ ����������� ������ ���������� �������
     * 
     * @return value
     */
    public String getReloadCustomsName() {
        return reloadCustomsName;
    }

    /** 
     * Set the 'ReloadCustomsName' element value. ������������ ����������� ������ ���������� �������
     * 
     * @param reloadCustomsName
     */
    public void setReloadCustomsName(String reloadCustomsName) {
        this.reloadCustomsName = reloadCustomsName;
    }

    /** 
     * Get the 'ContainerIndicator' element value. ������� ������������ ���������
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. ������� ������������ ���������
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the list of 'ContainerID' element items. ����� ������ ����������
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. ����� ������ ����������
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the list of 'ReloadTransportMeans' element items. ����� ������������ ��������
     * 
     * @return list
     */
    public List<TransportMeansType> getReloadTransportMeanList() {
        return reloadTransportMeanList;
    }

    /** 
     * Set the list of 'ReloadTransportMeans' element items. ����� ������������ ��������
     * 
     * @param list
     */
    public void setReloadTransportMeanList(List<TransportMeansType> list) {
        reloadTransportMeanList = list;
    }
}
