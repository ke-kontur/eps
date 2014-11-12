
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ���������� �������
 */
public class KDTConsigneeType extends CUOrganizationType
{
    private String contractorIndicator;
    private CUBranchDescriptionType branchDescription;

    /** 
     * Get the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������; 2 - ������ �� ������
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������; 2 - ������ �� ������
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
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
}