
package ru.acs.fts.schemas.album.resultrd;

/** 
 * �������� �������� ���������, � ������� �������� ������
 */
public class ItemInfoType
{
    private String refItem;
    private String recommendValue;

    /** 
     * Get the 'RefItem' element value. ������ �� ������� � �������.
     * 
     * @return value
     */
    public String getRefItem() {
        return refItem;
    }

    /** 
     * Set the 'RefItem' element value. ������ �� ������� � �������.
     * 
     * @param refItem
     */
    public void setRefItem(String refItem) {
        this.refItem = refItem;
    }

    /** 
     * Get the 'RecommendValue' element value. ������������� ��������.
     * 
     * @return value
     */
    public String getRecommendValue() {
        return recommendValue;
    }

    /** 
     * Set the 'RecommendValue' element value. ������������� ��������.
     * 
     * @param recommendValue
     */
    public void setRecommendValue(String recommendValue) {
        this.recommendValue = recommendValue;
    }
}
