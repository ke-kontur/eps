
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Был выбран именно этот продавец, поскольку
 */
public class ChoiceSellerType
{
    private String producer;
    private String officialRepresentativeProducer;
    private String guarantee;
    private String profitableTerm;
    private String commentsProfitableTerm;
    private String otherwise;
    private String otherwiseComments;

    /** 
     * Get the 'Producer' element value. Признак того, что продавец является производителем товаров
     * 
     * @return value
     */
    public String getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. Признак того, что продавец является производителем товаров
     * 
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'OfficialRepresentativeProducer' element value. Признак того, что продавец является официальным представителем производителя
     * 
     * @return value
     */
    public String getOfficialRepresentativeProducer() {
        return officialRepresentativeProducer;
    }

    /** 
     * Set the 'OfficialRepresentativeProducer' element value. Признак того, что продавец является официальным представителем производителя
     * 
     * @param officialRepresentativeProducer
     */
    public void setOfficialRepresentativeProducer(
            String officialRepresentativeProducer) {
        this.officialRepresentativeProducer = officialRepresentativeProducer;
    }

    /** 
     * Get the 'Guarantee' element value. Признак того, что продавец предоставляет гарантийное обслуживание товаров
     * 
     * @return value
     */
    public String getGuarantee() {
        return guarantee;
    }

    /** 
     * Set the 'Guarantee' element value. Признак того, что продавец предоставляет гарантийное обслуживание товаров
     * 
     * @param guarantee
     */
    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    /** 
     * Get the 'ProfitableTerm' element value. Признак того, что были предложены более выгодные условия покупки товаров, сравнительно с другими участниками рынка
     * 
     * @return value
     */
    public String getProfitableTerm() {
        return profitableTerm;
    }

    /** 
     * Set the 'ProfitableTerm' element value. Признак того, что были предложены более выгодные условия покупки товаров, сравнительно с другими участниками рынка
     * 
     * @param profitableTerm
     */
    public void setProfitableTerm(String profitableTerm) {
        this.profitableTerm = profitableTerm;
    }

    /** 
     * Get the 'CommentsProfitableTerm' element value. Были предложены более выгодные условия покупки товаров, сравнительно с другими участниками рынка.(указать подробности)
     * 
     * @return value
     */
    public String getCommentsProfitableTerm() {
        return commentsProfitableTerm;
    }

    /** 
     * Set the 'CommentsProfitableTerm' element value. Были предложены более выгодные условия покупки товаров, сравнительно с другими участниками рынка.(указать подробности)
     * 
     * @param commentsProfitableTerm
     */
    public void setCommentsProfitableTerm(String commentsProfitableTerm) {
        this.commentsProfitableTerm = commentsProfitableTerm;
    }

    /** 
     * Get the 'Otherwise' element value. Признак выбора продавца по иным причинам
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. Признак выбора продавца по иным причинам
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'OtherwiseComments' element value. Иные причины (указать)
     * 
     * @return value
     */
    public String getOtherwiseComments() {
        return otherwiseComments;
    }

    /** 
     * Set the 'OtherwiseComments' element value. Иные причины (указать)
     * 
     * @param otherwiseComments
     */
    public void setOtherwiseComments(String otherwiseComments) {
        this.otherwiseComments = otherwiseComments;
    }
}
