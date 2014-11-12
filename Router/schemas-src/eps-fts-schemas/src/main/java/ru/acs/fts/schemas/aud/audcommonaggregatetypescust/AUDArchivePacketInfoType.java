
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Краткая информация о пакете архива (без документов пакета).
 */
public class AUDArchivePacketInfoType extends AUDArchivePutInfoType
{
    private String archivePacketId;

    /** 
     * Get the 'ArchivePacketId' element value. Архивный идентификатор пакета
     * 
     * @return value
     */
    public String getArchivePacketId() {
        return archivePacketId;
    }

    /** 
     * Set the 'ArchivePacketId' element value. Архивный идентификатор пакета
     * 
     * @param archivePacketId
     */
    public void setArchivePacketId(String archivePacketId) {
        this.archivePacketId = archivePacketId;
    }
}
