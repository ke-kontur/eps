
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * ���������� � ������� ����������� ������� ����������� ����� �� (������ DBF)
 */
public class GTDinTableType
{
    private String tableName;
    private String attributeName;
    private String recordNumber;

    /** 
     * Get the 'TableName' element value. ��� ������� ����������� ������� ����������� ����� �� (������ DBF)
     * 
     * @return value
     */
    public String getTableName() {
        return tableName;
    }

    /** 
     * Set the 'TableName' element value. ��� ������� ����������� ������� ����������� ����� �� (������ DBF)
     * 
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /** 
     * Get the 'AttributeName' element value. ������������ �������� �������
     * 
     * @return value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** 
     * Set the 'AttributeName' element value. ������������ �������� �������
     * 
     * @param attributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /** 
     * Get the 'RecordNumber' element value. ����� ������, ��������������� �������� ���� NZP � �������
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ����� ������, ��������������� �������� ���� NZP � �������
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
