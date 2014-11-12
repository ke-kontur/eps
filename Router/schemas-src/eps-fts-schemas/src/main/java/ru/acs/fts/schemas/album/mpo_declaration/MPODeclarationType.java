
package ru.acs.fts.schemas.album.mpo_declaration;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Таможенная декларация товаров, пересылаемых в МПО
 */
public class MPODeclarationType extends BaseDocType
{
    private String feedBillAgency;
    private LocalDate feedBillDate;
    private String MPONumber;
    private String docSign;
    private String PIRegID;
    private List<String> consignmentCategoryList = new ArrayList<String>();
    private String explication;
    private List<String> postalFeeList = new ArrayList<String>();
    private String totalCost;
    private String currencyCode;
    private String departureCountry;
    private String destinationCountry;
    private String totalGrossWeight;
    private String MPOFactWeight;
    private String comment;
    private String designatedOperator;
    private String MMPOName;
    private ConsigneeType consignee;
    private ImporterType importer;
    private ConsignorType consignor;
    private List<DocumentInfoType> documentInfoList = new ArrayList<DocumentInfoType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private InformationType information;
    private String documentModeID;

    /** 
     * Get the 'FeedBillAgency' element value. Учреждение  подачи
     * 
     * @return value
     */
    public String getFeedBillAgency() {
        return feedBillAgency;
    }

    /** 
     * Set the 'FeedBillAgency' element value. Учреждение  подачи
     * 
     * @param feedBillAgency
     */
    public void setFeedBillAgency(String feedBillAgency) {
        this.feedBillAgency = feedBillAgency;
    }

    /** 
     * Get the 'FeedBillDate' element value. Дата подачи
     * 
     * @return value
     */
    public LocalDate getFeedBillDate() {
        return feedBillDate;
    }

    /** 
     * Set the 'FeedBillDate' element value. Дата подачи
     * 
     * @param feedBillDate
     */
    public void setFeedBillDate(LocalDate feedBillDate) {
        this.feedBillDate = feedBillDate;
    }

    /** 
     * Get the 'MPO_Number' element value. Номер МПО
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. Номер МПО
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }

    /** 
     * Get the 'DocSign' element value. Тип информации: 0 - основная, 1-предварительная
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Тип информации: 0 - основная, 1-предварительная
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'PI_RegID' element value. Регистрационный номер предварительной информации об МПО
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Регистрационный номер предварительной информации об МПО
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the list of 'ConsignmentCategory' element items. Категория отправления в соответствии с классификатором
     * 
     * @return list
     */
    public List<String> getConsignmentCategoryList() {
        return consignmentCategoryList;
    }

    /** 
     * Set the list of 'ConsignmentCategory' element items. Категория отправления в соответствии с классификатором
     * 
     * @param list
     */
    public void setConsignmentCategoryList(List<String> list) {
        consignmentCategoryList = list;
    }

    /** 
     * Get the 'Explication' element value. Пояснение
     * 
     * @return value
     */
    public String getExplication() {
        return explication;
    }

    /** 
     * Set the 'Explication' element value. Пояснение
     * 
     * @param explication
     */
    public void setExplication(String explication) {
        this.explication = explication;
    }

    /** 
     * Get the list of 'PostalFees' element items. Сумма почтовых сборов/расходов
     * 
     * @return list
     */
    public List<String> getPostalFeeList() {
        return postalFeeList;
    }

    /** 
     * Set the list of 'PostalFees' element items. Сумма почтовых сборов/расходов
     * 
     * @param list
     */
    public void setPostalFeeList(List<String> list) {
        postalFeeList = list;
    }

    /** 
     * Get the 'TotalCost' element value. Общая стоимость товаров
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Общая стоимость товаров
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DepartureCountry' element value. Страна отправления товара
     * 
     * @return value
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. Страна отправления товара
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения товара
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения товара
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGrossWeight' element value. Общий вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /** 
     * Set the 'TotalGrossWeight' element value. Общий вес товара, брутто (кг)
     * 
     * @param totalGrossWeight
     */
    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /** 
     * Get the 'MPOFactWeight' element value. Фактический вес МПО (кг)
     * 
     * @return value
     */
    public String getMPOFactWeight() {
        return MPOFactWeight;
    }

    /** 
     * Set the 'MPOFactWeight' element value. Фактический вес МПО (кг)
     * 
     * @param MPOFactWeight
     */
    public void setMPOFactWeight(String MPOFactWeight) {
        this.MPOFactWeight = MPOFactWeight;
    }

    /** 
     * Get the 'Comment' element value. Примечания
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Примечания
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'DesignatedOperator' element value. Назначенный оператор
     * 
     * @return value
     */
    public String getDesignatedOperator() {
        return designatedOperator;
    }

    /** 
     * Set the 'DesignatedOperator' element value. Назначенный оператор
     * 
     * @param designatedOperator
     */
    public void setDesignatedOperator(String designatedOperator) {
        this.designatedOperator = designatedOperator;
    }

    /** 
     * Get the 'MMPOName' element value. Наименование ММПО
     * 
     * @return value
     */
    public String getMMPOName() {
        return MMPOName;
    }

    /** 
     * Set the 'MMPOName' element value. Наименование ММПО
     * 
     * @param MMPOName
     */
    public void setMMPOName(String MMPOName) {
        this.MMPOName = MMPOName;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Importer' element value. Импортер
     * 
     * @return value
     */
    public ImporterType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Импортер
     * 
     * @param importer
     */
    public void setImporter(ImporterType importer) {
        this.importer = importer;
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
     * Get the list of 'DocumentInfo' element items. Сведения о документе
     * 
     * @return list
     */
    public List<DocumentInfoType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. Сведения о документе
     * 
     * @param list
     */
    public void setDocumentInfoList(List<DocumentInfoType> list) {
        documentInfoList = list;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Information' element value. Дополнительная информация
     * 
     * @return value
     */
    public InformationType getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. Дополнительная информация
     * 
     * @param information
     */
    public void setInformation(InformationType information) {
        this.information = information;
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
