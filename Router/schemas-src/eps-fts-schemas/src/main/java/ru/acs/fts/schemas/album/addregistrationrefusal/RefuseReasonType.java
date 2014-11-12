
package ru.acs.fts.schemas.album.addregistrationrefusal;

import java.util.ArrayList;
import java.util.List;

/** 
 * Причины отказа
 */
public class RefuseReasonType
{
    private String refusalReasonCode;
    private List<String> refusalReasonDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'RefusalReasonCode' element value. Код причины отказа
     * 
     * @return value
     */
    public String getRefusalReasonCode() {
        return refusalReasonCode;
    }

    /** 
     * Set the 'RefusalReasonCode' element value. Код причины отказа
     * 
     * @param refusalReasonCode
     */
    public void setRefusalReasonCode(String refusalReasonCode) {
        this.refusalReasonCode = refusalReasonCode;
    }

    /** 
     * Get the list of 'RefusalReasonDescription' element items. Описание причины отказа
     * 
     * @return list
     */
    public List<String> getRefusalReasonDescriptionList() {
        return refusalReasonDescriptionList;
    }

    /** 
     * Set the list of 'RefusalReasonDescription' element items. Описание причины отказа
     * 
     * @param list
     */
    public void setRefusalReasonDescriptionList(List<String> list) {
        refusalReasonDescriptionList = list;
    }
}
