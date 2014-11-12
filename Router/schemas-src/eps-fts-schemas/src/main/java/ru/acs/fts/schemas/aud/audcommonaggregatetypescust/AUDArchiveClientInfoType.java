
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о клиенте архива.
 */
public class AUDArchiveClientInfoType
{
    private String archiveClientId;
    private String description;

    /** 
     * Get the 'ArchiveClientId' element value. Идентификатор клиента архива.
     * 
     * @return value
     */
    public String getArchiveClientId() {
        return archiveClientId;
    }

    /** 
     * Set the 'ArchiveClientId' element value. Идентификатор клиента архива.
     * 
     * @param archiveClientId
     */
    public void setArchiveClientId(String archiveClientId) {
        this.archiveClientId = archiveClientId;
    }

    /** 
     * Get the 'Description' element value. Наименование клиента архива.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Наименование клиента архива.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
