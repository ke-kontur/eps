
package ru.acs.fts.schemas.album.contractdealpassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Паспорт сделки (ПС), оформленный по контракту - документ валютного контроля,  предназначенный для осуществления контроля за вывозимыми с территории Российской Федерации товарами
 */
public class ContractDealPassportType extends BaseDocType
{
    private LocalDate date;
    private String bankName;
    private RegNumberType PSNumber;
    private ResidentType residentInfo;
    private List<NonresidentType> nonresidentInfoList = new ArrayList<NonresidentType>();
    private List<ContractTermsType> commonContractInfoList = new ArrayList<ContractTermsType>();
    private List<AdditionalInfoType> additionalInfoList = new ArrayList<AdditionalInfoType>();
    private List<UpdatingInfoType> updatingInfoList = new ArrayList<UpdatingInfoType>();
    private RegNumberType previousPSNumber;
    private SupplementalInformationType documentRegistrationType;
    private SupplementalInformationType completedDocumentType;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата оформления ПС
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата оформления ПС
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'BankName' element value. Полное или сокращенное фирменное название уполномоченного банка (филиала уполномоченного банка), оформившего ПС
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Полное или сокращенное фирменное название уполномоченного банка (филиала уполномоченного банка), оформившего ПС
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'PSNumber' element value. Регистрационный номер ПС
     * 
     * @return value
     */
    public RegNumberType getPSNumber() {
        return PSNumber;
    }

    /** 
     * Set the 'PSNumber' element value. Регистрационный номер ПС
     * 
     * @param PSNumber
     */
    public void setPSNumber(RegNumberType PSNumber) {
        this.PSNumber = PSNumber;
    }

    /** 
     * Get the 'ResidentInfo' element value. Сведения о резиденте
     * 
     * @return value
     */
    public ResidentType getResidentInfo() {
        return residentInfo;
    }

    /** 
     * Set the 'ResidentInfo' element value. Сведения о резиденте
     * 
     * @param residentInfo
     */
    public void setResidentInfo(ResidentType residentInfo) {
        this.residentInfo = residentInfo;
    }

    /** 
     * Get the list of 'NonresidentInfo' element items. Реквизиты нерезидента
     * 
     * @return list
     */
    public List<NonresidentType> getNonresidentInfoList() {
        return nonresidentInfoList;
    }

    /** 
     * Set the list of 'NonresidentInfo' element items. Реквизиты нерезидента
     * 
     * @param list
     */
    public void setNonresidentInfoList(List<NonresidentType> list) {
        nonresidentInfoList = list;
    }

    /** 
     * Get the list of 'CommonContractInfo' element items. Общие сведения о контракте
     * 
     * @return list
     */
    public List<ContractTermsType> getCommonContractInfoList() {
        return commonContractInfoList;
    }

    /** 
     * Set the list of 'CommonContractInfo' element items. Общие сведения о контракте
     * 
     * @param list
     */
    public void setCommonContractInfoList(List<ContractTermsType> list) {
        commonContractInfoList = list;
    }

    /** 
     * Get the list of 'AdditionalInfo' element items. Сведения об оформлении, о переводе и закрытии ПС
     * 
     * @return list
     */
    public List<AdditionalInfoType> getAdditionalInfoList() {
        return additionalInfoList;
    }

    /** 
     * Set the list of 'AdditionalInfo' element items. Сведения об оформлении, о переводе и закрытии ПС
     * 
     * @param list
     */
    public void setAdditionalInfoList(List<AdditionalInfoType> list) {
        additionalInfoList = list;
    }

    /** 
     * Get the list of 'UpdatingInfo' element items. Сведения о переоформлении ПС
     * 
     * @return list
     */
    public List<UpdatingInfoType> getUpdatingInfoList() {
        return updatingInfoList;
    }

    /** 
     * Set the list of 'UpdatingInfo' element items. Сведения о переоформлении ПС
     * 
     * @param list
     */
    public void setUpdatingInfoList(List<UpdatingInfoType> list) {
        updatingInfoList = list;
    }

    /** 
     * Get the 'PreviousPSNumber' element value. Номер ПС, ранее оформленного по этому контракту
     * 
     * @return value
     */
    public RegNumberType getPreviousPSNumber() {
        return previousPSNumber;
    }

    /** 
     * Set the 'PreviousPSNumber' element value. Номер ПС, ранее оформленного по этому контракту
     * 
     * @param previousPSNumber
     */
    public void setPreviousPSNumber(RegNumberType previousPSNumber) {
        this.previousPSNumber = previousPSNumber;
    }

    /** 
     * Get the 'DocumentRegistrationType' element value. Способ и дата предоставления документов для оформления ПС
     * 
     * @return value
     */
    public SupplementalInformationType getDocumentRegistrationType() {
        return documentRegistrationType;
    }

    /** 
     * Set the 'DocumentRegistrationType' element value. Способ и дата предоставления документов для оформления ПС
     * 
     * @param documentRegistrationType
     */
    public void setDocumentRegistrationType(
            SupplementalInformationType documentRegistrationType) {
        this.documentRegistrationType = documentRegistrationType;
    }

    /** 
     * Get the 'CompletedDocumentType' element value. Способ и дата направления резиденту оформленного ПС
     * 
     * @return value
     */
    public SupplementalInformationType getCompletedDocumentType() {
        return completedDocumentType;
    }

    /** 
     * Set the 'CompletedDocumentType' element value. Способ и дата направления резиденту оформленного ПС
     * 
     * @param completedDocumentType
     */
    public void setCompletedDocumentType(
            SupplementalInformationType completedDocumentType) {
        this.completedDocumentType = completedDocumentType;
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
