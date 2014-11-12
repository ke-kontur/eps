
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import org.joda.time.LocalDate;

/** 
 * Период использования ТС
 */
public class UseTransportTermType
{
    private LocalDate beginUseTransportDate;
    private LocalDate endUseTransportDate;

    /** 
     * Get the 'BeginUseTransportDate' element value. Начало периода использования транспортного средства для ТС принадлежащих физ. лица)
     * 
     * @return value
     */
    public LocalDate getBeginUseTransportDate() {
        return beginUseTransportDate;
    }

    /** 
     * Set the 'BeginUseTransportDate' element value. Начало периода использования транспортного средства для ТС принадлежащих физ. лица)
     * 
     * @param beginUseTransportDate
     */
    public void setBeginUseTransportDate(LocalDate beginUseTransportDate) {
        this.beginUseTransportDate = beginUseTransportDate;
    }

    /** 
     * Get the 'EndUseTransportDate' element value. Конец периода использования транспортного средства для ТС принадлежащих физ. лица)
     * 
     * @return value
     */
    public LocalDate getEndUseTransportDate() {
        return endUseTransportDate;
    }

    /** 
     * Set the 'EndUseTransportDate' element value. Конец периода использования транспортного средства для ТС принадлежащих физ. лица)
     * 
     * @param endUseTransportDate
     */
    public void setEndUseTransportDate(LocalDate endUseTransportDate) {
        this.endUseTransportDate = endUseTransportDate;
    }
}
