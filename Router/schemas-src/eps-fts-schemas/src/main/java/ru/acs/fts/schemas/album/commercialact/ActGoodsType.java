
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Сведения о товаре согласно отчету о принятии
 */
public class ActGoodsType
{
    private String DO1GoodNumber;
    private String comments;

    /** 
     * Get the 'DO1GoodNumber' element value. Номер товара в отчете ДО-1
     * 
     * @return value
     */
    public String getDO1GoodNumber() {
        return DO1GoodNumber;
    }

    /** 
     * Set the 'DO1GoodNumber' element value. Номер товара в отчете ДО-1
     * 
     * @param DO1GoodNumber
     */
    public void setDO1GoodNumber(String DO1GoodNumber) {
        this.DO1GoodNumber = DO1GoodNumber;
    }

    /** 
     * Get the 'Comments' element value. Дополнение в примечание по товару (графа 11 отчета), уточняющее причины и обстоятельства отсутствия товара
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Дополнение в примечание по товару (графа 11 отчета), уточняющее причины и обстоятельства отсутствия товара
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
