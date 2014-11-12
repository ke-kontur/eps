
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о виде документов и версиях этого вида.
 */
public class AUDDocumentKindInfoType extends AUDDocumentKindIdInfoType
{
    private String description;
    private List<AUDDocumentKindVersionInfoType> documentKindVersionInfoList = new ArrayList<AUDDocumentKindVersionInfoType>();

    /** 
     * Get the 'Description' element value. Описание  вида документа.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание  вида документа.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the list of 'DocumentKindVersionInfo' element items. Информация о версии вида документов.
     * 
     * @return list
     */
    public List<AUDDocumentKindVersionInfoType> getDocumentKindVersionInfoList() {
        return documentKindVersionInfoList;
    }

    /** 
     * Set the list of 'DocumentKindVersionInfo' element items. Информация о версии вида документов.
     * 
     * @param list
     */
    public void setDocumentKindVersionInfoList(
            List<AUDDocumentKindVersionInfoType> list) {
        documentKindVersionInfoList = list;
    }
}
