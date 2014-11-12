
package ru.acs.fts.schemas.admin.ead_docrequest;

import org.joda.time.LocalDate;

/** 
 * Информация из архива
 */
public class ArchiveInformationType
{
    private String archDocAlbum;
    private LocalDate archDocDate;

    /** 
     * Get the 'ArchDocAlbum' element value. Номер версии альбома форматов
     * 
     * @return value
     */
    public String getArchDocAlbum() {
        return archDocAlbum;
    }

    /** 
     * Set the 'ArchDocAlbum' element value. Номер версии альбома форматов
     * 
     * @param archDocAlbum
     */
    public void setArchDocAlbum(String archDocAlbum) {
        this.archDocAlbum = archDocAlbum;
    }

    /** 
     * Get the 'ArchDocDate' element value. Дата помещения документа в электронный архив декларанта
     * 
     * @return value
     */
    public LocalDate getArchDocDate() {
        return archDocDate;
    }

    /** 
     * Set the 'ArchDocDate' element value. Дата помещения документа в электронный архив декларанта
     * 
     * @param archDocDate
     */
    public void setArchDocDate(LocalDate archDocDate) {
        this.archDocDate = archDocDate;
    }
}
