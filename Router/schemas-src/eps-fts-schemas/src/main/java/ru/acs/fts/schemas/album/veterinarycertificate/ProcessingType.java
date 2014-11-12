
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;

/** 
 * ���������
 */
public class ProcessingType
{
    private String nameProcessing;
    private LocalDate dateProcessing;

    /** 
     * Get the 'NameProcessing' element value. ������������ ���������
     * 
     * @return value
     */
    public String getNameProcessing() {
        return nameProcessing;
    }

    /** 
     * Set the 'NameProcessing' element value. ������������ ���������
     * 
     * @param nameProcessing
     */
    public void setNameProcessing(String nameProcessing) {
        this.nameProcessing = nameProcessing;
    }

    /** 
     * Get the 'DateProcessing' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDateProcessing() {
        return dateProcessing;
    }

    /** 
     * Set the 'DateProcessing' element value. ���� ���������
     * 
     * @param dateProcessing
     */
    public void setDateProcessing(LocalDate dateProcessing) {
        this.dateProcessing = dateProcessing;
    }
}
