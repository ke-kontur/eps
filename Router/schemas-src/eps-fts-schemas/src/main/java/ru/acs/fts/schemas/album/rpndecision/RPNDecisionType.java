
package ru.acs.fts.schemas.album.rpndecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Санитарно-карантинный контроль 
 */
public class RPNDecisionType extends BaseDocType
{
    private LocalDate decisionDate;
    private String decisionTime;
    private String decision;
    private String kppName;
    private TransportMeansBaseType transport;
    private GoodsDescriptionType goodsDescription;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private PersonBaseType officer;
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата принятия решения
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. Время принятия решения
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. Время принятия решения
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the 'Decision' element value. Принятое решение
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Принятое решение
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'KppName' element value. Наименование пропускного пункта
     * 
     * @return value
     */
    public String getKppName() {
        return kppName;
    }

    /** 
     * Set the 'KppName' element value. Наименование пропускного пункта
     * 
     * @param kppName
     */
    public void setKppName(String kppName) {
        this.kppName = kppName;
    }

    /** 
     * Get the 'Transport' element value. Транспортное средство международной перевозки
     * 
     * @return value
     */
    public TransportMeansBaseType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. Транспортное средство международной перевозки
     * 
     * @param transport
     */
    public void setTransport(TransportMeansBaseType transport) {
        this.transport = transport;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание товара
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель товара
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель товара
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Получатель товара
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель товара
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Officer' element value. Инспектор
     * 
     * @return value
     */
    public PersonBaseType getOfficer() {
        return officer;
    }

    /** 
     * Set the 'Officer' element value. Инспектор
     * 
     * @param officer
     */
    public void setOfficer(PersonBaseType officer) {
        this.officer = officer;
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
