
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ��������������� ������� - ������������ ��������
 */
public class CUTransportType
{
    private String transporKind;
    private List<String> transporIdentifierList = new ArrayList<String>();

    /** 
     * Get the 'TransporKind' element value. ��� ���� ������������� �������� � ������������ � ��������������� ����� ���������� � ��������������� �������
     * 
     * @return value
     */
    public String getTransporKind() {
        return transporKind;
    }

    /** 
     * Set the 'TransporKind' element value. ��� ���� ������������� �������� � ������������ � ��������������� ����� ���������� � ��������������� �������
     * 
     * @param transporKind
     */
    public void setTransporKind(String transporKind) {
        this.transporKind = transporKind;
    }

    /** 
     * Get the list of 'TransporIdentifier' element items. ����� ������������� ��������
     * 
     * @return list
     */
    public List<String> getTransporIdentifierList() {
        return transporIdentifierList;
    }

    /** 
     * Set the list of 'TransporIdentifier' element items. ����� ������������� ��������
     * 
     * @param list
     */
    public void setTransporIdentifierList(List<String> list) {
        transporIdentifierList = list;
    }
}
