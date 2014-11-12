
package ru.acs.fts.schemas.aud.aud_error;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentIdType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

/** 
 * ���������� � ���������� ��������� ���������, ���������� � ��������-���������. ����������� � ������, ���� ���������� �� �������� �������� ������������ ����� ��������-��������� ('ED_Container').
 */
public class EmbeddedDocumentResultInfoType extends AUDAppliedDocumentIdType
{
    private List<AUDResultInfoType> resultInfoList = new ArrayList<AUDResultInfoType>();

    /** 
     * Get the list of 'ResultInfo' element items. ���������� � ���������� ��������� ���������.
     * 
     * @return list
     */
    public List<AUDResultInfoType> getResultInfoList() {
        return resultInfoList;
    }

    /** 
     * Set the list of 'ResultInfo' element items. ���������� � ���������� ��������� ���������.
     * 
     * @param list
     */
    public void setResultInfoList(List<AUDResultInfoType> list) {
        resultInfoList = list;
    }
}
