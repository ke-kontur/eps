
package ru.acs.fts.schemas.album.railwaybill;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.DocumentType;

/** 
 * Документы, приложенные отправителем
 */
public class RWDocumentType extends DocumentType
{
    private LocalDate expirationDate;
    private String releaseCustoms;

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'ReleaseCustoms' element value. Таможенный орган выдавший документ
     * 
     * @return value
     */
    public String getReleaseCustoms() {
        return releaseCustoms;
    }

    /** 
     * Set the 'ReleaseCustoms' element value. Таможенный орган выдавший документ
     * 
     * @param releaseCustoms
     */
    public void setReleaseCustoms(String releaseCustoms) {
        this.releaseCustoms = releaseCustoms;
    }
}
