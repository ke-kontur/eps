
package ru.acs.fts.schemas.album.revealingtransportpp;

import org.joda.time.LocalDate;

/** 
 * Служебная информация
 */
public class ServiceInfoType
{
    private String transportID;
    private LocalDate crossDate;
    private String customsID;
    private String customsProcedure;

    /** 
     * Get the 'TransportID' element value. Идентификатор сообщения о  прибытии/убытии
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. Идентификатор сообщения о  прибытии/убытии
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'CrossDate' element value. Дата подачи документов (для СВР ПП)/Дата формирования запроса на выявление рисков (для АИСТ-М)
     * 
     * @return value
     */
    public LocalDate getCrossDate() {
        return crossDate;
    }

    /** 
     * Set the 'CrossDate' element value. Дата подачи документов (для СВР ПП)/Дата формирования запроса на выявление рисков (для АИСТ-М)
     * 
     * @param crossDate
     */
    public void setCrossDate(LocalDate crossDate) {
        this.crossDate = crossDate;
    }

    /** 
     * Get the 'CustomsID' element value. Код таможенного органа (КТАМ)
     * 
     * @return value
     */
    public String getCustomsID() {
        return customsID;
    }

    /** 
     * Set the 'CustomsID' element value. Код таможенного органа (КТАМ)
     * 
     * @param customsID
     */
    public void setCustomsID(String customsID) {
        this.customsID = customsID;
    }

    /** 
     * Get the 'CustomsProcedure' element value. Направление перемещения: ИМ (прибытие)/ ЭК (убытие)
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Направление перемещения: ИМ (прибытие)/ ЭК (убытие)
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }
}
