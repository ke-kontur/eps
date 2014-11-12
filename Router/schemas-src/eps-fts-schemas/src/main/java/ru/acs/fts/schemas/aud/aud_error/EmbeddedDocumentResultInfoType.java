
package ru.acs.fts.schemas.aud.aud_error;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentIdType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

/** 
 * Информация о результате обработки документа, вложенного в документ-контейнер. Указывается в случае, если переданный на хранение документ представляет собой документ-контейнер ('ED_Container').
 */
public class EmbeddedDocumentResultInfoType extends AUDAppliedDocumentIdType
{
    private List<AUDResultInfoType> resultInfoList = new ArrayList<AUDResultInfoType>();

    /** 
     * Get the list of 'ResultInfo' element items. Информация о результате обработки документа.
     * 
     * @return list
     */
    public List<AUDResultInfoType> getResultInfoList() {
        return resultInfoList;
    }

    /** 
     * Set the list of 'ResultInfo' element items. Информация о результате обработки документа.
     * 
     * @param list
     */
    public void setResultInfoList(List<AUDResultInfoType> list) {
        resultInfoList = list;
    }
}
