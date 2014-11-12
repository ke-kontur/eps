
package ru.acs.fts.schemas.album.noticerubykz;

/** 
 * Выявленное нарушение
 */
public class ViolationType
{
    private String nodeNumber;
    private String violationName;
    private String status;

    /** 
     * Get the 'NodeNumber' element value. Порядковый номер нарушения
     * 
     * @return value
     */
    public String getNodeNumber() {
        return nodeNumber;
    }

    /** 
     * Set the 'NodeNumber' element value. Порядковый номер нарушения
     * 
     * @param nodeNumber
     */
    public void setNodeNumber(String nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    /** 
     * Get the 'ViolationName' element value. Текст нарушения
     * 
     * @return value
     */
    public String getViolationName() {
        return violationName;
    }

    /** 
     * Set the 'ViolationName' element value. Текст нарушения
     * 
     * @param violationName
     */
    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    /** 
     * Get the 'Status' element value. Отметка об устранении нарушения: 1 - Да; 2 - Нет; 3 - Не требуется
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Отметка об устранении нарушения: 1 - Да; 2 - Нет; 3 - Не требуется
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
