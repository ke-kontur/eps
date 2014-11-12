
package ru.acs.fts.schemas.album.minsportrospechlic;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ
 */
public class DocumentType
{
    private String isCanceled;
    private String BDRDID;
    private String additionalInfo;
    private String paragraph;
    private DocumentBaseType contractDetails;
    private PersonType person;
    private PersonType recipient;
    private List<GoodsDescriptionType> goodsDescriptionList = new ArrayList<GoodsDescriptionType>();
    private AuthorisedPersonType authorisedPerson;
    private ConfirmationType confirmation;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'Paragraph' element value. Пункт приложения к протоколу (соглашению)
     * 
     * @return value
     */
    public String getParagraph() {
        return paragraph;
    }

    /** 
     * Set the 'Paragraph' element value. Пункт приложения к протоколу (соглашению)
     * 
     * @param paragraph
     */
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    /** 
     * Get the 'ContractDetails' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. Реквизиты контракта
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
    }

    /** 
     * Get the 'Person' element value. Сведения о лице, которому выдано подтверждение
     * 
     * @return value
     */
    public PersonType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Сведения о лице, которому выдано подтверждение
     * 
     * @param person
     */
    public void setPerson(PersonType person) {
        this.person = person;
    }

    /** 
     * Get the 'Recipient' element value. Сведения о получателе товаров
     * 
     * @return value
     */
    public PersonType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Сведения о получателе товаров
     * 
     * @param recipient
     */
    public void setRecipient(PersonType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<GoodsDescriptionType> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<GoodsDescriptionType> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'AuthorisedPerson' element value. Уполномоченное лицо
     * 
     * @return value
     */
    public AuthorisedPersonType getAuthorisedPerson() {
        return authorisedPerson;
    }

    /** 
     * Set the 'AuthorisedPerson' element value. Уполномоченное лицо
     * 
     * @param authorisedPerson
     */
    public void setAuthorisedPerson(AuthorisedPersonType authorisedPerson) {
        this.authorisedPerson = authorisedPerson;
    }

    /** 
     * Get the 'Confirmation' element value. Подтверждение
     * 
     * @return value
     */
    public ConfirmationType getConfirmation() {
        return confirmation;
    }

    /** 
     * Set the 'Confirmation' element value. Подтверждение
     * 
     * @param confirmation
     */
    public void setConfirmation(ConfirmationType confirmation) {
        this.confirmation = confirmation;
    }
}
