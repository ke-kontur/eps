
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Наименование и реквизиты перевозчика 
 */
public class CarrierType
{
    private String organizationName;
    private String customsBrokerCertificate;
    private String INN;
    private String OKPOID;
    private String note;
    private AddressType legalAddress;
    private AddressType factAddress;

    /** 
     * Get the 'OrganizationName' element value. Наименование экспресс перевозчика 
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование экспресс перевозчика 
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CustomsBrokerCertificate' element value. № свидетельства о включении в Реестр таможенных представителей (брокеров)
     * 
     * @return value
     */
    public String getCustomsBrokerCertificate() {
        return customsBrokerCertificate;
    }

    /** 
     * Set the 'CustomsBrokerCertificate' element value. № свидетельства о включении в Реестр таможенных представителей (брокеров)
     * 
     * @param customsBrokerCertificate
     */
    public void setCustomsBrokerCertificate(String customsBrokerCertificate) {
        this.customsBrokerCertificate = customsBrokerCertificate;
    }

    /** 
     * Get the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'Note' element value. Дополнительные сведения 
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Дополнительные сведения 
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'LegalAddress' element value. Юридический адрес 
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. Юридический адрес 
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }

    /** 
     * Get the 'FactAddress' element value. Фактический адрес
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Фактический адрес
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
