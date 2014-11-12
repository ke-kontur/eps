
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Направление на осмотр
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:DirectionOnInspection:5.4.0" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns2="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DirectionOnInspectionType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns2:IDKDirecrionDetailsType" name="DirectionRegistration"/>
 *         &lt;xs:element type="ns2:IDKMetadataType" name="DirectionInformation"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1010003E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DirectionOnInspectionType extends BaseDocType
{
    private IDKDirecrionDetailsType directionRegistration;
    private IDKMetadataType directionInformation;
    private String documentModeID;

    /** 
     * Get the 'DirectionRegistration' element value. Реквизиты направления
     * 
     * @return value
     */
    public IDKDirecrionDetailsType getDirectionRegistration() {
        return directionRegistration;
    }

    /** 
     * Set the 'DirectionRegistration' element value. Реквизиты направления
     * 
     * @param directionRegistration
     */
    public void setDirectionRegistration(
            IDKDirecrionDetailsType directionRegistration) {
        this.directionRegistration = directionRegistration;
    }

    /** 
     * Get the 'DirectionInformation' element value. Информация о транспорте и товарах
     * 
     * @return value
     */
    public IDKMetadataType getDirectionInformation() {
        return directionInformation;
    }

    /** 
     * Set the 'DirectionInformation' element value. Информация о транспорте и товарах
     * 
     * @param directionInformation
     */
    public void setDirectionInformation(IDKMetadataType directionInformation) {
        this.directionInformation = directionInformation;
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
