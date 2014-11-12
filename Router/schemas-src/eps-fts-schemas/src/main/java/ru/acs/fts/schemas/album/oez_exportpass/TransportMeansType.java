
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описания транспортного средства 
 */
public class TransportMeansType
{
    private String transportKind;
    private String transportMark;
    private List<String> transportRegNumberList = new ArrayList<String>();
    private String activeTransportIdentifier;

    /** 
     * Get the 'TransportKind' element value. Тип транспортного средства: 1 - а/м; 2 - ж/д; 3 - авиа
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. Тип транспортного средства: 1 - а/м; 2 - ж/д; 3 - авиа
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'TransportMark' element value. Марки транспортного средства
     * 
     * @return value
     */
    public String getTransportMark() {
        return transportMark;
    }

    /** 
     * Set the 'TransportMark' element value. Марки транспортного средства
     * 
     * @param transportMark
     */
    public void setTransportMark(String transportMark) {
        this.transportMark = transportMark;
    }

    /** 
     * Get the list of 'TransportRegNumber' element items. Регистрационный номер прицепа/полуприцепа 
     * 
     * @return list
     */
    public List<String> getTransportRegNumberList() {
        return transportRegNumberList;
    }

    /** 
     * Set the list of 'TransportRegNumber' element items. Регистрационный номер прицепа/полуприцепа 
     * 
     * @param list
     */
    public void setTransportRegNumberList(List<String> list) {
        transportRegNumberList = list;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. Идентификатор активного транспортного средства для прицепов, полуприцепов и др.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. Идентификатор активного транспортного средства для прицепов, полуприцепов и др.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }
}
