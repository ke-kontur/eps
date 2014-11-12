
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * �� � ��. ���������� ������. �������� �� ����������� �������
 */
public class ESADinConsignorType extends ESADOrganizationInType
{
    private String bowelsINN;
    private String bowelsOKPO;
    private String contractorIndicator;
    private String officesExchangeCode;
    private CUBranchDescriptionType branchDescription;
    private ContactType contact;

    /** 
     * Get the 'BowelsINN' element value. ��� �����������������.
     * 
     * @return value
     */
    public String getBowelsINN() {
        return bowelsINN;
    }

    /** 
     * Set the 'BowelsINN' element value. ��� �����������������.
     * 
     * @param bowelsINN
     */
    public void setBowelsINN(String bowelsINN) {
        this.bowelsINN = bowelsINN;
    }

    /** 
     * Get the 'BowelsOKPO' element value. ���� �����������������.
     * 
     * @return value
     */
    public String getBowelsOKPO() {
        return bowelsOKPO;
    }

    /** 
     * Set the 'BowelsOKPO' element value. ���� �����������������.
     * 
     * @param bowelsOKPO
     */
    public void setBowelsOKPO(String bowelsOKPO) {
        this.bowelsOKPO = bowelsOKPO;
    }

    /** 
     * Get the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }

    /** 
     * Get the 'OfficesExchangeCode' element value. ��� ���������� ������ ������ ������������� �������� ����������� 
     * 
     * @return value
     */
    public String getOfficesExchangeCode() {
        return officesExchangeCode;
    }

    /** 
     * Set the 'OfficesExchangeCode' element value. ��� ���������� ������ ������ ������������� �������� ����������� 
     * 
     * @param officesExchangeCode
     */
    public void setOfficesExchangeCode(String officesExchangeCode) {
        this.officesExchangeCode = officesExchangeCode;
    }

    /** 
     * Get the 'BranchDescription' element value. �������� �� ������������ �������������
     * 
     * @return value
     */
    public CUBranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. �������� �� ������������ �������������
     * 
     * @param branchDescription
     */
    public void setBranchDescription(CUBranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }

    /** 
     * Get the 'Contact' element value. ���������� ����������
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. ���������� ����������
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
