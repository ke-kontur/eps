
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о предоставленной предварительной информации
 */
public class PriorInformationType
{
    private List<String> priorInformationIDList = new ArrayList<String>();

    /** 
     * Get the list of 'PriorInformationID' element items. Идентификатор предварительной информации
     * 
     * @return list
     */
    public List<String> getPriorInformationIDList() {
        return priorInformationIDList;
    }

    /** 
     * Set the list of 'PriorInformationID' element items. Идентификатор предварительной информации
     * 
     * @param list
     */
    public void setPriorInformationIDList(List<String> list) {
        priorInformationIDList = list;
    }
}
