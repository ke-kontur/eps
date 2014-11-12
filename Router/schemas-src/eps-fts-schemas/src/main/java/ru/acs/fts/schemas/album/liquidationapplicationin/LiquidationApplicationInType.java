
package ru.acs.fts.schemas.album.liquidationapplicationin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Заявление на уничтожение пришедших в негодность товаров и (или) упаковки на территории ОЭЗ или вывоз таких товаров и (или) упаковки с территории ОЭЗ с целью уничтожения (Внутренний формат)
 */
public class LiquidationApplicationInType extends BaseDocType
{
    private String operationSign;
    private String liquidationReasons;
    private LocalDate liquidationDate;
    private LiquidationParticipantType OEZResident;
    private CUCustomsType customs;
    private LiquidationParticipantType liquidator;
    private AddressType liquidationPlace;
    private List<WasteProductsType> wasteProductList = new ArrayList<WasteProductsType>();
    private ApplicationRegNumberType applicationRegNumber;
    private List<CustomsMarkType> customsMarkList = new ArrayList<CustomsMarkType>();
    private String documentModeID;

    /** 
     * Get the 'OperationSign' element value. Признак операции: 0 - уничтожение на территории ОЭЗ; 1 - вывоз с территории ОЭЗ с целью уничтожения
     * 
     * @return value
     */
    public String getOperationSign() {
        return operationSign;
    }

    /** 
     * Set the 'OperationSign' element value. Признак операции: 0 - уничтожение на территории ОЭЗ; 1 - вывоз с территории ОЭЗ с целью уничтожения
     * 
     * @param operationSign
     */
    public void setOperationSign(String operationSign) {
        this.operationSign = operationSign;
    }

    /** 
     * Get the 'LiquidationReasons' element value. Причины вывода товаров и (или) упаковки из оборота
     * 
     * @return value
     */
    public String getLiquidationReasons() {
        return liquidationReasons;
    }

    /** 
     * Set the 'LiquidationReasons' element value. Причины вывода товаров и (или) упаковки из оборота
     * 
     * @param liquidationReasons
     */
    public void setLiquidationReasons(String liquidationReasons) {
        this.liquidationReasons = liquidationReasons;
    }

    /** 
     * Get the 'LiquidationDate' element value. Заявленная дата уничтожения отходов
     * 
     * @return value
     */
    public LocalDate getLiquidationDate() {
        return liquidationDate;
    }

    /** 
     * Set the 'LiquidationDate' element value. Заявленная дата уничтожения отходов
     * 
     * @param liquidationDate
     */
    public void setLiquidationDate(LocalDate liquidationDate) {
        this.liquidationDate = liquidationDate;
    }

    /** 
     * Get the 'OEZ_Resident' element value. Резидент ОЭЗ
     * 
     * @return value
     */
    public LiquidationParticipantType getOEZResident() {
        return OEZResident;
    }

    /** 
     * Set the 'OEZ_Resident' element value. Резидент ОЭЗ
     * 
     * @param OEZResident
     */
    public void setOEZResident(LiquidationParticipantType OEZResident) {
        this.OEZResident = OEZResident;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @return value
     */
    public LiquidationParticipantType getLiquidator() {
        return liquidator;
    }

    /** 
     * Set the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @param liquidator
     */
    public void setLiquidator(LiquidationParticipantType liquidator) {
        this.liquidator = liquidator;
    }

    /** 
     * Get the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @return value
     */
    public AddressType getLiquidationPlace() {
        return liquidationPlace;
    }

    /** 
     * Set the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @param liquidationPlace
     */
    public void setLiquidationPlace(AddressType liquidationPlace) {
        this.liquidationPlace = liquidationPlace;
    }

    /** 
     * Get the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @return list
     */
    public List<WasteProductsType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @param list
     */
    public void setWasteProductList(List<WasteProductsType> list) {
        wasteProductList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. Регистрационный номер заявления на уничтожение
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. Регистрационный номер заявления на уничтожение
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the list of 'CustomsMark' element items. Таможенные отметки
     * 
     * @return list
     */
    public List<CustomsMarkType> getCustomsMarkList() {
        return customsMarkList;
    }

    /** 
     * Set the list of 'CustomsMark' element items. Таможенные отметки
     * 
     * @param list
     */
    public void setCustomsMarkList(List<CustomsMarkType> list) {
        customsMarkList = list;
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
