
package ru.acs.fts.schemas.envelope;

/** 
 * ���������� ����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:ApplicationInf:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationInfType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="SoftKind" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="SoftVersion" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MessageKind" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationInfType
{
    private String softKind;
    private String softVersion;
    private String messageKind;

    /** 
     * Get the 'SoftKind' element value. ��� ������������ �����������
     * 
     * @return value
     */
    public String getSoftKind() {
        return softKind;
    }

    /** 
     * Set the 'SoftKind' element value. ��� ������������ �����������
     * 
     * @param softKind
     */
    public void setSoftKind(String softKind) {
        this.softKind = softKind;
    }

    /** 
     * Get the 'SoftVersion' element value. ������ ������������ �����������
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. ������ ������������ �����������
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the 'MessageKind' element value. ��� ���������
     * 
     * @return value
     */
    public String getMessageKind() {
        return messageKind;
    }

    /** 
     * Set the 'MessageKind' element value. ��� ���������
     * 
     * @param messageKind
     */
    public void setMessageKind(String messageKind) {
        this.messageKind = messageKind;
    }
}
