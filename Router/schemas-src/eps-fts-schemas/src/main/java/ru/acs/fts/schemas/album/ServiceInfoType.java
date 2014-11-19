
package ru.acs.fts.schemas.album;

import org.joda.time.LocalDate;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ServiceInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="TransportID"/>
 *     &lt;xs:element type="xs:date" name="CrossDate"/>
 *     &lt;xs:element type="xs:string" name="CustomsArriveID"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ServiceInfoType
{
    private String transportID;
    private LocalDate crossDate;
    private String customsArriveID;

    /** 
     * Get the 'TransportID' element value. ���������� ����������������� ����� ��������������� ����������
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. ���������� ����������������� ����� ��������������� ����������
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'CrossDate' element value. ���� ����������� ��������������� ���������� �� ������ ��� ������
     * 
     * @return value
     */
    public LocalDate getCrossDate() {
        return crossDate;
    }

    /** 
     * Set the 'CrossDate' element value. ���� ����������� ��������������� ���������� �� ������ ��� ������
     * 
     * @param crossDate
     */
    public void setCrossDate(LocalDate crossDate) {
        this.crossDate = crossDate;
    }

    /** 
     * Get the 'CustomsArriveID' element value. ��� ����������� ������, � ������� ����������� �������� ������� �� ���������� ���������� ����������� ����� (����)
     * 
     * @return value
     */
    public String getCustomsArriveID() {
        return customsArriveID;
    }

    /** 
     * Set the 'CustomsArriveID' element value. ��� ����������� ������, � ������� ����������� �������� ������� �� ���������� ���������� ����������� ����� (����)
     * 
     * @param customsArriveID
     */
    public void setCustomsArriveID(String customsArriveID) {
        this.customsArriveID = customsArriveID;
    }
}
