
package ru.acs.fts.schemas.album.reqoperations;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * При направлении требования по почте или иным способом
 */
public class DirectionRequirementType
{
    private String methodDirection;
    private LocalDate dateDirection;
    private CustomsPersonType customsPerson;
    private PersonBaseType person;
    private AddressType address;

    /** 
     * Get the 'MethodDirection' element value. Способ направления требования
     * 
     * @return value
     */
    public String getMethodDirection() {
        return methodDirection;
    }

    /** 
     * Set the 'MethodDirection' element value. Способ направления требования
     * 
     * @param methodDirection
     */
    public void setMethodDirection(String methodDirection) {
        this.methodDirection = methodDirection;
    }

    /** 
     * Get the 'DateDirection' element value. Дата направления требования
     * 
     * @return value
     */
    public LocalDate getDateDirection() {
        return dateDirection;
    }

    /** 
     * Set the 'DateDirection' element value. Дата направления требования
     * 
     * @param dateDirection
     */
    public void setDateDirection(LocalDate dateDirection) {
        this.dateDirection = dateDirection;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо, направившее требование
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо, направившее требование
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Person' element value. Лицо, принявшее требование
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Лицо, принявшее требование
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
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
}
