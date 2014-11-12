
package ru.acs.fts.schemas.album.goodscheckreport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ����� � ����������� ������
 */
public class GoodsCheckReportType extends BaseDocType
{
    private List<String> noteList = new ArrayList<String>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<GoodsCheckTableType> goodsCheckTableList = new ArrayList<GoodsCheckTableType>();
    private String documentModeID;

    /** 
     * Get the list of 'Note' element items. ����������, �����������
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. ����������, �����������
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����, ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����, ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ����, ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ����, ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'GoodsCheckTable' element items. ������� ������
     * 
     * @return list
     */
    public List<GoodsCheckTableType> getGoodsCheckTableList() {
        return goodsCheckTableList;
    }

    /** 
     * Set the list of 'GoodsCheckTable' element items. ������� ������
     * 
     * @param list
     */
    public void setGoodsCheckTableList(List<GoodsCheckTableType> list) {
        goodsCheckTableList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
