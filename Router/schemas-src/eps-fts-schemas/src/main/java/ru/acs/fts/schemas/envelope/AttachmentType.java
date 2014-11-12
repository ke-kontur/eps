
package ru.acs.fts.schemas.envelope;

import org.joda.time.DateTime;

/** 
 * �������� � �������������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:Attachments:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttachmentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="Name" minOccurs="0"/>
 *     &lt;xs:element type="xs:dateTime" name="ModificationDateTime" minOccurs="0"/>
 *     &lt;xs:element type="ns:FileReferenceType" name="FileReference"/>
 *     &lt;xs:element type="ns:FileSignatureType" name="FileSignature" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttachmentType
{
    private String name;
    private DateTime modificationDateTime;
    private FileReferenceType fileReference;
    private FileSignatureType fileSignature;

    /** 
     * Get the 'Name' element value. ��� ��������������� �����.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��� ��������������� �����.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'ModificationDateTime' element value. ���� � ����� ���������� ��������� ��������������� �����.
     * 
     * @return value
     */
    public DateTime getModificationDateTime() {
        return modificationDateTime;
    }

    /** 
     * Set the 'ModificationDateTime' element value. ���� � ����� ���������� ��������� ��������������� �����.
     * 
     * @param modificationDateTime
     */
    public void setModificationDateTime(DateTime modificationDateTime) {
        this.modificationDateTime = modificationDateTime;
    }

    /** 
     * Get the 'FileReference' element value. ������ �� ������������� ����
     * 
     * @return value
     */
    public FileReferenceType getFileReference() {
        return fileReference;
    }

    /** 
     * Set the 'FileReference' element value. ������ �� ������������� ����
     * 
     * @param fileReference
     */
    public void setFileReference(FileReferenceType fileReference) {
        this.fileReference = fileReference;
    }

    /** 
     * Get the 'FileSignature' element value. ���������� � ��� ��������������� �����
     * 
     * @return value
     */
    public FileSignatureType getFileSignature() {
        return fileSignature;
    }

    /** 
     * Set the 'FileSignature' element value. ���������� � ��� ��������������� �����
     * 
     * @param fileSignature
     */
    public void setFileSignature(FileSignatureType fileSignature) {
        this.fileSignature = fileSignature;
    }
}
