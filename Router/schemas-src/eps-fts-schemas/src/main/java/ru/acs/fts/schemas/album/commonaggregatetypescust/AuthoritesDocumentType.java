
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения о документе, удостоверяющем полномочия
 */
public class AuthoritesDocumentType extends DocumentBaseType
{
    private LocalDate complationAuthorityDate;

    /** 
     * Get the 'ComplationAuthorityDate' element value. Дата окончания полномочий
     * 
     * @return value
     */
    public LocalDate getComplationAuthorityDate() {
        return complationAuthorityDate;
    }

    /** 
     * Set the 'ComplationAuthorityDate' element value. Дата окончания полномочий
     * 
     * @param complationAuthorityDate
     */
    public void setComplationAuthorityDate(LocalDate complationAuthorityDate) {
        this.complationAuthorityDate = complationAuthorityDate;
    }
}
