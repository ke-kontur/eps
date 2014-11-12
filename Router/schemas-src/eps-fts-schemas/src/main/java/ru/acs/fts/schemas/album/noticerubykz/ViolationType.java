
package ru.acs.fts.schemas.album.noticerubykz;

/** 
 * ���������� ���������
 */
public class ViolationType
{
    private String nodeNumber;
    private String violationName;
    private String status;

    /** 
     * Get the 'NodeNumber' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getNodeNumber() {
        return nodeNumber;
    }

    /** 
     * Set the 'NodeNumber' element value. ���������� ����� ���������
     * 
     * @param nodeNumber
     */
    public void setNodeNumber(String nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    /** 
     * Get the 'ViolationName' element value. ����� ���������
     * 
     * @return value
     */
    public String getViolationName() {
        return violationName;
    }

    /** 
     * Set the 'ViolationName' element value. ����� ���������
     * 
     * @param violationName
     */
    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    /** 
     * Get the 'Status' element value. ������� �� ���������� ���������: 1 - ��; 2 - ���; 3 - �� ���������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������� �� ���������� ���������: 1 - ��; 2 - ���; 3 - �� ���������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
