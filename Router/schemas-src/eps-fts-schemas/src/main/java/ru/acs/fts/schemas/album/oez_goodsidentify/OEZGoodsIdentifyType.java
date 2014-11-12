
package ru.acs.fts.schemas.album.oez_goodsidentify;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление о проведении идентификации товаров, ввозимых  (ввезенных) на территорию ОЭЗ
 */
public class OEZGoodsIdentifyType extends BaseDocType
{
    private LocalDate dateDocument;
    private List<String> reasonList = new ArrayList<String>();
    private List<String> placeIdentifyList = new ArrayList<String>();
    private List<String> activityList = new ArrayList<String>();
    private List<String> presentInfoList = new ArrayList<String>();
    private CustomsType customs;
    private ConsigneeType consignee;
    private RegistrationNumberImpType registrationNumberImp;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DateDocument' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDateDocument() {
        return dateDocument;
    }

    /** 
     * Set the 'DateDocument' element value. Дата документа
     * 
     * @param dateDocument
     */
    public void setDateDocument(LocalDate dateDocument) {
        this.dateDocument = dateDocument;
    }

    /** 
     * Get the list of 'Reason' element items. Причины, по которым принято решение о проведении идентификации товаров
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Причины, по которым принято решение о проведении идентификации товаров
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the list of 'PlaceIdentify' element items. Место проведения идентификации товаров
     * 
     * @return list
     */
    public List<String> getPlaceIdentifyList() {
        return placeIdentifyList;
    }

    /** 
     * Set the list of 'PlaceIdentify' element items. Место проведения идентификации товаров
     * 
     * @param list
     */
    public void setPlaceIdentifyList(List<String> list) {
        placeIdentifyList = list;
    }

    /** 
     * Get the list of 'Activity' element items. Действия необходимые совершить в отношении товаров и средств транспорта, перевозящих такие товары
     * 
     * @return list
     */
    public List<String> getActivityList() {
        return activityList;
    }

    /** 
     * Set the list of 'Activity' element items. Действия необходимые совершить в отношении товаров и средств транспорта, перевозящих такие товары
     * 
     * @param list
     */
    public void setActivityList(List<String> list) {
        activityList = list;
    }

    /** 
     * Get the list of 'PresentInfo' element items. Перечень документов и сведений необходимых представить в уполномоченный таможенный орган
     * 
     * @return list
     */
    public List<String> getPresentInfoList() {
        return presentInfoList;
    }

    /** 
     * Set the list of 'PresentInfo' element items. Перечень документов и сведений необходимых представить в уполномоченный таможенный орган
     * 
     * @param list
     */
    public void setPresentInfoList(List<String> list) {
        presentInfoList = list;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'RegistrationNumberImp' element value. Регистрационный номер уведомления о ввозе
     * 
     * @return value
     */
    public RegistrationNumberImpType getRegistrationNumberImp() {
        return registrationNumberImp;
    }

    /** 
     * Set the 'RegistrationNumberImp' element value. Регистрационный номер уведомления о ввозе
     * 
     * @param registrationNumberImp
     */
    public void setRegistrationNumberImp(
            RegistrationNumberImpType registrationNumberImp) {
        this.registrationNumberImp = registrationNumberImp;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
