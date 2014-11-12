
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Результат выявления рисков по уведомлению о прибытии ТС
 */
public class PPRevealedRisksType extends BaseDocType
{
    private String transportID;
    private List<ProfilesType> profileList = new ArrayList<ProfilesType>();
    private ConsignmentsType consignments;
    private String documentModeID;

    /** 
     * Get the 'TransportID' element value. Идентификатор сообщения о прибытии транспорта, по которому выявлялись риски
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. Идентификатор сообщения о прибытии транспорта, по которому выявлялись риски
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the list of 'Profiles' element items. Выявленные ПР/СПР
     * 
     * @return list
     */
    public List<ProfilesType> getProfileList() {
        return profileList;
    }

    /** 
     * Set the list of 'Profiles' element items. Выявленные ПР/СПР
     * 
     * @param list
     */
    public void setProfileList(List<ProfilesType> list) {
        profileList = list;
    }

    /** 
     * Get the 'Consignments' element value. Партии товаров, на которых были выявлены риски
     * 
     * @return value
     */
    public ConsignmentsType getConsignments() {
        return consignments;
    }

    /** 
     * Set the 'Consignments' element value. Партии товаров, на которых были выявлены риски
     * 
     * @param consignments
     */
    public void setConsignments(ConsignmentsType consignments) {
        this.consignments = consignments;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
