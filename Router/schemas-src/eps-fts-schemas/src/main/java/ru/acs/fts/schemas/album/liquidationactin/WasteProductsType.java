
package ru.acs.fts.schemas.album.liquidationactin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Отходы, полученные из товаров и (или) упаковки
 */
public class WasteProductsType
{
    private List<String> wasteDescriptionList = new ArrayList<String>();
    private String wasteCode;
    private List<String> liquidationMethodList = new ArrayList<String>();
    private String wasteSign;
    private String newWasteSign;
    private String wasteTNVEDCode;
    private String customsProcedure;
    private SupplementaryQuantityType wasteQuantity;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();
    private DocumentBaseType document;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private AddressType wastePlace;

    /** 
     * Get the list of 'WasteDescription' element items. Наименование отхода в соответствии с Федеральным классификационным каталогом отходов
     * 
     * @return list
     */
    public List<String> getWasteDescriptionList() {
        return wasteDescriptionList;
    }

    /** 
     * Set the list of 'WasteDescription' element items. Наименование отхода в соответствии с Федеральным классификационным каталогом отходов
     * 
     * @param list
     */
    public void setWasteDescriptionList(List<String> list) {
        wasteDescriptionList = list;
    }

    /** 
     * Get the 'WasteCode' element value. Код отхода в соответствии с Федеральным классификационным каталогом отходов
     * 
     * @return value
     */
    public String getWasteCode() {
        return wasteCode;
    }

    /** 
     * Set the 'WasteCode' element value. Код отхода в соответствии с Федеральным классификационным каталогом отходов
     * 
     * @param wasteCode
     */
    public void setWasteCode(String wasteCode) {
        this.wasteCode = wasteCode;
    }

    /** 
     * Get the list of 'LiquidationMethod' element items. Способ уничтожения
     * 
     * @return list
     */
    public List<String> getLiquidationMethodList() {
        return liquidationMethodList;
    }

    /** 
     * Set the list of 'LiquidationMethod' element items. Способ уничтожения
     * 
     * @param list
     */
    public void setLiquidationMethodList(List<String> list) {
        liquidationMethodList = list;
    }

    /** 
     * Get the 'WasteSign' element value. Признак происхождения отходов: 0 - товары; 1 - упаковка
     * 
     * @return value
     */
    public String getWasteSign() {
        return wasteSign;
    }

    /** 
     * Set the 'WasteSign' element value. Признак происхождения отходов: 0 - товары; 1 - упаковка
     * 
     * @param wasteSign
     */
    public void setWasteSign(String wasteSign) {
        this.wasteSign = wasteSign;
    }

    /** 
     * Get the 'NewWasteSign' element value. Признак наличия отходов, образовавшиеся в результате уничтожения
     * 
     * @return value
     */
    public String getNewWasteSign() {
        return newWasteSign;
    }

    /** 
     * Set the 'NewWasteSign' element value. Признак наличия отходов, образовавшиеся в результате уничтожения
     * 
     * @param newWasteSign
     */
    public void setNewWasteSign(String newWasteSign) {
        this.newWasteSign = newWasteSign;
    }

    /** 
     * Get the 'WasteTNVEDCode' element value. Код отхода в соответствии с ТН ВЭД ТС
     * 
     * @return value
     */
    public String getWasteTNVEDCode() {
        return wasteTNVEDCode;
    }

    /** 
     * Set the 'WasteTNVEDCode' element value. Код отхода в соответствии с ТН ВЭД ТС
     * 
     * @param wasteTNVEDCode
     */
    public void setWasteTNVEDCode(String wasteTNVEDCode) {
        this.wasteTNVEDCode = wasteTNVEDCode;
    }

    /** 
     * Get the 'CustomsProcedure' element value. Таможенная процедура, под которую планируется помещать отходы
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Таможенная процедура, под которую планируется помещать отходы
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'WasteQuantity' element value. Количество отходов
     * 
     * @return value
     */
    public SupplementaryQuantityType getWasteQuantity() {
        return wasteQuantity;
    }

    /** 
     * Set the 'WasteQuantity' element value. Количество отходов
     * 
     * @param wasteQuantity
     */
    public void setWasteQuantity(SupplementaryQuantityType wasteQuantity) {
        this.wasteQuantity = wasteQuantity;
    }

    /** 
     * Get the list of 'PackingInformation' element items. Сведения об упаковке
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. Сведения об упаковке
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the 'Document' element value. Документ, подтверждающий факт уничтожения
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Документ, подтверждающий факт уничтожения
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the list of 'Consignment' element items. Сведения о партии товаров
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Сведения о партии товаров
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'WastePlace' element value. Местонахождение отходов до выпуска в соответствии с таможенной процедурой
     * 
     * @return value
     */
    public AddressType getWastePlace() {
        return wastePlace;
    }

    /** 
     * Set the 'WastePlace' element value. Местонахождение отходов до выпуска в соответствии с таможенной процедурой
     * 
     * @param wastePlace
     */
    public void setWastePlace(AddressType wastePlace) {
        this.wastePlace = wastePlace;
    }
}
