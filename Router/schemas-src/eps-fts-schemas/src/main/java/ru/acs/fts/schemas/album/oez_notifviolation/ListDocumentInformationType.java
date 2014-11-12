
package ru.acs.fts.schemas.album.oez_notifviolation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документы и сведения, представляемые в уполномоченный таможенный орган
 */
public class ListDocumentInformationType extends DocumentBaseType
{
    private List<String> addInformationList = new ArrayList<String>();

    /** 
     * Get the list of 'AddInformation' element items. Сведения
     * 
     * @return list
     */
    public List<String> getAddInformationList() {
        return addInformationList;
    }

    /** 
     * Set the list of 'AddInformation' element items. Сведения
     * 
     * @param list
     */
    public void setAddInformationList(List<String> list) {
        addInformationList = list;
    }
}
