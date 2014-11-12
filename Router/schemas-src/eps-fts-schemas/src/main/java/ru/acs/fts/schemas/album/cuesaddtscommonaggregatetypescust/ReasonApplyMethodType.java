
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Причина, по которой предшествующие методы определения стоимости не применимы
 */
public class ReasonApplyMethodType
{
    private List<String> reasonDescriptionList = new ArrayList<String>();

    /** 
     * Get the list of 'ReasonDescription' element items. Описание причины
     * 
     * @return list
     */
    public List<String> getReasonDescriptionList() {
        return reasonDescriptionList;
    }

    /** 
     * Set the list of 'ReasonDescription' element items. Описание причины
     * 
     * @param list
     */
    public void setReasonDescriptionList(List<String> list) {
        reasonDescriptionList = list;
    }
}
