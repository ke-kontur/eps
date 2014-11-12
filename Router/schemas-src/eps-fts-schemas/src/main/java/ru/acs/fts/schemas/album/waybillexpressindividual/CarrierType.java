
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ������������ � ��������� ����������� 
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
     * Get the 'OrganizationName' element value. ������������ �������� ����������� 
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �������� ����������� 
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CustomsBrokerCertificate' element value. � ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @return value
     */
    public String getCustomsBrokerCertificate() {
        return customsBrokerCertificate;
    }

    /** 
     * Set the 'CustomsBrokerCertificate' element value. � ������������� � ��������� � ������ ���������� �������������� (��������)
     * 
     * @param customsBrokerCertificate
     */
    public void setCustomsBrokerCertificate(String customsBrokerCertificate) {
        this.customsBrokerCertificate = customsBrokerCertificate;
    }

    /** 
     * Get the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'Note' element value. �������������� �������� 
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. �������������� �������� 
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'LegalAddress' element value. ����������� ����� 
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. ����������� ����� 
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }

    /** 
     * Get the 'FactAddress' element value. ����������� �����
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. ����������� �����
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
