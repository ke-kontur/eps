
package ru.acs.fts.schemas.aud.audinf;

/** 
 * Информация АЮД
 */
public class AUDInfType
{
    private String archiveClientId;
    private String customsCode;

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
     * Get the 'CustomsCode' element value. Код таможенного органа РФ (по "Классификатору  ТО и их структурных подразделений" ГТК).
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа РФ (по "Классификатору  ТО и их структурных подразделений" ГТК).
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }
}
