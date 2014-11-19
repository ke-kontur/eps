
package ru.acs.fts.schemas.album.sem_niresponse;

/** 
 * ��������� ��������� ������ �� ������� ���
 */
public class GoodsType
{
    private String goodsNumeric;
    private String relevance;
    private String riskDetected;

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ��������������  ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ��������������  ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'Relevance' element value. �������� ��������, ��������������� ������� ������������ ����������������� ����������� �������� ������ (������ �������������)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. �������� ��������, ��������������� ������� ������������ ����������������� ����������� �������� ������ (������ �������������)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the 'RiskDetected' element value. ������� ���������� ������������ �������� ������ ����������������� ����������� ������� �����
     * 
     * @return value
     */
    public String getRiskDetected() {
        return riskDetected;
    }

    /** 
     * Set the 'RiskDetected' element value. ������� ���������� ������������ �������� ������ ����������������� ����������� ������� �����
     * 
     * @param riskDetected
     */
    public void setRiskDetected(String riskDetected) {
        this.riskDetected = riskDetected;
    }
}
