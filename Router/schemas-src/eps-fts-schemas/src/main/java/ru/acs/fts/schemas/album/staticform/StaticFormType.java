
package ru.acs.fts.schemas.album.staticform;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Статистическая форма учета перемещения товара
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
     * Get the 'CustomsProcedure' element value. Направление перемещения: ИМ/ЭК
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Направление перемещения: ИМ/ЭК
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства на границе в соответствии с классификатором.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства на границе в соответствии с классификатором.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'ReportingDate' element value. Отчетный месяц перемещения товаров
     * 
     * @return value
     */
    public String getReportingDate() {
        return reportingDate;
    }

    /** 
     * Set the 'ReportingDate' element value. Отчетный месяц перемещения товаров
     * 
     * @param reportingDate
     */
    public void setReportingDate(String reportingDate) {
        this.reportingDate = reportingDate;
    }

    /** 
     * Get the 'NSF' element value. Системный номер статистической формы
     * 
     * @return value
     */
    public String getNSF() {
        return NSF;
    }

    /** 
     * Set the 'NSF' element value. Системный номер статистической формы
     * 
     * @param NSF
     */
    public void setNSF(String NSF) {
        this.NSF = NSF;
    }

    /** 
     * Get the 'Consignor' element value. Сведения об отправителе
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения об отправителе
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о получателе
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о получателе
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'FinancialAdjustingResponsiblePerson' element value. Лицо ответственное за финансовое урегулирование.
     * 
     * @return value
     */
    public FinancialAdjustingResponsiblePersonType getFinancialAdjustingResponsiblePerson() {
        return financialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'FinancialAdjustingResponsiblePerson' element value. Лицо ответственное за финансовое урегулирование.
     * 
     * @param financialAdjustingResponsiblePerson
     */
    public void setFinancialAdjustingResponsiblePerson(
            FinancialAdjustingResponsiblePersonType financialAdjustingResponsiblePerson) {
        this.financialAdjustingResponsiblePerson = financialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'TradeCountry' element value. Торгующая страна
     * 
     * @return value
     */
    public CountryInfoType getTradeCountry() {
        return tradeCountry;
    }

    /** 
     * Set the 'TradeCountry' element value. Торгующая страна
     * 
     * @param tradeCountry
     */
    public void setTradeCountry(CountryInfoType tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    /** 
     * Get the 'DispatchCountry' element value. Страна отправления
     * 
     * @return value
     */
    public CountryInfoType getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. Страна отправления
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(CountryInfoType dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения
     * 
     * @return value
     */
    public CountryInfoType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInfoType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the list of 'Documents' element items. Документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Documents' element items. Документы
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
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
     * Get the 'ProvidePerson' element value. Сведения о лице, ответственное за предоставление статистической формы (лицо, уполномоченное предоставлять статистическую форму от имени юридического лица)
     * 
     * @return value
     */
    public ProvidePersonType getProvidePerson() {
        return providePerson;
    }

    /** 
     * Set the 'ProvidePerson' element value. Сведения о лице, ответственное за предоставление статистической формы (лицо, уполномоченное предоставлять статистическую форму от имени юридического лица)
     * 
     * @param providePerson
     */
    public void setProvidePerson(ProvidePersonType providePerson) {
        this.providePerson = providePerson;
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
