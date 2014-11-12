
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������� ������, � �������� �������
 */
public class GoodsPackagingType
{
    private String pakageQuantity;
    private String cargoCode;
    private String cargoDescription;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();

    /** 
     * Get the 'PakageQuantity' element value. ���������� �������� ����.
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. ���������� �������� ����.
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'CargoCode' element value. ��� ���� ����� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @return value
     */
    public String getCargoCode() {
        return cargoCode;
    }

    /** 
     * Set the 'CargoCode' element value. ��� ���� ����� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @param cargoCode
     */
    public void setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode;
    }

    /** 
     * Get the 'CargoDescription' element value. �������� ���� �����.
     * 
     * @return value
     */
    public String getCargoDescription() {
        return cargoDescription;
    }

    /** 
     * Set the 'CargoDescription' element value. �������� ���� �����.
     * 
     * @param cargoDescription
     */
    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    /** 
     * Get the list of 'PackingInformation' element items. �������� �� �������� �������. ���, ����������. ����������
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. �������� �� �������� �������. ���, ����������. ����������
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }
}
