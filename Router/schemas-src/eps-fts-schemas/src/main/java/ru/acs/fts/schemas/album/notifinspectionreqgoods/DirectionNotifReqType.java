
package ru.acs.fts.schemas.album.notifinspectionreqgoods;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * При направлении уведомления/требования по почте или иным способом
 */
public class DirectionNotifReqType
{
    private String methodDirection;
    private LocalDate dateDirection;
    private AddressType address;
    private PersonBaseType person;
    private CustomsPersonType customsPerson;

    /** 
     * Get the 'MethodDirection' element value. Способ направления 
     * 
     * @return value
     */
    public String getMethodDirection() {
        return methodDirection;
    }

    /** 
     * Set the 'MethodDirection' element value. Способ направления 
     * 
     * @param methodDirection
     */
    public void setMethodDirection(String methodDirection) {
        this.methodDirection = methodDirection;
    }

    /** 
     * Get the 'DateDirection' element value. Дата направления 
     * 
     * @return value
     */
    public LocalDate getDateDirection() {
        return dateDirection;
    }

    /** 
     * Set the 'DateDirection' element value. Дата направления 
     * 
     * @param dateDirection
     */
    public void setDateDirection(LocalDate dateDirection) {
        this.dateDirection = dateDirection;
    }

    /** 
     * Get the 'Address' element value. Адрес 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'Person' element value. Лицо, принявшее уведомление
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Лицо, принявшее уведомление
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо, направившее уведомление
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо, направившее уведомление
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
