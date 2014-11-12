
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ���������� � ���������� �������. ��. 55 ��
 */
public class ESADReloadingInfoType
{
    private String reloadCountryCode;
    private String reloadCountryName;
    private String containerIndicator;
    private List<TransportMeansBaseType> reloadingTransportMeanList = new ArrayList<TransportMeansBaseType>();
    private CustomsType reloadingCustomsOffice;
    private ESADReloadContainerType reloadContainer;

    /** 
     * Get the 'ReloadCountryCode' element value. ��� ������ ���������� ������
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. ��� ������ ���������� ������
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
     * Get the list of 'ReloadingTransportMeans' element items. ����� ������������ ��������
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getReloadingTransportMeanList() {
        return reloadingTransportMeanList;
    }

    /** 
     * Set the list of 'ReloadingTransportMeans' element items. ����� ������������ ��������
     * 
     * @param list
     */
    public void setReloadingTransportMeanList(List<TransportMeansBaseType> list) {
        reloadingTransportMeanList = list;
    }

    /** 
     * Get the 'ReloadingCustomsOffice' element value. ���������� ����� ���������� �������
     * 
     * @return value
     */
    public CustomsType getReloadingCustomsOffice() {
        return reloadingCustomsOffice;
    }

    /** 
     * Set the 'ReloadingCustomsOffice' element value. ���������� ����� ���������� �������
     * 
     * @param reloadingCustomsOffice
     */
    public void setReloadingCustomsOffice(CustomsType reloadingCustomsOffice) {
        this.reloadingCustomsOffice = reloadingCustomsOffice;
    }

    /** 
     * Get the 'ReloadContainer' element value. �������� � ����� �����������
     * 
     * @return value
     */
    public ESADReloadContainerType getReloadContainer() {
        return reloadContainer;
    }

    /** 
     * Set the 'ReloadContainer' element value. �������� � ����� �����������
     * 
     * @param reloadContainer
     */
    public void setReloadContainer(ESADReloadContainerType reloadContainer) {
        this.reloadContainer = reloadContainer;
    }
}
