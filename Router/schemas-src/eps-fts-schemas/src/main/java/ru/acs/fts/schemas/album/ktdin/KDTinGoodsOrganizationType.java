
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� ����������� � �������� ����� ��
 */
public class KDTinGoodsOrganizationType extends CUOrganizationType
{
    private String contractorIndicator;

    /** 
     * Get the 'ContractorIndicator' element value. ����������� ��������� ��������: 1 - ����������; 2 - ������ �� ������
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. ����������� ��������� ��������: 1 - ����������; 2 - ������ �� ������
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }
}
