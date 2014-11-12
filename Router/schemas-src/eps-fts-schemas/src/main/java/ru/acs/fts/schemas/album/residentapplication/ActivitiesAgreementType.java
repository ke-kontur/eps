
package ru.acs.fts.schemas.album.residentapplication;

import org.joda.time.LocalDate;

/** 
 * ���������� � ������� ������������ 
 */
public class ActivitiesAgreementType
{
    private LocalDate agreementDate;
    private String agreementPlace;
    private String activitiesType;
    private String numberOfPages;

    /** 
     * Get the 'AgreementDate' element value. ���� ���������� � ������� ������������ 
     * 
     * @return value
     */
    public LocalDate getAgreementDate() {
        return agreementDate;
    }

    /** 
     * Set the 'AgreementDate' element value. ���� ���������� � ������� ������������ 
     * 
     * @param agreementDate
     */
    public void setAgreementDate(LocalDate agreementDate) {
        this.agreementDate = agreementDate;
    }

    /** 
     * Get the 'AgreementPlace' element value. ����� ���������� ���������� � ������� ������������ 
     * 
     * @return value
     */
    public String getAgreementPlace() {
        return agreementPlace;
    }

    /** 
     * Set the 'AgreementPlace' element value. ����� ���������� ���������� � ������� ������������ 
     * 
     * @param agreementPlace
     */
    public void setAgreementPlace(String agreementPlace) {
        this.agreementPlace = agreementPlace;
    }

    /** 
     * Get the 'ActivitiesType' element value. ��� ������������: 0 - �����������-����������������; 1 - �������-������������� 
     * 
     * @return value
     */
    public String getActivitiesType() {
        return activitiesType;
    }

    /** 
     * Set the 'ActivitiesType' element value. ��� ������������: 0 - �����������-����������������; 1 - �������-������������� 
     * 
     * @param activitiesType
     */
    public void setActivitiesType(String activitiesType) {
        this.activitiesType = activitiesType;
    }

    /** 
     * Get the 'NumberOfPages' element value. ���������� ������ ���������� � ������� ������������ 
     * 
     * @return value
     */
    public String getNumberOfPages() {
        return numberOfPages;
    }

    /** 
     * Set the 'NumberOfPages' element value. ���������� ������ ���������� � ������� ������������ 
     * 
     * @param numberOfPages
     */
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
