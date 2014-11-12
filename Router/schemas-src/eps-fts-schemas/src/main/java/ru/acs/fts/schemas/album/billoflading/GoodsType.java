
package ru.acs.fts.schemas.album.billoflading;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TransportGoodsType;

/** 
 * �������� ������.
 */
public class GoodsType extends TransportGoodsType
{
    private String placesQuantity;
    private String grossWeightQuantity;
    private String packingDescription;
    private List<String> containerNumList = new ArrayList<String>();
    private String polletQuantity;
    private List<String> UNnumberList = new ArrayList<String>();

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'PackingDescription' element value. �������� ��������  ����, ������ � ������� ����, ��������� �������� � ������ ��������� �����.
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. �������� ��������  ����, ������ � ������� ����, ��������� �������� � ������ ��������� �����.
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }

    /** 
     * Get the list of 'ContainerNum' element items. ����� ���������� 
     * 
     * @return list
     */
    public List<String> getContainerNumList() {
        return containerNumList;
    }

    /** 
     * Set the list of 'ContainerNum' element items. ����� ���������� 
     * 
     * @param list
     */
    public void setContainerNumList(List<String> list) {
        containerNumList = list;
    }

    /** 
     * Get the 'PolletQuantity' element value. ���������� ������ (��������)
     * 
     * @return value
     */
    public String getPolletQuantity() {
        return polletQuantity;
    }

    /** 
     * Set the 'PolletQuantity' element value. ���������� ������ (��������)
     * 
     * @param polletQuantity
     */
    public void setPolletQuantity(String polletQuantity) {
        this.polletQuantity = polletQuantity;
    }

    /** 
     * Get the list of 'UNnumber' element items. ������������� ��������� �������� �� ������������ ���
     * 
     * @return list
     */
    public List<String> getUNnumberList() {
        return UNnumberList;
    }

    /** 
     * Set the list of 'UNnumber' element items. ������������� ��������� �������� �� ������������ ���
     * 
     * @param list
     */
    public void setUNnumberList(List<String> list) {
        UNnumberList = list;
    }
}
