
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� ����������� � �������� ����� ��
 */
public class ESADoutGoodsOrganizationType extends CUOrganizationType
{
    private String contractorIndicator;

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
}
