
package ru.acs.fts.schemas.album.commissioninspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * Поручение на досмотр
 */
public class CommissionInspectionType extends BaseDocType
{
    private LocalDate dateInspection;
    private String timeInspection;
    private LocalDate dateCompile;
    private String timeDeliveryInspection;
    private String timeReceiptAct;
    private LocalDate dateReceiptAct;
    private String basisExamination;
    private String objectType;
    private GTDID6Type commissionInspectionID;
    private CustomsType customs;
    private List<CustomsPersonType> customsPersonList = new ArrayList<CustomsPersonType>();
    private TransportMeanType infoTransport;
    private PersonInspectionType personInspection;
    private AimInspectionType aimInspection;
    private VolumeInspectionType volumeInspection;
    private DegreeInspectionType degreeInspection;
    private List<IdentityMeansType> identityMeanList = new ArrayList<IdentityMeansType>();
    private GoodsLocationType goodsLocation;
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private DestinationType destination;
    private InfoGoodsType infoGoods;
    private CustomsPersonType customsChief;
    private CustomsPersonType customsPresonDecision;
    private List<ApplicationTSTKType> applicationTSTKList = new ArrayList<ApplicationTSTKType>();
    private String documentModeID;

    /** 
     * Get the 'DateInspection' element value. Срок до которого провести таможенный досмотр (дата)
     * 
     * @return value
     */
    public LocalDate getDateInspection() {
        return dateInspection;
    }

    /** 
     * Set the 'DateInspection' element value. Срок до которого провести таможенный досмотр (дата)
     * 
     * @param dateInspection
     */
    public void setDateInspection(LocalDate dateInspection) {
        this.dateInspection = dateInspection;
    }

    /** 
     * Get the 'TimeInspection' element value. Срок до которого провести таможенный досмотр (время)
     * 
     * @return value
     */
    public String getTimeInspection() {
        return timeInspection;
    }

    /** 
     * Set the 'TimeInspection' element value. Срок до которого провести таможенный досмотр (время)
     * 
     * @param timeInspection
     */
    public void setTimeInspection(String timeInspection) {
        this.timeInspection = timeInspection;
    }

    /** 
     * Get the 'DateCompile' element value. Дата составления и подписания поручения.
     * 
     * @return value
     */
    public LocalDate getDateCompile() {
        return dateCompile;
    }

    /** 
     * Set the 'DateCompile' element value. Дата составления и подписания поручения.
     * 
     * @param dateCompile
     */
    public void setDateCompile(LocalDate dateCompile) {
        this.dateCompile = dateCompile;
    }

    /** 
     * Get the 'TimeDeliveryInspection' element value. Время выдачи поручения
     * 
     * @return value
     */
    public String getTimeDeliveryInspection() {
        return timeDeliveryInspection;
    }

    /** 
     * Set the 'TimeDeliveryInspection' element value. Время выдачи поручения
     * 
     * @param timeDeliveryInspection
     */
    public void setTimeDeliveryInspection(String timeDeliveryInspection) {
        this.timeDeliveryInspection = timeDeliveryInspection;
    }

    /** 
     * Get the 'TimeReceiptAct' element value. Время получения акта
     * 
     * @return value
     */
    public String getTimeReceiptAct() {
        return timeReceiptAct;
    }

    /** 
     * Set the 'TimeReceiptAct' element value. Время получения акта
     * 
     * @param timeReceiptAct
     */
    public void setTimeReceiptAct(String timeReceiptAct) {
        this.timeReceiptAct = timeReceiptAct;
    }

    /** 
     * Get the 'DateReceiptAct' element value. Дата получения акта
     * 
     * @return value
     */
    public LocalDate getDateReceiptAct() {
        return dateReceiptAct;
    }

    /** 
     * Set the 'DateReceiptAct' element value. Дата получения акта
     * 
     * @param dateReceiptAct
     */
    public void setDateReceiptAct(LocalDate dateReceiptAct) {
        this.dateReceiptAct = dateReceiptAct;
    }

    /** 
     * Get the 'BasisExamination' element value. Основание для проведения досмотра
     * 
     * @return value
     */
    public String getBasisExamination() {
        return basisExamination;
    }

    /** 
     * Set the 'BasisExamination' element value. Основание для проведения досмотра
     * 
     * @param basisExamination
     */
    public void setBasisExamination(String basisExamination) {
        this.basisExamination = basisExamination;
    }

    /** 
     * Get the 'ObjectType' element value. Тип объекта: 1-товар; 2-транспортное средство
     * 
     * @return value
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. Тип объекта: 1-товар; 2-транспортное средство
     * 
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'CommissionInspectionID' element value. Регистрационный номер поручения на досмотр
     * 
     * @return value
     */
    public GTDID6Type getCommissionInspectionID() {
        return commissionInspectionID;
    }

    /** 
     * Set the 'CommissionInspectionID' element value. Регистрационный номер поручения на досмотр
     * 
     * @param commissionInspectionID
     */
    public void setCommissionInspectionID(GTDID6Type commissionInspectionID) {
        this.commissionInspectionID = commissionInspectionID;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'CustomsPerson' element items. Должностное лицо таможенного органа
     * 
     * @return list
     */
    public List<CustomsPersonType> getCustomsPersonList() {
        return customsPersonList;
    }

    /** 
     * Set the list of 'CustomsPerson' element items. Должностное лицо таможенного органа
     * 
     * @param list
     */
    public void setCustomsPersonList(List<CustomsPersonType> list) {
        customsPersonList = list;
    }

    /** 
     * Get the 'InfoTransport' element value. Сведения о транспорте
     * 
     * @return value
     */
    public TransportMeanType getInfoTransport() {
        return infoTransport;
    }

    /** 
     * Set the 'InfoTransport' element value. Сведения о транспорте
     * 
     * @param infoTransport
     */
    public void setInfoTransport(TransportMeanType infoTransport) {
        this.infoTransport = infoTransport;
    }

    /** 
     * Get the 'PersonInspection' element value. Лицо,обладающего полномочиями в отношении товаров и (или) транспортных средств.
     * 
     * @return value
     */
    public PersonInspectionType getPersonInspection() {
        return personInspection;
    }

    /** 
     * Set the 'PersonInspection' element value. Лицо,обладающего полномочиями в отношении товаров и (или) транспортных средств.
     * 
     * @param personInspection
     */
    public void setPersonInspection(PersonInspectionType personInspection) {
        this.personInspection = personInspection;
    }

    /** 
     * Get the 'AimInspection' element value. Цель досмотра
     * 
     * @return value
     */
    public AimInspectionType getAimInspection() {
        return aimInspection;
    }

    /** 
     * Set the 'AimInspection' element value. Цель досмотра
     * 
     * @param aimInspection
     */
    public void setAimInspection(AimInspectionType aimInspection) {
        this.aimInspection = aimInspection;
    }

    /** 
     * Get the 'VolumeInspection' element value. Объем досмотра
     * 
     * @return value
     */
    public VolumeInspectionType getVolumeInspection() {
        return volumeInspection;
    }

    /** 
     * Set the 'VolumeInspection' element value. Объем досмотра
     * 
     * @param volumeInspection
     */
    public void setVolumeInspection(VolumeInspectionType volumeInspection) {
        this.volumeInspection = volumeInspection;
    }

    /** 
     * Get the 'DegreeInspection' element value. Степень досмотра
     * 
     * @return value
     */
    public DegreeInspectionType getDegreeInspection() {
        return degreeInspection;
    }

    /** 
     * Set the 'DegreeInspection' element value. Степень досмотра
     * 
     * @param degreeInspection
     */
    public void setDegreeInspection(DegreeInspectionType degreeInspection) {
        this.degreeInspection = degreeInspection;
    }

    /** 
     * Get the list of 'IdentityMeans' element items. Средства идентификации
     * 
     * @return list
     */
    public List<IdentityMeansType> getIdentityMeanList() {
        return identityMeanList;
    }

    /** 
     * Set the list of 'IdentityMeans' element items. Средства идентификации
     * 
     * @param list
     */
    public void setIdentityMeanList(List<IdentityMeansType> list) {
        identityMeanList = list;
    }

    /** 
     * Get the 'GoodsLocation' element value. Местонахождение товаров.
     * 
     * @return value
     */
    public GoodsLocationType getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. Местонахождение товаров.
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(GoodsLocationType goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    /** 
     * Get the list of 'Document' element items. Cведения о транспортных (перевозочных) документах, коммерческих документах, книжке международной дорожной перевозки (МДП), таможенных документах.
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Cведения о транспортных (перевозочных) документах, коммерческих документах, книжке международной дорожной перевозки (МДП), таможенных документах.
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
    }

    /** 
     * Get the 'Destination' element value. Место назначения
     * 
     * @return value
     */
    public DestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. Место назначения
     * 
     * @param destination
     */
    public void setDestination(DestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the 'InfoGoods' element value. Сведения о товаре
     * 
     * @return value
     */
    public InfoGoodsType getInfoGoods() {
        return infoGoods;
    }

    /** 
     * Set the 'InfoGoods' element value. Сведения о товаре
     * 
     * @param infoGoods
     */
    public void setInfoGoods(InfoGoodsType infoGoods) {
        this.infoGoods = infoGoods;
    }

    /** 
     * Get the 'CustomsChief' element value. Начальник таможенного органа/заместитель начальника таможенного органа (первый заместитель)
     * 
     * @return value
     */
    public CustomsPersonType getCustomsChief() {
        return customsChief;
    }

    /** 
     * Set the 'CustomsChief' element value. Начальник таможенного органа/заместитель начальника таможенного органа (первый заместитель)
     * 
     * @param customsChief
     */
    public void setCustomsChief(CustomsPersonType customsChief) {
        this.customsChief = customsChief;
    }

    /** 
     * Get the 'CustomsPresonDecision' element value. Должностное лицо, принявшее решение о проведении досмотра.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPresonDecision() {
        return customsPresonDecision;
    }

    /** 
     * Set the 'CustomsPresonDecision' element value. Должностное лицо, принявшее решение о проведении досмотра.
     * 
     * @param customsPresonDecision
     */
    public void setCustomsPresonDecision(CustomsPersonType customsPresonDecision) {
        this.customsPresonDecision = customsPresonDecision;
    }

    /** 
     * Get the list of 'ApplicationTSTK' element items. Применение ТСТК
     * 
     * @return list
     */
    public List<ApplicationTSTKType> getApplicationTSTKList() {
        return applicationTSTKList;
    }

    /** 
     * Set the list of 'ApplicationTSTK' element items. Применение ТСТК
     * 
     * @param list
     */
    public void setApplicationTSTKList(List<ApplicationTSTKType> list) {
        applicationTSTKList = list;
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
