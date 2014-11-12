
package ru.acs.fts.schemas.album.requestmca;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация о ДТ и документе по запросу
 */
public class RequestMCAType extends BaseDocType
{
    private String transitDirectionCode;
    private String currencyCode;
    private String paymentsFact;
    private String otherPaymentsFact;
    private String vendorInfo;
    private GTDIDType DTRegNumber;
    private OrganizationBaseType consigner;
    private OrganizationBaseType consignee;
    private OrganizationBaseType contractHolder;
    private OrganizationBaseType buyer;
    private List<ITSInfoType> ITSInfoList = new ArrayList<ITSInfoType>();
    private String documentModeID;

    /** 
     * Get the 'TransitDirectionCode' element value. Направление перемещения
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value. Направление перемещения
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты договора (буквенный)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты договора (буквенный)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PaymentsFact' element value. Факт наличия в ДТС лицензионных платежей
     * 
     * @return value
     */
    public String getPaymentsFact() {
        return paymentsFact;
    }

    /** 
     * Set the 'PaymentsFact' element value. Факт наличия в ДТС лицензионных платежей
     * 
     * @param paymentsFact
     */
    public void setPaymentsFact(String paymentsFact) {
        this.paymentsFact = paymentsFact;
    }

    /** 
     * Get the 'OtherPaymentsFact' element value. Факт наличия в ДТ иных платежей
     * 
     * @return value
     */
    public String getOtherPaymentsFact() {
        return otherPaymentsFact;
    }

    /** 
     * Set the 'OtherPaymentsFact' element value. Факт наличия в ДТ иных платежей
     * 
     * @param otherPaymentsFact
     */
    public void setOtherPaymentsFact(String otherPaymentsFact) {
        this.otherPaymentsFact = otherPaymentsFact;
    }

    /** 
     * Get the 'VendorInfo' element value. Описание продавца
     * 
     * @return value
     */
    public String getVendorInfo() {
        return vendorInfo;
    }

    /** 
     * Set the 'VendorInfo' element value. Описание продавца
     * 
     * @param vendorInfo
     */
    public void setVendorInfo(String vendorInfo) {
        this.vendorInfo = vendorInfo;
    }

    /** 
     * Get the 'DTRegNumber' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getDTRegNumber() {
        return DTRegNumber;
    }

    /** 
     * Set the 'DTRegNumber' element value. Регистрационный номер ДТ
     * 
     * @param DTRegNumber
     */
    public void setDTRegNumber(GTDIDType DTRegNumber) {
        this.DTRegNumber = DTRegNumber;
    }

    /** 
     * Get the 'Consigner' element value. Отправитель товара
     * 
     * @return value
     */
    public OrganizationBaseType getConsigner() {
        return consigner;
    }

    /** 
     * Set the 'Consigner' element value. Отправитель товара
     * 
     * @param consigner
     */
    public void setConsigner(OrganizationBaseType consigner) {
        this.consigner = consigner;
    }

    /** 
     * Get the 'Consignee' element value. Получатель товара
     * 
     * @return value
     */
    public OrganizationBaseType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель товара
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationBaseType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'ContractHolder' element value. Контрактодержатель
     * 
     * @return value
     */
    public OrganizationBaseType getContractHolder() {
        return contractHolder;
    }

    /** 
     * Set the 'ContractHolder' element value. Контрактодержатель
     * 
     * @param contractHolder
     */
    public void setContractHolder(OrganizationBaseType contractHolder) {
        this.contractHolder = contractHolder;
    }

    /** 
     * Get the 'Buyer' element value. Покупатель
     * 
     * @return value
     */
    public OrganizationBaseType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Покупатель
     * 
     * @param buyer
     */
    public void setBuyer(OrganizationBaseType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the list of 'ITSInfo' element items. Информация о товарной позиции по запросу
     * 
     * @return list
     */
    public List<ITSInfoType> getITSInfoList() {
        return ITSInfoList;
    }

    /** 
     * Set the list of 'ITSInfo' element items. Информация о товарной позиции по запросу
     * 
     * @param list
     */
    public void setITSInfoList(List<ITSInfoType> list) {
        ITSInfoList = list;
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
