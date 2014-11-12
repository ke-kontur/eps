
package ru.acs.fts.schemas.album.residentapplication;

import org.joda.time.LocalDate;

/** 
 * Соглашение о ведении деятельности 
 */
public class ActivitiesAgreementType
{
    private LocalDate agreementDate;
    private String agreementPlace;
    private String activitiesType;
    private String numberOfPages;

    /** 
     * Get the 'AgreementDate' element value. Дата соглашения о ведении деятельности 
     * 
     * @return value
     */
    public LocalDate getAgreementDate() {
        return agreementDate;
    }

    /** 
     * Set the 'AgreementDate' element value. Дата соглашения о ведении деятельности 
     * 
     * @param agreementDate
     */
    public void setAgreementDate(LocalDate agreementDate) {
        this.agreementDate = agreementDate;
    }

    /** 
     * Get the 'AgreementPlace' element value. Место заключения соглашения о ведении деятельности 
     * 
     * @return value
     */
    public String getAgreementPlace() {
        return agreementPlace;
    }

    /** 
     * Set the 'AgreementPlace' element value. Место заключения соглашения о ведении деятельности 
     * 
     * @param agreementPlace
     */
    public void setAgreementPlace(String agreementPlace) {
        this.agreementPlace = agreementPlace;
    }

    /** 
     * Get the 'ActivitiesType' element value. Тип деятельности: 0 - промышленно-производственная; 1 - технико-внедренческая 
     * 
     * @return value
     */
    public String getActivitiesType() {
        return activitiesType;
    }

    /** 
     * Set the 'ActivitiesType' element value. Тип деятельности: 0 - промышленно-производственная; 1 - технико-внедренческая 
     * 
     * @param activitiesType
     */
    public void setActivitiesType(String activitiesType) {
        this.activitiesType = activitiesType;
    }

    /** 
     * Get the 'NumberOfPages' element value. Количество листов соглашения о ведении деятельности 
     * 
     * @return value
     */
    public String getNumberOfPages() {
        return numberOfPages;
    }

    /** 
     * Set the 'NumberOfPages' element value. Количество листов соглашения о ведении деятельности 
     * 
     * @param numberOfPages
     */
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
