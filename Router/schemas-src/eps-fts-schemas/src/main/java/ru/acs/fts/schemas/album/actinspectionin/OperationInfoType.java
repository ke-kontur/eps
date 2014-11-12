
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Информация об операции (заполняется при TechMarkCode = 001 и 002)
 */
public class OperationInfoType extends CustomsPersonType
{
    private String operationDocCode;
    private String operationDocNum;
    private LocalDate operationDocDate;

    /** 
     * Get the 'OperationDocCode' element value. Тип документа 
     * 
     * @return value
     */
    public String getOperationDocCode() {
        return operationDocCode;
    }

    /** 
     * Set the 'OperationDocCode' element value. Тип документа 
     * 
     * @param operationDocCode
     */
    public void setOperationDocCode(String operationDocCode) {
        this.operationDocCode = operationDocCode;
    }

    /** 
     * Get the 'OperationDocNum' element value. Номер документа
     * 
     * @return value
     */
    public String getOperationDocNum() {
        return operationDocNum;
    }

    /** 
     * Set the 'OperationDocNum' element value. Номер документа
     * 
     * @param operationDocNum
     */
    public void setOperationDocNum(String operationDocNum) {
        this.operationDocNum = operationDocNum;
    }

    /** 
     * Get the 'OperationDocDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getOperationDocDate() {
        return operationDocDate;
    }

    /** 
     * Set the 'OperationDocDate' element value. Дата документа
     * 
     * @param operationDocDate
     */
    public void setOperationDocDate(LocalDate operationDocDate) {
        this.operationDocDate = operationDocDate;
    }
}
