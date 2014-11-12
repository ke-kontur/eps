
package ru.acs.fts.schemas.album.bdrd_request;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� ��������
 */
public class RequestedDataType extends DocumentBaseType
{
    private String docCode;
    private String requestPositionID;
    private List<GoodsType> goodInfoList = new ArrayList<GoodsType>();

    /** 
     * Get the 'DocCode' element value. ��� ���� �������������� ���������
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� �������������� ���������
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'RequestPositionID' element value. ������� �� � �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������� �� � �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the list of 'GoodInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsType> getGoodInfoList() {
        return goodInfoList;
    }

    /** 
     * Set the list of 'GoodInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodInfoList(List<GoodsType> list) {
        goodInfoList = list;
    }
}
