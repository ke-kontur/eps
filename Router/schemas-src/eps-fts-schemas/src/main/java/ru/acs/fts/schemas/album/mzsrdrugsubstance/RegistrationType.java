
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о регистрации лекарственного средства
 */
public class RegistrationType extends DocumentBaseType
{
    private String regStatus;
    private LocalDate endDate;

    /** 
     * Get the 'RegStatus' element value. Статус регистрационного удостоверения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное
     * 
     * @return value
     */
    public String getRegStatus() {
        return regStatus;
    }

    /** 
     * Set the 'RegStatus' element value. Статус регистрационного удостоверения: 1 - Действующее, 2 - Приостановленное, 3 - Аннулированное
     * 
     * @param regStatus
     */
    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    /** 
     * Get the 'EndDate' element value. Дата (приостановления, аннулирования)/Срок действия/Дата исключения из государственного реестра лекарственных средств
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата (приостановления, аннулирования)/Срок действия/Дата исключения из государственного реестра лекарственных средств
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
