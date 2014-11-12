
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Поиск продавца для покупки данного товара или ранее до начала сотрудничества осуществлялся
 */
public class SearchSellerType
{
    private String middleman;
    private String commercial;
    private String exchange;
    private String otherwise;
    private String commentsOtherwise;

    /** 
     * Get the 'Middleman' element value. Признак участия посредника
     * 
     * @return value
     */
    public String getMiddleman() {
        return middleman;
    }

    /** 
     * Set the 'Middleman' element value. Признак участия посредника
     * 
     * @param middleman
     */
    public void setMiddleman(String middleman) {
        this.middleman = middleman;
    }

    /** 
     * Get the 'Commercial' element value. Признак использования рекламных объявлений
     * 
     * @return value
     */
    public String getCommercial() {
        return commercial;
    }

    /** 
     * Set the 'Commercial' element value. Признак использования рекламных объявлений
     * 
     * @param commercial
     */
    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    /** 
     * Get the 'Exchange' element value. Признак поиска продавца на бирже
     * 
     * @return value
     */
    public String getExchange() {
        return exchange;
    }

    /** 
     * Set the 'Exchange' element value. Признак поиска продавца на бирже
     * 
     * @param exchange
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /** 
     * Get the 'Otherwise' element value. Признак поиска продавца иным образом
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. Признак поиска продавца иным образом
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'CommentsOtherwise' element value. Иным образом (указать способ)
     * 
     * @return value
     */
    public String getCommentsOtherwise() {
        return commentsOtherwise;
    }

    /** 
     * Set the 'CommentsOtherwise' element value. Иным образом (указать способ)
     * 
     * @param commentsOtherwise
     */
    public void setCommentsOtherwise(String commentsOtherwise) {
        this.commentsOtherwise = commentsOtherwise;
    }
}
