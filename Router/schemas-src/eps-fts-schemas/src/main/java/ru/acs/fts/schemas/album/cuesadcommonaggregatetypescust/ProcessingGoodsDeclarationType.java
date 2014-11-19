
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Заявление на переработку товаров
 */
public class ProcessingGoodsDeclarationType
{
    private List<String> rateOutputGoodList = new ArrayList<String>();
    private String processingDocNumber;
    private LocalDate processingDocDate;
    private List<String> goodsIdentificationMethodList = new ArrayList<String>();
    private String processingPlace;
    private List<String> substituteList = new ArrayList<String>();
    private AddressType placeProcessing;
    private CUOrganizationType organization;
    private ProcessingGoodsType processingProduct;
    private List<ProcessingGoodsType> wasteProductList = new ArrayList<ProcessingGoodsType>();
    private List<ProcessingGoodsType> heelList = new ArrayList<ProcessingGoodsType>();

    /** 
     * Get the list of 'RateOutputGoods' element items. Норма выхода продуктов переработки
     * 
     * @return list
     */
    public List<String> getRateOutputGoodList() {
        return rateOutputGoodList;
    }

    /** 
     * Set the list of 'RateOutputGoods' element items. Норма выхода продуктов переработки
     * 
     * @param list
     */
    public void setRateOutputGoodList(List<String> list) {
        rateOutputGoodList = list;
    }

    /** 
     * Get the 'ProcessingDocNumber' element value. Номер разрешения на предшествующую переработку
     * 
     * @return value
     */
    public String getProcessingDocNumber() {
        return processingDocNumber;
    }

    /** 
     * Set the 'ProcessingDocNumber' element value. Номер разрешения на предшествующую переработку
     * 
     * @param processingDocNumber
     */
    public void setProcessingDocNumber(String processingDocNumber) {
        this.processingDocNumber = processingDocNumber;
    }

    /** 
     * Get the 'ProcessingDocDate' element value. Дата предшествующего разрешения на переработку
     * 
     * @return value
     */
    public LocalDate getProcessingDocDate() {
        return processingDocDate;
    }

    /** 
     * Set the 'ProcessingDocDate' element value. Дата предшествующего разрешения на переработку
     * 
     * @param processingDocDate
     */
    public void setProcessingDocDate(LocalDate processingDocDate) {
        this.processingDocDate = processingDocDate;
    }

    /** 
     * Get the list of 'GoodsIdentificationMethod' element items. Способы идентификации ввезенных/вывезенных товаров в продуктах переработки
     * 
     * @return list
     */
    public List<String> getGoodsIdentificationMethodList() {
        return goodsIdentificationMethodList;
    }

    /** 
     * Set the list of 'GoodsIdentificationMethod' element items. Способы идентификации ввезенных/вывезенных товаров в продуктах переработки
     * 
     * @param list
     */
    public void setGoodsIdentificationMethodList(List<String> list) {
        goodsIdentificationMethodList = list;
    }

    /** 
     * Get the 'ProcessingPlace' element value. Место проведения операций по переработке товаров
     * 
     * @return value
     */
    public String getProcessingPlace() {
        return processingPlace;
    }

    /** 
     * Set the 'ProcessingPlace' element value. Место проведения операций по переработке товаров
     * 
     * @param processingPlace
     */
    public void setProcessingPlace(String processingPlace) {
        this.processingPlace = processingPlace;
    }

    /** 
     * Get the list of 'Substitute' element items. Сведения о замене иностранных товаров эквивалентными товарами
     * 
     * @return list
     */
    public List<String> getSubstituteList() {
        return substituteList;
    }

    /** 
     * Set the list of 'Substitute' element items. Сведения о замене иностранных товаров эквивалентными товарами
     * 
     * @param list
     */
    public void setSubstituteList(List<String> list) {
        substituteList = list;
    }

    /** 
     * Get the 'PlaceProcessing' element value. Адрес места проведения операций по переработке
     * 
     * @return value
     */
    public AddressType getPlaceProcessing() {
        return placeProcessing;
    }

    /** 
     * Set the 'PlaceProcessing' element value. Адрес места проведения операций по переработке
     * 
     * @param placeProcessing
     */
    public void setPlaceProcessing(AddressType placeProcessing) {
        this.placeProcessing = placeProcessing;
    }

    /** 
     * Get the 'Organization' element value. Наименование лица, осуществляющего операции по переработке товаров
     * 
     * @return value
     */
    public CUOrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Наименование лица, осуществляющего операции по переработке товаров
     * 
     * @param organization
     */
    public void setOrganization(CUOrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'ProcessingProduct' element value. Продукт переработки
     * 
     * @return value
     */
    public ProcessingGoodsType getProcessingProduct() {
        return processingProduct;
    }

    /** 
     * Set the 'ProcessingProduct' element value. Продукт переработки
     * 
     * @param processingProduct
     */
    public void setProcessingProduct(ProcessingGoodsType processingProduct) {
        this.processingProduct = processingProduct;
    }

    /** 
     * Get the list of 'WasteProducts' element items. Отходы переработки
     * 
     * @return list
     */
    public List<ProcessingGoodsType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProducts' element items. Отходы переработки
     * 
     * @param list
     */
    public void setWasteProductList(List<ProcessingGoodsType> list) {
        wasteProductList = list;
    }

    /** 
     * Get the list of 'Heels' element items. Остатки
     * 
     * @return list
     */
    public List<ProcessingGoodsType> getHeelList() {
        return heelList;
    }

    /** 
     * Set the list of 'Heels' element items. Остатки
     * 
     * @param list
     */
    public void setHeelList(List<ProcessingGoodsType> list) {
        heelList = list;
    }
}
