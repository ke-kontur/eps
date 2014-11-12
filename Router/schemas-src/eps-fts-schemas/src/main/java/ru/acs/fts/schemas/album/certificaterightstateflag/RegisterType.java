
package ru.acs.fts.schemas.album.certificaterightstateflag;

import org.joda.time.LocalDate;

/** 
 * Государственный судовой реестр Российской Федерации
 */
public class RegisterType
{
    private String numberRegister;
    private LocalDate dateRegister;

    /** 
     * Get the 'NumberRegister' element value. Номер реестра
     * 
     * @return value
     */
    public String getNumberRegister() {
        return numberRegister;
    }

    /** 
     * Set the 'NumberRegister' element value. Номер реестра
     * 
     * @param numberRegister
     */
    public void setNumberRegister(String numberRegister) {
        this.numberRegister = numberRegister;
    }

    /** 
     * Get the 'DateRegister' element value. Дата реестра
     * 
     * @return value
     */
    public LocalDate getDateRegister() {
        return dateRegister;
    }

    /** 
     * Set the 'DateRegister' element value. Дата реестра
     * 
     * @param dateRegister
     */
    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }
}
