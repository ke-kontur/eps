
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

/** 
 * ������� � ���������� ��������� � ��������� ������� �� �������
 */
public class DTSOutGoodsResultType
{
    private String GTDGoodsNumber;
    private DTSOuDecisionType DTSGoodsCostDecision;
    private DTSOuDecisionType DTSGoodsRecallDecision;

    /** 
     * Get the 'GTDGoodsNumber' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. ����� ������ �� ��
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'DTSGoodsCostDecision' element value. ������� � ���������� ��������� ������
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSGoodsCostDecision() {
        return DTSGoodsCostDecision;
    }

    /** 
     * Set the 'DTSGoodsCostDecision' element value. ������� � ���������� ��������� ������
     * 
     * @param DTSGoodsCostDecision
     */
    public void setDTSGoodsCostDecision(DTSOuDecisionType DTSGoodsCostDecision) {
        this.DTSGoodsCostDecision = DTSGoodsCostDecision;
    }

    /** 
     * Get the 'DTSGoodsRecallDecision' element value. ������� �� ������������� ��� ������ ��� �� ������
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSGoodsRecallDecision() {
        return DTSGoodsRecallDecision;
    }

    /** 
     * Set the 'DTSGoodsRecallDecision' element value. ������� �� ������������� ��� ������ ��� �� ������
     * 
     * @param DTSGoodsRecallDecision
     */
    public void setDTSGoodsRecallDecision(
            DTSOuDecisionType DTSGoodsRecallDecision) {
        this.DTSGoodsRecallDecision = DTSGoodsRecallDecision;
    }
}
