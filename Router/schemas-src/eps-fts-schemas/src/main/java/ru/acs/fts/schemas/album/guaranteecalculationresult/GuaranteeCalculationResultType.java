
package ru.acs.fts.schemas.album.guaranteecalculationresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * ��������� ������� ���� ����������� ������ ���������� ������, �������
 */
public class GuaranteeCalculationResultType extends BaseDocType
{
    private String documentDateTime;
    private TotalAmountType totalAmount;
    private TotalAmountType totalDeltaAmount;
    private List<GoodsAmountType> goodsAmountList = new ArrayList<GoodsAmountType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������.
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������.
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'TotalAmount' element value. ����� ����� �����������, ������������ �� �������
     * 
     * @return value
     */
    public TotalAmountType getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. ����� ����� �����������, ������������ �� �������
     * 
     * @param totalAmount
     */
    public void setTotalAmount(TotalAmountType totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'TotalDeltaAmount' element value. ����� ����� �����������, ������������ �� ������� (�� ������� ��� ���������� ����)
     * 
     * @return value
     */
    public TotalAmountType getTotalDeltaAmount() {
        return totalDeltaAmount;
    }

    /** 
     * Set the 'TotalDeltaAmount' element value. ����� ����� �����������, ������������ �� ������� (�� ������� ��� ���������� ����)
     * 
     * @param totalDeltaAmount
     */
    public void setTotalDeltaAmount(TotalAmountType totalDeltaAmount) {
        this.totalDeltaAmount = totalDeltaAmount;
    }

    /** 
     * Get the list of 'GoodsAmount' element items. ��������� ������� ���� ����������� �� ������
     * 
     * @return list
     */
    public List<GoodsAmountType> getGoodsAmountList() {
        return goodsAmountList;
    }

    /** 
     * Set the list of 'GoodsAmount' element items. ��������� ������� ���� ����������� �� ������
     * 
     * @param list
     */
    public void setGoodsAmountList(List<GoodsAmountType> list) {
        goodsAmountList = list;
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
