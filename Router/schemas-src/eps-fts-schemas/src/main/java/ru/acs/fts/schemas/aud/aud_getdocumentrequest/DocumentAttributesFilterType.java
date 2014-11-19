
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAttributeFilterParamsType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDTFilterType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDStringFilterParamsType;

/** 
 * Параметры фильтра на реквизиты документа. Должен быть указан вид искомых документов (идентификатор вида и идентификатор версии вида), который определяет перечень возможных реквизитов, на которые может быть наложен фильтр.
 */
public class DocumentAttributesFilterType
{
    private String appliedDocumentKindId;
    private String appliedDocumentKindVersionId;
    private List<AUDAttributeFilterParamsType> attributeFilterParamList = new ArrayList<AUDAttributeFilterParamsType>();
    private AUDDTFilterType appliedGTDID;
    private AUDStringFilterParamsType appliedPacketID;

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
     * Get the list of 'AttributeFilterParams' element items. Параметры фильтра на реквизит документа.
     * 
     * @return list
     */
    public List<AUDAttributeFilterParamsType> getAttributeFilterParamList() {
        return attributeFilterParamList;
    }

    /** 
     * Set the list of 'AttributeFilterParams' element items. Параметры фильтра на реквизит документа.
     * 
     * @param list
     */
    public void setAttributeFilterParamList(
            List<AUDAttributeFilterParamsType> list) {
        attributeFilterParamList = list;
    }

    /** 
     * Get the 'AppliedGTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public AUDDTFilterType getAppliedGTDID() {
        return appliedGTDID;
    }

    /** 
     * Set the 'AppliedGTDID' element value. Регистрационный номер ДТ
     * 
     * @param appliedGTDID
     */
    public void setAppliedGTDID(AUDDTFilterType appliedGTDID) {
        this.appliedGTDID = appliedGTDID;
    }

    /** 
     * Get the 'AppliedPacketID' element value. Параметры фильтра на прикладной идентификатор пакета. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @return value
     */
    public AUDStringFilterParamsType getAppliedPacketID() {
        return appliedPacketID;
    }

    /** 
     * Set the 'AppliedPacketID' element value. Параметры фильтра на прикладной идентификатор пакета. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @param appliedPacketID
     */
    public void setAppliedPacketID(AUDStringFilterParamsType appliedPacketID) {
        this.appliedPacketID = appliedPacketID;
    }
}
