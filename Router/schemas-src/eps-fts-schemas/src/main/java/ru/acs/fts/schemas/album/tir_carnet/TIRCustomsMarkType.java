
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ������� �������
 */
public class TIRCustomsMarkType
{
    private String goodsAcceptInfo;
    private String identityNoBroken;
    private String transitTime;
    private String customsDocNum;
    private String comments;
    private String packProcFinish;
    private TIRCustomsPersonType customsPerson;
    private CustomsType customs;

    /** 
     * Get the 'GoodsAcceptInfo' element value. ������������� � �������� ����� � ���������� (������� ����������� ��� ������� ��� ������)/  ������������� � ����������� �������� ��� (������� ����� ���������� ��� ������� ��� ������)
     * 
     * @return value
     */
    public String getGoodsAcceptInfo() {
        return goodsAcceptInfo;
    }

    /** 
     * Set the 'GoodsAcceptInfo' element value. ������������� � �������� ����� � ���������� (������� ����������� ��� ������� ��� ������)/  ������������� � ����������� �������� ��� (������� ����� ���������� ��� ������� ��� ������)
     * 
     * @param goodsAcceptInfo
     */
    public void setGoodsAcceptInfo(String goodsAcceptInfo) {
        this.goodsAcceptInfo = goodsAcceptInfo;
    }

    /** 
     * Get the 'IdentityNoBroken' element value. ���������� ������,  ������ ��� ��������������� ����� �������� �� �������������
     * 
     * @return value
     */
    public String getIdentityNoBroken() {
        return identityNoBroken;
    }

    /** 
     * Set the 'IdentityNoBroken' element value. ���������� ������,  ������ ��� ��������������� ����� �������� �� �������������
     * 
     * @param identityNoBroken
     */
    public void setIdentityNoBroken(String identityNoBroken) {
        this.identityNoBroken = identityNoBroken;
    }

    /** 
     * Get the 'TransitTime' element value. ����������������� ���������� ���������
     * 
     * @return value
     */
    public String getTransitTime() {
        return transitTime;
    }

    /** 
     * Set the 'TransitTime' element value. ����������������� ���������� ���������
     * 
     * @param transitTime
     */
    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }

    /** 
     * Get the 'CustomsDocNum' element value. ����� ����������� ���������
     * 
     * @return value
     */
    public String getCustomsDocNum() {
        return customsDocNum;
    }

    /** 
     * Set the 'CustomsDocNum' element value. ����� ����������� ���������
     * 
     * @param customsDocNum
     */
    public void setCustomsDocNum(String customsDocNum) {
        this.customsDocNum = customsDocNum;
    }

    /** 
     * Get the 'Comments' element value. ������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'PackProcFinish' element value. ����� �������� ���� � ��������� �������  ������������ ����������� �������� ���
     * 
     * @return value
     */
    public String getPackProcFinish() {
        return packProcFinish;
    }

    /** 
     * Set the 'PackProcFinish' element value. ����� �������� ���� � ��������� �������  ������������ ����������� �������� ���
     * 
     * @param packProcFinish
     */
    public void setPackProcFinish(String packProcFinish) {
        this.packProcFinish = packProcFinish;
    }

    /** 
     * Get the 'CustomsPerson' element value. ������� � ������ ������������ ����  ����������� ������
     * 
     * @return value
     */
    public TIRCustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ������� � ������ ������������ ����  ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(TIRCustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. ���������������� �������� (�����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������������� �������� (�����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }
}
