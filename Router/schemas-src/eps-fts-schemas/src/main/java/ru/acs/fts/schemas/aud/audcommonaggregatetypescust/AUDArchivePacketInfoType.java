
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ������� ���������� � ������ ������ (��� ���������� ������).
 */
public class AUDArchivePacketInfoType extends AUDArchivePutInfoType
{
    private String archivePacketId;

    /** 
     * Get the 'ArchivePacketId' element value. �������� ������������� ������
     * 
     * @return value
     */
    public String getArchivePacketId() {
        return archivePacketId;
    }

    /** 
     * Set the 'ArchivePacketId' element value. �������� ������������� ������
     * 
     * @param archivePacketId
     */
    public void setArchivePacketId(String archivePacketId) {
        this.archivePacketId = archivePacketId;
    }
}
