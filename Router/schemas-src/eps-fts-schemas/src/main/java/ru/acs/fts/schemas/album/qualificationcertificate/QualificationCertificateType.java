
package ru.acs.fts.schemas.album.qualificationcertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������������� �������� ����������� �� ����������� ����������
 */
public class QualificationCertificateType extends BaseDocType
{
    private String personName;
    private LocalDate dateBirth;
    private LocalDate dateIssueCertificate;
    private IdentityCardType identityCard;
    private CustomsType customs;
    private PersonSignatureType signatureChairmanCommission;
    private List<InfoLearningType> infoLearningList = new ArrayList<InfoLearningType>();
    private RegistrationNumberCertificateType registrationNumberCertificate;
    private FormType form;
    private String documentModeID;

    /** 
     * Get the 'PersonName' element value. �������. ���. ��������.
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. �������. ���. ��������.
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'DateBirth' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getDateBirth() {
        return dateBirth;
    }

    /** 
     * Set the 'DateBirth' element value. ���� ��������
     * 
     * @param dateBirth
     */
    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    /** 
     * Get the 'DateIssueCertificate' element value. ���� ������ ����������������� ���������
     * 
     * @return value
     */
    public LocalDate getDateIssueCertificate() {
        return dateIssueCertificate;
    }

    /** 
     * Set the 'DateIssueCertificate' element value. ���� ������ ����������������� ���������
     * 
     * @param dateIssueCertificate
     */
    public void setDateIssueCertificate(LocalDate dateIssueCertificate) {
        this.dateIssueCertificate = dateIssueCertificate;
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

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'SignatureChairmanCommission' element value. ������� ������������ ��������������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getSignatureChairmanCommission() {
        return signatureChairmanCommission;
    }

    /** 
     * Set the 'SignatureChairmanCommission' element value. ������� ������������ ��������������� ��������
     * 
     * @param signatureChairmanCommission
     */
    public void setSignatureChairmanCommission(
            PersonSignatureType signatureChairmanCommission) {
        this.signatureChairmanCommission = signatureChairmanCommission;
    }

    /** 
     * Get the list of 'InfoLearning' element items. ��������  � ����������� �������� �� ���������� ��������� ������������.
     * 
     * @return list
     */
    public List<InfoLearningType> getInfoLearningList() {
        return infoLearningList;
    }

    /** 
     * Set the list of 'InfoLearning' element items. ��������  � ����������� �������� �� ���������� ��������� ������������.
     * 
     * @param list
     */
    public void setInfoLearningList(List<InfoLearningType> list) {
        infoLearningList = list;
    }

    /** 
     * Get the 'RegistrationNumberCertificate' element value. ��������������� ����� ����������������� ���������.
     * 
     * @return value
     */
    public RegistrationNumberCertificateType getRegistrationNumberCertificate() {
        return registrationNumberCertificate;
    }

    /** 
     * Set the 'RegistrationNumberCertificate' element value. ��������������� ����� ����������������� ���������.
     * 
     * @param registrationNumberCertificate
     */
    public void setRegistrationNumberCertificate(
            RegistrationNumberCertificateType registrationNumberCertificate) {
        this.registrationNumberCertificate = registrationNumberCertificate;
    }

    /** 
     * Get the 'Form' element value. ����� � ����� ������
     * 
     * @return value
     */
    public FormType getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. ����� � ����� ������
     * 
     * @param form
     */
    public void setForm(FormType form) {
        this.form = form;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
