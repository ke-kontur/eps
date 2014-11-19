
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� �� ������ ������ � ��
 */
public class PostPenaltyType
{
    private String isPaid;
    private String violatorID;
    private String penaltySum;
    private DocumentBaseType resolution;
    private PenaltyType penalty;

    /** 
     * Get the 'IsPaid' element value. ������� �� ������
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. ������� �� ������
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'ViolatorID' element value. ������������� ������ � ������� �����������
     * 
     * @return value
     */
    public String getViolatorID() {
        return violatorID;
    }

    /** 
     * Set the 'ViolatorID' element value. ������������� ������ � ������� �����������
     * 
     * @param violatorID
     */
    public void setViolatorID(String violatorID) {
        this.violatorID = violatorID;
    }

    /** 
     * Get the 'PenaltySum' element value. ����� ������ � ������
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. ����� ������ � ������
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'Resolution' element value. �������������
     * 
     * @return value
     */
    public DocumentBaseType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. �������������
     * 
     * @param resolution
     */
    public void setResolution(DocumentBaseType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the 'Penalty' element value. �������� �� ������ ������
     * 
     * @return value
     */
    public PenaltyType getPenalty() {
        return penalty;
    }

    /** 
     * Set the 'Penalty' element value. �������� �� ������ ������
     * 
     * @param penalty
     */
    public void setPenalty(PenaltyType penalty) {
        this.penalty = penalty;
    }
}
