
package ru.acs.fts.schemas.album.sem_niresponse;

/** 
 * Результат обработки товара по сервису СУР
 */
public class GoodsType
{
    private String goodsNumeric;
    private String relevance;
    private String riskDetected;

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер декларируемого  товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер декларируемого  товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
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
}
