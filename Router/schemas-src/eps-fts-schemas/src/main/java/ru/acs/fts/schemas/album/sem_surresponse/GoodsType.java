
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * �������� � ������� � ����������������� ����������� ������� �����
 */
public class GoodsType extends ResultGoodsType
{
    private String profileIndex;
    private String relevance;
    private String riskDetected;
    private String threshold;
    private List<DTFieldDescriptionMarkUpType> DTFieldDescriptionMarkUpList = new ArrayList<DTFieldDescriptionMarkUpType>();
    private List<RiskProfileDescriptionMarkUpType> riskProfileDescriptionMarkUpList = new ArrayList<RiskProfileDescriptionMarkUpType>();

    /** 
     * Get the 'ProfileIndex' element value. ��������� ������������� ������� �����
     * 
     * @return value
     */
    public String getProfileIndex() {
        return profileIndex;
    }

    /** 
     * Set the 'ProfileIndex' element value. ��������� ������������� ������� �����
     * 
     * @param profileIndex
     */
    public void setProfileIndex(String profileIndex) {
        this.profileIndex = profileIndex;
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

    /** 
     * Get the 'Threshold' element value. ��������� �������� ������� ������������  ����������������� ����������� �������� ������
     * 
     * @return value
     */
    public String getThreshold() {
        return threshold;
    }

    /** 
     * Set the 'Threshold' element value. ��������� �������� ������� ������������  ����������������� ����������� �������� ������
     * 
     * @param threshold
     */
    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    /** 
     * Get the list of 'DTFieldDescriptionMarkUp' element items. ����������� ��������� �������� ���� ��
     * 
     * @return list
     */
    public List<DTFieldDescriptionMarkUpType> getDTFieldDescriptionMarkUpList() {
        return DTFieldDescriptionMarkUpList;
    }

    /** 
     * Set the list of 'DTFieldDescriptionMarkUp' element items. ����������� ��������� �������� ���� ��
     * 
     * @param list
     */
    public void setDTFieldDescriptionMarkUpList(
            List<DTFieldDescriptionMarkUpType> list) {
        DTFieldDescriptionMarkUpList = list;
    }

    /** 
     * Get the list of 'RiskProfileDescriptionMarkUp' element items. ����������� ��������� �������� ����������������� �����������  ������� �����
     * 
     * @return list
     */
    public List<RiskProfileDescriptionMarkUpType> getRiskProfileDescriptionMarkUpList() {
        return riskProfileDescriptionMarkUpList;
    }

    /** 
     * Set the list of 'RiskProfileDescriptionMarkUp' element items. ����������� ��������� �������� ����������������� �����������  ������� �����
     * 
     * @param list
     */
    public void setRiskProfileDescriptionMarkUpList(
            List<RiskProfileDescriptionMarkUpType> list) {
        riskProfileDescriptionMarkUpList = list;
    }
}
