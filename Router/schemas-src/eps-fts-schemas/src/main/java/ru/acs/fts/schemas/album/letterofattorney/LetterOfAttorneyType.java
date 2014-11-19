
package ru.acs.fts.schemas.album.letterofattorney;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������������
 */
public class LetterOfAttorneyType extends BaseDocType
{
    private List<String> subjectList = new ArrayList<String>();
    private LocalDate endDate;
    private DocumentBaseType documentReference;
    private OrganizationAttorneyType organization;
    private AuthoritesDocumentType authoritiesDocument;
    private EmpoweredPersonType empoweredPerson;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the list of 'Subject' element items. ������� ������������ (����� ������������)
     * 
     * @return list
     */
    public List<String> getSubjectList() {
        return subjectList;
    }

    /** 
     * Set the list of 'Subject' element items. ������� ������������ (����� ������������)
     * 
     * @param list
     */
    public void setSubjectList(List<String> list) {
        subjectList = list;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� ������������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� ������������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'DocumentReference' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. ��������� ���������
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Organization' element value. �������� �� �����������
     * 
     * @return value
     */
    public OrganizationAttorneyType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� �����������
     * 
     * @param organization
     */
    public void setOrganization(OrganizationAttorneyType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'AuthoritiesDocument' element value. ��������, �������������� ���������� ������������ ���� �����������-����������
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritiesDocument() {
        return authoritiesDocument;
    }

    /** 
     * Set the 'AuthoritiesDocument' element value. ��������, �������������� ���������� ������������ ���� �����������-����������
     * 
     * @param authoritiesDocument
     */
    public void setAuthoritiesDocument(
            AuthoritesDocumentType authoritiesDocument) {
        this.authoritiesDocument = authoritiesDocument;
    }

    /** 
     * Get the 'EmpoweredPerson' element value. ���������� ����
     * 
     * @return value
     */
    public EmpoweredPersonType getEmpoweredPerson() {
        return empoweredPerson;
    }

    /** 
     * Set the 'EmpoweredPerson' element value. ���������� ����
     * 
     * @param empoweredPerson
     */
    public void setEmpoweredPerson(EmpoweredPersonType empoweredPerson) {
        this.empoweredPerson = empoweredPerson;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� �����������-����������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� �����������-����������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
