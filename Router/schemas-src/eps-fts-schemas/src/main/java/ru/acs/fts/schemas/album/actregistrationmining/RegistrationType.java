
package ru.acs.fts.schemas.album.actregistrationmining;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �����������
 */
public class RegistrationType
{
    private LocalDate startDate;
    private LocalDate endDate;
    private String action;
    private List<ResolutionType> resolutionList = new ArrayList<ResolutionType>();
    private List<ProductListType> productList = new ArrayList<ProductListType>();

    /** 
     * Get the 'StartDate' element value. ���� ������ �������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ �������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Action' element value. � ���� ���� ������ (������) ������ ����������� ��� �������������: 1- ������������� �����������; 2- ����������� �����������; 3-����������� � ������-����������������� � ����������� ����� � ������������ � ������������.
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. � ���� ���� ������ (������) ������ ����������� ��� �������������: 1- ������������� �����������; 2- ����������� �����������; 3-����������� � ������-����������������� � ����������� ����� � ������������ � ������������.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /** 
     * Get the list of 'Resolution' element items. ����������
     * 
     * @return list
     */
    public List<ResolutionType> getResolutionList() {
        return resolutionList;
    }

    /** 
     * Set the list of 'Resolution' element items. ����������
     * 
     * @param list
     */
    public void setResolutionList(List<ResolutionType> list) {
        resolutionList = list;
    }

    /** 
     * Get the list of 'ProductList' element items. ���� ������������������ ���������
     * 
     * @return list
     */
    public List<ProductListType> getProductList() {
        return productList;
    }

    /** 
     * Set the list of 'ProductList' element items. ���� ������������������ ���������
     * 
     * @param list
     */
    public void setProductList(List<ProductListType> list) {
        productList = list;
    }
}
