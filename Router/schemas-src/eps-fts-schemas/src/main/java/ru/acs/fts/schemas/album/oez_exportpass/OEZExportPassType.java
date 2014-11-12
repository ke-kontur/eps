
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Решение на выезд средства транспорта с территории ОЭЗ/Разрешение на вывоз товаров с территории ПОЭЗ
 */
public class OEZExportPassType extends BaseDocType
{
    private LocalDate limitDate;
    private String docSign;
    private RegistrationNumberType registrationNumber;
    private ConsignorType consignor;
    private TransportMeansType transportMeans;
    private List<GoodsListType> goodsList = new ArrayList<GoodsListType>();
    private List<DocumentBaseType> documentExpList = new ArrayList<DocumentBaseType>();
    private CustomsPersonType customsPerson;
    private CUOrganizationType resident;
    private String documentModeID;

    /** 
     * Get the 'LimitDate' element value. Срок действия пропуска 
     * 
     * @return value
     */
    public LocalDate getLimitDate() {
        return limitDate;
    }

    /** 
     * Set the 'LimitDate' element value. Срок действия пропуска 
     * 
     * @param limitDate
     */
    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }

    /** 
     * Get the 'DocSign' element value. Признак документа: 0 - Решение на выезд средства транспорта с территории ОЭЗ; 1 - Разрешение на вывоз товаров с территории ПОЭЗ
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 0 - Решение на выезд средства транспорта с территории ОЭЗ; 1 - Разрешение на вывоз товаров с территории ПОЭЗ
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер разрешения
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер разрешения
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'TransportMeans' element value. Описания транспортного средства 
     * 
     * @return value
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. Описания транспортного средства 
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the list of 'GoodsList' element items. Перечень товаров
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. Перечень товаров
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }

    /** 
     * Get the list of 'DocumentExp' element items. Документы на основание, которых разрешен выезд
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentExpList() {
        return documentExpList;
    }

    /** 
     * Set the list of 'DocumentExp' element items. Документы на основание, которых разрешен выезд
     * 
     * @param list
     */
    public void setDocumentExpList(List<DocumentBaseType> list) {
        documentExpList = list;
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
     * Get the 'Resident' element value. Резидент (ПОЭЗ)
     * 
     * @return value
     */
    public CUOrganizationType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. Резидент (ПОЭЗ)
     * 
     * @param resident
     */
    public void setResident(CUOrganizationType resident) {
        this.resident = resident;
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
