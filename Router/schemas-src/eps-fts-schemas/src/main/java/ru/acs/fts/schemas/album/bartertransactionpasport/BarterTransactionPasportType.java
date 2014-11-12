
package ru.acs.fts.schemas.album.bartertransactionpasport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ShortCompanyDescType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Паспорт бартерной сделки - документ контроля и учета бартерных сделок, совершаемых российскими лицами в соответствии с заключенными внешнеэкономическими договорами
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
     * Get the 'MFER' element value. Реквизиты Управления уполномоченного МВЭС России
     * 
     * @return value
     */
    public ShortCompanyDescType getMFER() {
        return MFER;
    }

    /** 
     * Set the 'MFER' element value. Реквизиты Управления уполномоченного МВЭС России
     * 
     * @param MFER
     */
    public void setMFER(ShortCompanyDescType MFER) {
        this.MFER = MFER;
    }

    /** 
     * Get the 'RussianCompany' element value. Реквизиты российской стороны контракта
     * 
     * @return value
     */
    public RussianCompanyType getRussianCompany() {
        return russianCompany;
    }

    /** 
     * Set the 'RussianCompany' element value. Реквизиты российской стороны контракта
     * 
     * @param russianCompany
     */
    public void setRussianCompany(RussianCompanyType russianCompany) {
        this.russianCompany = russianCompany;
    }

    /** 
     * Get the 'ContractTerms' element value. Реквизиты и условия договора
     * 
     * @return value
     */
    public BarterContractTermsType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. Реквизиты и условия договора
     * 
     * @param contractTerms
     */
    public void setContractTerms(BarterContractTermsType contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the 'PermitPayment' element value. Реквизиты и условия разрешение МВЭС России на отсрочку платежа
     * 
     * @return value
     */
    public PermitPaymentType getPermitPayment() {
        return permitPayment;
    }

    /** 
     * Set the 'PermitPayment' element value. Реквизиты и условия разрешение МВЭС России на отсрочку платежа
     * 
     * @param permitPayment
     */
    public void setPermitPayment(PermitPaymentType permitPayment) {
        this.permitPayment = permitPayment;
    }

    /** 
     * Get the 'MFERSignature' element value. Подпись от Управления уполномоченного МВЭС России
     * 
     * @return value
     */
    public PersonSignatureType getMFERSignature() {
        return MFERSignature;
    }

    /** 
     * Set the 'MFERSignature' element value. Подпись от Управления уполномоченного МВЭС России
     * 
     * @param MFERSignature
     */
    public void setMFERSignature(PersonSignatureType MFERSignature) {
        this.MFERSignature = MFERSignature;
    }

    /** 
     * Get the 'RussianCompanySignature' element value. Подпись от российского лица
     * 
     * @return value
     */
    public PersonSignatureType getRussianCompanySignature() {
        return russianCompanySignature;
    }

    /** 
     * Set the 'RussianCompanySignature' element value. Подпись от российского лица
     * 
     * @param russianCompanySignature
     */
    public void setRussianCompanySignature(
            PersonSignatureType russianCompanySignature) {
        this.russianCompanySignature = russianCompanySignature;
    }

    /** 
     * Get the 'SpecialComments' element value. Особые отметки
     * 
     * @return value
     */
    public SpecialCommentsType getSpecialComments() {
        return specialComments;
    }

    /** 
     * Set the 'SpecialComments' element value. Особые отметки
     * 
     * @param specialComments
     */
    public void setSpecialComments(SpecialCommentsType specialComments) {
        this.specialComments = specialComments;
    }

    /** 
     * Get the list of 'Enclosure' element items. Приложение к Паспорту бартерной сделки 
     * 
     * @return list
     */
    public List<EnclosureType> getEnclosureList() {
        return enclosureList;
    }

    /** 
     * Set the list of 'Enclosure' element items. Приложение к Паспорту бартерной сделки 
     * 
     * @param list
     */
    public void setEnclosureList(List<EnclosureType> list) {
        enclosureList = list;
    }

    /** 
     * Get the 'Registration' element value. Регистрационные данные Паспорта бартерной сделки    
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрационные данные Паспорта бартерной сделки    
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
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
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
