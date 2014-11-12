
package ru.acs.fts.schemas.album.actcustomsobservation;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������������� ���� � ���� ����������� ����������
 */
public class AddSheetType
{
    private String numberSheet;
    private List<String> descriptionList = new ArrayList<String>();

    /** 
     * Get the 'NumberSheet' element value. ����� ��������������� �����
     * 
     * @return value
     */
    public String getNumberSheet() {
        return numberSheet;
    }

    /** 
     * Set the 'NumberSheet' element value. ����� ��������������� �����
     * 
     * @param numberSheet
     */
    public void setNumberSheet(String numberSheet) {
        this.numberSheet = numberSheet;
    }

    /** 
     * Get the list of 'Description' element items. �������� �������� ����������� ���������� � ��� ����������
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. �������� �������� ����������� ���������� � ��� ����������
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }
}
