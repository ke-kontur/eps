
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;

/** 
 * ќписани€ транспортного средства 
 */
public class TransportMeansType
{
    private String transportKind;
    private String transportMark;
    private List<String> transportRegNumberList = new ArrayList<String>();
    private String activeTransportIdentifier;

    /** 
     * Get the 'TransportKind' element value. “ип транспортного средства: 1 - а/м; 2 - ж/д; 3 - авиа
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. “ип транспортного средства: 1 - а/м; 2 - ж/д; 3 - авиа
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'TransportMark' element value. ћарки транспортного средства
     * 
     * @return value
     */
    public String getTransportMark() {
        return transportMark;
    }

    /** 
     * Set the 'TransportMark' element value. ћарки транспортного средства
     * 
     * @param transportMark
     */
    public void setTransportMark(String transportMark) {
        this.transportMark = transportMark;
    }

    /** 
     * Get the list of 'TransportRegNumber' element items. –егистрационный номер прицепа/полуприцепа 
     * 
     * @return list
     */
    public List<String> getTransportRegNumberList() {
        return transportRegNumberList;
    }

    /** 
     * Set the list of 'TransportRegNumber' element items. –егистрационный номер прицепа/полуприцепа 
     * 
     * @param list
     */
    public void setTransportRegNumberList(List<String> list) {
        transportRegNumberList = list;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. »дентификатор активного транспортного средства дл€ прицепов, полуприцепов и др.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. »дентификатор активного транспортного средства дл€ прицепов, полуприцепов и др.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }
}
