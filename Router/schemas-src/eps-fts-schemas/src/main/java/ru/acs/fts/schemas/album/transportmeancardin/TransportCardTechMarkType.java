
package ru.acs.fts.schemas.album.transportmeancardin;

import org.joda.time.LocalDate;

/** 
 * Карточка ТС. Внутренний формат. Технологические отметки.
 */
public class TransportCardTechMarkType
{
    private LocalDate dateOut;
    private String timeOut;
    private LocalDate modificationDate;
    private String modificationTime;
    private String modificationIndicator;
    private String packetControlIndicator;
    private String PTSUseDateTime;
    private String PTSOutDateTime;

    /** 
     * Get the 'DateOut' element value. Дата выгрузки записи.
     * 
     * @return value
     */
    public LocalDate getDateOut() {
        return dateOut;
    }

    /** 
     * Set the 'DateOut' element value. Дата выгрузки записи.
     * 
     * @param dateOut
     */
    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }

    /** 
     * Get the 'TimeOut' element value. Время выгрузки записи.
     * 
     * @return value
     */
    public String getTimeOut() {
        return timeOut;
    }

    /** 
     * Set the 'TimeOut' element value. Время выгрузки записи.
     * 
     * @param timeOut
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /** 
     * Get the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /** 
     * Get the 'ModificationIndicator' element value. Признак модификации записи.
     * 
     * @return value
     */
    public String getModificationIndicator() {
        return modificationIndicator;
    }

    /** 
     * Set the 'ModificationIndicator' element value. Признак модификации записи.
     * 
     * @param modificationIndicator
     */
    public void setModificationIndicator(String modificationIndicator) {
        this.modificationIndicator = modificationIndicator;
    }

    /** 
     * Get the 'PacketControlIndicator' element value. Индикатор пакетного контроля.
     * 
     * @return value
     */
    public String getPacketControlIndicator() {
        return packetControlIndicator;
    }

    /** 
     * Set the 'PacketControlIndicator' element value. Индикатор пакетного контроля.
     * 
     * @param packetControlIndicator
     */
    public void setPacketControlIndicator(String packetControlIndicator) {
        this.packetControlIndicator = packetControlIndicator;
    }

    /** 
     * Get the 'PTSUseDateTime' element value. Дата /время использования бланка ПТС/ПШТС
     * 
     * @return value
     */
    public String getPTSUseDateTime() {
        return PTSUseDateTime;
    }

    /** 
     * Set the 'PTSUseDateTime' element value. Дата /время использования бланка ПТС/ПШТС
     * 
     * @param PTSUseDateTime
     */
    public void setPTSUseDateTime(String PTSUseDateTime) {
        this.PTSUseDateTime = PTSUseDateTime;
    }

    /** 
     * Get the 'PTSOutDateTime' element value. Дата /время выгрузки для передачи в подсистему учета бланков ПТС/ПШТС
     * 
     * @return value
     */
    public String getPTSOutDateTime() {
        return PTSOutDateTime;
    }

    /** 
     * Set the 'PTSOutDateTime' element value. Дата /время выгрузки для передачи в подсистему учета бланков ПТС/ПШТС
     * 
     * @param PTSOutDateTime
     */
    public void setPTSOutDateTime(String PTSOutDateTime) {
        this.PTSOutDateTime = PTSOutDateTime;
    }
}
