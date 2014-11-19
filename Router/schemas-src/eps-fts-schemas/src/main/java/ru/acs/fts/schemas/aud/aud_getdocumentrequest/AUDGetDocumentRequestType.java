
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentDataPresenceInfoType;

/** 
 * ������ �� ����� � ���������� ��������� (����������) ������.
 */
public class AUDGetDocumentRequestType extends AUDBaseEnvelopeType
{
    private int choiceSelect = -1;
    private static final int DOCUMENT_FILTER_CHOICE = 0;
    private static final int DOCUMENT_ARCHIVE_ID_REQUEST_PARAMS_CHOICE = 1;
    private DocumentFilterType documentFilter;
    private DocumentArchiveIdRequestParamsType documentArchiveIdRequestParams;
    private AUDDocumentDataPresenceInfoType documentDataPresenceInfo;
    private String documentModeID;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if DocumentFilter is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocumentFilter() {
        return choiceSelect == DOCUMENT_FILTER_CHOICE;
    }

    /** 
     * Get the 'DocumentFilter' element value. ��������� ������ ���������� � �������������� ��������. ������������� ���� �������� �������� �������� ������������ � ����������� ����������� "�" (������� ��������� ������ ������������� ���� �������� ��������� � ��������).
     * 
     * @return value
     */
    public DocumentFilterType getDocumentFilter() {
        return documentFilter;
    }

    /** 
     * Set the 'DocumentFilter' element value. ��������� ������ ���������� � �������������� ��������. ������������� ���� �������� �������� �������� ������������ � ����������� ����������� "�" (������� ��������� ������ ������������� ���� �������� ��������� � ��������).
     * 
     * @param documentFilter
     */
    public void setDocumentFilter(DocumentFilterType documentFilter) {
        setChoiceSelect(DOCUMENT_FILTER_CHOICE);
        this.documentFilter = documentFilter;
    }

    /** 
     * Check if DocumentArchiveIdRequestParams is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocumentArchiveIdRequestParams() {
        return choiceSelect == DOCUMENT_ARCHIVE_ID_REQUEST_PARAMS_CHOICE;
    }

    /** 
     * Get the 'DocumentArchiveIdRequestParams' element value. ��������� ������� ��������� �� ��������� ��������������.
     * 
     * @return value
     */
    public DocumentArchiveIdRequestParamsType getDocumentArchiveIdRequestParams() {
        return documentArchiveIdRequestParams;
    }

    /** 
     * Set the 'DocumentArchiveIdRequestParams' element value. ��������� ������� ��������� �� ��������� ��������������.
     * 
     * @param documentArchiveIdRequestParams
     */
    public void setDocumentArchiveIdRequestParams(
            DocumentArchiveIdRequestParamsType documentArchiveIdRequestParams) {
        setChoiceSelect(DOCUMENT_ARCHIVE_ID_REQUEST_PARAMS_CHOICE);
        this.documentArchiveIdRequestParams = documentArchiveIdRequestParams;
    }

    /** 
     * Get the 'DocumentDataPresenceInfo' element value. �������� ������������� �������������� ��������� ������, ��������� � ����������.
     * 
     * @return value
     */
    public AUDDocumentDataPresenceInfoType getDocumentDataPresenceInfo() {
        return documentDataPresenceInfo;
    }

    /** 
     * Set the 'DocumentDataPresenceInfo' element value. �������� ������������� �������������� ��������� ������, ��������� � ����������.
     * 
     * @param documentDataPresenceInfo
     */
    public void setDocumentDataPresenceInfo(
            AUDDocumentDataPresenceInfoType documentDataPresenceInfo) {
        this.documentDataPresenceInfo = documentDataPresenceInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
