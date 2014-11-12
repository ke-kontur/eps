
package ru.acs.fts.schemas.aud.aud_packetinventoryresponse;

import java.math.BigInteger;

/** 
 * �������� � ��������� �� �����
 */
public class DocumentInventoryItemType
{
    private String appliedDocumentId;
    private String archiveDocumentId;
    private BigInteger maxVersion;

    /** 
     * Get the 'AppliedDocumentId' element value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getAppliedDocumentId() {
        return appliedDocumentId;
    }

    /** 
     * Set the 'AppliedDocumentId' element value. ���������� ������������� ���������
     * 
     * @param appliedDocumentId
     */
    public void setAppliedDocumentId(String appliedDocumentId) {
        this.appliedDocumentId = appliedDocumentId;
    }

    /** 
     * Get the 'ArchiveDocumentId' element value. �������� ������������� ���������
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. �������� ������������� ���������
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
    }

    /** 
     * Get the 'MaxVersion' element value. ������������ ������ ���������
     * 
     * @return value
     */
    public BigInteger getMaxVersion() {
        return maxVersion;
    }

    /** 
     * Set the 'MaxVersion' element value. ������������ ������ ���������
     * 
     * @param maxVersion
     */
    public void setMaxVersion(BigInteger maxVersion) {
        this.maxVersion = maxVersion;
    }
}
