
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� �������
 */
public class EntryTableType extends CellType
{
    private String cols;
    private List<EntryRowType> entryRowList = new ArrayList<EntryRowType>();

    /** 
     * Get the 'Cols' element value. ����� ������� � �������
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'Cols' element value. ����� ������� � �������
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }

    /** 
     * Get the list of 'EntryRow' element items. ������ �������
     * 
     * @return list
     */
    public List<EntryRowType> getEntryRowList() {
        return entryRowList;
    }

    /** 
     * Set the list of 'EntryRow' element items. ������ �������
     * 
     * @param list
     */
    public void setEntryRowList(List<EntryRowType> list) {
        entryRowList = list;
    }
}
