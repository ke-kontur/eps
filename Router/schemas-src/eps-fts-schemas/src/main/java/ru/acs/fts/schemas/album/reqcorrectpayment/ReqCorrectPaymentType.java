
package ru.acs.fts.schemas.album.reqcorrectpayment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Решение о корректировке таможенной стоимости товаров
 */
public class ReqCorrectPaymentType extends BaseDocType
{
    private LocalDate resolDate;
    private String officeName;
    private String declName;
    private LocalDate dateLimitPriorRelease;
    private String dateLimitAfterRelease;
    private String dateLimit;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDID;
    private List<KTSGoodsType> KTSGoodList = new ArrayList<KTSGoodsType>();
    private List<ValuationCustCostType> valuationCustCostList = new ArrayList<ValuationCustCostType>();
    private AddressType address;
    private SignatureInfType receivingResolution;
    private SignatureInfType sendResolution;
    private String documentModeID;

    /** 
     * Get the 'ResolDate' element value. Дата решения
     * 
     * @return value
     */
    public LocalDate getResolDate() {
        return resolDate;
    }

    /** 
     * Set the 'ResolDate' element value. Дата решения
     * 
     * @param resolDate
     */
    public void setResolDate(LocalDate resolDate) {
        this.resolDate = resolDate;
    }

    /** 
     * Get the 'OfficeName' element value. Наименование таможенного органа
     * 
     * @return value
     */
    public String getOfficeName() {
        return officeName;
    }

    /** 
     * Set the 'OfficeName' element value. Наименование таможенного органа
     * 
     * @param officeName
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /** 
     * Get the 'DeclName' element value. Наименование декларанта (таможенного представителя)
     * 
     * @return value
     */
    public String getDeclName() {
        return declName;
    }

    /** 
     * Set the 'DeclName' element value. Наименование декларанта (таможенного представителя)
     * 
     * @param declName
     */
    public void setDeclName(String declName) {
        this.declName = declName;
    }

    /** 
     * Get the 'DateLimitPriorRelease' element value. Срок осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения до выпуска товаров
     * 
     * @return value
     */
    public LocalDate getDateLimitPriorRelease() {
        return dateLimitPriorRelease;
    }

    /** 
     * Set the 'DateLimitPriorRelease' element value. Срок осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения до выпуска товаров
     * 
     * @param dateLimitPriorRelease
     */
    public void setDateLimitPriorRelease(LocalDate dateLimitPriorRelease) {
        this.dateLimitPriorRelease = dateLimitPriorRelease;
    }

    /** 
     * Get the 'DateLimitAfterRelease' element value. Срок осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения после выпуска товаров (срок, не превышающий 10 рабочих дней со дня получения декларантом/представителем  решения о корректировке)
     * 
     * @return value
     */
    public String getDateLimitAfterRelease() {
        return dateLimitAfterRelease;
    }

    /** 
     * Set the 'DateLimitAfterRelease' element value. Срок осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения после выпуска товаров (срок, не превышающий 10 рабочих дней со дня получения декларантом/представителем  решения о корректировке)
     * 
     * @param dateLimitAfterRelease
     */
    public void setDateLimitAfterRelease(String dateLimitAfterRelease) {
        this.dateLimitAfterRelease = dateLimitAfterRelease;
    }

    /** 
     * Get the 'DateLimit' element value. Срок, установленный в государстве - членеТаможенного союза, осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения после выпуска товаров
     * 
     * @return value
     */
    public String getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Срок, установленный в государстве - членеТаможенного союза, осуществления корректировки таможенной стоимости и уплаты таможенной пошлины, налогов при принятии решения после выпуска товаров
     * 
     * @param dateLimit
     */
    public void setDateLimit(String dateLimit) {
        this.dateLimit = dateLimit;
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
     * Get the 'GTDID' element value. Регистрационный номер  ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер  ДТ.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'KTSGoods' element items. Корректировка таможенной стоимости товаров
     * 
     * @return list
     */
    public List<KTSGoodsType> getKTSGoodList() {
        return KTSGoodList;
    }

    /** 
     * Set the list of 'KTSGoods' element items. Корректировка таможенной стоимости товаров
     * 
     * @param list
     */
    public void setKTSGoodList(List<KTSGoodsType> list) {
        KTSGoodList = list;
    }

    /** 
     * Get the list of 'ValuationCustCost' element items. Определение таможенной стоимости товаров/Необходимые изменения в ДТ
     * 
     * @return list
     */
    public List<ValuationCustCostType> getValuationCustCostList() {
        return valuationCustCostList;
    }

    /** 
     * Set the list of 'ValuationCustCost' element items. Определение таможенной стоимости товаров/Необходимые изменения в ДТ
     * 
     * @param list
     */
    public void setValuationCustCostList(List<ValuationCustCostType> list) {
        valuationCustCostList = list;
    }

    /** 
     * Get the 'Address' element value. Адрес направления решения
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес направления решения
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'ReceivingResolution' element value. Получение решения
     * 
     * @return value
     */
    public SignatureInfType getReceivingResolution() {
        return receivingResolution;
    }

    /** 
     * Set the 'ReceivingResolution' element value. Получение решения
     * 
     * @param receivingResolution
     */
    public void setReceivingResolution(SignatureInfType receivingResolution) {
        this.receivingResolution = receivingResolution;
    }

    /** 
     * Get the 'SendResolution' element value. Направление решения
     * 
     * @return value
     */
    public SignatureInfType getSendResolution() {
        return sendResolution;
    }

    /** 
     * Set the 'SendResolution' element value. Направление решения
     * 
     * @param sendResolution
     */
    public void setSendResolution(SignatureInfType sendResolution) {
        this.sendResolution = sendResolution;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
