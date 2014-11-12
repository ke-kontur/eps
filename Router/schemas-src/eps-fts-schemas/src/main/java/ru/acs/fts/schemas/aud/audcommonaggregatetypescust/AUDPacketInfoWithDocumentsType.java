
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о пакете архива и его документах.
 */
public class AUDPacketInfoWithDocumentsType extends AUDPacketInfoType
{
    private List<AUDDocumentInfoType> documentInfoList = new ArrayList<AUDDocumentInfoType>();

    /** 
     * Get the list of 'DocumentInfo' element items. Информация о документе архива.
     * 
     * @return list
     */
    public List<AUDDocumentInfoType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. Информация о документе архива.
     * 
     * @param list
     */
    public void setDocumentInfoList(List<AUDDocumentInfoType> list) {
        documentInfoList = list;
    }
}
