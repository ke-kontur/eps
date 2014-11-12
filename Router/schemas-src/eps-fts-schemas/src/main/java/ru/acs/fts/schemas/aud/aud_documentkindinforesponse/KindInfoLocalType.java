
package ru.acs.fts.schemas.aud.aud_documentkindinforesponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentAttributeInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionInfoType;

public class KindInfoLocalType
{
    private String appliedDocumentKindId;
    private String description;
    private List<AUDDocumentKindVersionInfoType> documentKindVersionInfoList = new ArrayList<AUDDocumentKindVersionInfoType>();
    private List<AUDDocumentAttributeInfoType> documentCommonAttributeList = new ArrayList<AUDDocumentAttributeInfoType>();

    /** 
     * Get the 'AppliedDocumentKindId' element value. Идентификатор вида прикладных документов. Значение должно быть равно значению атрибута 'DocumentModeID' ("Идентификатор вида документа. Код документа в Альбоме форматов.") прикладного документа.
     * 
     * @return value
     */
    public String getAppliedDocumentKindId() {
        return appliedDocumentKindId;
    }

    /** 
     * Set the 'AppliedDocumentKindId' element value. Идентификатор вида прикладных документов. Значение должно быть равно значению атрибута 'DocumentModeID' ("Идентификатор вида документа. Код документа в Альбоме форматов.") прикладного документа.
     * 
     * @param appliedDocumentKindId
     */
    public void setAppliedDocumentKindId(String appliedDocumentKindId) {
        this.appliedDocumentKindId = appliedDocumentKindId;
    }

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

    /** 
     * Get the list of 'DocumentCommonAttribute' element items. Информация о реквизите документа
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoType> getDocumentCommonAttributeList() {
        return documentCommonAttributeList;
    }

    /** 
     * Set the list of 'DocumentCommonAttribute' element items. Информация о реквизите документа
     * 
     * @param list
     */
    public void setDocumentCommonAttributeList(
            List<AUDDocumentAttributeInfoType> list) {
        documentCommonAttributeList = list;
    }
}
