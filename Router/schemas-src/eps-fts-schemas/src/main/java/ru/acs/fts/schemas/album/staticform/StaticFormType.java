
package ru.acs.fts.schemas.album.staticform;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ����� ����� ����������� ������
 */
public class StaticFormType extends BaseDocType
{
    private String customsProcedure;
    private String transportModeCode;
    private String reportingDate;
    private String NSF;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private FinancialAdjustingResponsiblePersonType financialAdjustingResponsiblePerson;
    private CountryInfoType tradeCountry;
    private CountryInfoType dispatchCountry;
    private CountryInfoType destinationCountry;
    private List<DocumentBaseType> documentList = new ArrayList<DocumentBaseType>();
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private ProvidePersonType providePerson;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value. ����������� �����������: ��/��
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ����������� �����������: ��/��
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� ������� � ������������ � ���������������.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� ������� � ������������ � ���������������.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'ReportingDate' element value. �������� ����� ����������� �������
     * 
     * @return value
     */
    public String getReportingDate() {
        return reportingDate;
    }

    /** 
     * Set the 'ReportingDate' element value. �������� ����� ����������� �������
     * 
     * @param reportingDate
     */
    public void setReportingDate(String reportingDate) {
        this.reportingDate = reportingDate;
    }

    /** 
     * Get the 'NSF' element value. ��������� ����� �������������� �����
     * 
     * @return value
     */
    public String getNSF() {
        return NSF;
    }

    /** 
     * Set the 'NSF' element value. ��������� ����� �������������� �����
     * 
     * @param NSF
     */
    public void setNSF(String NSF) {
        this.NSF = NSF;
    }

    /** 
     * Get the 'Consignor' element value. �������� �� �����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� �� �����������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ����������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'FinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������.
     * 
     * @return value
     */
    public FinancialAdjustingResponsiblePersonType getFinancialAdjustingResponsiblePerson() {
        return financialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'FinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������.
     * 
     * @param financialAdjustingResponsiblePerson
     */
    public void setFinancialAdjustingResponsiblePerson(
            FinancialAdjustingResponsiblePersonType financialAdjustingResponsiblePerson) {
        this.financialAdjustingResponsiblePerson = financialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'TradeCountry' element value. ��������� ������
     * 
     * @return value
     */
    public CountryInfoType getTradeCountry() {
        return tradeCountry;
    }

    /** 
     * Set the 'TradeCountry' element value. ��������� ������
     * 
     * @param tradeCountry
     */
    public void setTradeCountry(CountryInfoType tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    /** 
     * Get the 'DispatchCountry' element value. ������ �����������
     * 
     * @return value
     */
    public CountryInfoType getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. ������ �����������
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(CountryInfoType dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������
     * 
     * @return value
     */
    public CountryInfoType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInfoType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the list of 'Documents' element items. ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Documents' element items. ���������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'ProvidePerson' element value. �������� � ����, ������������� �� �������������� �������������� ����� (����, �������������� ������������� �������������� ����� �� ����� ������������ ����)
     * 
     * @return value
     */
    public ProvidePersonType getProvidePerson() {
        return providePerson;
    }

    /** 
     * Set the 'ProvidePerson' element value. �������� � ����, ������������� �� �������������� �������������� ����� (����, �������������� ������������� �������������� ����� �� ����� ������������ ����)
     * 
     * @param providePerson
     */
    public void setProvidePerson(ProvidePersonType providePerson) {
        this.providePerson = providePerson;
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
