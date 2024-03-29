
package ru.acs.fts.schemas.album.resolutioncommissionexportcontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� , ���������� ��������� �� ����������� ��������
 */
public class ResolutionCommissionExportControlType extends BaseDocType
{
    private String regNumber;
    private LocalDate endDate;
    private List<String> termsActionList = new ArrayList<String>();
    private int choiceSelect = -1;
    private static final int JURIDICAL_PERSON_CHOICE = 0;
    private static final int INDIVIDUAL_PERSON_CHOICE = 1;
    private JuridicalPersonType juridicalPerson;
    private IndividualPersonType individualPerson;
    private ApplicationType application;
    private DocumentBaseType issueBase;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'RegNumber' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. ��������������� ����� ����������
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� ����������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� ����������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'TermsAction' element items. ������� �������� ����������
     * 
     * @return list
     */
    public List<String> getTermsActionList() {
        return termsActionList;
    }

    /** 
     * Set the list of 'TermsAction' element items. ������� �������� ����������
     * 
     * @param list
     */
    public void setTermsActionList(List<String> list) {
        termsActionList = list;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if JuridicalPerson is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifJuridicalPerson() {
        return choiceSelect == JURIDICAL_PERSON_CHOICE;
    }

    /** 
     * Get the 'JuridicalPerson' element value. ����������� ����
     * 
     * @return value
     */
    public JuridicalPersonType getJuridicalPerson() {
        return juridicalPerson;
    }

    /** 
     * Set the 'JuridicalPerson' element value. ����������� ����
     * 
     * @param juridicalPerson
     */
    public void setJuridicalPerson(JuridicalPersonType juridicalPerson) {
        setChoiceSelect(JURIDICAL_PERSON_CHOICE);
        this.juridicalPerson = juridicalPerson;
    }

    /** 
     * Check if IndividualPerson is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifIndividualPerson() {
        return choiceSelect == INDIVIDUAL_PERSON_CHOICE;
    }

    /** 
     * Get the 'IndividualPerson' element value. ���������� ����
     * 
     * @return value
     */
    public IndividualPersonType getIndividualPerson() {
        return individualPerson;
    }

    /** 
     * Set the 'IndividualPerson' element value. ���������� ����
     * 
     * @param individualPerson
     */
    public void setIndividualPerson(IndividualPersonType individualPerson) {
        setChoiceSelect(INDIVIDUAL_PERSON_CHOICE);
        this.individualPerson = individualPerson;
    }

    /** 
     * Get the 'Application' element value. �������� �� ���������
     * 
     * @return value
     */
    public ApplicationType getApplication() {
        return application;
    }

    /** 
     * Set the 'Application' element value. �������� �� ���������
     * 
     * @param application
     */
    public void setApplication(ApplicationType application) {
        this.application = application;
    }

    /** 
     * Get the 'IssueBase' element value. ���������� ������ �� ���������
     * 
     * @return value
     */
    public DocumentBaseType getIssueBase() {
        return issueBase;
    }

    /** 
     * Set the 'IssueBase' element value. ���������� ������ �� ���������
     * 
     * @param issueBase
     */
    public void setIssueBase(DocumentBaseType issueBase) {
        this.issueBase = issueBase;
    }

    /** 
     * Get the 'PersonSignature' element value. �������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. �������
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
