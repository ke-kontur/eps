
package ru.acs.fts.schemas.album.bartertransactionpasport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ShortCompanyDescType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� ��������� ������ - �������� �������� � ����� ��������� ������, ����������� ����������� ������ � ������������ � ������������ �������������������� ����������
 */
public class BarterTransactionPasportType extends BaseDocType
{
    private ShortCompanyDescType MFER;
    private RussianCompanyType russianCompany;
    private BarterContractTermsType contractTerms;
    private PermitPaymentType permitPayment;
    private PersonSignatureType MFERSignature;
    private PersonSignatureType russianCompanySignature;
    private SpecialCommentsType specialComments;
    private List<EnclosureType> enclosureList = new ArrayList<EnclosureType>();
    private RegistrationType registration;
    private ForeignContractorType foreignContractor;
    private String documentModeID;

    /** 
     * Get the 'MFER' element value. ��������� ���������� ��������������� ���� ������
     * 
     * @return value
     */
    public ShortCompanyDescType getMFER() {
        return MFER;
    }

    /** 
     * Set the 'MFER' element value. ��������� ���������� ��������������� ���� ������
     * 
     * @param MFER
     */
    public void setMFER(ShortCompanyDescType MFER) {
        this.MFER = MFER;
    }

    /** 
     * Get the 'RussianCompany' element value. ��������� ���������� ������� ���������
     * 
     * @return value
     */
    public RussianCompanyType getRussianCompany() {
        return russianCompany;
    }

    /** 
     * Set the 'RussianCompany' element value. ��������� ���������� ������� ���������
     * 
     * @param russianCompany
     */
    public void setRussianCompany(RussianCompanyType russianCompany) {
        this.russianCompany = russianCompany;
    }

    /** 
     * Get the 'ContractTerms' element value. ��������� � ������� ��������
     * 
     * @return value
     */
    public BarterContractTermsType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. ��������� � ������� ��������
     * 
     * @param contractTerms
     */
    public void setContractTerms(BarterContractTermsType contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the 'PermitPayment' element value. ��������� � ������� ���������� ���� ������ �� �������� �������
     * 
     * @return value
     */
    public PermitPaymentType getPermitPayment() {
        return permitPayment;
    }

    /** 
     * Set the 'PermitPayment' element value. ��������� � ������� ���������� ���� ������ �� �������� �������
     * 
     * @param permitPayment
     */
    public void setPermitPayment(PermitPaymentType permitPayment) {
        this.permitPayment = permitPayment;
    }

    /** 
     * Get the 'MFERSignature' element value. ������� �� ���������� ��������������� ���� ������
     * 
     * @return value
     */
    public PersonSignatureType getMFERSignature() {
        return MFERSignature;
    }

    /** 
     * Set the 'MFERSignature' element value. ������� �� ���������� ��������������� ���� ������
     * 
     * @param MFERSignature
     */
    public void setMFERSignature(PersonSignatureType MFERSignature) {
        this.MFERSignature = MFERSignature;
    }

    /** 
     * Get the 'RussianCompanySignature' element value. ������� �� ����������� ����
     * 
     * @return value
     */
    public PersonSignatureType getRussianCompanySignature() {
        return russianCompanySignature;
    }

    /** 
     * Set the 'RussianCompanySignature' element value. ������� �� ����������� ����
     * 
     * @param russianCompanySignature
     */
    public void setRussianCompanySignature(
            PersonSignatureType russianCompanySignature) {
        this.russianCompanySignature = russianCompanySignature;
    }

    /** 
     * Get the 'SpecialComments' element value. ������ �������
     * 
     * @return value
     */
    public SpecialCommentsType getSpecialComments() {
        return specialComments;
    }

    /** 
     * Set the 'SpecialComments' element value. ������ �������
     * 
     * @param specialComments
     */
    public void setSpecialComments(SpecialCommentsType specialComments) {
        this.specialComments = specialComments;
    }

    /** 
     * Get the list of 'Enclosure' element items. ���������� � �������� ��������� ������ 
     * 
     * @return list
     */
    public List<EnclosureType> getEnclosureList() {
        return enclosureList;
    }

    /** 
     * Set the list of 'Enclosure' element items. ���������� � �������� ��������� ������ 
     * 
     * @param list
     */
    public void setEnclosureList(List<EnclosureType> list) {
        enclosureList = list;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ �������� ��������� ������    
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ �������� ��������� ������    
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'ForeignContractor' element value. ��������� ������������ �����������
     * 
     * @return value
     */
    public ForeignContractorType getForeignContractor() {
        return foreignContractor;
    }

    /** 
     * Set the 'ForeignContractor' element value. ��������� ������������ �����������
     * 
     * @param foreignContractor
     */
    public void setForeignContractor(ForeignContractorType foreignContractor) {
        this.foreignContractor = foreignContractor;
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
