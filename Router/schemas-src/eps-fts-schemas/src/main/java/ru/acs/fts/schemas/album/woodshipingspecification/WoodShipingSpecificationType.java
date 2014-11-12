
package ru.acs.fts.schemas.album.woodshipingspecification;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Отгрузочная спецификация на товары 44 группы ТН ВЭД ТС
 */
public class WoodShipingSpecificationType extends BaseDocType
{
    private String specificationNumber;
    private LocalDate unloadingDate;
    private List<String> wagonNumberList = new ArrayList<String>();
    private String railbillNumber;
    private String additionalMarking;
    private String totalQuantity;
    private String totalVolume;
    private DocumentBaseType contract;
    private OrganizationInfoType sender;
    private OrganizationInfoType recipient;
    private StandartsInfoType standartsInfo;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private List<LenghtInfoType> totalLengthList = new ArrayList<LenghtInfoType>();
    private PersonBaseType checkMan;
    private PersonBaseType foreman;
    private PersonBaseType loader;
    private String documentModeID;

    /** 
     * Get the 'SpecificationNumber' element value. Номер отгрузочной спецификации
     * 
     * @return value
     */
    public String getSpecificationNumber() {
        return specificationNumber;
    }

    /** 
     * Set the 'SpecificationNumber' element value. Номер отгрузочной спецификации
     * 
     * @param specificationNumber
     */
    public void setSpecificationNumber(String specificationNumber) {
        this.specificationNumber = specificationNumber;
    }

    /** 
     * Get the 'UnloadingDate' element value. Дата отгрузки
     * 
     * @return value
     */
    public LocalDate getUnloadingDate() {
        return unloadingDate;
    }

    /** 
     * Set the 'UnloadingDate' element value. Дата отгрузки
     * 
     * @param unloadingDate
     */
    public void setUnloadingDate(LocalDate unloadingDate) {
        this.unloadingDate = unloadingDate;
    }

    /** 
     * Get the list of 'WagonNumber' element items. Номер вагона
     * 
     * @return list
     */
    public List<String> getWagonNumberList() {
        return wagonNumberList;
    }

    /** 
     * Set the list of 'WagonNumber' element items. Номер вагона
     * 
     * @param list
     */
    public void setWagonNumberList(List<String> list) {
        wagonNumberList = list;
    }

    /** 
     * Get the 'RailbillNumber' element value. Номер ж/д накладной
     * 
     * @return value
     */
    public String getRailbillNumber() {
        return railbillNumber;
    }

    /** 
     * Set the 'RailbillNumber' element value. Номер ж/д накладной
     * 
     * @param railbillNumber
     */
    public void setRailbillNumber(String railbillNumber) {
        this.railbillNumber = railbillNumber;
    }

    /** 
     * Get the 'AdditionalMarking' element value. Дополнительная маркировка
     * 
     * @return value
     */
    public String getAdditionalMarking() {
        return additionalMarking;
    }

    /** 
     * Set the 'AdditionalMarking' element value. Дополнительная маркировка
     * 
     * @param additionalMarking
     */
    public void setAdditionalMarking(String additionalMarking) {
        this.additionalMarking = additionalMarking;
    }

    /** 
     * Get the 'TotalQuantity' element value. Общее количество в натуральных единицах (шт.)
     * 
     * @return value
     */
    public String getTotalQuantity() {
        return totalQuantity;
    }

    /** 
     * Set the 'TotalQuantity' element value. Общее количество в натуральных единицах (шт.)
     * 
     * @param totalQuantity
     */
    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    /** 
     * Get the 'TotalVolume' element value. Общий объем в куб. метрах
     * 
     * @return value
     */
    public String getTotalVolume() {
        return totalVolume;
    }

    /** 
     * Set the 'TotalVolume' element value. Общий объем в куб. метрах
     * 
     * @param totalVolume
     */
    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    /** 
     * Get the 'Contract' element value. Контракт
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Контракт
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Sender' element value. Сведения об отправителе
     * 
     * @return value
     */
    public OrganizationInfoType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Сведения об отправителе
     * 
     * @param sender
     */
    public void setSender(OrganizationInfoType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Recipient' element value. Сведения о получателе
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Сведения о получателе
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'StandartsInfo' element value. Информация о стандартах
     * 
     * @return value
     */
    public StandartsInfoType getStandartsInfo() {
        return standartsInfo;
    }

    /** 
     * Set the 'StandartsInfo' element value. Информация о стандартах
     * 
     * @param standartsInfo
     */
    public void setStandartsInfo(StandartsInfoType standartsInfo) {
        this.standartsInfo = standartsInfo;
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
     * Get the list of 'TotalLength' element items. Общая информация по длине
     * 
     * @return list
     */
    public List<LenghtInfoType> getTotalLengthList() {
        return totalLengthList;
    }

    /** 
     * Set the list of 'TotalLength' element items. Общая информация по длине
     * 
     * @param list
     */
    public void setTotalLengthList(List<LenghtInfoType> list) {
        totalLengthList = list;
    }

    /** 
     * Get the 'CheckMan' element value. Учетчик
     * 
     * @return value
     */
    public PersonBaseType getCheckMan() {
        return checkMan;
    }

    /** 
     * Set the 'CheckMan' element value. Учетчик
     * 
     * @param checkMan
     */
    public void setCheckMan(PersonBaseType checkMan) {
        this.checkMan = checkMan;
    }

    /** 
     * Get the 'Foreman' element value. Начальник цеха
     * 
     * @return value
     */
    public PersonBaseType getForeman() {
        return foreman;
    }

    /** 
     * Set the 'Foreman' element value. Начальник цеха
     * 
     * @param foreman
     */
    public void setForeman(PersonBaseType foreman) {
        this.foreman = foreman;
    }

    /** 
     * Get the 'Loader' element value. Мастер погрузки
     * 
     * @return value
     */
    public PersonBaseType getLoader() {
        return loader;
    }

    /** 
     * Set the 'Loader' element value. Мастер погрузки
     * 
     * @param loader
     */
    public void setLoader(PersonBaseType loader) {
        this.loader = loader;
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
