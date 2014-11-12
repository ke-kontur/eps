
package ru.acs.fts.schemas.album.inforequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об организации/физ. лице (юр. лицо/ИП)
 */
public class OrganizationType extends CUOrganizationType
{
    private String orgSign;
    private String insuranceNumber;
    private LocalDate birthDate;
    private String addressSign;
    private AddressType birthPlace;

    /** 
     * Get the 'OrgSign' element value. Признак: 0 - физ. лицо; 1 - юр. лицо
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 0 - физ. лицо; 1 - юр. лицо
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'InsuranceNumber' element value. Страховой номер индивидуального лицевого счёта (СНИЛС)
     * 
     * @return value
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /** 
     * Set the 'InsuranceNumber' element value. Страховой номер индивидуального лицевого счёта (СНИЛС)
     * 
     * @param insuranceNumber
     */
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    /** 
     * Get the 'BirthDate' element value. Дата рождения
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. Дата рождения
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'AddressSign' element value. Тип регистрации: 0 - МП (место пребывания); 1 - МЖ (место проживания)
     * 
     * @return value
     */
    public String getAddressSign() {
        return addressSign;
    }

    /** 
     * Set the 'AddressSign' element value. Тип регистрации: 0 - МП (место пребывания); 1 - МЖ (место проживания)
     * 
     * @param addressSign
     */
    public void setAddressSign(String addressSign) {
        this.addressSign = addressSign;
    }

    /** 
     * Get the 'BirthPlace' element value. Место рождения
     * 
     * @return value
     */
    public AddressType getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. Место рождения
     * 
     * @param birthPlace
     */
    public void setBirthPlace(AddressType birthPlace) {
        this.birthPlace = birthPlace;
    }
}
