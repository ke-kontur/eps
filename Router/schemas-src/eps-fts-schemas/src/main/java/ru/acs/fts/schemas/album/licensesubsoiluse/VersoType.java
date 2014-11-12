
package ru.acs.fts.schemas.album.licensesubsoiluse;

import java.util.ArrayList;
import java.util.List;

/** 
 * Оборотная сторона
 */
public class VersoType
{
    private String termsSubsoil;
    private String copySolutions;
    private String locationPlot;
    private String copyJuridicalPersonRegistrationCertificate;
    private String copyTaxOrganRegistrationCertificate;
    private String areaInfo;
    private String listPreviousUser;
    private String userInfo;
    private List<OtherApplicationsType> otherApplicationList = new ArrayList<OtherApplicationsType>();

    /** 
     * Get the 'TermsSubsoil' element value. Условия пользования недрами
     * 
     * @return value
     */
    public String getTermsSubsoil() {
        return termsSubsoil;
    }

    /** 
     * Set the 'TermsSubsoil' element value. Условия пользования недрами
     * 
     * @param termsSubsoil
     */
    public void setTermsSubsoil(String termsSubsoil) {
        this.termsSubsoil = termsSubsoil;
    }

    /** 
     * Get the 'CopySolutions' element value. Копия  решения,  являющегося  основанием  предоставления  лицензии,
     * 
     * @return value
     */
    public String getCopySolutions() {
        return copySolutions;
    }

    /** 
     * Set the 'CopySolutions' element value. Копия  решения,  являющегося  основанием  предоставления  лицензии,
     * 
     * @param copySolutions
     */
    public void setCopySolutions(String copySolutions) {
        this.copySolutions = copySolutions;
    }

    /** 
     * Get the 'LocationPlot' element value. Схема расположения участка недр 
     * 
     * @return value
     */
    public String getLocationPlot() {
        return locationPlot;
    }

    /** 
     * Set the 'LocationPlot' element value. Схема расположения участка недр 
     * 
     * @param locationPlot
     */
    public void setLocationPlot(String locationPlot) {
        this.locationPlot = locationPlot;
    }

    /** 
     * Get the 'CopyJuridicalPersonRegistrationCertificate' element value. Копия свидетельства о государственной регистрации юридического лица
     * 
     * @return value
     */
    public String getCopyJuridicalPersonRegistrationCertificate() {
        return copyJuridicalPersonRegistrationCertificate;
    }

    /** 
     * Set the 'CopyJuridicalPersonRegistrationCertificate' element value. Копия свидетельства о государственной регистрации юридического лица
     * 
     * @param copyJuridicalPersonRegistrationCertificate
     */
    public void setCopyJuridicalPersonRegistrationCertificate(
            String copyJuridicalPersonRegistrationCertificate) {
        this.copyJuridicalPersonRegistrationCertificate = copyJuridicalPersonRegistrationCertificate;
    }

    /** 
     * Get the 'CopyTaxOrganRegistrationCertificate' element value. Копия свидетельства о постановке пользователя недр на налоговый учет
     * 
     * @return value
     */
    public String getCopyTaxOrganRegistrationCertificate() {
        return copyTaxOrganRegistrationCertificate;
    }

    /** 
     * Set the 'CopyTaxOrganRegistrationCertificate' element value. Копия свидетельства о постановке пользователя недр на налоговый учет
     * 
     * @param copyTaxOrganRegistrationCertificate
     */
    public void setCopyTaxOrganRegistrationCertificate(
            String copyTaxOrganRegistrationCertificate) {
        this.copyTaxOrganRegistrationCertificate = copyTaxOrganRegistrationCertificate;
    }

    /** 
     * Get the 'AreaInfo' element value. Документ, содержащий  сведения  об   участке  недр
     * 
     * @return value
     */
    public String getAreaInfo() {
        return areaInfo;
    }

    /** 
     * Set the 'AreaInfo' element value. Документ, содержащий  сведения  об   участке  недр
     * 
     * @param areaInfo
     */
    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }

    /** 
     * Get the 'ListPreviousUser' element value. Перечисление  предыдущих  пользователей  данным участком недр 
     * 
     * @return value
     */
    public String getListPreviousUser() {
        return listPreviousUser;
    }

    /** 
     * Set the 'ListPreviousUser' element value. Перечисление  предыдущих  пользователей  данным участком недр 
     * 
     * @param listPreviousUser
     */
    public void setListPreviousUser(String listPreviousUser) {
        this.listPreviousUser = listPreviousUser;
    }

    /** 
     * Get the 'UserInfo' element value. Краткая  справка о пользователе недр
     * 
     * @return value
     */
    public String getUserInfo() {
        return userInfo;
    }

    /** 
     * Set the 'UserInfo' element value. Краткая  справка о пользователе недр
     * 
     * @param userInfo
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    /** 
     * Get the list of 'OtherApplications' element items. Иные приложения 
     * 
     * @return list
     */
    public List<OtherApplicationsType> getOtherApplicationList() {
        return otherApplicationList;
    }

    /** 
     * Set the list of 'OtherApplications' element items. Иные приложения 
     * 
     * @param list
     */
    public void setOtherApplicationList(List<OtherApplicationsType> list) {
        otherApplicationList = list;
    }
}
