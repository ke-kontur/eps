
package ru.acs.fts.schemas.album.applicationacceptclassdecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Информация о товаре
 */
public class GoodInfoType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private List<String> technicalDescriptionList = new ArrayList<String>();
    private String methodInstal;
    private LocalDate beginDate;
    private LocalDate endDate;
    private String customsModeCode;
    private List<String> reasonList = new ArrayList<String>();
    private AddressType addressFactInstal;
    private CustomsType customsControls;
    private List<ComponentType> componentList = new ArrayList<ComponentType>();

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the list of 'TechnicalDescription' element items. Общее техническое описание товара
     * 
     * @return list
     */
    public List<String> getTechnicalDescriptionList() {
        return technicalDescriptionList;
    }

    /** 
     * Set the list of 'TechnicalDescription' element items. Общее техническое описание товара
     * 
     * @param list
     */
    public void setTechnicalDescriptionList(List<String> list) {
        technicalDescriptionList = list;
    }

    /** 
     * Get the 'MethodInstal' element value. Способ монтажа (сборки)
     * 
     * @return value
     */
    public String getMethodInstal() {
        return methodInstal;
    }

    /** 
     * Set the 'MethodInstal' element value. Способ монтажа (сборки)
     * 
     * @param methodInstal
     */
    public void setMethodInstal(String methodInstal) {
        this.methodInstal = methodInstal;
    }

    /** 
     * Get the 'BeginDate' element value. Планируемый период поставки товара: дата начала
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Планируемый период поставки товара: дата начала
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Планируемый период поставки товара: дата  окончания
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Планируемый период поставки товара: дата  окончания
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры, под которую будет помещен товар 
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры, под которую будет помещен товар 
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the list of 'Reason' element items. Причины, по которым невозможна подача заявлений на выпуск в одном таможенном органе
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Причины, по которым невозможна подача заявлений на выпуск в одном таможенном органе
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'AddressFactInstal' element value. Адрес места фактической сборки, монтажа, установки
     * 
     * @return value
     */
    public AddressType getAddressFactInstal() {
        return addressFactInstal;
    }

    /** 
     * Set the 'AddressFactInstal' element value. Адрес места фактической сборки, монтажа, установки
     * 
     * @param addressFactInstal
     */
    public void setAddressFactInstal(AddressType addressFactInstal) {
        this.addressFactInstal = addressFactInstal;
    }

    /** 
     * Get the 'CustomsControls' element value. Контролирующая таможня
     * 
     * @return value
     */
    public CustomsType getCustomsControls() {
        return customsControls;
    }

    /** 
     * Set the 'CustomsControls' element value. Контролирующая таможня
     * 
     * @param customsControls
     */
    public void setCustomsControls(CustomsType customsControls) {
        this.customsControls = customsControls;
    }

    /** 
     * Get the list of 'Component' element items. Перечень компонентов
     * 
     * @return list
     */
    public List<ComponentType> getComponentList() {
        return componentList;
    }

    /** 
     * Set the list of 'Component' element items. Перечень компонентов
     * 
     * @param list
     */
    public void setComponentList(List<ComponentType> list) {
        componentList = list;
    }
}
