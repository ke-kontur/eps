
package ru.acs.fts.schemas.album.resultasktt;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� �������� �� ��
 */
public class TDCheckResultType
{
    private String result;
    private String comment;
    private String operatorDeliveryPlace;
    private GTDIDType TDNumber;
    private CustomsType deliveryPlace;

    /** 
     * Get the 'Result' element value. ������� ��������� ���������� �������� �� �� (���������)
     * 
     * @return value
     */
    public String getResult() {
        return result;
    }

    /** 
     * Set the 'Result' element value. ������� ��������� ���������� �������� �� �� (���������)
     * 
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /** 
     * Get the 'Comment' element value. �����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. �����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'OperatorDeliveryPlace' element value. ����� �������� ������� ��� 
     * 
     * @return value
     */
    public String getOperatorDeliveryPlace() {
        return operatorDeliveryPlace;
    }

    /** 
     * Set the 'OperatorDeliveryPlace' element value. ����� �������� ������� ��� 
     * 
     * @param operatorDeliveryPlace
     */
    public void setOperatorDeliveryPlace(String operatorDeliveryPlace) {
        this.operatorDeliveryPlace = operatorDeliveryPlace;
    }

    /** 
     * Get the 'TDNumber' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getTDNumber() {
        return TDNumber;
    }

    /** 
     * Set the 'TDNumber' element value. ����� ��
     * 
     * @param TDNumber
     */
    public void setTDNumber(GTDIDType TDNumber) {
        this.TDNumber = TDNumber;
    }

    /** 
     * Get the 'DeliveryPlace' element value. ����� ��������: ����������� ���������� ����� ����������
     * 
     * @return value
     */
    public CustomsType getDeliveryPlace() {
        return deliveryPlace;
    }

    /** 
     * Set the 'DeliveryPlace' element value. ����� ��������: ����������� ���������� ����� ����������
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(CustomsType deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }
}
