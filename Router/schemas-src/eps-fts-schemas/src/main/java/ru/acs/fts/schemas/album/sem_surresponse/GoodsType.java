
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * Сведения о товарах и неформализованных индикаторах профиля риска
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
     * Get the 'ProfileIndex' element value. Системный идентификатор профиля риска
     * 
     * @return value
     */
    public String getProfileIndex() {
        return profileIndex;
    }

    /** 
     * Set the 'ProfileIndex' element value. Системный идентификатор профиля риска
     * 
     * @param profileIndex
     */
    public void setProfileIndex(String profileIndex) {
        this.profileIndex = profileIndex;
    }

    /** 
     * Get the 'Relevance' element value. Числовое значение, характеризующее степень соответствия неформализованных индикаторов описанию товара (оценка достоверности)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. Числовое значение, характеризующее степень соответствия неформализованных индикаторов описанию товара (оценка достоверности)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the 'RiskDetected' element value. Признак найденного соответствия описания товара неформализованным индикаторам профиля риска
     * 
     * @return value
     */
    public String getRiskDetected() {
        return riskDetected;
    }

    /** 
     * Set the 'RiskDetected' element value. Признак найденного соответствия описания товара неформализованным индикаторам профиля риска
     * 
     * @param riskDetected
     */
    public void setRiskDetected(String riskDetected) {
        this.riskDetected = riskDetected;
    }

    /** 
     * Get the 'Threshold' element value. Пороговое значение степени соответствия  неформализованных индикаторов описанию товара
     * 
     * @return value
     */
    public String getThreshold() {
        return threshold;
    }

    /** 
     * Set the 'Threshold' element value. Пороговое значение степени соответствия  неформализованных индикаторов описанию товара
     * 
     * @param threshold
     */
    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    /** 
     * Get the list of 'DTFieldDescriptionMarkUp' element items. Размеченные текстовые описания граф ДТ
     * 
     * @return list
     */
    public List<DTFieldDescriptionMarkUpType> getDTFieldDescriptionMarkUpList() {
        return DTFieldDescriptionMarkUpList;
    }

    /** 
     * Set the list of 'DTFieldDescriptionMarkUp' element items. Размеченные текстовые описания граф ДТ
     * 
     * @param list
     */
    public void setDTFieldDescriptionMarkUpList(
            List<DTFieldDescriptionMarkUpType> list) {
        DTFieldDescriptionMarkUpList = list;
    }

    /** 
     * Get the list of 'RiskProfileDescriptionMarkUp' element items. Размеченные текстовые описания неформализованных индикаторов  профиля риска
     * 
     * @return list
     */
    public List<RiskProfileDescriptionMarkUpType> getRiskProfileDescriptionMarkUpList() {
        return riskProfileDescriptionMarkUpList;
    }

    /** 
     * Set the list of 'RiskProfileDescriptionMarkUp' element items. Размеченные текстовые описания неформализованных индикаторов  профиля риска
     * 
     * @param list
     */
    public void setRiskProfileDescriptionMarkUpList(
            List<RiskProfileDescriptionMarkUpType> list) {
        riskProfileDescriptionMarkUpList = list;
    }
}
