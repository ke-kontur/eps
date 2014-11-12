
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * Грузовой манифест
 */
public class CargoManifestType extends BaseDocType
{
    private LocalDate manifestDate;
    private String carrierName;
    private String carrierCode;
    private String LNG;
    private FlightInfoType flightInfo;
    private List<DestinationInfoType> destinationInfoList = new ArrayList<DestinationInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ManifestDate' element value. Дата заполнения манифеста
     * 
     * @return value
     */
    public LocalDate getManifestDate() {
        return manifestDate;
    }

    /** 
     * Set the 'ManifestDate' element value. Дата заполнения манифеста
     * 
     * @param manifestDate
     */
    public void setManifestDate(LocalDate manifestDate) {
        this.manifestDate = manifestDate;
    }

    /** 
     * Get the 'CarrierName' element value. Наименование перевозчика
     * 
     * @return value
     */
    public String getCarrierName() {
        return carrierName;
    }

    /** 
     * Set the 'CarrierName' element value. Наименование перевозчика
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /** 
     * Get the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /** 
     * Get the 'LNG' element value. Код  языка документа
     * 
     * @return value
     */
    public String getLNG() {
        return LNG;
    }

    /** 
     * Set the 'LNG' element value. Код  языка документа
     * 
     * @param LNG
     */
    public void setLNG(String LNG) {
        this.LNG = LNG;
    }

    /** 
     * Get the 'FlightInfo' element value. Сведения о рейсе
     * 
     * @return value
     */
    public FlightInfoType getFlightInfo() {
        return flightInfo;
    }

    /** 
     * Set the 'FlightInfo' element value. Сведения о рейсе
     * 
     * @param flightInfo
     */
    public void setFlightInfo(FlightInfoType flightInfo) {
        this.flightInfo = flightInfo;
    }

    /** 
     * Get the list of 'DestinationInfo' element items. информация о разгрузке товара
     * 
     * @return list
     */
    public List<DestinationInfoType> getDestinationInfoList() {
        return destinationInfoList;
    }

    /** 
     * Set the list of 'DestinationInfo' element items. информация о разгрузке товара
     * 
     * @param list
     */
    public void setDestinationInfoList(List<DestinationInfoType> list) {
        destinationInfoList = list;
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
