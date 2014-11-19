
package ru.acs.fts.schemas.aud.aud_documentkindinforesponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ����� �� ������ �� ��������� ���������� � ������������������ ����� ����������.
 */
public class AUDDocumentKindInfoResponseType extends AUDBaseEnvelopeType
{
    private List<KindInfoLocalType> documentKindInfoList = new ArrayList<KindInfoLocalType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentKindInfo' element items. ���������� � ���� ���������� � ������� ����� ����.
     * 
     * @return list
     */
    public List<KindInfoLocalType> getDocumentKindInfoList() {
        return documentKindInfoList;
    }

    /** 
     * Set the list of 'DocumentKindInfo' element items. ���������� � ���� ���������� � ������� ����� ����.
     * 
     * @param list
     */
    public void setDocumentKindInfoList(List<KindInfoLocalType> list) {
        documentKindInfoList = list;
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
