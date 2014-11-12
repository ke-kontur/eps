
package ru.acs.fts.schemas.album.responsemca;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� ���������
 */
public class DocumentHeadType extends DocumentBaseType
{
    private String visibleFlag;
    private String organizationName;

    /** 
     * Get the 'VisibleFlag' element value. ������� ���������
     * 
     * @return value
     */
    public String getVisibleFlag() {
        return visibleFlag;
    }

    /** 
     * Set the 'VisibleFlag' element value. ������� ���������
     * 
     * @param visibleFlag
     */
    public void setVisibleFlag(String visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������, �������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������, �������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
