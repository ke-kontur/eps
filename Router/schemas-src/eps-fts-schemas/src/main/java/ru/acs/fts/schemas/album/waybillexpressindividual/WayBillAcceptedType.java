
package ru.acs.fts.schemas.album.waybillexpressindividual;

/** 
 * Накладная была принята: дата, время и имя принявшего лица
 */
public class WayBillAcceptedType
{
    private String dateTime;
    private String personName;

    /** 
     * Get the 'DateTime' element value. Дата и время принятия накладной
     * 
     * @return value
     */
    public String getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'DateTime' element value. Дата и время принятия накладной
     * 
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'PersonName' element value. Имя лица, принявшего накладную
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. Имя лица, принявшего накладную
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
