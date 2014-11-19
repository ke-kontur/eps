
package ru.acs.fts.schemas.album.goodsdecision;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������� �������
 */
public class ConsignmentsType
{
    private String consignmentNum;
    private String billSerialNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'ConsignmentNum' element value. ����� �������� ������
     * 
     * @return value
     */
    public String getConsignmentNum() {
        return consignmentNum;
    }

    /** 
     * Set the 'ConsignmentNum' element value. ����� �������� ������
     * 
     * @param consignmentNum
     */
    public void setConsignmentNum(String consignmentNum) {
        this.consignmentNum = consignmentNum;
    }

    /** 
     * Get the 'BillSerialNumber' element value. �������� ����� ���������
     * 
     * @return value
     */
    public String getBillSerialNumber() {
        return billSerialNumber;
    }

    /** 
     * Set the 'BillSerialNumber' element value. �������� ����� ���������
     * 
     * @param billSerialNumber
     */
    public void setBillSerialNumber(String billSerialNumber) {
        this.billSerialNumber = billSerialNumber;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
