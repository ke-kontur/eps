
package ru.acs.fts.schemas.album.minpromlicence;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ������ ���������� � �������� (�������� ������������)
 */
public class LicAddendumItemType
{
    private String positionNumber;
    private List<String> commodityNameList = new ArrayList<String>();
    private String cost;
    private String pageNumber;
    private List<SupplementaryQuantityType> licAddendumMeasureItemList = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'PositionNumber' element value. ����� �������
     * 
     * @return value
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /** 
     * Set the 'PositionNumber' element value. ����� �������
     * 
     * @param positionNumber
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    /** 
     * Get the list of 'CommodityName' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getCommodityNameList() {
        return commodityNameList;
    }

    /** 
     * Set the list of 'CommodityName' element items. �������� ������
     * 
     * @param list
     */
    public void setCommodityNameList(List<String> list) {
        commodityNameList = list;
    }

    /** 
     * Get the 'Cost' element value. ��������� ������ � ������ ��������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ��������� ������ � ������ ��������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'PageNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /** 
     * Set the 'PageNumber' element value. ����� �����
     * 
     * @param pageNumber
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /** 
     * Get the list of 'LicAddendumMeasureItem' element items. ������� ��������� � ����������
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getLicAddendumMeasureItemList() {
        return licAddendumMeasureItemList;
    }

    /** 
     * Set the list of 'LicAddendumMeasureItem' element items. ������� ��������� � ����������
     * 
     * @param list
     */
    public void setLicAddendumMeasureItemList(
            List<SupplementaryQuantityType> list) {
        licAddendumMeasureItemList = list;
    }
}
