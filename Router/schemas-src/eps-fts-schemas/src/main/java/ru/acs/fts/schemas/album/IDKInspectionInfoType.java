
package ru.acs.fts.schemas.album;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:InspectionMetadata:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKInspectionInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:IDKInspectionPlaceType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="IDResult"/>
 *         &lt;xs:element type="xs:string" name="InspectionResult" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="OperatorID" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="LNP" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="Notes" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKInspectionInfoType extends IDKInspectionPlaceType
{
    private String IDResult;
    private String inspectionResult;
    private String operatorID;
    private String LNP;
    private String notes;

    /** 
     * Get the 'IDResult' element value. Уникальный идентификатор результатов осмотра в БД 
     * 
     * @return value
     */
    public String getIDResult() {
        return IDResult;
    }

    /** 
     * Set the 'IDResult' element value. Уникальный идентификатор результатов осмотра в БД 
     * 
     * @param IDResult
     */
    public void setIDResult(String IDResult) {
        this.IDResult = IDResult;
    }

    /** 
     * Get the 'InspectionResult' element value. Решение оператора АИ: 0 - Объект без подозрения; 1 - Объект под подозрением
     * 
     * @return value
     */
    public String getInspectionResult() {
        return inspectionResult;
    }

    /** 
     * Set the 'InspectionResult' element value. Решение оператора АИ: 0 - Объект без подозрения; 1 - Объект под подозрением
     * 
     * @param inspectionResult
     */
    public void setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    /** 
     * Get the 'OperatorID' element value. Код оператора АИ
     * 
     * @return value
     */
    public String getOperatorID() {
        return operatorID;
    }

    /** 
     * Set the 'OperatorID' element value. Код оператора АИ
     * 
     * @param operatorID
     */
    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    /** 
     * Get the 'LNP' element value. ЛНП
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'Notes' element value. Примечание
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Примечание
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
