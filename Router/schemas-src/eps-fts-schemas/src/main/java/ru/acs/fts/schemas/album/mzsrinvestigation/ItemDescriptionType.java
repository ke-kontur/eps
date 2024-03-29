
package ru.acs.fts.schemas.album.mzsrinvestigation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� �������������� ��������/����. ����������/����������
 */
public class ItemDescriptionType
{
    private List<String> nameList = new ArrayList<String>();
    private String internationalName;
    private String info;
    private LocalDate expitarionDate;
    private String cost;
    private CUOrganizationType producer;
    private SupplementaryQuantityType count;
    private DocumentBaseType gosRegistration;

    /** 
     * Get the list of 'Name' element items. ������������ �������������� ��������/����������
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. ������������ �������������� ��������/����������
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'InternationalName' element value. ������������� ��������������� ������������ �������������� ��������
     * 
     * @return value
     */
    public String getInternationalName() {
        return internationalName;
    }

    /** 
     * Set the 'InternationalName' element value. ������������� ��������������� ������������ �������������� ��������
     * 
     * @param internationalName
     */
    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName;
    }

    /** 
     * Get the 'Info' element value. ���������� (����� �������, ���������)
     * 
     * @return value
     */
    public String getInfo() {
        return info;
    }

    /** 
     * Set the 'Info' element value. ���������� (����� �������, ���������)
     * 
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /** 
     * Get the 'ExpitarionDate' element value. C��� ��������
     * 
     * @return value
     */
    public LocalDate getExpitarionDate() {
        return expitarionDate;
    }

    /** 
     * Set the 'ExpitarionDate' element value. C��� ��������
     * 
     * @param expitarionDate
     */
    public void setExpitarionDate(LocalDate expitarionDate) {
        this.expitarionDate = expitarionDate;
    }

    /** 
     * Get the 'Cost' element value. ���������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ���������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Producer' element value. ������������� �������������� ��������
     * 
     * @return value
     */
    public CUOrganizationType getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. ������������� �������������� ��������
     * 
     * @param producer
     */
    public void setProducer(CUOrganizationType producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'Count' element value. ����������
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. ����������
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }

    /** 
     * Get the 'GosRegistration' element value. ��������������� �����������
     * 
     * @return value
     */
    public DocumentBaseType getGosRegistration() {
        return gosRegistration;
    }

    /** 
     * Set the 'GosRegistration' element value. ��������������� �����������
     * 
     * @param gosRegistration
     */
    public void setGosRegistration(DocumentBaseType gosRegistration) {
        this.gosRegistration = gosRegistration;
    }
}
