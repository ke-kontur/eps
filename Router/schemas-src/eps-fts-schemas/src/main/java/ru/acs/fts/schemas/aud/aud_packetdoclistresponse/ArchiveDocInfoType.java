
package ru.acs.fts.schemas.aud.aud_packetdoclistresponse;

import java.math.BigInteger;
import org.joda.time.DateTime;

/** 
 * ���������� � ��������� ������
 */
public class ArchiveDocInfoType
{
    private String archiveDocID;
    private String appliedDocID;
    private String docDescription;
    private DateTime createDateTime;
    private BigInteger docVersion;

    /** 
     * Get the 'ArchiveDocID' element value. ��������  ������������� ���������
     * 
     * @return value
     */
    public String getArchiveDocID() {
        return archiveDocID;
    }

    /** 
     * Set the 'ArchiveDocID' element value. ��������  ������������� ���������
     * 
     * @param archiveDocID
     */
    public void setArchiveDocID(String archiveDocID) {
        this.archiveDocID = archiveDocID;
    }

    /** 
     * Get the 'AppliedDocID' element value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getAppliedDocID() {
        return appliedDocID;
    }

    /** 
     * Set the 'AppliedDocID' element value. ���������� ������������� ���������
     * 
     * @param appliedDocID
     */
    public void setAppliedDocID(String appliedDocID) {
        this.appliedDocID = appliedDocID;
    }

    /** 
     * Get the 'DocDescription' element value. �������� ���������
     * 
     * @return value
     */
    public String getDocDescription() {
        return docDescription;
    }

    /** 
     * Set the 'DocDescription' element value. �������� ���������
     * 
     * @param docDescription
     */
    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    /** 
     * Get the 'CreateDateTime' element value. ���� ����� ���������� ��������� � ������
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. ���� ����� ���������� ��������� � ������
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'DocVersion' element value. ����� ������ ���������
     * 
     * @return value
     */
    public BigInteger getDocVersion() {
        return docVersion;
    }

    /** 
     * Set the 'DocVersion' element value. ����� ������ ���������
     * 
     * @param docVersion
     */
    public void setDocVersion(BigInteger docVersion) {
        this.docVersion = docVersion;
    }
}
