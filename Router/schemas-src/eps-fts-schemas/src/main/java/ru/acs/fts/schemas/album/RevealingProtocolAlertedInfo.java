
package ru.acs.fts.schemas.album;

/** 
 * Информация о срабатывании по товарам конкретного индикатора ПР
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
     * Get the 'GoodsNumber' element value. Номер товара (заполняется, если индикатор подчинен группе товаров)
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Номер товара (заполняется, если индикатор подчинен группе товаров)
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'DocumentValue' element value. Значение из документа с которым выполнялось сравнение значения индикатора (ДТ, ТД и т.д.)
     * 
     * @return value
     */
    public String getDocumentValue() {
        return documentValue;
    }

    /** 
     * Set the 'DocumentValue' element value. Значение из документа с которым выполнялось сравнение значения индикатора (ДТ, ТД и т.д.)
     * 
     * @param documentValue
     */
    public void setDocumentValue(String documentValue) {
        this.documentValue = documentValue;
    }

    /** 
     * Get the 'AlertedSign' element value. Признак сравнения (true - совпадение, false - несовпадение)
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. Признак сравнения (true - совпадение, false - несовпадение)
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
    }
}
