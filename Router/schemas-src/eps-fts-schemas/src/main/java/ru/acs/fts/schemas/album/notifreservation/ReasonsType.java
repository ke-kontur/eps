
package ru.acs.fts.schemas.album.notifreservation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание обстоятельств, послуживших причиной невозможности резервирования суммы обеспечения
 */
public class ReasonsType
{
    private String reasonCode;
    private List<String> reasonDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'ReasonCode' element value. Код
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. Код
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the list of 'ReasonDescription' element items. Описание
     * 
     * @return list
     */
    public List<String> getReasonDescriptionList() {
        return reasonDescriptionList;
    }

    /** 
     * Set the list of 'ReasonDescription' element items. Описание
     * 
     * @param list
     */
    public void setReasonDescriptionList(List<String> list) {
        reasonDescriptionList = list;
    }
}
