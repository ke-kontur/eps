
package ru.acs.fts.schemas.album.whgoodout;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Уведомление о принятии решения о выдаче товаров с СВХ
 */
public class WHGoodOutType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private LocalDate releaseDate;
    private String comments;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<DeliveryGoodsType> deliveryGoodList = new ArrayList<DeliveryGoodsType>();
    private DocumentBaseType produceDocuments;
    private SVHLicenceNumberType SVHLicenceNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления уведомление
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления уведомление
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления уведомление
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления уведомление
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'ReleaseDate' element value. Дата выпуска
     * 
     * @return value
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /** 
     * Set the 'ReleaseDate' element value. Дата выпуска
     * 
     * @param releaseDate
     */
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * Get the list of 'DeliveryGoods' element items. Основание на выдачу товаров
     * 
     * @return list
     */
    public List<DeliveryGoodsType> getDeliveryGoodList() {
        return deliveryGoodList;
    }

    /** 
     * Set the list of 'DeliveryGoods' element items. Основание на выдачу товаров
     * 
     * @param list
     */
    public void setDeliveryGoodList(List<DeliveryGoodsType> list) {
        deliveryGoodList = list;
    }

    /** 
     * Get the 'ProduceDocuments' element value. Сведения о выпускающем документе
     * 
     * @return value
     */
    public DocumentBaseType getProduceDocuments() {
        return produceDocuments;
    }

    /** 
     * Set the 'ProduceDocuments' element value. Сведения о выпускающем документе
     * 
     * @param produceDocuments
     */
    public void setProduceDocuments(DocumentBaseType produceDocuments) {
        this.produceDocuments = produceDocuments;
    }

    /** 
     * Get the 'SVHLicenceNumber' element value. Номер лицензии СВХ
     * 
     * @return value
     */
    public SVHLicenceNumberType getSVHLicenceNumber() {
        return SVHLicenceNumber;
    }

    /** 
     * Set the 'SVHLicenceNumber' element value. Номер лицензии СВХ
     * 
     * @param SVHLicenceNumber
     */
    public void setSVHLicenceNumber(SVHLicenceNumberType SVHLicenceNumber) {
        this.SVHLicenceNumber = SVHLicenceNumber;
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
