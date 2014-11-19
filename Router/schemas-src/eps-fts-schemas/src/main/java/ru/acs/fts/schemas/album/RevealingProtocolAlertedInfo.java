
package ru.acs.fts.schemas.album;

/** 
 * ���������� � ������������ �� ������� ����������� ���������� ��
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RevealingProtocolAlertedInfo">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GoodsNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DocumentValue"/>
 *     &lt;xs:element type="xs:string" name="AlertedSign"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RevealingProtocolAlertedInfo
{
    private String goodsNumber;
    private String documentValue;
    private String alertedSign;

    /** 
     * Get the 'GoodsNumber' element value. ����� ������ (�����������, ���� ��������� �������� ������ �������)
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ����� ������ (�����������, ���� ��������� �������� ������ �������)
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'DocumentValue' element value. �������� �� ��������� � ������� ����������� ��������� �������� ���������� (��, �� � �.�.)
     * 
     * @return value
     */
    public String getDocumentValue() {
        return documentValue;
    }

    /** 
     * Set the 'DocumentValue' element value. �������� �� ��������� � ������� ����������� ��������� �������� ���������� (��, �� � �.�.)
     * 
     * @param documentValue
     */
    public void setDocumentValue(String documentValue) {
        this.documentValue = documentValue;
    }

    /** 
     * Get the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������)
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������)
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
    }
}
