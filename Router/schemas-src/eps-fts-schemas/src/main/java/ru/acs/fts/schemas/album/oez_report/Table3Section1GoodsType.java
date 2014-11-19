
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 3. ������ 1. �����, ���������� ��� ���������� ����� ��������� ���������� ���� ��� ����� �����������
 */
public class Table3Section1GoodsType extends GoodsBaseType
{
    private String quantity;
    private List<String> OEZGoodsNameList = new ArrayList<String>();
    private List<String> noteList = new ArrayList<String>();
    private String nonProcessingGoodsTail;
    private Table2CustomsDocumentType customsDocument;

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'OEZGoodsName' element items. ������������ �������, ������������ �� ���������� ���
     * 
     * @return list
     */
    public List<String> getOEZGoodsNameList() {
        return OEZGoodsNameList;
    }

    /** 
     * Set the list of 'OEZGoodsName' element items. ������������ �������, ������������ �� ���������� ���
     * 
     * @param list
     */
    public void setOEZGoodsNameList(List<String> list) {
        OEZGoodsNameList = list;
    }

    /** 
     * Get the list of 'Note' element items. ����������
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. ����������
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'NonProcessingGoodsTail' element value. ������� �������, � ��������� ������� �� ��������� �������� �� �����������, ����������� � ��������� ��� �� �������� ����(����������)
     * 
     * @return value
     */
    public String getNonProcessingGoodsTail() {
        return nonProcessingGoodsTail;
    }

    /** 
     * Set the 'NonProcessingGoodsTail' element value. ������� �������, � ��������� ������� �� ��������� �������� �� �����������, ����������� � ��������� ��� �� �������� ����(����������)
     * 
     * @param nonProcessingGoodsTail
     */
    public void setNonProcessingGoodsTail(String nonProcessingGoodsTail) {
        this.nonProcessingGoodsTail = nonProcessingGoodsTail;
    }

    /** 
     * Get the 'CustomsDocument' element value. ���������� ��������. ����� ��. ����� ��������� ����������� ���������, �� ��������� �������� �������������� ���������� ����������, ����� � ��������� ����� ������� ��������� ����������
     * 
     * @return value
     */
    public Table2CustomsDocumentType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. ���������� ��������. ����� ��. ����� ��������� ����������� ���������, �� ��������� �������� �������������� ���������� ����������, ����� � ��������� ����� ������� ��������� ����������
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(Table2CustomsDocumentType customsDocument) {
        this.customsDocument = customsDocument;
    }
}
