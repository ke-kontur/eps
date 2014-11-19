
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * �������� � ������������ ����������
 */
public class CarInformationType
{
    private String arriveType;
    private String VINID;
    private AutoInspResultsType autoInspResults;

    /** 
     * Get the 'ArriveType' element value. ��������: 1 - ����� �����, 2 - �� ������������ ��������, 3 - � ����������
     * 
     * @return value
     */
    public String getArriveType() {
        return arriveType;
    }

    /** 
     * Set the 'ArriveType' element value. ��������: 1 - ����� �����, 2 - �� ������������ ��������, 3 - � ����������
     * 
     * @param arriveType
     */
    public void setArriveType(String arriveType) {
        this.arriveType = arriveType;
    }

    /** 
     * Get the 'VINID' element value. ����������������� ����� (VIN) ������������� ��������
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. ����������������� ����� (VIN) ������������� ��������
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'AutoInspResults' element value. ���������� �������� ���������� (�������� ������� 8702, 8703 �� �� ��� ��)
     * 
     * @return value
     */
    public AutoInspResultsType getAutoInspResults() {
        return autoInspResults;
    }

    /** 
     * Set the 'AutoInspResults' element value. ���������� �������� ���������� (�������� ������� 8702, 8703 �� �� ��� ��)
     * 
     * @param autoInspResults
     */
    public void setAutoInspResults(AutoInspResultsType autoInspResults) {
        this.autoInspResults = autoInspResults;
    }
}
