
package ru.acs.fts.schemas.album.notifgoodsarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHPackingInformationType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHPalleteInformationType;

/** 
 * ���������� �� ���������
 */
public class ArrivePackingInformationType
{
    private String pakageQuantity;
    private String pakageTypeCode;
    private String pakagePartQuantity;
    private List<WHPackingInformationType> packingInformationList = new ArrayList<WHPackingInformationType>();
    private List<WHPackingInformationType> cargoList = new ArrayList<WHPackingInformationType>();
    private List<WHPalleteInformationType> palleteList = new ArrayList<WHPalleteInformationType>();

    /** 
     * Get the 'PakageQuantity' element value. ����� ���������� �������� ����, ��������� ������� �������.
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. ����� ���������� �������� ����, ��������� ������� �������.
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'PakageTypeCode' element value. ��� ������� �������� ������: 0 - ��� ��������; 1 - � ���������;  2 - ��� �������� � ������������� �������� ������������� ��������
     * 
     * @return value
     */
    public String getPakageTypeCode() {
        return pakageTypeCode;
    }

    /** 
     * Set the 'PakageTypeCode' element value. ��� ������� �������� ������: 0 - ��� ��������; 1 - � ���������;  2 - ��� �������� � ������������� �������� ������������� ��������
     * 
     * @param pakageTypeCode
     */
    public void setPakageTypeCode(String pakageTypeCode) {
        this.pakageTypeCode = pakageTypeCode;
    }

    /** 
     * Get the 'PakagePartQuantity' element value. ����� ���������� �������� ����, �������� ������� �������.
     * 
     * @return value
     */
    public String getPakagePartQuantity() {
        return pakagePartQuantity;
    }

    /** 
     * Set the 'PakagePartQuantity' element value. ����� ���������� �������� ����, �������� ������� �������.
     * 
     * @param pakagePartQuantity
     */
    public void setPakagePartQuantity(String pakagePartQuantity) {
        this.pakagePartQuantity = pakagePartQuantity;
    }

    /** 
     * Get the list of 'PackingInformation' element items. ���������� �� ���������
     * 
     * @return list
     */
    public List<WHPackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. ���������� �� ���������
     * 
     * @param list
     */
    public void setPackingInformationList(List<WHPackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the list of 'Cargo' element items. �������� � ���� ����� (��� �������� ������ ��� ��������)
     * 
     * @return list
     */
    public List<WHPackingInformationType> getCargoList() {
        return cargoList;
    }

    /** 
     * Set the list of 'Cargo' element items. �������� � ���� ����� (��� �������� ������ ��� ��������)
     * 
     * @param list
     */
    public void setCargoList(List<WHPackingInformationType> list) {
        cargoList = list;
    }

    /** 
     * Get the list of 'Pallete' element items. ���������� � �������� � ��������
     * 
     * @return list
     */
    public List<WHPalleteInformationType> getPalleteList() {
        return palleteList;
    }

    /** 
     * Set the list of 'Pallete' element items. ���������� � �������� � ��������
     * 
     * @param list
     */
    public void setPalleteList(List<WHPalleteInformationType> list) {
        palleteList = list;
    }
}
