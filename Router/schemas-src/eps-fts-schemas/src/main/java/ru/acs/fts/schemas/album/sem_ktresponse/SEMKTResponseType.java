
package ru.acs.fts.schemas.album.sem_ktresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ������� ���������� �� ��������������� ������ �������, ����������� ��� ������������ � ����������� ����� ���������� ������� ��
 */
public class SEMKTResponseType extends BaseDocType
{
    private String status;
    private List<ResultKTGoodsType> goodList = new ArrayList<ResultKTGoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Status' element value. C�������� ���������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. C�������� ���������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the list of 'Goods' element items. ���������� � �������. � ������ ���������� ���������� �� ������� �� �������
     * 
     * @return list
     */
    public List<ResultKTGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. ���������� � �������. � ������ ���������� ���������� �� ������� �� �������
     * 
     * @param list
     */
    public void setGoodList(List<ResultKTGoodsType> list) {
        goodList = list;
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
