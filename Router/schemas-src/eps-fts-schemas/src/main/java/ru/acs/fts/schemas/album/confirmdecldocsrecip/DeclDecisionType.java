
package ru.acs.fts.schemas.album.confirmdecldocsrecip;

import org.joda.time.LocalDate;

/** 
 * ������� ����������
 */
public class DeclDecisionType
{
    private String declAgree;
    private LocalDate declDate;
    private String declTime;
    private InspectionPlaceType inspectionPlace;

    /** 
     * Get the 'DeclAgree' element value. ������� �������� ���������� ������� �� �������
     * 
     * @return value
     */
    public String getDeclAgree() {
        return declAgree;
    }

    /** 
     * Set the 'DeclAgree' element value. ������� �������� ���������� ������� �� �������
     * 
     * @param declAgree
     */
    public void setDeclAgree(String declAgree) {
        this.declAgree = declAgree;
    }

    /** 
     * Get the 'DeclDate' element value. ���� �������� ���������� �� �������
     * 
     * @return value
     */
    public LocalDate getDeclDate() {
        return declDate;
    }

    /** 
     * Set the 'DeclDate' element value. ���� �������� ���������� �� �������
     * 
     * @param declDate
     */
    public void setDeclDate(LocalDate declDate) {
        this.declDate = declDate;
    }

    /** 
     * Get the 'DeclTime' element value. ����� �������� ���������� �� �������
     * 
     * @return value
     */
    public String getDeclTime() {
        return declTime;
    }

    /** 
     * Set the 'DeclTime' element value. ����� �������� ���������� �� �������
     * 
     * @param declTime
     */
    public void setDeclTime(String declTime) {
        this.declTime = declTime;
    }

    /** 
     * Get the 'InspectionPlace' element value. �������� ����� ���������� ��������
     * 
     * @return value
     */
    public InspectionPlaceType getInspectionPlace() {
        return inspectionPlace;
    }

    /** 
     * Set the 'InspectionPlace' element value. �������� ����� ���������� ��������
     * 
     * @param inspectionPlace
     */
    public void setInspectionPlace(InspectionPlaceType inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }
}
