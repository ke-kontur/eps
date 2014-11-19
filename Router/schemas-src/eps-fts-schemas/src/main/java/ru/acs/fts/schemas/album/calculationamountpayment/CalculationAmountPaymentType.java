
package ru.acs.fts.schemas.album.calculationamountpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ ������� ����������� ������ ���������� ��������
 */
public class CalculationAmountPaymentType extends BaseDocType
{
    private String numberSheet;
    private String total;
    private String quantity;
    private List<DescriptionGoodsType> descriptionGoodList = new ArrayList<DescriptionGoodsType>();
    private GTDIDType GTDID;
    private CustomsPersonType customsPersonSignature;
    private String documentModeID;

    /** 
     * Get the 'NumberSheet' element value. ���������� ����� �����
     * 
     * @return value
     */
    public String getNumberSheet() {
        return numberSheet;
    }

    /** 
     * Set the 'NumberSheet' element value. ���������� ����� �����
     * 
     * @param numberSheet
     */
    public void setNumberSheet(String numberSheet) {
        this.numberSheet = numberSheet;
    }

    /** 
     * Get the 'Total' element value. �����: ������ ����������� �� ��
     * 
     * @return value
     */
    public String getTotal() {
        return total;
    }

    /** 
     * Set the 'Total' element value. �����: ������ ����������� �� ��
     * 
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /** 
     * Get the 'Quantity' element value. ���������� �������, � ��������� ������� ��������� �����������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� �������, � ��������� ������� ��������� �����������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'DescriptionGoods' element items. �������� � ������
     * 
     * @return list
     */
    public List<DescriptionGoodsType> getDescriptionGoodList() {
        return descriptionGoodList;
    }

    /** 
     * Set the list of 'DescriptionGoods' element items. �������� � ������
     * 
     * @param list
     */
    public void setDescriptionGoodList(List<DescriptionGoodsType> list) {
        descriptionGoodList = list;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� �����  ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� �����  ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
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
