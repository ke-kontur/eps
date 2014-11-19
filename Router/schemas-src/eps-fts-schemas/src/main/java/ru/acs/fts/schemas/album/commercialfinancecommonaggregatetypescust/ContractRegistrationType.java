
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������� (����������) ��������� (����, �����, �����)
 */
public class ContractRegistrationType extends DocumentBaseType
{
    private String contractPlace;

    /** 
     * Get the 'ContractPlace' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getContractPlace() {
        return contractPlace;
    }

    /** 
     * Set the 'ContractPlace' element value. ����� ���������� ���������
     * 
     * @param contractPlace
     */
    public void setContractPlace(String contractPlace) {
        this.contractPlace = contractPlace;
    }
}
