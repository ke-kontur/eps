
package ru.acs.fts.schemas.album.scienceeduminconfirm;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Подтверждение Минобрнауки России
 */
public class ScienceEduMinConfirmType extends BaseDocType
{
    private String documentAttachment;
    private String additionalInfo;
    private ConfirmationInfoType confirmationInfo;
    private DocumentBaseType contract;
    private ParticipantType confirmationPerson;
    private ParticipantType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private PersonBaseType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'DocumentAttachment' element value. Пункт (подпункт) приложения к Соглашению и (или) Протоколу
     * 
     * @return value
     */
    public String getDocumentAttachment() {
        return documentAttachment;
    }

    /** 
     * Set the 'DocumentAttachment' element value. Пункт (подпункт) приложения к Соглашению и (или) Протоколу
     * 
     * @param documentAttachment
     */
    public void setDocumentAttachment(String documentAttachment) {
        this.documentAttachment = documentAttachment;
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
     * Get the 'ConfirmationInfo' element value. Сведения о подтверждении
     * 
     * @return value
     */
    public ConfirmationInfoType getConfirmationInfo() {
        return confirmationInfo;
    }

    /** 
     * Set the 'ConfirmationInfo' element value. Сведения о подтверждении
     * 
     * @param confirmationInfo
     */
    public void setConfirmationInfo(ConfirmationInfoType confirmationInfo) {
        this.confirmationInfo = confirmationInfo;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'ConfirmationPerson' element value. Сведения о лице, которому выдано подтверждение
     * 
     * @return value
     */
    public ParticipantType getConfirmationPerson() {
        return confirmationPerson;
    }

    /** 
     * Set the 'ConfirmationPerson' element value. Сведения о лице, которому выдано подтверждение
     * 
     * @param confirmationPerson
     */
    public void setConfirmationPerson(ParticipantType confirmationPerson) {
        this.confirmationPerson = confirmationPerson;
    }

    /** 
     * Get the 'Consignee' element value. Получатель товара
     * 
     * @return value
     */
    public ParticipantType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель товара
     * 
     * @param consignee
     */
    public void setConsignee(ParticipantType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
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
