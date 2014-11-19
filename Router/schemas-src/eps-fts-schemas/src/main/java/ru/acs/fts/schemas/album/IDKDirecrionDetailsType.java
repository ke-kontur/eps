
package ru.acs.fts.schemas.album;

/** 
 * ��������� �����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKDirecrionDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ArrivalDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DirectionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DirectionCustoms"/>
 *     &lt;xs:element type="xs:string" name="DirectionDate"/>
 *     &lt;xs:element type="xs:string" name="LNP"/>
 *     &lt;xs:element type="xs:string" name="MessageNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKDirecrionDetailsType
{
    private String arrivalDate;
    private String directionNumber;
    private String directionCustoms;
    private String directionDate;
    private String LNP;
    private String messageNumber;

    /** 
     * Get the 'ArrivalDate' element value. ���� ��������
     * 
     * @return value
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /** 
     * Set the 'ArrivalDate' element value. ���� ��������
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
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
     * Get the 'DirectionCustoms' element value. ��� ��, ��������������� �����������
     * 
     * @return value
     */
    public String getDirectionCustoms() {
        return directionCustoms;
    }

    /** 
     * Set the 'DirectionCustoms' element value. ��� ��, ��������������� �����������
     * 
     * @param directionCustoms
     */
    public void setDirectionCustoms(String directionCustoms) {
        this.directionCustoms = directionCustoms;
    }

    /** 
     * Get the 'DirectionDate' element value. ���� ������������ �����������
     * 
     * @return value
     */
    public String getDirectionDate() {
        return directionDate;
    }

    /** 
     * Set the 'DirectionDate' element value. ���� ������������ �����������
     * 
     * @param directionDate
     */
    public void setDirectionDate(String directionDate) {
        this.directionDate = directionDate;
    }

    /** 
     * Get the 'LNP' element value. ��� ����������, ��������������� �����������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ��� ����������, ��������������� �����������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
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
