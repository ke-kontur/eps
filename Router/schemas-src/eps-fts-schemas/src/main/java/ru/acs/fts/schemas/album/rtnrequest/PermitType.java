
package ru.acs.fts.schemas.album.rtnrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Данные по разрешению/карточке
 */
public class PermitType
{
    private String accessCertificate;
    private String information;
    private List<String> licAddrList = new ArrayList<String>();
    private PermitInfoType permitInfo;
    private TSInfoType TSInfo;
    private CUOrganizationType permittedCompany;
    private CUOrganizationType organization;

    /** 
     * Get the 'AccessCertificate' element value. Номер удостоверения допуска
     * 
     * @return value
     */
    public String getAccessCertificate() {
        return accessCertificate;
    }

    /** 
     * Set the 'AccessCertificate' element value. Номер удостоверения допуска
     * 
     * @param accessCertificate
     */
    public void setAccessCertificate(String accessCertificate) {
        this.accessCertificate = accessCertificate;
    }

    /** 
     * Get the 'Information' element value. Примечание
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. Примечание
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the list of 'LicAddr' element items. Место осуществления лицензируемого вида деятельности
     * 
     * @return list
     */
    public List<String> getLicAddrList() {
        return licAddrList;
    }

    /** 
     * Set the list of 'LicAddr' element items. Место осуществления лицензируемого вида деятельности
     * 
     * @param list
     */
    public void setLicAddrList(List<String> list) {
        licAddrList = list;
    }

    /** 
     * Get the 'PermitInfo' element value. Разрешение/карточка
     * 
     * @return value
     */
    public PermitInfoType getPermitInfo() {
        return permitInfo;
    }

    /** 
     * Set the 'PermitInfo' element value. Разрешение/карточка
     * 
     * @param permitInfo
     */
    public void setPermitInfo(PermitInfoType permitInfo) {
        this.permitInfo = permitInfo;
    }

    /** 
     * Get the 'TSInfo' element value. Сведения о ТС
     * 
     * @return value
     */
    public TSInfoType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Сведения о ТС
     * 
     * @param TSInfo
     */
    public void setTSInfo(TSInfoType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'PermittedCompany' element value. Наименование компании, которой выдано разрешение
     * 
     * @return value
     */
    public CUOrganizationType getPermittedCompany() {
        return permittedCompany;
    }

    /** 
     * Set the 'PermittedCompany' element value. Наименование компании, которой выдано разрешение
     * 
     * @param permittedCompany
     */
    public void setPermittedCompany(CUOrganizationType permittedCompany) {
        this.permittedCompany = permittedCompany;
    }

    /** 
     * Get the 'Organization' element value. Наименование организации, выдавшей удостоверение
     * 
     * @return value
     */
    public CUOrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Наименование организации, выдавшей удостоверение
     * 
     * @param organization
     */
    public void setOrganization(CUOrganizationType organization) {
        this.organization = organization;
    }
}
