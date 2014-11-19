
package ru.acs.fts.schemas.album.dealpassport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� ������ (��) - �������� ��������� ��������,  ��������������� ��� ������������� �������� �� ���������� � ���������� ���������� ��������� ��������
 */
public class DealPassportType extends BaseDocType
{
    private String bankName;
    private DPNumberType DPNumber;
    private DPNumberType anotherBankDPNumber;
    private DPoldNumberType DPoldNumber;
    private ResidentType resident;
    private ForeignContractorType foreignContractor;
    private ContractTermsType contractTerms;
    private List<AddContractTermsType> addContractTermList = new ArrayList<AddContractTermsType>();
    private List<PermissionsType> permissionList = new ArrayList<PermissionsType>();
    private PersonSignatureType bankSignature;
    private PersonSignatureType residentSignature;
    private DPEndType DPEnd;
    private DPReMadeType DPReMade;
    private SpecialInformationType specialInformation;
    private String documentModeID;

    /** 
     * Get the 'BankName' element value. ������������ �����
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. ������������ �����
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'DPNumber' element value. ����� �������� ������
     * 
     * @return value
     */
    public DPNumberType getDPNumber() {
        return DPNumber;
    }

    /** 
     * Set the 'DPNumber' element value. ����� �������� ������
     * 
     * @param DPNumber
     */
    public void setDPNumber(DPNumberType DPNumber) {
        this.DPNumber = DPNumber;
    }

    /** 
     * Get the 'AnotherBankDPNumber' element value. ����� �������� ������, ������������ � ������ �����
     * 
     * @return value
     */
    public DPNumberType getAnotherBankDPNumber() {
        return anotherBankDPNumber;
    }

    /** 
     * Set the 'AnotherBankDPNumber' element value. ����� �������� ������, ������������ � ������ �����
     * 
     * @param anotherBankDPNumber
     */
    public void setAnotherBankDPNumber(DPNumberType anotherBankDPNumber) {
        this.anotherBankDPNumber = anotherBankDPNumber;
    }

    /** 
     * Get the 'DPoldNumber' element value. ����� �������� ������, ������������ �� 18.06.2004
     * 
     * @return value
     */
    public DPoldNumberType getDPoldNumber() {
        return DPoldNumber;
    }

    /** 
     * Set the 'DPoldNumber' element value. ����� �������� ������, ������������ �� 18.06.2004
     * 
     * @param DPoldNumber
     */
    public void setDPoldNumber(DPoldNumberType DPoldNumber) {
        this.DPoldNumber = DPoldNumber;
    }

    /** 
     * Get the 'Resident' element value. �������� � ���������
     * 
     * @return value
     */
    public ResidentType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. �������� � ���������
     * 
     * @param resident
     */
    public void setResident(ResidentType resident) {
        this.resident = resident;
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
     * Get the 'ContractTerms' element value. ����� �������� � ���������
     * 
     * @return value
     */
    public ContractTermsType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. ����� �������� � ���������
     * 
     * @param contractTerms
     */
    public void setContractTerms(ContractTermsType contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the list of 'AddContractTerms' element items. �������� �� ����������/����������� � ���������
     * 
     * @return list
     */
    public List<AddContractTermsType> getAddContractTermList() {
        return addContractTermList;
    }

    /** 
     * Set the list of 'AddContractTerms' element items. �������� �� ����������/����������� � ���������
     * 
     * @param list
     */
    public void setAddContractTermList(List<AddContractTermsType> list) {
        addContractTermList = list;
    }

    /** 
     * Get the list of 'Permissions' element items. ���������� � �����������
     * 
     * @return list
     */
    public List<PermissionsType> getPermissionList() {
        return permissionList;
    }

    /** 
     * Set the list of 'Permissions' element items. ���������� � �����������
     * 
     * @param list
     */
    public void setPermissionList(List<PermissionsType> list) {
        permissionList = list;
    }

    /** 
     * Get the 'BankSignature' element value. ������� �� ������� �����
     * 
     * @return value
     */
    public PersonSignatureType getBankSignature() {
        return bankSignature;
    }

    /** 
     * Set the 'BankSignature' element value. ������� �� ������� �����
     * 
     * @param bankSignature
     */
    public void setBankSignature(PersonSignatureType bankSignature) {
        this.bankSignature = bankSignature;
    }

    /** 
     * Get the 'ResidentSignature' element value. ������� ���������
     * 
     * @return value
     */
    public PersonSignatureType getResidentSignature() {
        return residentSignature;
    }

    /** 
     * Set the 'ResidentSignature' element value. ������� ���������
     * 
     * @param residentSignature
     */
    public void setResidentSignature(PersonSignatureType residentSignature) {
        this.residentSignature = residentSignature;
    }

    /** 
     * Get the 'DPEnd' element value. ���������� � �������� ��
     * 
     * @return value
     */
    public DPEndType getDPEnd() {
        return DPEnd;
    }

    /** 
     * Set the 'DPEnd' element value. ���������� � �������� ��
     * 
     * @param DPEnd
     */
    public void setDPEnd(DPEndType DPEnd) {
        this.DPEnd = DPEnd;
    }

    /** 
     * Get the 'DPReMade' element value. ���������� � �������������� ��
     * 
     * @return value
     */
    public DPReMadeType getDPReMade() {
        return DPReMade;
    }

    /** 
     * Set the 'DPReMade' element value. ���������� � �������������� ��
     * 
     * @param DPReMade
     */
    public void setDPReMade(DPReMadeType DPReMade) {
        this.DPReMade = DPReMade;
    }

    /** 
     * Get the 'SpecialInformation' element value. ����������� �������� � ���������
     * 
     * @return value
     */
    public SpecialInformationType getSpecialInformation() {
        return specialInformation;
    }

    /** 
     * Set the 'SpecialInformation' element value. ����������� �������� � ���������
     * 
     * @param specialInformation
     */
    public void setSpecialInformation(SpecialInformationType specialInformation) {
        this.specialInformation = specialInformation;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
