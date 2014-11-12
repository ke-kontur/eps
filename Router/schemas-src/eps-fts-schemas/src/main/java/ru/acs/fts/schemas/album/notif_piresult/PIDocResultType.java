
package ru.acs.fts.schemas.album.notif_piresult;

/** 
 * Информация об обработке документа
 */
public class PIDocResultType
{
    private String PIRegID;
    private String PIStatus;
    private String PIRegDateTime;

    /** 
     * Get the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации.
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации.
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'PI_Status' element value. Статус предварительной информации
     * 
     * @return value
     */
    public String getPIStatus() {
        return PIStatus;
    }

    /** 
     * Set the 'PI_Status' element value. Статус предварительной информации
     * 
     * @param PIStatus
     */
    public void setPIStatus(String PIStatus) {
        this.PIStatus = PIStatus;
    }

    /** 
     * Get the 'PI_RegDateTime' element value. Дата и время регистрации предварительной информации
     * 
     * @return value
     */
    public String getPIRegDateTime() {
        return PIRegDateTime;
    }

    /** 
     * Set the 'PI_RegDateTime' element value. Дата и время регистрации предварительной информации
     * 
     * @param PIRegDateTime
     */
    public void setPIRegDateTime(String PIRegDateTime) {
        this.PIRegDateTime = PIRegDateTime;
    }
}
