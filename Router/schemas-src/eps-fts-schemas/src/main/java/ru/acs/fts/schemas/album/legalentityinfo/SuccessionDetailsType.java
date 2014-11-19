
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� ��������������
 */
public class SuccessionDetailsType extends ReferenceInfoType
{
    private RecordDataType recordData;
    private OrganizationBaseType orgInfo;

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }

    /** 
     * Get the 'OrgInfo' element value. �������� � ����������� ����
     * 
     * @return value
     */
    public OrganizationBaseType getOrgInfo() {
        return orgInfo;
    }

    /** 
     * Set the 'OrgInfo' element value. �������� � ����������� ����
     * 
     * @param orgInfo
     */
    public void setOrgInfo(OrganizationBaseType orgInfo) {
        this.orgInfo = orgInfo;
    }
}
