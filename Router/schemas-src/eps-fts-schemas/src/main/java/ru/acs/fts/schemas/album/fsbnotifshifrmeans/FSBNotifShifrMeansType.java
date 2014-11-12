
package ru.acs.fts.schemas.album.fsbnotifshifrmeans;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Ответ на запрос сведений из нотификаций о характеристиках товаров (продукции), содержащих шифровальные (криптографические) средства
 */
public class FSBNotifShifrMeansType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String notificationDuration;
    private LocalDate notificationDate;
    private String documentNumber;
    private CUOrganizationType manufacturer;
    private CUOrganizationType applicantDetails;
    private PersonSignatureType authorizedPerson;
    private String documentModeID;

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
     * Get the list of 'GoodsDescription' element items. Наименование товара (продукции)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара (продукции)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'NotificationDuration' element value. Срок действия нотификации
     * 
     * @return value
     */
    public String getNotificationDuration() {
        return notificationDuration;
    }

    /** 
     * Set the 'NotificationDuration' element value. Срок действия нотификации
     * 
     * @param notificationDuration
     */
    public void setNotificationDuration(String notificationDuration) {
        this.notificationDuration = notificationDuration;
    }

    /** 
     * Get the 'NotificationDate' element value. Дата принятия нотификации
     * 
     * @return value
     */
    public LocalDate getNotificationDate() {
        return notificationDate;
    }

    /** 
     * Set the 'NotificationDate' element value. Дата принятия нотификации
     * 
     * @param notificationDate
     */
    public void setNotificationDate(LocalDate notificationDate) {
        this.notificationDate = notificationDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'Manufacturer' element value. Реквизиты фирмы производителя товара (продукции)
     * 
     * @return value
     */
    public CUOrganizationType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Реквизиты фирмы производителя товара (продукции)
     * 
     * @param manufacturer
     */
    public void setManufacturer(CUOrganizationType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'ApplicantDetails' element value. Реквизиты заявителя
     * 
     * @return value
     */
    public CUOrganizationType getApplicantDetails() {
        return applicantDetails;
    }

    /** 
     * Set the 'ApplicantDetails' element value. Реквизиты заявителя
     * 
     * @param applicantDetails
     */
    public void setApplicantDetails(CUOrganizationType applicantDetails) {
        this.applicantDetails = applicantDetails;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее нотификацию
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее нотификацию
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
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
