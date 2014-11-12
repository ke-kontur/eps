
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDateTimeFilterParamsType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDStringFilterParamsType;

/** 
 * Параметры поиска документов с использованием фильтров.
 */
public class DocumentFilterType
{
    private DocumentAttributesFilterType documentAttributesFilter;
    private List<AUDStringFilterParamsType> documentContentsFilterList = new ArrayList<AUDStringFilterParamsType>();
    private List<AUDStringFilterParamsType> documentDescriptionFilterList = new ArrayList<AUDStringFilterParamsType>();
    private List<AUDDateTimeFilterParamsType> documentPutDateTimeFilterList = new ArrayList<AUDDateTimeFilterParamsType>();
    private AUDStringFilterParamsType appliedDocumentId;

    /** 
     * Get the 'DocumentAttributesFilter' element value. Параметры фильтра на реквизиты документа. Должен быть указан вид искомых документов (идентификатор вида и идентификатор версии вида), который определяет перечень возможных реквизитов, на которые может быть наложен фильтр.
     * 
     * @return value
     */
    public DocumentAttributesFilterType getDocumentAttributesFilter() {
        return documentAttributesFilter;
    }

    /** 
     * Set the 'DocumentAttributesFilter' element value. Параметры фильтра на реквизиты документа. Должен быть указан вид искомых документов (идентификатор вида и идентификатор версии вида), который определяет перечень возможных реквизитов, на которые может быть наложен фильтр.
     * 
     * @param documentAttributesFilter
     */
    public void setDocumentAttributesFilter(
            DocumentAttributesFilterType documentAttributesFilter) {
        this.documentAttributesFilter = documentAttributesFilter;
    }

    /** 
     * Get the list of 'DocumentContentsFilter' element items. Параметры фильтра на содержимое (текст) документа. Значение типа "string" (строка). Допустимые операторы: like.
     * 
     * @return list
     */
    public List<AUDStringFilterParamsType> getDocumentContentsFilterList() {
        return documentContentsFilterList;
    }

    /** 
     * Set the list of 'DocumentContentsFilter' element items. Параметры фильтра на содержимое (текст) документа. Значение типа "string" (строка). Допустимые операторы: like.
     * 
     * @param list
     */
    public void setDocumentContentsFilterList(
            List<AUDStringFilterParamsType> list) {
        documentContentsFilterList = list;
    }

    /** 
     * Get the list of 'DocumentDescriptionFilter' element items. Параметры фильтра на описание документа. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @return list
     */
    public List<AUDStringFilterParamsType> getDocumentDescriptionFilterList() {
        return documentDescriptionFilterList;
    }

    /** 
     * Set the list of 'DocumentDescriptionFilter' element items. Параметры фильтра на описание документа. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @param list
     */
    public void setDocumentDescriptionFilterList(
            List<AUDStringFilterParamsType> list) {
        documentDescriptionFilterList = list;
    }

    /** 
     * Get the list of 'DocumentPutDateTimeFilter' element items. Параметры фильтра на дату и время размещения документа в архиве - значение типа "datetime" (дата и время). Допустимые операторы: equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal. Значения фильтра должны быть представлены с указанием смещения (значения локального времени относительно всемирного времени).
     * 
     * @return list
     */
    public List<AUDDateTimeFilterParamsType> getDocumentPutDateTimeFilterList() {
        return documentPutDateTimeFilterList;
    }

    /** 
     * Set the list of 'DocumentPutDateTimeFilter' element items. Параметры фильтра на дату и время размещения документа в архиве - значение типа "datetime" (дата и время). Допустимые операторы: equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal. Значения фильтра должны быть представлены с указанием смещения (значения локального времени относительно всемирного времени).
     * 
     * @param list
     */
    public void setDocumentPutDateTimeFilterList(
            List<AUDDateTimeFilterParamsType> list) {
        documentPutDateTimeFilterList = list;
    }

    /** 
     * Get the 'AppliedDocumentId' element value. Параметры фильтра на прикладной идентификатор документа. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @return value
     */
    public AUDStringFilterParamsType getAppliedDocumentId() {
        return appliedDocumentId;
    }

    /** 
     * Set the 'AppliedDocumentId' element value. Параметры фильтра на прикладной идентификатор документа. Значение типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
     * 
     * @param appliedDocumentId
     */
    public void setAppliedDocumentId(AUDStringFilterParamsType appliedDocumentId) {
        this.appliedDocumentId = appliedDocumentId;
    }
}
