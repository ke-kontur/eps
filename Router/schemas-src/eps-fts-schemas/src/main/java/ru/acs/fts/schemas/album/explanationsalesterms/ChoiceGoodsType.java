
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Выбор товара
 */
public class ChoiceGoodsType
{
    private String sample;
    private String description;
    private String standard;
    private String commentsStandard;
    private String otherwise;
    private String otherwiseComments;

    /** 
     * Get the 'Sample' element value. Признак выбора товара по образцу
     * 
     * @return value
     */
    public String getSample() {
        return sample;
    }

    /** 
     * Set the 'Sample' element value. Признак выбора товара по образцу
     * 
     * @param sample
     */
    public void setSample(String sample) {
        this.sample = sample;
    }

    /** 
     * Get the 'Description' element value. Признак выбора товара по описанию
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Признак выбора товара по описанию
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'Standard' element value. Признак выбора товара в соответствии с действующими стандартами
     * 
     * @return value
     */
    public String getStandard() {
        return standard;
    }

    /** 
     * Set the 'Standard' element value. Признак выбора товара в соответствии с действующими стандартами
     * 
     * @param standard
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /** 
     * Get the 'CommentsStandard' element value. В соответствии с действующими стандартами (указать стандарт, кем принят, регламентирующие его соблюдение документы)
     * 
     * @return value
     */
    public String getCommentsStandard() {
        return commentsStandard;
    }

    /** 
     * Set the 'CommentsStandard' element value. В соответствии с действующими стандартами (указать стандарт, кем принят, регламентирующие его соблюдение документы)
     * 
     * @param commentsStandard
     */
    public void setCommentsStandard(String commentsStandard) {
        this.commentsStandard = commentsStandard;
    }

    /** 
     * Get the 'Otherwise' element value. Иные образом
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. Иные образом
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'OtherwiseComments' element value. Иные образом (указать способ)
     * 
     * @return value
     */
    public String getOtherwiseComments() {
        return otherwiseComments;
    }

    /** 
     * Set the 'OtherwiseComments' element value. Иные образом (указать способ)
     * 
     * @param otherwiseComments
     */
    public void setOtherwiseComments(String otherwiseComments) {
        this.otherwiseComments = otherwiseComments;
    }
}
