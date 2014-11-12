
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товарах помещенных под таможенную процедуру
 */
public class CustomsProcedurePlacedType extends CustomsModeQuantityType
{
    private List<String> noteList = new ArrayList<String>();

    /** 
     * Get the list of 'Note' element items. Примечание
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. Примечание
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }
}
