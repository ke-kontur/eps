
package ru.acs.fts.schemas.album.qualificationcertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������  � ����������� �������� �� ���������� ��������� ������������.
 */
public class InfoLearningType
{
    private LocalDate startPeriod;
    private LocalDate endPeriod;
    private String nameOrganizaion;
    private String nubmerLicenseOrganization;
    private String markCustoms;
    private List<DocumentBaseType> documentLearningList = new ArrayList<DocumentBaseType>();
    private List<PersonSignatureType> signatureAuthorizedPersonList = new ArrayList<PersonSignatureType>();

    /** 
     * Get the 'StartPeriod' element value. ������ ����������� �������� �� ���������� ���������  ������������ c
     * 
     * @return value
     */
    public LocalDate getStartPeriod() {
        return startPeriod;
    }

    /** 
     * Set the 'StartPeriod' element value. ������ ����������� �������� �� ���������� ���������  ������������ c
     * 
     * @param startPeriod
     */
    public void setStartPeriod(LocalDate startPeriod) {
        this.startPeriod = startPeriod;
    }

    /** 
     * Get the 'EndPeriod' element value. ������ ����������� �������� �� ���������� ���������  ������������ ��
     * 
     * @return value
     */
    public LocalDate getEndPeriod() {
        return endPeriod;
    }

    /** 
     * Set the 'EndPeriod' element value. ������ ����������� �������� �� ���������� ���������  ������������ ��
     * 
     * @param endPeriod
     */
    public void setEndPeriod(LocalDate endPeriod) {
        this.endPeriod = endPeriod;
    }

    /** 
     * Get the 'NameOrganizaion' element value. ������������ �����������, ����������� ��������
     * 
     * @return value
     */
    public String getNameOrganizaion() {
        return nameOrganizaion;
    }

    /** 
     * Set the 'NameOrganizaion' element value. ������������ �����������, ����������� ��������
     * 
     * @param nameOrganizaion
     */
    public void setNameOrganizaion(String nameOrganizaion) {
        this.nameOrganizaion = nameOrganizaion;
    }

    /** 
     * Get the 'NubmerLicenseOrganization' element value. ����� �������� �����������
     * 
     * @return value
     */
    public String getNubmerLicenseOrganization() {
        return nubmerLicenseOrganization;
    }

    /** 
     * Set the 'NubmerLicenseOrganization' element value. ����� �������� �����������
     * 
     * @param nubmerLicenseOrganization
     */
    public void setNubmerLicenseOrganization(String nubmerLicenseOrganization) {
        this.nubmerLicenseOrganization = nubmerLicenseOrganization;
    }

    /** 
     * Get the 'MarkCustoms' element value. ������� ����������� ������ � ���������� ���������� � ��������� ������������
     * 
     * @return value
     */
    public String getMarkCustoms() {
        return markCustoms;
    }

    /** 
     * Set the 'MarkCustoms' element value. ������� ����������� ������ � ���������� ���������� � ��������� ������������
     * 
     * @param markCustoms
     */
    public void setMarkCustoms(String markCustoms) {
        this.markCustoms = markCustoms;
    }

    /** 
     * Get the list of 'DocumentLearning' element items. ���������, �������������� ����������� ��������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentLearningList() {
        return documentLearningList;
    }

    /** 
     * Set the list of 'DocumentLearning' element items. ���������, �������������� ����������� ��������
     * 
     * @param list
     */
    public void setDocumentLearningList(List<DocumentBaseType> list) {
        documentLearningList = list;
    }

    /** 
     * Get the list of 'SignatureAuthorizedPerson' element items. ������� �������������� ����
     * 
     * @return list
     */
    public List<PersonSignatureType> getSignatureAuthorizedPersonList() {
        return signatureAuthorizedPersonList;
    }

    /** 
     * Set the list of 'SignatureAuthorizedPerson' element items. ������� �������������� ����
     * 
     * @param list
     */
    public void setSignatureAuthorizedPersonList(List<PersonSignatureType> list) {
        signatureAuthorizedPersonList = list;
    }
}
