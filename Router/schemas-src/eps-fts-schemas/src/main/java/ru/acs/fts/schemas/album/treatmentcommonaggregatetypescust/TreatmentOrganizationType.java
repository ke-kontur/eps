
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Организация
 */
public class TreatmentOrganizationType extends OrganizationBaseType
{
    private String phone;
    private String fax;
    private String telex;
    private String OKPOID;
    private String OKATOCode;
    private AddressType treatmentOrganizationAddress;
    private AddressType factAddress;
    private AddressType legalAddress;
    private List<TreatmentBankInformationType> rubBankInformationList = new ArrayList<TreatmentBankInformationType>();
    private List<TreatmentBankInformationType> valBankInformationList = new ArrayList<TreatmentBankInformationType>();

    /** 
     * Get the 'Phone' element value. Телефон иностранной организации
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Телефон иностранной организации
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. Номер факса.
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. Номер факса.
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Telex' element value. Номер телекса.
     * 
     * @return value
     */
    public String getTelex() {
        return telex;
    }

    /** 
     * Set the 'Telex' element value. Номер телекса.
     * 
     * @param telex
     */
    public void setTelex(String telex) {
        this.telex = telex;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'OKATOCode' element value. Код ОКАТО.
     * 
     * @return value
     */
    public String getOKATOCode() {
        return OKATOCode;
    }

    /** 
     * Set the 'OKATOCode' element value. Код ОКАТО.
     * 
     * @param OKATOCode
     */
    public void setOKATOCode(String OKATOCode) {
        this.OKATOCode = OKATOCode;
    }

    /** 
     * Get the 'TreatmentOrganizationAddress' element value. Адрес организации-переработчика
     * 
     * @return value
     */
    public AddressType getTreatmentOrganizationAddress() {
        return treatmentOrganizationAddress;
    }

    /** 
     * Set the 'TreatmentOrganizationAddress' element value. Адрес организации-переработчика
     * 
     * @param treatmentOrganizationAddress
     */
    public void setTreatmentOrganizationAddress(
            AddressType treatmentOrganizationAddress) {
        this.treatmentOrganizationAddress = treatmentOrganizationAddress;
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
     * Get the list of 'RubBankInformation' element items. Информация о банке а котором находится рублевый счет
     * 
     * @return list
     */
    public List<TreatmentBankInformationType> getRubBankInformationList() {
        return rubBankInformationList;
    }

    /** 
     * Set the list of 'RubBankInformation' element items. Информация о банке а котором находится рублевый счет
     * 
     * @param list
     */
    public void setRubBankInformationList(
            List<TreatmentBankInformationType> list) {
        rubBankInformationList = list;
    }

    /** 
     * Get the list of 'ValBankInformation' element items. Информация о банке а котором находится валютный счет
     * 
     * @return list
     */
    public List<TreatmentBankInformationType> getValBankInformationList() {
        return valBankInformationList;
    }

    /** 
     * Set the list of 'ValBankInformation' element items. Информация о банке а котором находится валютный счет
     * 
     * @param list
     */
    public void setValBankInformationList(
            List<TreatmentBankInformationType> list) {
        valBankInformationList = list;
    }
}
