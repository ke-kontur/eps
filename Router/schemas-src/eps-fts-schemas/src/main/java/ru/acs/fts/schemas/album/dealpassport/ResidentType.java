
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о резиденте
 */
public class ResidentType extends OrganizationBaseType
{
    private LocalDate regDate;
    private AddressType residentAddress;

    /** 
     * Get the 'RegDate' element value. Дата внесения записи в государственный реестр
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата внесения записи в государственный реестр
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'ResidentAddress' element value. Описание адреса резидента
     * 
     * @return value
     */
    public AddressType getResidentAddress() {
        return residentAddress;
    }

    /** 
     * Set the 'ResidentAddress' element value. Описание адреса резидента
     * 
     * @param residentAddress
     */
    public void setResidentAddress(AddressType residentAddress) {
        this.residentAddress = residentAddress;
    }
}
