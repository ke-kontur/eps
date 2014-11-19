
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 2. �����, ���������� ��� ���������� ����� ��������� ���������� ����, ������� ��������� � ������������ ��������� (����������� ����������������� ��������) � ��������� ��� �������� ������������ � �������� �������������
 */
public class Table2GoodsType extends GoodsWithoutStatusBaseType
{
    private String residentsGoodsQuantity;
    private Table2CustomsDocumentType customsDocument;
    private List<Table2GoodsFlowType> inList = new ArrayList<Table2GoodsFlowType>();
    private List<Table2GoodsFlowType> usedList = new ArrayList<Table2GoodsFlowType>();
    private List<Table2GoodsFlowType> outList = new ArrayList<Table2GoodsFlowType>();

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
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

    /** 
     * Get the list of 'In' element items. ������, ����������� � �����������
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getInList() {
        return inList;
    }

    /** 
     * Set the list of 'In' element items. ������, ����������� � �����������
     * 
     * @param list
     */
    public void setInList(List<Table2GoodsFlowType> list) {
        inList = list;
    }

    /** 
     * Get the list of 'Used' element items. ������, ���������� � ������������ � ���������� ���������������
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getUsedList() {
        return usedList;
    }

    /** 
     * Set the list of 'Used' element items. ������, ���������� � ������������ � ���������� ���������������
     * 
     * @param list
     */
    public void setUsedList(List<Table2GoodsFlowType> list) {
        usedList = list;
    }

    /** 
     * Get the list of 'Out' element items. ������, ������� ������ (�������, �������)
     * 
     * @return list
     */
    public List<Table2GoodsFlowType> getOutList() {
        return outList;
    }

    /** 
     * Set the list of 'Out' element items. ������, ������� ������ (�������, �������)
     * 
     * @param list
     */
    public void setOutList(List<Table2GoodsFlowType> list) {
        outList = list;
    }
}
