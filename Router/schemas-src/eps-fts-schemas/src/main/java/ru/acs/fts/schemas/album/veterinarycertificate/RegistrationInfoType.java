
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;

/** 
 * Сведения о регистрации
 */
public class RegistrationInfoType
{
    private String registrationNumber;
    private LocalDate issueDate;
    private String territorialAuthority;
    private String competentAuthority;
    private String issueCountry;

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дату выдачи сертификата
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дату выдачи сертификата
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'TerritorialAuthority' element value. Наименование территориального органа Россельхознадзора / Учреждение страны - экспортера, выдавшее сертификат
     * 
     * @return value
     */
    public String getTerritorialAuthority() {
        return territorialAuthority;
    }

    /** 
     * Set the 'TerritorialAuthority' element value. Наименование территориального органа Россельхознадзора / Учреждение страны - экспортера, выдавшее сертификат
     * 
     * @param territorialAuthority
     */
    public void setTerritorialAuthority(String territorialAuthority) {
        this.territorialAuthority = territorialAuthority;
    }

    /** 
     * Get the 'CompetentAuthority' element value. Компетентное ведомство страны - экспортера
     * 
     * @return value
     */
    public String getCompetentAuthority() {
        return competentAuthority;
    }

    /** 
     * Set the 'CompetentAuthority' element value. Компетентное ведомство страны - экспортера
     * 
     * @param competentAuthority
     */
    public void setCompetentAuthority(String competentAuthority) {
        this.competentAuthority = competentAuthority;
    }

    /** 
     * Get the 'IssueCountry' element value. Страна, выдавшая сертификат
     * 
     * @return value
     */
    public String getIssueCountry() {
        return issueCountry;
    }

    /** 
     * Set the 'IssueCountry' element value. Страна, выдавшая сертификат
     * 
     * @param issueCountry
     */
    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }
}
