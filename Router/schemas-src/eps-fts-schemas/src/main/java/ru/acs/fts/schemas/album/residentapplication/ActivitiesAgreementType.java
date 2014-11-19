
package ru.acs.fts.schemas.album.residentapplication;

import org.joda.time.LocalDate;

/** 
 * —оглашение о ведении де€тельности 
 */
public class ActivitiesAgreementType
{
    private LocalDate agreementDate;
    private String agreementPlace;
    private String activitiesType;
    private String numberOfPages;

    /** 
     * Get the 'AgreementDate' element value. ƒата соглашени€ о ведении де€тельности 
     * 
     * @return value
     */
    public LocalDate getAgreementDate() {
        return agreementDate;
    }

    /** 
     * Set the 'AgreementDate' element value. ƒата соглашени€ о ведении де€тельности 
     * 
     * @param agreementDate
     */
    public void setAgreementDate(LocalDate agreementDate) {
        this.agreementDate = agreementDate;
    }

    /** 
     * Get the 'AgreementPlace' element value. ћесто заключени€ соглашени€ о ведении де€тельности 
     * 
     * @return value
     */
    public String getAgreementPlace() {
        return agreementPlace;
    }

    /** 
     * Set the 'AgreementPlace' element value. ћесто заключени€ соглашени€ о ведении де€тельности 
     * 
     * @param agreementPlace
     */
    public void setAgreementPlace(String agreementPlace) {
        this.agreementPlace = agreementPlace;
    }

    /** 
     * Get the 'ActivitiesType' element value. “ип де€тельности: 0 - промышленно-производственна€; 1 - технико-внедренческа€ 
     * 
     * @return value
     */
    public String getActivitiesType() {
        return activitiesType;
    }

    /** 
     * Set the 'ActivitiesType' element value. “ип де€тельности: 0 - промышленно-производственна€; 1 - технико-внедренческа€ 
     * 
     * @param activitiesType
     */
    public void setActivitiesType(String activitiesType) {
        this.activitiesType = activitiesType;
    }

    /** 
     * Get the 'NumberOfPages' element value.  оличество листов соглашени€ о ведении де€тельности 
     * 
     * @return value
     */
    public String getNumberOfPages() {
        return numberOfPages;
    }

    /** 
     * Set the 'NumberOfPages' element value.  оличество листов соглашени€ о ведении де€тельности 
     * 
     * @param numberOfPages
     */
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
