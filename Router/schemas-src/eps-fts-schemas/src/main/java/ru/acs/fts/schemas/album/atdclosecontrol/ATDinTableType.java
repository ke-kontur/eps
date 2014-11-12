
package ru.acs.fts.schemas.album.atdclosecontrol;

/** 
 * ���������� � ������� ����������� ������� ����������� ����� ��� 
 */
public class ATDinTableType
{
    private String tableName;
    private String attributeName;
    private String recordNumber;

    /** 
     * Get the 'TableName' element value. ��� ������� ����������� ������� ����������� ����� ��� 
     * 
     * @return value
     */
    public String getTableName() {
        return tableName;
    }

    /** 
     * Set the 'TableName' element value. ��� ������� ����������� ������� ����������� ����� ��� 
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
     * Get the 'RecordNumber' element value. ����� ������, ��������������� �������� ���� NUMREC � �������
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ����� ������, ��������������� �������� ���� NUMREC � �������
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
