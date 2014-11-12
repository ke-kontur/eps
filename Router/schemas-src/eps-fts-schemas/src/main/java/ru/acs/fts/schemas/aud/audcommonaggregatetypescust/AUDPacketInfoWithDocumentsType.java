
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ������ ������ � ��� ����������.
 */
public class AUDPacketInfoWithDocumentsType extends AUDPacketInfoType
{
    private List<AUDDocumentInfoType> documentInfoList = new ArrayList<AUDDocumentInfoType>();

    /** 
     * Get the list of 'DocumentInfo' element items. ���������� � ��������� ������.
     * 
     * @return list
     */
    public List<AUDDocumentInfoType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. ���������� � ��������� ������.
     * 
     * @param list
     */
    public void setDocumentInfoList(List<AUDDocumentInfoType> list) {
        documentInfoList = list;
    }
}
