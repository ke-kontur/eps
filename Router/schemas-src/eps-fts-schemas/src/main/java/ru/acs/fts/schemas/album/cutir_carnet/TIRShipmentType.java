
package ru.acs.fts.schemas.album.cutir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.IdentityMarkType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRDestinationType;

/** 
 * �������� � �������� ������
 */
public class TIRShipmentType
{
    private String containerIndicator;
    private List<String> containerIDList = new ArrayList<String>();
    private String totalPlacesQuantity;
    private CUOrganizationType TIRConsignor;
    private CUOrganizationType TIRConsignee;
    private TIRDestinationType destination;
    private List<TIRGoodsType> TIRGoodList = new ArrayList<TIRGoodsType>();
    private List<IdentityMarkType> identityMarkList = new ArrayList<IdentityMarkType>();

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
     * Get the list of 'ContainerID' element items. ����� ����������
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. ����� ����������
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the 'TotalPlacesQuantity' element value. ����� ����� ��������  ����
     * 
     * @return value
     */
    public String getTotalPlacesQuantity() {
        return totalPlacesQuantity;
    }

    /** 
     * Set the 'TotalPlacesQuantity' element value. ����� ����� ��������  ����
     * 
     * @param totalPlacesQuantity
     */
    public void setTotalPlacesQuantity(String totalPlacesQuantity) {
        this.totalPlacesQuantity = totalPlacesQuantity;
    }

    /** 
     * Get the 'TIRConsignor' element value. �������� �� �����������
     * 
     * @return value
     */
    public CUOrganizationType getTIRConsignor() {
        return TIRConsignor;
    }

    /** 
     * Set the 'TIRConsignor' element value. �������� �� �����������
     * 
     * @param TIRConsignor
     */
    public void setTIRConsignor(CUOrganizationType TIRConsignor) {
        this.TIRConsignor = TIRConsignor;
    }

    /** 
     * Get the 'TIRConsignee' element value. �������� � ����������
     * 
     * @return value
     */
    public CUOrganizationType getTIRConsignee() {
        return TIRConsignee;
    }

    /** 
     * Set the 'TIRConsignee' element value. �������� � ����������
     * 
     * @param TIRConsignee
     */
    public void setTIRConsignee(CUOrganizationType TIRConsignee) {
        this.TIRConsignee = TIRConsignee;
    }

    /** 
     * Get the 'Destination' element value. ����� ����������/��������
     * 
     * @return value
     */
    public TIRDestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. ����� ����������/��������
     * 
     * @param destination
     */
    public void setDestination(TIRDestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the list of 'TIRGoods' element items. ������ � ������ ���
     * 
     * @return list
     */
    public List<TIRGoodsType> getTIRGoodList() {
        return TIRGoodList;
    }

    /** 
     * Set the list of 'TIRGoods' element items. ������ � ������ ���
     * 
     * @param list
     */
    public void setTIRGoodList(List<TIRGoodsType> list) {
        TIRGoodList = list;
    }

    /** 
     * Get the list of 'IdentityMark' element items. ������ ��� ��������������� ����� (�����, �������������)
     * 
     * @return list
     */
    public List<IdentityMarkType> getIdentityMarkList() {
        return identityMarkList;
    }

    /** 
     * Set the list of 'IdentityMark' element items. ������ ��� ��������������� ����� (�����, �������������)
     * 
     * @param list
     */
    public void setIdentityMarkList(List<IdentityMarkType> list) {
        identityMarkList = list;
    }
}
