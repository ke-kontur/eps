
package ru.acs.fts.schemas.album.sertifst1form;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �� ������������� �����������
 */
public class SertifInfType
{
    private String organizationName;
    private LocalDate dateInf;
    private String FIO;
    private String signPlace;
    private AddressType place;

    /** 
     * Get the 'OrganizationName' element value. ������������ ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'DateInf' element value. ���� ������������� ���������
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ������������� ���������
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'FIO' element value. ��� ���� ��������������� ����������
     * 
     * @return value
     */
    public String getFIO() {
        return FIO;
    }

    /** 
     * Set the 'FIO' element value. ��� ���� ��������������� ����������
     * 
     * @param FIO
     */
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    /** 
     * Get the 'SignPlace' element value. �����  �������
     * 
     * @return value
     */
    public String getSignPlace() {
        return signPlace;
    }

    /** 
     * Set the 'SignPlace' element value. �����  �������
     * 
     * @param signPlace
     */
    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    /** 
     * Get the 'Place' element value. ����� ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @return value
     */
    public AddressType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @param place
     */
    public void setPlace(AddressType place) {
        this.place = place;
    }
}
