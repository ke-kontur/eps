
package ru.acs.fts.schemas.album.resultrd;

/** 
 * Описание элемента документа, в котором допущена ошибка
 */
public class ItemInfoType
{
    private String refItem;
    private String recommendValue;

    /** 
     * Get the 'RefItem' element value. Ссылка на элемент с ошибкой.
     * 
     * @return value
     */
    public String getRefItem() {
        return refItem;
    }

    /** 
     * Set the 'RefItem' element value. Ссылка на элемент с ошибкой.
     * 
     * @param refItem
     */
    public void setRefItem(String refItem) {
        this.refItem = refItem;
    }

    /** 
     * Get the 'RecommendValue' element value. Рекомендуемое значение.
     * 
     * @return value
     */
    public String getRecommendValue() {
        return recommendValue;
    }

    /** 
     * Set the 'RecommendValue' element value. Рекомендуемое значение.
     * 
     * @param recommendValue
     */
    public void setRecommendValue(String recommendValue) {
        this.recommendValue = recommendValue;
    }
}
