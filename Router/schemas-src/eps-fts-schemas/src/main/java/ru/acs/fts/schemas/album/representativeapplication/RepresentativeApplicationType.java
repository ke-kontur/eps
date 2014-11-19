
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * Заявление таможенного представителя, используемое в качестве пассажирской таможенной декларации/Реестр возвращаемых товаров
 */
public class RepresentativeApplicationType extends BaseDocType
{
    private String destinationCountry;
    private String totalGoodsNumber;
    private RepresentativeType representative;
    private String applicationSign;
    private GTDIDType applicationRegNumber;
    private WarehousePlaceType warehousePlace;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения. Буквенный код по классификатору стран мира
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения. Буквенный код по классификатору стран мира
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. Всего наименований товаров
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Всего наименований товаров
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'Representative' element value. Таможенный представитель
     * 
     * @return value
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. Таможенный представитель
     * 
     * @param representative
     */
    public void setRepresentative(RepresentativeType representative) {
        this.representative = representative;
    }

    /** 
     * Get the 'ApplicationSign' element value. Тип реестра: 0 - реестр доставляемых товаров, 1- реестр возвращаемых товаров 
     * 
     * @return value
     */
    public String getApplicationSign() {
        return applicationSign;
    }

    /** 
     * Set the 'ApplicationSign' element value. Тип реестра: 0 - реестр доставляемых товаров, 1- реестр возвращаемых товаров 
     * 
     * @param applicationSign
     */
    public void setApplicationSign(String applicationSign) {
        this.applicationSign = applicationSign;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. Регистрационный номер исходного реестра, если товары возвращаемые
     * 
     * @return value
     */
    public GTDIDType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. Регистрационный номер исходного реестра, если товары возвращаемые
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(GTDIDType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'WarehousePlace' element value. Номер лицензии СВХ, на котором размещены товары
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Номер лицензии СВХ, на котором размещены товары
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the list of 'Consignment' element items. Сведения о партии
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Сведения о партии
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
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
