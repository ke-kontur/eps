
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * Регистрационный номер акта таможенного осмотра
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:ActNumberInfo:5.4.0" xmlns:ns2="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActNumberInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns2:IDKResultIDType" name="ResultInfo"/>
 *         &lt;xs:element type="ns:GTDID6Type" name="ActRegNumber"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1010001E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActNumberInfoType extends BaseDocType
{
    private IDKResultIDType resultInfo;
    private GTDID6Type actRegNumber;
    private String documentModeID;

    /** 
     * Get the 'ResultInfo' element value. Информация о результатах осмотра , для которых требуется сформировать акт
     * 
     * @return value
     */
    public IDKResultIDType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. Информация о результатах осмотра , для которых требуется сформировать акт
     * 
     * @param resultInfo
     */
    public void setResultInfo(IDKResultIDType resultInfo) {
        this.resultInfo = resultInfo;
    }

    /** 
     * Get the 'ActRegNumber' element value. Номер акта таможенного осмотра
     * 
     * @return value
     */
    public GTDID6Type getActRegNumber() {
        return actRegNumber;
    }

    /** 
     * Set the 'ActRegNumber' element value. Номер акта таможенного осмотра
     * 
     * @param actRegNumber
     */
    public void setActRegNumber(GTDID6Type actRegNumber) {
        this.actRegNumber = actRegNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
