
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.MarkUpType;

/** 
 * ����������� ��������� �������� ����������������� ����������� ������� �����
 */
public class RiskProfileDescriptionMarkUpType
{
    private String code;
    private List<MarkUpType> markupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'Code' element value. ��� ������������������ ����������
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. ��� ������������������ ����������
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the list of 'Markup' element items. ��������� ��������
     * 
     * @return list
     */
    public List<MarkUpType> getMarkupList() {
        return markupList;
    }

    /** 
     * Set the list of 'Markup' element items. ��������� ��������
     * 
     * @param list
     */
    public void setMarkupList(List<MarkUpType> list) {
        markupList = list;
    }
}
