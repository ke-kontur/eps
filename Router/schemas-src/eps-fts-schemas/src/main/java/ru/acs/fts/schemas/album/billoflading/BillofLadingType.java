
package ru.acs.fts.schemas.album.billoflading;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * Коносамент
 */
public class BillofLadingType extends BaseDocType
{
    private String languageCode;
    private String copyNumber;
    private String clause;
    private String BOLDescription;
    private String PIRegID;
    private RegistrationDocumentType registrationDocument;
    private VesselType vessel;
    private PortLoadType loading;
    private PortLoadType unloading;
    private OrganizationType carrier;
    private OrganizationType consignee;
    private OrganizationType consignor;
    private FreightType freight;
    private DestinationType destination;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private PersonNamePostTypeType documentSignature;
    private ReceiptOrDeliveryPlaceType placeOfDelivery;
    private ReceiptOrDeliveryPlaceType placeOfReceipt;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'LanguageCode' element value. Код языка коносамента
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. Код языка коносамента
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'CopyNumber' element value. Число составленных экземпляров коносамента, заполняется если их больше чем один.
     * 
     * @return value
     */
    public String getCopyNumber() {
        return copyNumber;
    }

    /** 
     * Set the 'CopyNumber' element value. Число составленных экземпляров коносамента, заполняется если их больше чем один.
     * 
     * @param copyNumber
     */
    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    /** 
     * Get the 'Clause' element value. Особая оговорка в соответствующих случаях о том, что груз должен или может перевозиться на палубе
     * 
     * @return value
     */
    public String getClause() {
        return clause;
    }

    /** 
     * Set the 'Clause' element value. Особая оговорка в соответствующих случаях о том, что груз должен или может перевозиться на палубе
     * 
     * @param clause
     */
    public void setClause(String clause) {
        this.clause = clause;
    }

    /** 
     * Get the 'BOLDescription' element value. Тип коносамента (именной коносамент) или указание, что коносамент выдан "приказу отправителя", либо наименование получателя с указанием, что коносамент выдан "приказу получателя" (ордерный коносамент), или указание, что коносамент выдан на предъявителя (коносамент на предъявителя); если в ордерном коносаменте не указано, что он составлен "приказу получателя", то он считается составленным "приказу отправителя"
     * 
     * @return value
     */
    public String getBOLDescription() {
        return BOLDescription;
    }

    /** 
     * Set the 'BOLDescription' element value. Тип коносамента (именной коносамент) или указание, что коносамент выдан "приказу отправителя", либо наименование получателя с указанием, что коносамент выдан "приказу получателя" (ордерный коносамент), или указание, что коносамент выдан на предъявителя (коносамент на предъявителя); если в ордерном коносаменте не указано, что он составлен "приказу получателя", то он считается составленным "приказу отправителя"
     * 
     * @param BOLDescription
     */
    public void setBOLDescription(String BOLDescription) {
        this.BOLDescription = BOLDescription;
    }

    /** 
     * Get the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'RegistrationDocument' element value. Информация о регистрации коносамента
     * 
     * @return value
     */
    public RegistrationDocumentType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. Информация о регистрации коносамента
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(
            RegistrationDocumentType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Vessel' element value. Реквизиты судна
     * 
     * @return value
     */
    public VesselType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. Реквизиты судна
     * 
     * @param vessel
     */
    public void setVessel(VesselType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the 'Loading' element value. Информация о погрузке груза
     * 
     * @return value
     */
    public PortLoadType getLoading() {
        return loading;
    }

    /** 
     * Set the 'Loading' element value. Информация о погрузке груза
     * 
     * @param loading
     */
    public void setLoading(PortLoadType loading) {
        this.loading = loading;
    }

    /** 
     * Get the 'Unloading' element value. Информация о разгрузке груза
     * 
     * @return value
     */
    public PortLoadType getUnloading() {
        return unloading;
    }

    /** 
     * Set the 'Unloading' element value. Информация о разгрузке груза
     * 
     * @param unloading
     */
    public void setUnloading(PortLoadType unloading) {
        this.unloading = unloading;
    }

    /** 
     * Get the 'Carrier' element value. Информация о перевозчике
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Информация о перевозчике
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignee' element value. Информация о получателе
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Информация о получателе
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. Информация об отправителе
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Информация об отправителе
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Freight' element value. Информация о платежах, причитающихся перевозчику 
     * 
     * @return value
     */
    public FreightType getFreight() {
        return freight;
    }

    /** 
     * Set the 'Freight' element value. Информация о платежах, причитающихся перевозчику 
     * 
     * @param freight
     */
    public void setFreight(FreightType freight) {
        this.freight = freight;
    }

    /** 
     * Get the 'Destination' element value. Место назначения груза либо, при наличие чартера, место назначения или направления судна 
     * 
     * @return value
     */
    public DestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. Место назначения груза либо, при наличие чартера, место назначения или направления судна 
     * 
     * @param destination
     */
    public void setDestination(DestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the list of 'Goods' element items. Описание груза.
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Описание груза.
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись документа капитаном, морским агентом или каким-либо другим лицом, надлежащим образом уполномоченным на то капитаном
     * 
     * @return value
     */
    public PersonNamePostTypeType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись документа капитаном, морским агентом или каким-либо другим лицом, надлежащим образом уполномоченным на то капитаном
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonNamePostTypeType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'PlaceOfDelivery' element value. Место отгрузки. Пункт, из которого поставщик производит отгрузку товара покупателя. Если договором не предусмотрено иное, то юридический адрес поставщика считается местом отгрузки
     * 
     * @return value
     */
    public ReceiptOrDeliveryPlaceType getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    /** 
     * Set the 'PlaceOfDelivery' element value. Место отгрузки. Пункт, из которого поставщик производит отгрузку товара покупателя. Если договором не предусмотрено иное, то юридический адрес поставщика считается местом отгрузки
     * 
     * @param placeOfDelivery
     */
    public void setPlaceOfDelivery(ReceiptOrDeliveryPlaceType placeOfDelivery) {
        this.placeOfDelivery = placeOfDelivery;
    }

    /** 
     * Get the 'PlaceOfReceipt' element value. Место получения груза перевозчиком
     * 
     * @return value
     */
    public ReceiptOrDeliveryPlaceType getPlaceOfReceipt() {
        return placeOfReceipt;
    }

    /** 
     * Set the 'PlaceOfReceipt' element value. Место получения груза перевозчиком
     * 
     * @param placeOfReceipt
     */
    public void setPlaceOfReceipt(ReceiptOrDeliveryPlaceType placeOfReceipt) {
        this.placeOfReceipt = placeOfReceipt;
    }

    /** 
     * Get the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
