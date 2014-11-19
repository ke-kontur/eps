
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� �� ����������� ������� � ������� �� ����������
 */
public class TreatmentOperationsType
{
    private String operationName;
    private List<String> operationMethodList = new ArrayList<String>();
    private LocalDate operationEndDate;

    /** 
     * Get the 'OperationName' element value. �������� ��������
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. �������� ��������
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the list of 'OperationMethod' element items. ������ ���������� ��������
     * 
     * @return list
     */
    public List<String> getOperationMethodList() {
        return operationMethodList;
    }

    /** 
     * Set the list of 'OperationMethod' element items. ������ ���������� ��������
     * 
     * @param list
     */
    public void setOperationMethodList(List<String> list) {
        operationMethodList = list;
    }

    /** 
     * Get the 'OperationEndDate' element value. ���� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getOperationEndDate() {
        return operationEndDate;
    }

    /** 
     * Set the 'OperationEndDate' element value. ���� ���������� ��������
     * 
     * @param operationEndDate
     */
    public void setOperationEndDate(LocalDate operationEndDate) {
        this.operationEndDate = operationEndDate;
    }
}
