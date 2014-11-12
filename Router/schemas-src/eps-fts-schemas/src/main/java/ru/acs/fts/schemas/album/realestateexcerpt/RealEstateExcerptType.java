
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос сведений из Единого государственного реестра прав на недвижимое имущество и сделок с ним
 */
public class RealEstateExcerptType extends BaseDocType
{
    private String applicationSourceSystemID;
    private String applicationID;
    private List<RequestDataType> requestDataList = new ArrayList<RequestDataType>();
    private RequestPersonType requestPerson;
    private PaymentType payment;
    private DeliveryType delivery;
    private List<PresentedDocsType> appliedDocumentList = new ArrayList<PresentedDocsType>();
    private MunicipalServiceType municipalService;
    private String documentModeID;

    /** 
     * Get the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @return value
     */
    public String getApplicationSourceSystemID() {
        return applicationSourceSystemID;
    }

    /** 
     * Set the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @param applicationSourceSystemID
     */
    public void setApplicationSourceSystemID(String applicationSourceSystemID) {
        this.applicationSourceSystemID = applicationSourceSystemID;
    }

    /** 
     * Get the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @return value
     */
    public String getApplicationID() {
        return applicationID;
    }

    /** 
     * Set the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @param applicationID
     */
    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /** 
     * Get the list of 'RequestData' element items. Запрашиваемые сведения
     * 
     * @return list
     */
    public List<RequestDataType> getRequestDataList() {
        return requestDataList;
    }

    /** 
     * Set the list of 'RequestData' element items. Запрашиваемые сведения
     * 
     * @param list
     */
    public void setRequestDataList(List<RequestDataType> list) {
        requestDataList = list;
    }

    /** 
     * Get the 'RequestPerson' element value. Сведения об организации запрашивающей сведения
     * 
     * @return value
     */
    public RequestPersonType getRequestPerson() {
        return requestPerson;
    }

    /** 
     * Set the 'RequestPerson' element value. Сведения об организации запрашивающей сведения
     * 
     * @param requestPerson
     */
    public void setRequestPerson(RequestPersonType requestPerson) {
        this.requestPerson = requestPerson;
    }

    /** 
     * Get the 'Payment' element value. Оплата
     * 
     * @return value
     */
    public PaymentType getPayment() {
        return payment;
    }

    /** 
     * Set the 'Payment' element value. Оплата
     * 
     * @param payment
     */
    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }

    /** 
     * Get the 'Delivery' element value. Способ обмена информацией
     * 
     * @return value
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /** 
     * Set the 'Delivery' element value. Способ обмена информацией
     * 
     * @param delivery
     */
    public void setDelivery(DeliveryType delivery) {
        this.delivery = delivery;
    }

    /** 
     * Get the list of 'AppliedDocuments' element items. Сведения о приложенных документах
     * 
     * @return list
     */
    public List<PresentedDocsType> getAppliedDocumentList() {
        return appliedDocumentList;
    }

    /** 
     * Set the list of 'AppliedDocuments' element items. Сведения о приложенных документах
     * 
     * @param list
     */
    public void setAppliedDocumentList(List<PresentedDocsType> list) {
        appliedDocumentList = list;
    }

    /** 
     * Get the 'MunicipalService' element value. Государственная или муниципальная услуга
     * 
     * @return value
     */
    public MunicipalServiceType getMunicipalService() {
        return municipalService;
    }

    /** 
     * Set the 'MunicipalService' element value. Государственная или муниципальная услуга
     * 
     * @param municipalService
     */
    public void setMunicipalService(MunicipalServiceType municipalService) {
        this.municipalService = municipalService;
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
