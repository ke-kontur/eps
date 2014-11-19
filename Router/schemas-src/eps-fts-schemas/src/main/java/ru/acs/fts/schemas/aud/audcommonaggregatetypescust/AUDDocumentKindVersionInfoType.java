
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о версии вида документов, включая перечень способов представления (для визуализации документов) и перечень реквизитов.
 */
public class AUDDocumentKindVersionInfoType
{
    private String appliedDocumentKindVersionId;
    private List<AUDDocumentAttributeInfoType> documentAttributeInfoList = new ArrayList<AUDDocumentAttributeInfoType>();
    private List<AUDRepresentationKindCommonInfoType> representationKindCommonInfoList = new ArrayList<AUDRepresentationKindCommonInfoType>();

    /** 
     * Get the 'AppliedDocumentKindVersionId' element value. Идентификатор версии вида прикладных документов. Значение должно быть равно идентификатору пространства имен XML прикладного документа (корневого элемента документа).
     * 
     * @return value
     */
    public String getAppliedDocumentKindVersionId() {
        return appliedDocumentKindVersionId;
    }

    /** 
     * Set the 'AppliedDocumentKindVersionId' element value. Идентификатор версии вида прикладных документов. Значение должно быть равно идентификатору пространства имен XML прикладного документа (корневого элемента документа).
     * 
     * @param appliedDocumentKindVersionId
     */
    public void setAppliedDocumentKindVersionId(
            String appliedDocumentKindVersionId) {
        this.appliedDocumentKindVersionId = appliedDocumentKindVersionId;
    }

    /** 
     * Get the list of 'DocumentAttributeInfo' element items. Резерв. Информация о реквизите документа.
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoType> getDocumentAttributeInfoList() {
        return documentAttributeInfoList;
    }

    /** 
     * Set the list of 'DocumentAttributeInfo' element items. Резерв. Информация о реквизите документа.
     * 
     * @param list
     */
    public void setDocumentAttributeInfoList(
            List<AUDDocumentAttributeInfoType> list) {
        documentAttributeInfoList = list;
    }

    /** 
     * Get the list of 'RepresentationKindCommonInfo' element items. Информация о виде представления (для визуализации документа).
     * 
     * @return list
     */
    public List<AUDRepresentationKindCommonInfoType> getRepresentationKindCommonInfoList() {
        return representationKindCommonInfoList;
    }

    /** 
     * Set the list of 'RepresentationKindCommonInfo' element items. Информация о виде представления (для визуализации документа).
     * 
     * @param list
     */
    public void setRepresentationKindCommonInfoList(
            List<AUDRepresentationKindCommonInfoType> list) {
        representationKindCommonInfoList = list;
    }
}
