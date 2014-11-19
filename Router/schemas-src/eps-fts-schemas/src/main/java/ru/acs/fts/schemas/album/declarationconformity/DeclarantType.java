
package ru.acs.fts.schemas.album.declarationconformity;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBackAddrType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ���������
 */
public class DeclarantType extends OrganizationBackAddrType
{
    private LocalDate orgRegistryDate;
    private PersonBaseType chief;
    private OrganizationBaseType orgRegAuthority;

    /** 
     * Get the 'OrgRegistryDate' element value. ���� ����������� ����������� ��� ��
     * 
     * @return value
     */
    public LocalDate getOrgRegistryDate() {
        return orgRegistryDate;
    }

    /** 
     * Set the 'OrgRegistryDate' element value. ���� ����������� ����������� ��� ��
     * 
     * @param orgRegistryDate
     */
    public void setOrgRegistryDate(LocalDate orgRegistryDate) {
        this.orgRegistryDate = orgRegistryDate;
    }

    /** 
     * Get the 'Chief' element value. ������������ �����������
     * 
     * @return value
     */
    public PersonBaseType getChief() {
        return chief;
    }

    /** 
     * Set the 'Chief' element value. ������������ �����������
     * 
     * @param chief
     */
    public void setChief(PersonBaseType chief) {
        this.chief = chief;
    }

    /** 
     * Get the 'OrgRegAuthority' element value. ����� ����������� ������������ ���� ��� ��������������� ���������������
     * 
     * @return value
     */
    public OrganizationBaseType getOrgRegAuthority() {
        return orgRegAuthority;
    }

    /** 
     * Set the 'OrgRegAuthority' element value. ����� ����������� ������������ ���� ��� ��������������� ���������������
     * 
     * @param orgRegAuthority
     */
    public void setOrgRegAuthority(OrganizationBaseType orgRegAuthority) {
        this.orgRegAuthority = orgRegAuthority;
    }
}
