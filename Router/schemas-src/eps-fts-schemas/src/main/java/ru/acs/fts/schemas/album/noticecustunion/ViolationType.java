
package ru.acs.fts.schemas.album.noticecustunion;

/** 
 * Выявленное нарушение
 */
public class ViolationType
{
    private String nodeNumber;
    private String violationName;
    private String controlStatusName;

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
     * Get the 'ControlStatusName' element value. Отметка об устранении нарушения
     * 
     * @return value
     */
    public String getControlStatusName() {
        return controlStatusName;
    }

    /** 
     * Set the 'ControlStatusName' element value. Отметка об устранении нарушения
     * 
     * @param controlStatusName
     */
    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }
}
