
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * �������� � ����� �� ��������������� �������������� ����� ������������� ������������
 */
public class ActivityType
{
    private String activityCode;
    private String activitySign;
    private RecordDataType recordData;

    /** 
     * Get the 'ActivityCode' element value. ��� �� ��������������� �������������� ����� ������������� ������������
     * 
     * @return value
     */
    public String getActivityCode() {
        return activityCode;
    }

    /** 
     * Set the 'ActivityCode' element value. ��� �� ��������������� �������������� ����� ������������� ������������
     * 
     * @param activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /** 
     * Get the 'ActivitySign' element value. �������: 0 - ��������; 1 - ��������������
     * 
     * @return value
     */
    public String getActivitySign() {
        return activitySign;
    }

    /** 
     * Set the 'ActivitySign' element value. �������: 0 - ��������; 1 - ��������������
     * 
     * @param activitySign
     */
    public void setActivitySign(String activitySign) {
        this.activitySign = activitySign;
    }

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
}
