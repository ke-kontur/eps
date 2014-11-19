
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������
 */
public class CellType extends TextParaType
{
    private String align;
    private String valign;
    private List<String> namestList = new ArrayList<String>();
    private List<String> nameendList = new ArrayList<String>();
    private String morerows;
    private String morecols;

    /** 
     * Get the 'Align' element value. ����� ������������ �� �����������
     * 
     * @return value
     */
    public String getAlign() {
        return align;
    }

    /** 
     * Set the 'Align' element value. ����� ������������ �� �����������
     * 
     * @param align
     */
    public void setAlign(String align) {
        this.align = align;
    }

    /** 
     * Get the 'Valign' element value. ����� ������������ �� ���������
     * 
     * @return value
     */
    public String getValign() {
        return valign;
    }

    /** 
     * Set the 'Valign' element value. ����� ������������ �� ���������
     * 
     * @param valign
     */
    public void setValign(String valign) {
        this.valign = valign;
    }

    /** 
     * Get the list of 'Namest' element items. ������������ ������ ������, ���������� � ����������� �� �����������
     * 
     * @return list
     */
    public List<String> getNamestList() {
        return namestList;
    }

    /** 
     * Set the list of 'Namest' element items. ������������ ������ ������, ���������� � ����������� �� �����������
     * 
     * @param list
     */
    public void setNamestList(List<String> list) {
        namestList = list;
    }

    /** 
     * Get the list of 'Nameend' element items. ������������ ��������� ������, ���������� � ����������� �� �����������
     * 
     * @return list
     */
    public List<String> getNameendList() {
        return nameendList;
    }

    /** 
     * Set the list of 'Nameend' element items. ������������ ��������� ������, ���������� � ����������� �� �����������
     * 
     * @param list
     */
    public void setNameendList(List<String> list) {
        nameendList = list;
    }

    /** 
     * Get the 'Morerows' element value. ���������� �����, ���������� � ����������� �� ���������
     * 
     * @return value
     */
    public String getMorerows() {
        return morerows;
    }

    /** 
     * Set the 'Morerows' element value. ���������� �����, ���������� � ����������� �� ���������
     * 
     * @param morerows
     */
    public void setMorerows(String morerows) {
        this.morerows = morerows;
    }

    /** 
     * Get the 'Morecols' element value. ���������� ��������, ���������� � ����������� �� �����������
     * 
     * @return value
     */
    public String getMorecols() {
        return morecols;
    }

    /** 
     * Set the 'Morecols' element value. ���������� ��������, ���������� � ����������� �� �����������
     * 
     * @param morecols
     */
    public void setMorecols(String morecols) {
        this.morecols = morecols;
    }
}
