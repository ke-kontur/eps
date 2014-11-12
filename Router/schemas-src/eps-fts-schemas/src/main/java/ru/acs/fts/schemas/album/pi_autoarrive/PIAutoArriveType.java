
package ru.acs.fts.schemas.album.pi_autoarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������������� ����������� � �������� �������, ����������� ������������� ������������
 */
public class PIAutoArriveType extends BaseDocType
{
    private String PIURN;
    private String expDTNumber;
    private String expCountryCode;
    private OrganizationInfoType consignee;
    private OrganizationInfoType carrier;
    private OrganizationInfoType consignor;
    private GoodsInformType goodsInform;
    private ShippingInformationType shippingInformation;
    private GTDIDType PIDTNumber;
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'Exp_DTNumber' element value. ����� ���������� ��
     * 
     * @return value
     */
    public String getExpDTNumber() {
        return expDTNumber;
    }

    /** 
     * Set the 'Exp_DTNumber' element value. ����� ���������� ��
     * 
     * @param expDTNumber
     */
    public void setExpDTNumber(String expDTNumber) {
        this.expDTNumber = expDTNumber;
    }

    /** 
     * Get the 'Exp_CountryCode' element value. ��� ������ ��������
     * 
     * @return value
     */
    public String getExpCountryCode() {
        return expCountryCode;
    }

    /** 
     * Set the 'Exp_CountryCode' element value. ��� ������ ��������
     * 
     * @param expCountryCode
     */
    public void setExpCountryCode(String expCountryCode) {
        this.expCountryCode = expCountryCode;
    }

    /** 
     * Get the 'Consignee' element value. ���������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� � ����������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationInfoType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Carrier' element value. ���������� � �����������
     * 
     * @return value
     */
    public OrganizationInfoType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ���������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationInfoType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignor' element value. ���������� �� ����������� ������
     * 
     * @return value
     */
    public OrganizationInfoType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ���������� �� ����������� ������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationInfoType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'GoodsInform' element value. ���������� � ����������� �������
     * 
     * @return value
     */
    public GoodsInformType getGoodsInform() {
        return goodsInform;
    }

    /** 
     * Set the 'GoodsInform' element value. ���������� � ����������� �������
     * 
     * @param goodsInform
     */
    public void setGoodsInform(GoodsInformType goodsInform) {
        this.goodsInform = goodsInform;
    }

    /** 
     * Get the 'ShippingInformation' element value. ���������� � ��������� �����
     * 
     * @return value
     */
    public ShippingInformationType getShippingInformation() {
        return shippingInformation;
    }

    /** 
     * Set the 'ShippingInformation' element value. ���������� � ��������� �����
     * 
     * @param shippingInformation
     */
    public void setShippingInformation(
            ShippingInformationType shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    /** 
     * Get the 'PI_DTNumber' element value. ����� ��������������� ���������� �� ������ 
     * 
     * @return value
     */
    public GTDIDType getPIDTNumber() {
        return PIDTNumber;
    }

    /** 
     * Set the 'PI_DTNumber' element value. ����� ��������������� ���������� �� ������ 
     * 
     * @param PIDTNumber
     */
    public void setPIDTNumber(GTDIDType PIDTNumber) {
        this.PIDTNumber = PIDTNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ���������� ������������� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
