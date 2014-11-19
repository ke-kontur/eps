
package ru.acs.fts.schemas.album.decisionclassgood;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������� �������� �������. ���������� ���������� �����������
 */
public class ExpertDecisionType extends DocumentBaseType
{
    private String expertOrganization;

    /** 
     * Get the 'ExpertOrganization' element value. ������������ ���������� �����������
     * 
     * @return value
     */
    public String getExpertOrganization() {
        return expertOrganization;
    }

    /** 
     * Set the 'ExpertOrganization' element value. ������������ ���������� �����������
     * 
     * @param expertOrganization
     */
    public void setExpertOrganization(String expertOrganization) {
        this.expertOrganization = expertOrganization;
    }
}
