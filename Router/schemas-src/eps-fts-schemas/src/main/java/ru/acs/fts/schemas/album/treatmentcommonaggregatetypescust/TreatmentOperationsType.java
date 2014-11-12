
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Операции по переработке товаров и способы их совершения
 */
public class TreatmentOperationsType
{
    private String operationName;
    private List<String> operationMethodList = new ArrayList<String>();
    private LocalDate operationEndDate;

    /** 
     * Get the 'OperationName' element value. Название операции
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. Название операции
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the list of 'OperationMethod' element items. Способ совершения операции
     * 
     * @return list
     */
    public List<String> getOperationMethodList() {
        return operationMethodList;
    }

    /** 
     * Set the list of 'OperationMethod' element items. Способ совершения операции
     * 
     * @param list
     */
    public void setOperationMethodList(List<String> list) {
        operationMethodList = list;
    }

    /** 
     * Get the 'OperationEndDate' element value. Срок завершения операции
     * 
     * @return value
     */
    public LocalDate getOperationEndDate() {
        return operationEndDate;
    }

    /** 
     * Set the 'OperationEndDate' element value. Срок завершения операции
     * 
     * @param operationEndDate
     */
    public void setOperationEndDate(LocalDate operationEndDate) {
        this.operationEndDate = operationEndDate;
    }
}
