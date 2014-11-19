
package ru.acs.fts.schemas.album;

/** 
 * ���������� � ���������� �������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKInspectionPlaceType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="InspectionDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="CustomsCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="IDKNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DirectionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MessageNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKInspectionPlaceType
{
    private String inspectionDate;
    private String customsCode;
    private String IDKNumber;
    private String directionNumber;
    private String messageNumber;

    /** 
     * Get the 'InspectionDate' element value. ���� �������
     * 
     * @return value
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /** 
     * Set the 'InspectionDate' element value. ���� �������
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ��, ������������ ������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ��, ������������ ������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'IDKNumber' element value. ����� ���/����
     * 
     * @return value
     */
    public String getIDKNumber() {
        return IDKNumber;
    }

    /** 
     * Set the 'IDKNumber' element value. ����� ���/����
     * 
     * @param IDKNumber
     */
    public void setIDKNumber(String IDKNumber) {
        this.IDKNumber = IDKNumber;
    }

    /** 
     * Get the 'DirectionNumber' element value. ����� �����������
     * 
     * @return value
     */
    public String getDirectionNumber() {
        return directionNumber;
    }

    /** 
     * Set the 'DirectionNumber' element value. ����� �����������
     * 
     * @param directionNumber
     */
    public void setDirectionNumber(String directionNumber) {
        this.directionNumber = directionNumber;
    }

    /** 
     * Get the 'MessageNumber' element value. ����� ��������� � ��������/������
     * 
     * @return value
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /** 
     * Set the 'MessageNumber' element value. ����� ��������� � ��������/������
     * 
     * @param messageNumber
     */
    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }
}
