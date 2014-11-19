
package ru.acs.fts.schemas.aud.aud_getdocumentresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentInfoWithAttributesType;

/** 
 * ����� �� ������ �� ����� � ���������� ��������� (����������) ������.
 */
public class AUDGetDocumentResponseType extends AUDBaseEnvelopeType
{
    private List<AUDDocumentInfoWithAttributesType> documentInfoWithAttributeList = new ArrayList<AUDDocumentInfoWithAttributesType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentInfoWithAttributes' element items. ���������� � ��������� ������, ������ (� ������ �������� ������ ��������) � ���������� ���������.
     * 
     * @return list
     */
    public List<AUDDocumentInfoWithAttributesType> getDocumentInfoWithAttributeList() {
        return documentInfoWithAttributeList;
    }

    /** 
     * Set the list of 'DocumentInfoWithAttributes' element items. ���������� � ��������� ������, ������ (� ������ �������� ������ ��������) � ���������� ���������.
     * 
     * @param list
     */
    public void setDocumentInfoWithAttributeList(
            List<AUDDocumentInfoWithAttributesType> list) {
        documentInfoWithAttributeList = list;
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
