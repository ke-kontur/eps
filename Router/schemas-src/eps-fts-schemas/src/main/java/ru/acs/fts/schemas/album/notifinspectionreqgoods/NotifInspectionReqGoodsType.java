
package ru.acs.fts.schemas.album.notifinspectionreqgoods;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Уведомление о проведении таможенного досмотра/ Требование о предъявлении товаров 
 */
public class NotifInspectionReqGoodsType extends BaseDocType
{
    private String otherwise;
    private LocalDate notifReqDate;
    private LocalDate inspDate;
    private String inspTime;
    private String identificationGoods;
    private String presence;
    private String documentKind;
    private CUCustomsType customs;
    private DocIDType docID;
    private List<InspectionPlaceType> inspectionPlaceList = new ArrayList<InspectionPlaceType>();
    private CustomsPersonType customsPerson;
    private DirectionNotifReqType directionNotifReq;
    private DeclarantType declarant;
    private String documentModeID;

    /** 
     * Get the 'Otherwise' element value. Иные случаи
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. Иные случаи
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'NotifReqDate' element value. Дата уведомления/требования
     * 
     * @return value
     */
    public LocalDate getNotifReqDate() {
        return notifReqDate;
    }

    /** 
     * Set the 'NotifReqDate' element value. Дата уведомления/требования
     * 
     * @param notifReqDate
     */
    public void setNotifReqDate(LocalDate notifReqDate) {
        this.notifReqDate = notifReqDate;
    }

    /** 
     * Get the 'InspDate' element value. Дата проведения досмотра
     * 
     * @return value
     */
    public LocalDate getInspDate() {
        return inspDate;
    }

    /** 
     * Set the 'InspDate' element value. Дата проведения досмотра
     * 
     * @param inspDate
     */
    public void setInspDate(LocalDate inspDate) {
        this.inspDate = inspDate;
    }

    /** 
     * Get the 'InspTime' element value. Время проведения досмотра
     * 
     * @return value
     */
    public String getInspTime() {
        return inspTime;
    }

    /** 
     * Set the 'InspTime' element value. Время проведения досмотра
     * 
     * @param inspTime
     */
    public void setInspTime(String inspTime) {
        this.inspTime = inspTime;
    }

    /** 
     * Get the 'IdentificationGoods' element value. Информация, идентифицирующая товары
     * 
     * @return value
     */
    public String getIdentificationGoods() {
        return identificationGoods;
    }

    /** 
     * Set the 'IdentificationGoods' element value. Информация, идентифицирующая товары
     * 
     * @param identificationGoods
     */
    public void setIdentificationGoods(String identificationGoods) {
        this.identificationGoods = identificationGoods;
    }

    /** 
     * Get the 'Presence' element value. Признак того, что требуется присутствие при таможенном досмотре
     * 
     * @return value
     */
    public String getPresence() {
        return presence;
    }

    /** 
     * Set the 'Presence' element value. Признак того, что требуется присутствие при таможенном досмотре
     * 
     * @param presence
     */
    public void setPresence(String presence) {
        this.presence = presence;
    }

    /** 
     * Get the 'DocumentKind' element value. Тип документа: 0- уведомление о проведении таможенного досмотра, 1 - требование о предъявлении товаров
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. Тип документа: 0- уведомление о проведении таможенного досмотра, 1 - требование о предъявлении товаров
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DocID' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public DocIDType getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. Регистрационный номер документа
     * 
     * @param docID
     */
    public void setDocID(DocIDType docID) {
        this.docID = docID;
    }

    /** 
     * Get the list of 'InspectionPlace' element items. Место проведения таможенного досмотра (осмотра)
     * 
     * @return list
     */
    public List<InspectionPlaceType> getInspectionPlaceList() {
        return inspectionPlaceList;
    }

    /** 
     * Set the list of 'InspectionPlace' element items. Место проведения таможенного досмотра (осмотра)
     * 
     * @param list
     */
    public void setInspectionPlaceList(List<InspectionPlaceType> list) {
        inspectionPlaceList = list;
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
     * Get the 'DirectionNotifReq' element value. При направлении уведомления/требования по почте или иным способом
     * 
     * @return value
     */
    public DirectionNotifReqType getDirectionNotifReq() {
        return directionNotifReq;
    }

    /** 
     * Set the 'DirectionNotifReq' element value. При направлении уведомления/требования по почте или иным способом
     * 
     * @param directionNotifReq
     */
    public void setDirectionNotifReq(DirectionNotifReqType directionNotifReq) {
        this.directionNotifReq = directionNotifReq;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте, ином лице, обладающем полномочиями в отношении товаров и (или) транспортных средств, и их представителей.
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте, ином лице, обладающем полномочиями в отношении товаров и (или) транспортных средств, и их представителей.
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
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
