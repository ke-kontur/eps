
package ru.acs.fts.schemas.album.licensesubsoiluse;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� �������
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
     * Get the 'TermsSubsoil' element value. ������� ����������� �������
     * 
     * @return value
     */
    public String getTermsSubsoil() {
        return termsSubsoil;
    }

    /** 
     * Set the 'TermsSubsoil' element value. ������� ����������� �������
     * 
     * @param termsSubsoil
     */
    public void setTermsSubsoil(String termsSubsoil) {
        this.termsSubsoil = termsSubsoil;
    }

    /** 
     * Get the 'CopySolutions' element value. �����  �������,  �����������  ����������  ��������������  ��������,
     * 
     * @return value
     */
    public String getCopySolutions() {
        return copySolutions;
    }

    /** 
     * Set the 'CopySolutions' element value. �����  �������,  �����������  ����������  ��������������  ��������,
     * 
     * @param copySolutions
     */
    public void setCopySolutions(String copySolutions) {
        this.copySolutions = copySolutions;
    }

    /** 
     * Get the 'LocationPlot' element value. ����� ������������ ������� ���� 
     * 
     * @return value
     */
    public String getLocationPlot() {
        return locationPlot;
    }

    /** 
     * Set the 'LocationPlot' element value. ����� ������������ ������� ���� 
     * 
     * @param locationPlot
     */
    public void setLocationPlot(String locationPlot) {
        this.locationPlot = locationPlot;
    }

    /** 
     * Get the 'CopyJuridicalPersonRegistrationCertificate' element value. ����� ������������� � ��������������� ����������� ������������ ����
     * 
     * @return value
     */
    public String getCopyJuridicalPersonRegistrationCertificate() {
        return copyJuridicalPersonRegistrationCertificate;
    }

    /** 
     * Set the 'CopyJuridicalPersonRegistrationCertificate' element value. ����� ������������� � ��������������� ����������� ������������ ����
     * 
     * @param copyJuridicalPersonRegistrationCertificate
     */
    public void setCopyJuridicalPersonRegistrationCertificate(
            String copyJuridicalPersonRegistrationCertificate) {
        this.copyJuridicalPersonRegistrationCertificate = copyJuridicalPersonRegistrationCertificate;
    }

    /** 
     * Get the 'CopyTaxOrganRegistrationCertificate' element value. ����� ������������� � ���������� ������������ ���� �� ��������� ����
     * 
     * @return value
     */
    public String getCopyTaxOrganRegistrationCertificate() {
        return copyTaxOrganRegistrationCertificate;
    }

    /** 
     * Set the 'CopyTaxOrganRegistrationCertificate' element value. ����� ������������� � ���������� ������������ ���� �� ��������� ����
     * 
     * @param copyTaxOrganRegistrationCertificate
     */
    public void setCopyTaxOrganRegistrationCertificate(
            String copyTaxOrganRegistrationCertificate) {
        this.copyTaxOrganRegistrationCertificate = copyTaxOrganRegistrationCertificate;
    }

    /** 
     * Get the 'AreaInfo' element value. ��������, ����������  ��������  ��   �������  ����
     * 
     * @return value
     */
    public String getAreaInfo() {
        return areaInfo;
    }

    /** 
     * Set the 'AreaInfo' element value. ��������, ����������  ��������  ��   �������  ����
     * 
     * @param areaInfo
     */
    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }

    /** 
     * Get the 'ListPreviousUser' element value. ������������  ����������  �������������  ������ �������� ���� 
     * 
     * @return value
     */
    public String getListPreviousUser() {
        return listPreviousUser;
    }

    /** 
     * Set the 'ListPreviousUser' element value. ������������  ����������  �������������  ������ �������� ���� 
     * 
     * @param listPreviousUser
     */
    public void setListPreviousUser(String listPreviousUser) {
        this.listPreviousUser = listPreviousUser;
    }

    /** 
     * Get the 'UserInfo' element value. �������  ������� � ������������ ����
     * 
     * @return value
     */
    public String getUserInfo() {
        return userInfo;
    }

    /** 
     * Set the 'UserInfo' element value. �������  ������� � ������������ ����
     * 
     * @param userInfo
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    /** 
     * Get the list of 'OtherApplications' element items. ���� ���������� 
     * 
     * @return list
     */
    public List<OtherApplicationsType> getOtherApplicationList() {
        return otherApplicationList;
    }

    /** 
     * Set the list of 'OtherApplications' element items. ���� ���������� 
     * 
     * @param list
     */
    public void setOtherApplicationList(List<OtherApplicationsType> list) {
        otherApplicationList = list;
    }
}
