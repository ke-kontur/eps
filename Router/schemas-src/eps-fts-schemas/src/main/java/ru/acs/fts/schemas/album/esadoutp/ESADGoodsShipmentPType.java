
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;

/** 
 * Сведения о товарной партии.
 */
public class ESADGoodsShipmentPType
{
    private String originCountryName;
    private String totalPackageNumber;
    private String totalCustCost;
    private String custCostCurrencyCode;
    private String totalGrossWeight;
    private String consignmentIdentifier;
    private String departureCustomsCode;
    private String borderCustomsOffice;
    private CUOrganizationType ESADoutConsignorP;
    private CUOrganizationType ESADoutConsigneeP;
    private ESADoutCarrierPType ESADoutCarrierP;
    private ESADoutDeclarantPType ESADoutDeclarantP;
    private CUESADMainContractTermsType ESADoutMainContractTermsP;
    private ESADoutConsigmenPType ESADoutConsigmenP;
    private List<ESADoutGoodsPType> ESADoutGoodsPList = new ArrayList<ESADoutGoodsPType>();
    private CustomsPaymentsPType customsPaymentsP;
    private List<TransportDocumentType> transportDocumentList = new ArrayList<TransportDocumentType>();
    private List<ConfirmingOrganizationType> confirmingOrganizationList = new ArrayList<ConfirmingOrganizationType>();

    /** 
     * Get the 'OriginCountryName' element value. Страна происхождения товара. Наименование / разные / неизвестна.
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Страна происхождения товара. Наименование / разные / неизвестна.
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест.
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'TotalCustCost' element value. Сведения о стоимости/общая таможенная стоимость
     * 
     * @return value
     */
    public String getTotalCustCost() {
        return totalCustCost;
    }

    /** 
     * Set the 'TotalCustCost' element value. Сведения о стоимости/общая таможенная стоимость
     * 
     * @param totalCustCost
     */
    public void setTotalCustCost(String totalCustCost) {
        this.totalCustCost = totalCustCost;
    }

    /** 
     * Get the 'CustCostCurrencyCode' element value. Цифровой код валюты таможенной стоимости.
     * 
     * @return value
     */
    public String getCustCostCurrencyCode() {
        return custCostCurrencyCode;
    }

    /** 
     * Set the 'CustCostCurrencyCode' element value. Цифровой код валюты таможенной стоимости.
     * 
     * @param custCostCurrencyCode
     */
    public void setCustCostCurrencyCode(String custCostCurrencyCode) {
        this.custCostCurrencyCode = custCostCurrencyCode;
    }

    /** 
     * Get the 'TotalGrossWeight' element value. Общий вес товара брутто (кг)
     * 
     * @return value
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /** 
     * Set the 'TotalGrossWeight' element value. Общий вес товара брутто (кг)
     * 
     * @param totalGrossWeight
     */
    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /** 
     * Get the 'ConsignmentIdentifier' element value. Уникальный номер перевозки
     * 
     * @return value
     */
    public String getConsignmentIdentifier() {
        return consignmentIdentifier;
    }

    /** 
     * Set the 'ConsignmentIdentifier' element value. Уникальный номер перевозки
     * 
     * @param consignmentIdentifier
     */
    public void setConsignmentIdentifier(String consignmentIdentifier) {
        this.consignmentIdentifier = consignmentIdentifier;
    }

    /** 
     * Get the 'DepartureCustomsCode' element value. Код таможенного органа отправления
     * 
     * @return value
     */
    public String getDepartureCustomsCode() {
        return departureCustomsCode;
    }

    /** 
     * Set the 'DepartureCustomsCode' element value. Код таможенного органа отправления
     * 
     * @param departureCustomsCode
     */
    public void setDepartureCustomsCode(String departureCustomsCode) {
        this.departureCustomsCode = departureCustomsCode;
    }

    /** 
     * Get the 'BorderCustomsOffice' element value. Код таможенного органа вывоза
     * 
     * @return value
     */
    public String getBorderCustomsOffice() {
        return borderCustomsOffice;
    }

    /** 
     * Set the 'BorderCustomsOffice' element value. Код таможенного органа вывоза
     * 
     * @param borderCustomsOffice
     */
    public void setBorderCustomsOffice(String borderCustomsOffice) {
        this.borderCustomsOffice = borderCustomsOffice;
    }

    /** 
     * Get the 'ESADoutConsignorP' element value. Сведения об отправителе товаров
     * 
     * @return value
     */
    public CUOrganizationType getESADoutConsignorP() {
        return ESADoutConsignorP;
    }

    /** 
     * Set the 'ESADoutConsignorP' element value. Сведения об отправителе товаров
     * 
     * @param ESADoutConsignorP
     */
    public void setESADoutConsignorP(CUOrganizationType ESADoutConsignorP) {
        this.ESADoutConsignorP = ESADoutConsignorP;
    }

    /** 
     * Get the 'ESADoutConsigneeP' element value. Сведения о получателе товаров
     * 
     * @return value
     */
    public CUOrganizationType getESADoutConsigneeP() {
        return ESADoutConsigneeP;
    }

    /** 
     * Set the 'ESADoutConsigneeP' element value. Сведения о получателе товаров
     * 
     * @param ESADoutConsigneeP
     */
    public void setESADoutConsigneeP(CUOrganizationType ESADoutConsigneeP) {
        this.ESADoutConsigneeP = ESADoutConsigneeP;
    }

    /** 
     * Get the 'ESADoutCarrierP' element value. Сведения о перевозчике товаров
     * 
     * @return value
     */
    public ESADoutCarrierPType getESADoutCarrierP() {
        return ESADoutCarrierP;
    }

    /** 
     * Set the 'ESADoutCarrierP' element value. Сведения о перевозчике товаров
     * 
     * @param ESADoutCarrierP
     */
    public void setESADoutCarrierP(ESADoutCarrierPType ESADoutCarrierP) {
        this.ESADoutCarrierP = ESADoutCarrierP;
    }

    /** 
     * Get the 'ESADoutDeclarantP' element value. Сведения о декларанте товаров
     * 
     * @return value
     */
    public ESADoutDeclarantPType getESADoutDeclarantP() {
        return ESADoutDeclarantP;
    }

    /** 
     * Set the 'ESADoutDeclarantP' element value. Сведения о декларанте товаров
     * 
     * @param ESADoutDeclarantP
     */
    public void setESADoutDeclarantP(ESADoutDeclarantPType ESADoutDeclarantP) {
        this.ESADoutDeclarantP = ESADoutDeclarantP;
    }

    /** 
     * Get the 'ESADoutMainContractTermsP' element value. Сведения об условиях сделки
     * 
     * @return value
     */
    public CUESADMainContractTermsType getESADoutMainContractTermsP() {
        return ESADoutMainContractTermsP;
    }

    /** 
     * Set the 'ESADoutMainContractTermsP' element value. Сведения об условиях сделки
     * 
     * @param ESADoutMainContractTermsP
     */
    public void setESADoutMainContractTermsP(
            CUESADMainContractTermsType ESADoutMainContractTermsP) {
        this.ESADoutMainContractTermsP = ESADoutMainContractTermsP;
    }

    /** 
     * Get the 'ESADoutConsigmenP' element value. Сведения о перевозке товаров
     * 
     * @return value
     */
    public ESADoutConsigmenPType getESADoutConsigmenP() {
        return ESADoutConsigmenP;
    }

    /** 
     * Set the 'ESADoutConsigmenP' element value. Сведения о перевозке товаров
     * 
     * @param ESADoutConsigmenP
     */
    public void setESADoutConsigmenP(ESADoutConsigmenPType ESADoutConsigmenP) {
        this.ESADoutConsigmenP = ESADoutConsigmenP;
    }

    /** 
     * Get the list of 'ESADoutGoodsP' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<ESADoutGoodsPType> getESADoutGoodsPList() {
        return ESADoutGoodsPList;
    }

    /** 
     * Set the list of 'ESADoutGoodsP' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setESADoutGoodsPList(List<ESADoutGoodsPType> list) {
        ESADoutGoodsPList = list;
    }

    /** 
     * Get the 'CustomsPaymentsP' element value. Таможенные платежи к уплате
     * 
     * @return value
     */
    public CustomsPaymentsPType getCustomsPaymentsP() {
        return customsPaymentsP;
    }

    /** 
     * Set the 'CustomsPaymentsP' element value. Таможенные платежи к уплате
     * 
     * @param customsPaymentsP
     */
    public void setCustomsPaymentsP(CustomsPaymentsPType customsPaymentsP) {
        this.customsPaymentsP = customsPaymentsP;
    }

    /** 
     * Get the list of 'TransportDocument' element items. Информация о транспортных документах
     * 
     * @return list
     */
    public List<TransportDocumentType> getTransportDocumentList() {
        return transportDocumentList;
    }

    /** 
     * Set the list of 'TransportDocument' element items. Информация о транспортных документах
     * 
     * @param list
     */
    public void setTransportDocumentList(List<TransportDocumentType> list) {
        transportDocumentList = list;
    }

    /** 
     * Get the list of 'ConfirmingOrganization' element items. Удостоверяющий
     * 
     * @return list
     */
    public List<ConfirmingOrganizationType> getConfirmingOrganizationList() {
        return confirmingOrganizationList;
    }

    /** 
     * Set the list of 'ConfirmingOrganization' element items. Удостоверяющий
     * 
     * @param list
     */
    public void setConfirmingOrganizationList(
            List<ConfirmingOrganizationType> list) {
        confirmingOrganizationList = list;
    }
}
