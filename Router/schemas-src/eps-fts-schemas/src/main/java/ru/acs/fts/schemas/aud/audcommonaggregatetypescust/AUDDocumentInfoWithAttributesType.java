
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о документе архива, пакете (в состав которого входит документ) и реквизитах документа.
 */
public class AUDDocumentInfoWithAttributesType
        extends
            AUDDocumentInfoWithPacketType
{
    private List<AUDDocumentAttributeInfoAndValueType> AUDDocumentAttributeInfoAndValueList = new ArrayList<AUDDocumentAttributeInfoAndValueType>();

    /** 
     * Get the list of 'AUD_DocumentAttributeInfoAndValue' element items. Информация о реквизите документа и значение реквизита.
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoAndValueType> getAUDDocumentAttributeInfoAndValueList() {
        return AUDDocumentAttributeInfoAndValueList;
    }

    /** 
     * Set the list of 'AUD_DocumentAttributeInfoAndValue' element items. Информация о реквизите документа и значение реквизита.
     * 
     * @param list
     */
    public void setAUDDocumentAttributeInfoAndValueList(
            List<AUDDocumentAttributeInfoAndValueType> list) {
        AUDDocumentAttributeInfoAndValueList = list;
    }
}
