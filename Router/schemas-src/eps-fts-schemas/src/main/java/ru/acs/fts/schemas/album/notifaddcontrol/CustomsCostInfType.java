
package ru.acs.fts.schemas.album.notifaddcontrol;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ���������� ���������, ��������� �������������
 */
public class CustomsCostInfType
{
    private String position;
    private List<String> custCostInfList = new ArrayList<String>();
    private List<String> commentList = new ArrayList<String>();
    private List<ReqDocumentType> reqDocumentList = new ArrayList<ReqDocumentType>();

    /** 
     * Get the 'Position' element value. ���������� �����
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� �����
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'CustCostInf' element items. �������� ��������, ��������� �������������/���������
     * 
     * @return list
     */
    public List<String> getCustCostInfList() {
        return custCostInfList;
    }

    /** 
     * Set the list of 'CustCostInf' element items. �������� ��������, ��������� �������������/���������
     * 
     * @param list
     */
    public void setCustCostInfList(List<String> list) {
        custCostInfList = list;
    }

    /** 
     * Get the list of 'Comment' element items. ����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. ����������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the list of 'ReqDocuments' element items. ������������� ���������
     * 
     * @return list
     */
    public List<ReqDocumentType> getReqDocumentList() {
        return reqDocumentList;
    }

    /** 
     * Set the list of 'ReqDocuments' element items. ������������� ���������
     * 
     * @param list
     */
    public void setReqDocumentList(List<ReqDocumentType> list) {
        reqDocumentList = list;
    }
}
