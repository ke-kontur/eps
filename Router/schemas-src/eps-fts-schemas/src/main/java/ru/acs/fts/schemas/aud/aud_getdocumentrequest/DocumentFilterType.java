
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDateTimeFilterParamsType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDStringFilterParamsType;

/** 
 * ��������� ������ ���������� � �������������� ��������.
 */
public class DocumentFilterType
{
    private DocumentAttributesFilterType documentAttributesFilter;
    private List<AUDStringFilterParamsType> documentContentsFilterList = new ArrayList<AUDStringFilterParamsType>();
    private List<AUDStringFilterParamsType> documentDescriptionFilterList = new ArrayList<AUDStringFilterParamsType>();
    private List<AUDDateTimeFilterParamsType> documentPutDateTimeFilterList = new ArrayList<AUDDateTimeFilterParamsType>();
    private AUDStringFilterParamsType appliedDocumentId;

    /** 
     * Get the 'DocumentAttributesFilter' element value. ��������� ������� �� ��������� ���������. ������ ���� ������ ��� ������� ���������� (������������� ���� � ������������� ������ ����), ������� ���������� �������� ��������� ����������, �� ������� ����� ���� ������� ������.
     * 
     * @return value
     */
    public DocumentAttributesFilterType getDocumentAttributesFilter() {
        return documentAttributesFilter;
    }

    /** 
     * Set the 'DocumentAttributesFilter' element value. ��������� ������� �� ��������� ���������. ������ ���� ������ ��� ������� ���������� (������������� ���� � ������������� ������ ����), ������� ���������� �������� ��������� ����������, �� ������� ����� ���� ������� ������.
     * 
     * @param documentAttributesFilter
     */
    public void setDocumentAttributesFilter(
            DocumentAttributesFilterType documentAttributesFilter) {
        this.documentAttributesFilter = documentAttributesFilter;
    }

    /** 
     * Get the list of 'DocumentContentsFilter' element items. ��������� ������� �� ���������� (�����) ���������. �������� ���� "string" (������). ���������� ���������: like.
     * 
     * @return list
     */
    public List<AUDStringFilterParamsType> getDocumentContentsFilterList() {
        return documentContentsFilterList;
    }

    /** 
     * Set the list of 'DocumentContentsFilter' element items. ��������� ������� �� ���������� (�����) ���������. �������� ���� "string" (������). ���������� ���������: like.
     * 
     * @param list
     */
    public void setDocumentContentsFilterList(
            List<AUDStringFilterParamsType> list) {
        documentContentsFilterList = list;
    }

    /** 
     * Get the list of 'DocumentDescriptionFilter' element items. ��������� ������� �� �������� ���������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @return list
     */
    public List<AUDStringFilterParamsType> getDocumentDescriptionFilterList() {
        return documentDescriptionFilterList;
    }

    /** 
     * Set the list of 'DocumentDescriptionFilter' element items. ��������� ������� �� �������� ���������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @param list
     */
    public void setDocumentDescriptionFilterList(
            List<AUDStringFilterParamsType> list) {
        documentDescriptionFilterList = list;
    }

    /** 
     * Get the list of 'DocumentPutDateTimeFilter' element items. ��������� ������� �� ���� � ����� ���������� ��������� � ������ - �������� ���� "datetime" (���� � �����). ���������� ���������: equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal. �������� ������� ������ ���� ������������ � ��������� �������� (�������� ���������� ������� ������������ ���������� �������).
     * 
     * @return list
     */
    public List<AUDDateTimeFilterParamsType> getDocumentPutDateTimeFilterList() {
        return documentPutDateTimeFilterList;
    }

    /** 
     * Set the list of 'DocumentPutDateTimeFilter' element items. ��������� ������� �� ���� � ����� ���������� ��������� � ������ - �������� ���� "datetime" (���� � �����). ���������� ���������: equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal. �������� ������� ������ ���� ������������ � ��������� �������� (�������� ���������� ������� ������������ ���������� �������).
     * 
     * @param list
     */
    public void setDocumentPutDateTimeFilterList(
            List<AUDDateTimeFilterParamsType> list) {
        documentPutDateTimeFilterList = list;
    }

    /** 
     * Get the 'AppliedDocumentId' element value. ��������� ������� �� ���������� ������������� ���������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @return value
     */
    public AUDStringFilterParamsType getAppliedDocumentId() {
        return appliedDocumentId;
    }

    /** 
     * Set the 'AppliedDocumentId' element value. ��������� ������� �� ���������� ������������� ���������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @param appliedDocumentId
     */
    public void setAppliedDocumentId(AUDStringFilterParamsType appliedDocumentId) {
        this.appliedDocumentId = appliedDocumentId;
    }
}
