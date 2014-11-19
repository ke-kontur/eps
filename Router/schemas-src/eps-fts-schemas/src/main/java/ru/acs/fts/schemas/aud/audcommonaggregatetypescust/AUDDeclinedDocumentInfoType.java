
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� ������, � ������� � �������� ��������.
 */
public class AUDDeclinedDocumentInfoType
{
    private String archiveDocumentId;
    private AUDResultInfoType resultInfo;

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
     * Get the 'ResultInfo' element value. ���������� � ������� ������ � �������.
     * 
     * @return value
     */
    public AUDResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. ���������� � ������� ������ � �������.
     * 
     * @param resultInfo
     */
    public void setResultInfo(AUDResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
    }
}
