
package ru.acs.fts.schemas.album.gtdobligation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������������� � ������ ���������� ���������� � ������������� ����������� ���������� � ��������
 */
public class GTDObligationType extends BaseDocType
{
    private LocalDate dateSign;
    private String goodsUsagePurpose;
    private String goodsDirection;
    private String totalGoodsQuantity;
    private String currencyRate;
    private String currencyCode;
    private String containerSign;
    private String filledPerson;
    private List<String> simplificationList = new ArrayList<String>();
    private String customsName;
    private CustomsProcedureType ESADCustomsProcedure;
    private List<ObligationGoodsType> obligationGoodList = new ArrayList<ObligationGoodsType>();
    private OrganizationType obligationDeclarant;
    private InfoCustomsPayType infoCustomsPay;
    private CountryType tradeCountry;
    private CountryType departureCountry;
    private CountryType originCountry;
    private CountryType destinationCountry;
    private List<TransportInfoType> transportList = new ArrayList<TransportInfoType>();
    private OrganizationType consignor;
    private OrganizationType consignee;
    private CustBrokerType custBroker;
    private List<PresentedDocumentsType> presentedDocumentList = new ArrayList<PresentedDocumentsType>();
    private String documentModeID;

    /** 
     * Get the 'DateSign' element value. ���� ���������� ����������� ��� ���������� ��������������
     * 
     * @return value
     */
    public LocalDate getDateSign() {
        return dateSign;
    }

    /** 
     * Set the 'DateSign' element value. ���� ���������� ����������� ��� ���������� ��������������
     * 
     * @param dateSign
     */
    public void setDateSign(LocalDate dateSign) {
        this.dateSign = dateSign;
    }

    /** 
     * Get the 'GoodsUsagePurpose' element value. ���� ������������� �������
     * 
     * @return value
     */
    public String getGoodsUsagePurpose() {
        return goodsUsagePurpose;
    }

    /** 
     * Set the 'GoodsUsagePurpose' element value. ���� ������������� �������
     * 
     * @param goodsUsagePurpose
     */
    public void setGoodsUsagePurpose(String goodsUsagePurpose) {
        this.goodsUsagePurpose = goodsUsagePurpose;
    }

    /** 
     * Get the 'GoodsDirection' element value. ����������� ����������� ������� (��, ��)
     * 
     * @return value
     */
    public String getGoodsDirection() {
        return goodsDirection;
    }

    /** 
     * Set the 'GoodsDirection' element value. ����������� ����������� ������� (��, ��)
     * 
     * @param goodsDirection
     */
    public void setGoodsDirection(String goodsDirection) {
        this.goodsDirection = goodsDirection;
    }

    /** 
     * Get the 'TotalGoodsQuantity' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getTotalGoodsQuantity() {
        return totalGoodsQuantity;
    }

    /** 
     * Set the 'TotalGoodsQuantity' element value. ����� ������������ �������
     * 
     * @param totalGoodsQuantity
     */
    public void setTotalGoodsQuantity(String totalGoodsQuantity) {
        this.totalGoodsQuantity = totalGoodsQuantity;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ���� ��������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ���� ��������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ContainerSign' element value. ������� ������������ ���������: 1 - ���� ��������� ������� (���� �� ������ �� ���) ����� ���. ������� ������������ (�������������) � ����������; 0 - � ���� ������� (� ��� �����, ���� �������� � ��������� ����������)
     * 
     * @return value
     */
    public String getContainerSign() {
        return containerSign;
    }

    /** 
     * Set the 'ContainerSign' element value. ������� ������������ ���������: 1 - ���� ��������� ������� (���� �� ������ �� ���) ����� ���. ������� ������������ (�������������) � ����������; 0 - � ���� ������� (� ��� �����, ���� �������� � ��������� ����������)
     * 
     * @param containerSign
     */
    public void setContainerSign(String containerSign) {
        this.containerSign = containerSign;
    }

    /** 
     * Get the 'FilledPerson' element value. ������ ����, ��������� �������������
     * 
     * @return value
     */
    public String getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. ������ ����, ��������� �������������
     * 
     * @param filledPerson
     */
    public void setFilledPerson(String filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the list of 'Simplification' element items. ������������ ���������
     * 
     * @return list
     */
    public List<String> getSimplificationList() {
        return simplificationList;
    }

    /** 
     * Set the list of 'Simplification' element items. ������������ ���������
     * 
     * @param list
     */
    public void setSimplificationList(List<String> list) {
        simplificationList = list;
    }

    /** 
     * Get the 'CustomsName' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public String getCustomsName() {
        return customsName;
    }

    /** 
     * Set the 'CustomsName' element value. ������������ ����������� ������
     * 
     * @param customsName
     */
    public void setCustomsName(String customsName) {
        this.customsName = customsName;
    }

    /** 
     * Get the 'ESADCustomsProcedure' element value. ���������� ���������
     * 
     * @return value
     */
    public CustomsProcedureType getESADCustomsProcedure() {
        return ESADCustomsProcedure;
    }

    /** 
     * Set the 'ESADCustomsProcedure' element value. ���������� ���������
     * 
     * @param ESADCustomsProcedure
     */
    public void setESADCustomsProcedure(
            CustomsProcedureType ESADCustomsProcedure) {
        this.ESADCustomsProcedure = ESADCustomsProcedure;
    }

    /** 
     * Get the list of 'ObligationGoods' element items. ������, � ������� ������� ������ ����������� ���������
     * 
     * @return list
     */
    public List<ObligationGoodsType> getObligationGoodList() {
        return obligationGoodList;
    }

    /** 
     * Set the list of 'ObligationGoods' element items. ������, � ������� ������� ������ ����������� ���������
     * 
     * @param list
     */
    public void setObligationGoodList(List<ObligationGoodsType> list) {
        obligationGoodList = list;
    }

    /** 
     * Get the 'ObligationDeclarant' element value. ��������� �������������
     * 
     * @return value
     */
    public OrganizationType getObligationDeclarant() {
        return obligationDeclarant;
    }

    /** 
     * Set the 'ObligationDeclarant' element value. ��������� �������������
     * 
     * @param obligationDeclarant
     */
    public void setObligationDeclarant(OrganizationType obligationDeclarant) {
        this.obligationDeclarant = obligationDeclarant;
    }

    /** 
     * Get the 'InfoCustomsPay' element value. �������� �� ����������� ���������� �������� (�����������, ���� ����������� ������ ����������   ��������  ��� ���������  ����������� ������ ������������� ���������� ��������, � ���� ������ - �� �����������)
     * 
     * @return value
     */
    public InfoCustomsPayType getInfoCustomsPay() {
        return infoCustomsPay;
    }

    /** 
     * Set the 'InfoCustomsPay' element value. �������� �� ����������� ���������� �������� (�����������, ���� ����������� ������ ����������   ��������  ��� ���������  ����������� ������ ������������� ���������� ��������, � ���� ������ - �� �����������)
     * 
     * @param infoCustomsPay
     */
    public void setInfoCustomsPay(InfoCustomsPayType infoCustomsPay) {
        this.infoCustomsPay = infoCustomsPay;
    }

    /** 
     * Get the 'TradeCountry' element value. ��������� ������
     * 
     * @return value
     */
    public CountryType getTradeCountry() {
        return tradeCountry;
    }

    /** 
     * Set the 'TradeCountry' element value. ��������� ������
     * 
     * @param tradeCountry
     */
    public void setTradeCountry(CountryType tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    /** 
     * Get the 'DepartureCountry' element value. ������ �����������
     * 
     * @return value
     */
    public CountryType getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. ������ �����������
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(CountryType departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(CountryType originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������
     * 
     * @return value
     */
    public CountryType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the list of 'Transport' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TransportInfoType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTransportList(List<TransportInfoType> list) {
        transportList = list;
    }

    /** 
     * Get the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ���������� �������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'CustBroker' element value. ���������� �������������
     * 
     * @return value
     */
    public CustBrokerType getCustBroker() {
        return custBroker;
    }

    /** 
     * Set the 'CustBroker' element value. ���������� �������������
     * 
     * @param custBroker
     */
    public void setCustBroker(CustBrokerType custBroker) {
        this.custBroker = custBroker;
    }

    /** 
     * Get the list of 'PresentedDocuments' element items. �������������� ���������
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocuments' element items. �������������� ���������
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentsType> list) {
        presentedDocumentList = list;
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
