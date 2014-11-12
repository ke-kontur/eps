
package ru.acs.fts.schemas.album.goodsoperationrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Запрос перевозчика в таможенный орган на совершение операций с грузом
 */
public class GoodsOperationRequestType extends BaseDocType
{
    private List<WayBillOperationType> wayBillOperationList = new ArrayList<WayBillOperationType>();
    private CustomsType customsOffice;
    private CUOrganizationType carrier;
    private String documentModeID;

    /** 
     * Get the list of 'WayBillOperation' element items. Сведения об операциях с грузом по накладной
     * 
     * @return list
     */
    public List<WayBillOperationType> getWayBillOperationList() {
        return wayBillOperationList;
    }

    /** 
     * Set the list of 'WayBillOperation' element items. Сведения об операциях с грузом по накладной
     * 
     * @param list
     */
    public void setWayBillOperationList(List<WayBillOperationType> list) {
        wayBillOperationList = list;
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
