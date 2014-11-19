
package ru.acs.fts.schemas.album.rpndecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ���������-����������� �������� 
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
     * Get the 'DecisionDate' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� �������� �������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. ����� �������� �������
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the 'Decision' element value. �������� �������
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������� �������
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'KppName' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public String getKppName() {
        return kppName;
    }

    /** 
     * Set the 'KppName' element value. ������������ ����������� ������
     * 
     * @param kppName
     */
    public void setKppName(String kppName) {
        this.kppName = kppName;
    }

    /** 
     * Get the 'Transport' element value. ������������ �������� ������������� ���������
     * 
     * @return value
     */
    public TransportMeansBaseType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. ������������ �������� ������������� ���������
     * 
     * @param transport
     */
    public void setTransport(TransportMeansBaseType transport) {
        this.transport = transport;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'Consignor' element value. ����������� ������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������� ������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ���������� ������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� ������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Officer' element value. ���������
     * 
     * @return value
     */
    public PersonBaseType getOfficer() {
        return officer;
    }

    /** 
     * Set the 'Officer' element value. ���������
     * 
     * @param officer
     */
    public void setOfficer(PersonBaseType officer) {
        this.officer = officer;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
