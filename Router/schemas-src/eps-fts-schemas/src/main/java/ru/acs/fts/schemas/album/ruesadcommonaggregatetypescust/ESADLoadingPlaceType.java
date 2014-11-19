
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �� � ��. ������� ������. ����� ��������/��������� ������. ��.27.
 */
public class ESADLoadingPlaceType
{
    private String informationTypeCode;
    private int choiceSelect = -1;
    private static final int LOADING_PLACE_WAREHOUSE_CHOICE = 0;
    private static final int LOADING_PLASE_CONSIGNEE_CHOICE = 1;
    private static final int LOADING_PLACE_OTHER_LIST_CHOICE = 2;
    private WarehousePlaceType loadingPlaceWarehouse;
    private LoadingPlaseConsigneeType loadingPlaseConsignee;
    private List<LoadingPlaceOtherType> loadingPlaceOtherList = new ArrayList<LoadingPlaceOtherType>();

    /** 
     * Get the 'InformationTypeCode' element value. ��� ����������: 11- ���;  21- ��; 25 - ��������� �����; 31- ����� ����������; 39 - ����� ����; 59 - ���� �����
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. ��� ����������: 11- ���;  21- ��; 25 - ��������� �����; 31- ����� ����������; 39 - ����� ����; 59 - ���� �����
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if LoadingPlaceWarehouse is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifLoadingPlaceWarehouse() {
        return choiceSelect == LOADING_PLACE_WAREHOUSE_CHOICE;
    }

    /** 
     * Get the 'LoadingPlaceWarehouse' element value. �������� � ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @return value
     */
    public WarehousePlaceType getLoadingPlaceWarehouse() {
        return loadingPlaceWarehouse;
    }

    /** 
     * Set the 'LoadingPlaceWarehouse' element value. �������� � ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @param loadingPlaceWarehouse
     */
    public void setLoadingPlaceWarehouse(
            WarehousePlaceType loadingPlaceWarehouse) {
        setChoiceSelect(LOADING_PLACE_WAREHOUSE_CHOICE);
        this.loadingPlaceWarehouse = loadingPlaceWarehouse;
    }

    /** 
     * Check if LoadingPlaseConsignee is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifLoadingPlaseConsignee() {
        return choiceSelect == LOADING_PLASE_CONSIGNEE_CHOICE;
    }

    /** 
     * Get the 'LoadingPlaseConsignee' element value. ����� �������� /���������. ��� �� ���� ���������� ������ �������� �� /  ��� ��, ���� �������� �������������� �� ������ ����������.
     * 
     * @return value
     */
    public LoadingPlaseConsigneeType getLoadingPlaseConsignee() {
        return loadingPlaseConsignee;
    }

    /** 
     * Set the 'LoadingPlaseConsignee' element value. ����� �������� /���������. ��� �� ���� ���������� ������ �������� �� /  ��� ��, ���� �������� �������������� �� ������ ����������.
     * 
     * @param loadingPlaseConsignee
     */
    public void setLoadingPlaseConsignee(
            LoadingPlaseConsigneeType loadingPlaseConsignee) {
        setChoiceSelect(LOADING_PLASE_CONSIGNEE_CHOICE);
        this.loadingPlaseConsignee = loadingPlaseConsignee;
    }

    /** 
     * Check if LoadingPlaceOtherList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifLoadingPlaceOtherList() {
        return choiceSelect == LOADING_PLACE_OTHER_LIST_CHOICE;
    }

    /** 
     * Get the list of 'LoadingPlaceOther' element items. ���� ����� �������� �������.
     * 
     * @return list
     */
    public List<LoadingPlaceOtherType> getLoadingPlaceOtherList() {
        return loadingPlaceOtherList;
    }

    /** 
     * Set the list of 'LoadingPlaceOther' element items. ���� ����� �������� �������.
     * 
     * @param list
     */
    public void setLoadingPlaceOtherList(List<LoadingPlaceOtherType> list) {
        setChoiceSelect(LOADING_PLACE_OTHER_LIST_CHOICE);
        loadingPlaceOtherList = list;
    }
}
