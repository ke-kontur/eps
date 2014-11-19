
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.math.BigInteger;

/** 
 * ���������� �� �������� �������������� ��������� � ������ ������.
 */
public class AUDArchiveDocumentIdWithVersionType
{
    private String archiveDocumentId;
    private BigInteger documentVersionNumber;

    /** 
     * Get the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
    }

    /** 
     * Get the 'DocumentVersionNumber' element value. ����� ������ ���������.
     * 
     * @return value
     */
    public BigInteger getDocumentVersionNumber() {
        return documentVersionNumber;
    }

    /** 
     * Set the 'DocumentVersionNumber' element value. ����� ������ ���������.
     * 
     * @param documentVersionNumber
     */
    public void setDocumentVersionNumber(BigInteger documentVersionNumber) {
        this.documentVersionNumber = documentVersionNumber;
    }
}
