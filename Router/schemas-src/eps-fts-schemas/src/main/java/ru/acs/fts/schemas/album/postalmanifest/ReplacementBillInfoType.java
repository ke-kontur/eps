
package ru.acs.fts.schemas.album.postalmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ���������� ���������
 */
public class ReplacementBillInfoType
{
    private String formingAircompany;
    private String submitAirport;
    private List<String> remarkList = new ArrayList<String>();
    private String operatorSupplyCountry;

    /** 
     * Get the 'FormingAircompany' element value. ������������, ������������ ���������� ���������
     * 
     * @return value
     */
    public String getFormingAircompany() {
        return formingAircompany;
    }

    /** 
     * Set the 'FormingAircompany' element value. ������������, ������������ ���������� ���������
     * 
     * @param formingAircompany
     */
    public void setFormingAircompany(String formingAircompany) {
        this.formingAircompany = formingAircompany;
    }

    /** 
     * Get the 'SubmitAirport' element value. �������� ������ ���������� ���������
     * 
     * @return value
     */
    public String getSubmitAirport() {
        return submitAirport;
    }

    /** 
     * Set the 'SubmitAirport' element value. �������� ������ ���������� ���������
     * 
     * @param submitAirport
     */
    public void setSubmitAirport(String submitAirport) {
        this.submitAirport = submitAirport;
    }

    /** 
     * Get the list of 'Remarks' element items. ���������, ���������� ��������� �����
     * 
     * @return list
     */
    public List<String> getRemarkList() {
        return remarkList;
    }

    /** 
     * Set the list of 'Remarks' element items. ���������, ���������� ��������� �����
     * 
     * @param list
     */
    public void setRemarkList(List<String> list) {
        remarkList = list;
    }

    /** 
     * Get the 'OperatorSupplyCountry' element value. ����������� �������� ������ ������ �����
     * 
     * @return value
     */
    public String getOperatorSupplyCountry() {
        return operatorSupplyCountry;
    }

    /** 
     * Set the 'OperatorSupplyCountry' element value. ����������� �������� ������ ������ �����
     * 
     * @param operatorSupplyCountry
     */
    public void setOperatorSupplyCountry(String operatorSupplyCountry) {
        this.operatorSupplyCountry = operatorSupplyCountry;
    }
}
