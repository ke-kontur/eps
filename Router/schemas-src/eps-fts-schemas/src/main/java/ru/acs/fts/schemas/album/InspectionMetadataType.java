
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Результаты осмотра. Метаданные
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:InspectionMetadata:5.4.0" xmlns:ns2="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InspectionMetadataType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns1:IDKInspectionInfoType" name="InspectionInfo"/>
 *         &lt;xs:element type="ns2:IDKMetadataType" name="DirectionInfo"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1010005E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InspectionMetadataType extends BaseDocType
{
    private IDKInspectionInfoType inspectionInfo;
    private IDKMetadataType directionInfo;
    private String documentModeID;

    /** 
     * Get the 'InspectionInfo' element value. Информация об осмотре
     * 
     * @return value
     */
    public IDKInspectionInfoType getInspectionInfo() {
        return inspectionInfo;
    }

    /** 
     * Set the 'InspectionInfo' element value. Информация об осмотре
     * 
     * @param inspectionInfo
     */
    public void setInspectionInfo(IDKInspectionInfoType inspectionInfo) {
        this.inspectionInfo = inspectionInfo;
    }

    /** 
     * Get the 'DirectionInfo' element value. Сведения о транспортном средстве и товарах
     * 
     * @return value
     */
    public IDKMetadataType getDirectionInfo() {
        return directionInfo;
    }

    /** 
     * Set the 'DirectionInfo' element value. Сведения о транспортном средстве и товарах
     * 
     * @param directionInfo
     */
    public void setDirectionInfo(IDKMetadataType directionInfo) {
        this.directionInfo = directionInfo;
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
