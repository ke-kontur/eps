
package ru.acs.fts.schemas.album.inqinotreatment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;

/** 
 * ���������
 */
public class ApplicantType
{
    private PersonSignatureType applicantsBoss;
    private PersonSignatureType accountantGeneralApp;
    private TreatmentOrganizationType organizationInfo;
    private IdentityCardType identityCard;

    /** 
     * Get the 'ApplicantsBoss' element value. ������������ �����������
     * 
     * @return value
     */
    public PersonSignatureType getApplicantsBoss() {
        return applicantsBoss;
    }

    /** 
     * Set the 'ApplicantsBoss' element value. ������������ �����������
     * 
     * @param applicantsBoss
     */
    public void setApplicantsBoss(PersonSignatureType applicantsBoss) {
        this.applicantsBoss = applicantsBoss;
    }

    /** 
     * Get the 'AccountantGeneralApp' element value. ������� ��������� �����������
     * 
     * @return value
     */
    public PersonSignatureType getAccountantGeneralApp() {
        return accountantGeneralApp;
    }

    /** 
     * Set the 'AccountantGeneralApp' element value. ������� ��������� �����������
     * 
     * @param accountantGeneralApp
     */
    public void setAccountantGeneralApp(PersonSignatureType accountantGeneralApp) {
        this.accountantGeneralApp = accountantGeneralApp;
    }

    /** 
     * Get the 'OrganizationInfo' element value. �������������� ���������������
     * 
     * @return value
     */
    public TreatmentOrganizationType getOrganizationInfo() {
        return organizationInfo;
    }

    /** 
     * Set the 'OrganizationInfo' element value. �������������� ���������������
     * 
     * @param organizationInfo
     */
    public void setOrganizationInfo(TreatmentOrganizationType organizationInfo) {
        this.organizationInfo = organizationInfo;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
