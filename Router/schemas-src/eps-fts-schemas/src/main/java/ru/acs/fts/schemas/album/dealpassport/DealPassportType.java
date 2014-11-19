
package ru.acs.fts.schemas.album.dealpassport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Паспорт сделки (ПС) - документ валютного контроля,  предназначенный для осуществления контроля за вывозимыми с территории Российской Федерации товарами
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
     * Get the 'BankName' element value. Наименование банка
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Наименование банка
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'DPNumber' element value. Номер паспорта сделки
     * 
     * @return value
     */
    public DPNumberType getDPNumber() {
        return DPNumber;
    }

    /** 
     * Set the 'DPNumber' element value. Номер паспорта сделки
     * 
     * @param DPNumber
     */
    public void setDPNumber(DPNumberType DPNumber) {
        this.DPNumber = DPNumber;
    }

    /** 
     * Get the 'AnotherBankDPNumber' element value. Номер паспорта сделки, оформленного в другом банке
     * 
     * @return value
     */
    public DPNumberType getAnotherBankDPNumber() {
        return anotherBankDPNumber;
    }

    /** 
     * Set the 'AnotherBankDPNumber' element value. Номер паспорта сделки, оформленного в другом банке
     * 
     * @param anotherBankDPNumber
     */
    public void setAnotherBankDPNumber(DPNumberType anotherBankDPNumber) {
        this.anotherBankDPNumber = anotherBankDPNumber;
    }

    /** 
     * Get the 'DPoldNumber' element value. Номер паспорта сделки, оформленного до 18.06.2004
     * 
     * @return value
     */
    public DPoldNumberType getDPoldNumber() {
        return DPoldNumber;
    }

    /** 
     * Set the 'DPoldNumber' element value. Номер паспорта сделки, оформленного до 18.06.2004
     * 
     * @param DPoldNumber
     */
    public void setDPoldNumber(DPoldNumberType DPoldNumber) {
        this.DPoldNumber = DPoldNumber;
    }

    /** 
     * Get the 'Resident' element value. Сведения о резиденте
     * 
     * @return value
     */
    public ResidentType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. Сведения о резиденте
     * 
     * @param resident
     */
    public void setResident(ResidentType resident) {
        this.resident = resident;
    }

    /** 
     * Get the 'ForeignContractor' element value. Реквизиты иностранного контрагента
     * 
     * @return value
     */
    public ForeignContractorType getForeignContractor() {
        return foreignContractor;
    }

    /** 
     * Set the 'ForeignContractor' element value. Реквизиты иностранного контрагента
     * 
     * @param foreignContractor
     */
    public void setForeignContractor(ForeignContractorType foreignContractor) {
        this.foreignContractor = foreignContractor;
    }

    /** 
     * Get the 'ContractTerms' element value. Общие сведения о контракте
     * 
     * @return value
     */
    public ContractTermsType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. Общие сведения о контракте
     * 
     * @param contractTerms
     */
    public void setContractTerms(ContractTermsType contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the list of 'AddContractTerms' element items. Сведения об изменениях/дополнениях к контракту
     * 
     * @return list
     */
    public List<AddContractTermsType> getAddContractTermList() {
        return addContractTermList;
    }

    /** 
     * Set the list of 'AddContractTerms' element items. Сведения об изменениях/дополнениях к контракту
     * 
     * @param list
     */
    public void setAddContractTermList(List<AddContractTermsType> list) {
        addContractTermList = list;
    }

    /** 
     * Get the list of 'Permissions' element items. Информация о разрешениях
     * 
     * @return list
     */
    public List<PermissionsType> getPermissionList() {
        return permissionList;
    }

    /** 
     * Set the list of 'Permissions' element items. Информация о разрешениях
     * 
     * @param list
     */
    public void setPermissionList(List<PermissionsType> list) {
        permissionList = list;
    }

    /** 
     * Get the 'BankSignature' element value. Подпись со стороны банка
     * 
     * @return value
     */
    public PersonSignatureType getBankSignature() {
        return bankSignature;
    }

    /** 
     * Set the 'BankSignature' element value. Подпись со стороны банка
     * 
     * @param bankSignature
     */
    public void setBankSignature(PersonSignatureType bankSignature) {
        this.bankSignature = bankSignature;
    }

    /** 
     * Get the 'ResidentSignature' element value. Подпись резидента
     * 
     * @return value
     */
    public PersonSignatureType getResidentSignature() {
        return residentSignature;
    }

    /** 
     * Set the 'ResidentSignature' element value. Подпись резидента
     * 
     * @param residentSignature
     */
    public void setResidentSignature(PersonSignatureType residentSignature) {
        this.residentSignature = residentSignature;
    }

    /** 
     * Get the 'DPEnd' element value. Информация о закрытии ПС
     * 
     * @return value
     */
    public DPEndType getDPEnd() {
        return DPEnd;
    }

    /** 
     * Set the 'DPEnd' element value. Информация о закрытии ПС
     * 
     * @param DPEnd
     */
    public void setDPEnd(DPEndType DPEnd) {
        this.DPEnd = DPEnd;
    }

    /** 
     * Get the 'DPReMade' element value. Информация о переоформлении ПС
     * 
     * @return value
     */
    public DPReMadeType getDPReMade() {
        return DPReMade;
    }

    /** 
     * Set the 'DPReMade' element value. Информация о переоформлении ПС
     * 
     * @param DPReMade
     */
    public void setDPReMade(DPReMadeType DPReMade) {
        this.DPReMade = DPReMade;
    }

    /** 
     * Get the 'SpecialInformation' element value. Специальные сведения о контракте
     * 
     * @return value
     */
    public SpecialInformationType getSpecialInformation() {
        return specialInformation;
    }

    /** 
     * Set the 'SpecialInformation' element value. Специальные сведения о контракте
     * 
     * @param specialInformation
     */
    public void setSpecialInformation(SpecialInformationType specialInformation) {
        this.specialInformation = specialInformation;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
