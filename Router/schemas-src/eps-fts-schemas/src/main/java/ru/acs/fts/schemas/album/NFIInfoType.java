
package ru.acs.fts.schemas.album;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NFIInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="NFICode"/>
 *     &lt;xs:element type="xs:string" name="NFIHash"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NFIInfoType
{
    private String NFICode;
    private String NFIHash;

    /** 
     * Get the 'NFICode' element value. Код информации для неформ. индикатора.
    Возможные значения:
    0100 – неформ. индикаторы из группы «Субъект ВЭД»
    0200 – неформ. индикаторы из группы «Партия товаров»
    0300 – неформ. индикаторы из группы «Товары»
    0400 – неформ. индикаторы из группы «Товары»-«Платежи»
    0500 – неформ. индикаторы из группы «Товары»-«Документы»
    0600 – неформ. индикаторы из группы «Транспортные средства»
    0700 – неформ. индикаторы в целом к профилю риска

     * 
     * @return value
     */
    public String getNFICode() {
        return NFICode;
    }

    /** 
     * Set the 'NFICode' element value. Код информации для неформ. индикатора.
    Возможные значения:
    0100 – неформ. индикаторы из группы «Субъект ВЭД»
    0200 – неформ. индикаторы из группы «Партия товаров»
    0300 – неформ. индикаторы из группы «Товары»
    0400 – неформ. индикаторы из группы «Товары»-«Платежи»
    0500 – неформ. индикаторы из группы «Товары»-«Документы»
    0600 – неформ. индикаторы из группы «Транспортные средства»
    0700 – неформ. индикаторы в целом к профилю риска

     * 
     * @param NFICode
     */
    public void setNFICode(String NFICode) {
        this.NFICode = NFICode;
    }

    /** 
     * Get the 'NFIHash' element value. Хэш-сумма для неформ. индикатора
     * 
     * @return value
     */
    public String getNFIHash() {
        return NFIHash;
    }

    /** 
     * Set the 'NFIHash' element value. Хэш-сумма для неформ. индикатора
     * 
     * @param NFIHash
     */
    public void setNFIHash(String NFIHash) {
        this.NFIHash = NFIHash;
    }
}
