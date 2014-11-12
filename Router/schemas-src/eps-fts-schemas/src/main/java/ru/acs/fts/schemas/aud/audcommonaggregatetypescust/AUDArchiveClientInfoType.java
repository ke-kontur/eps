
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ������� ������.
 */
public class AUDArchiveClientInfoType
{
    private String archiveClientId;
    private String description;

    /** 
     * Get the 'ArchiveClientId' element value. ������������� ������� ������.
     * 
     * @return value
     */
    public String getArchiveClientId() {
        return archiveClientId;
    }

    /** 
     * Set the 'ArchiveClientId' element value. ������������� ������� ������.
     * 
     * @param archiveClientId
     */
    public void setArchiveClientId(String archiveClientId) {
        this.archiveClientId = archiveClientId;
    }

    /** 
     * Get the 'Description' element value. ������������ ������� ������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ������������ ������� ������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
