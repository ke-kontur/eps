
package ru.acs.fts.schemas.album.statementofaccount;

import org.joda.time.LocalDate;

/** 
 * Информация о формировании формы документа
 */
public class DocumentInfoType
{
    private String organizationName;
    private LocalDate creationDate;
    private String creationTime;

    /** 
     * Get the 'OrganizationName' element value. Наименование учреждения, выпустившего форму
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование учреждения, выпустившего форму
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CreationDate' element value. Дата формирования формы
     * 
     * @return value
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'CreationDate' element value. Дата формирования формы
     * 
     * @param creationDate
     */
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'CreationTime' element value. Время формирования формы
     * 
     * @return value
     */
    public String getCreationTime() {
        return creationTime;
    }

    /** 
     * Set the 'CreationTime' element value. Время формирования формы
     * 
     * @param creationTime
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
