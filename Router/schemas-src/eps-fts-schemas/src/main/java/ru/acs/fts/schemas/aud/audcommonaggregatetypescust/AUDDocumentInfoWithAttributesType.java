
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ��������� ������, ������ (� ������ �������� ������ ��������) � ���������� ���������.
 */
public class AUDDocumentInfoWithAttributesType
        extends
            AUDDocumentInfoWithPacketType
{
    private List<AUDDocumentAttributeInfoAndValueType> AUDDocumentAttributeInfoAndValueList = new ArrayList<AUDDocumentAttributeInfoAndValueType>();

    /** 
     * Get the list of 'AUD_DocumentAttributeInfoAndValue' element items. ���������� � ��������� ��������� � �������� ���������.
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoAndValueType> getAUDDocumentAttributeInfoAndValueList() {
        return AUDDocumentAttributeInfoAndValueList;
    }

    /** 
     * Set the list of 'AUD_DocumentAttributeInfoAndValue' element items. ���������� � ��������� ��������� � �������� ���������.
     * 
     * @param list
     */
    public void setAUDDocumentAttributeInfoAndValueList(
            List<AUDDocumentAttributeInfoAndValueType> list) {
        AUDDocumentAttributeInfoAndValueList = list;
    }
}
