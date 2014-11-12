
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 *  ДТС. Служебные отметки.
 */
public class DTSOfficialMarkType
{
    private String markIdentifier;
    private String markDescription;
    private String personName;
    private String LNP;
    private LocalDate dateInf;
    private String timeInf;

    /** 
     * Get the 'MarkIdentifier' element value. Идентификатор отметки 
     * 
     * @return value
     */
    public String getMarkIdentifier() {
        return markIdentifier;
    }

    /** 
     * Set the 'MarkIdentifier' element value. Идентификатор отметки 
     * 
     * @param markIdentifier
     */
    public void setMarkIdentifier(String markIdentifier) {
        this.markIdentifier = markIdentifier;
    }

    /** 
     * Get the 'MarkDescription' element value. Служебная запись 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'PersonName' element value. ФИО должностного лица, внесшего отметку
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО должностного лица, внесшего отметку
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица, внесшего отметку
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица, внесшего отметку
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'DateInf' element value. Дата внесения служебной отметки
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата внесения служебной отметки
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. Время внесения служебной отметки
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. Время внесения служебной отметки
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }
}
