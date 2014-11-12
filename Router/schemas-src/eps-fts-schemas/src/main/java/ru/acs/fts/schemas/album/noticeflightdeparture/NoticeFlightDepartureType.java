
package ru.acs.fts.schemas.album.noticeflightdeparture;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление о выполнении международного рейса до планового времени убытия
 */
public class NoticeFlightDepartureType extends BaseDocType
{
    private CUOrganizationType carrier;
    private CustomsType customsOffice;
    private DepartureInfoType departureInfo;
    private String documentModeID;

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'CustomsOffice' element value. Таможенный орган, в регионе деятельности которого находится воздушный пункт пропуска
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Таможенный орган, в регионе деятельности которого находится воздушный пункт пропуска
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'DepartureInfo' element value. Сведения об убытии воздушного судна
     * 
     * @return value
     */
    public DepartureInfoType getDepartureInfo() {
        return departureInfo;
    }

    /** 
     * Set the 'DepartureInfo' element value. Сведения об убытии воздушного судна
     * 
     * @param departureInfo
     */
    public void setDepartureInfo(DepartureInfoType departureInfo) {
        this.departureInfo = departureInfo;
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
