
package ru.acs.fts.schemas.album.cwquery;

import java.util.ArrayList;
import java.util.List;

/** 
 * Номера запрашиваемых документов
 */
public class NumbersType
{
    private List<String> documentNumberList = new ArrayList<String>();

    /** 
     * Get the list of 'DocumentNumbers' element items. Номер запрашиваемого документа
     * 
     * @return list
     */
    public List<String> getDocumentNumberList() {
        return documentNumberList;
    }

    /** 
     * Set the list of 'DocumentNumbers' element items. Номер запрашиваемого документа
     * 
     * @param list
     */
    public void setDocumentNumberList(List<String> list) {
        documentNumberList = list;
    }
}
