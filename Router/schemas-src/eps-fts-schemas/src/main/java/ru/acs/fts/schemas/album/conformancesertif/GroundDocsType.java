
package ru.acs.fts.schemas.album.conformancesertif;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Описание  документов на основании которых выдан сертификат
 */
public class GroundDocsType extends DocumentBaseType
{
    private String organizationName;
    private String organizationNumber;
    private LocalDate beginDate;
    private LocalDate endDate;
    private AddressType organizationAddress;

    /** 
     * Get the 'OrganizationName' element value. Кем выдан документ (наименование органа производившего испытания)
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Кем выдан документ (наименование органа производившего испытания)
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OrganizationNumber' element value. Регистрационный номер органа, производившего испытания
     * 
     * @return value
     */
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    /** 
     * Set the 'OrganizationNumber' element value. Регистрационный номер органа, производившего испытания
     * 
     * @param organizationNumber
     */
    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия документа
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия документа
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'OrganizationAddress' element value. Адрес организации
     * 
     * @return value
     */
    public AddressType getOrganizationAddress() {
        return organizationAddress;
    }

    /** 
     * Set the 'OrganizationAddress' element value. Адрес организации
     * 
     * @param organizationAddress
     */
    public void setOrganizationAddress(AddressType organizationAddress) {
        this.organizationAddress = organizationAddress;
    }
}
