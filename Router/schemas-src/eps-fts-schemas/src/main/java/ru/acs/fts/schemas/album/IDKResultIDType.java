
package ru.acs.fts.schemas.album;

/** 
 * Информация о результатах осмотра в БД для привязки акта
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKResultIDType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CustomsCode"/>
 *     &lt;xs:element type="xs:string" name="ResultID"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKResultIDType
{
    private String customsCode;
    private String resultID;

    /** 
     * Get the 'CustomsCode' element value. Код ТО, проводившего осмотр
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код ТО, проводившего осмотр
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'ResultID' element value. Идентификатор результатов осмотра в БД
     * 
     * @return value
     */
    public String getResultID() {
        return resultID;
    }

    /** 
     * Set the 'ResultID' element value. Идентификатор результатов осмотра в БД
     * 
     * @param resultID
     */
    public void setResultID(String resultID) {
        this.resultID = resultID;
    }
}
