
package ru.acs.fts.schemas.album.correctiondecision;

/** 
 * Дела об административных правонарушениях, уголовные дела
 */
public class DecisionArticlesType
{
    private String decisionArticleNumber;
    private String articlePartNumber;

    /** 
     * Get the 'DecisionArticleNumber' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России), Уголовного Кодекса Российской Федерации (УК России)
     * 
     * @return value
     */
    public String getDecisionArticleNumber() {
        return decisionArticleNumber;
    }

    /** 
     * Set the 'DecisionArticleNumber' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России), Уголовного Кодекса Российской Федерации (УК России)
     * 
     * @param decisionArticleNumber
     */
    public void setDecisionArticleNumber(String decisionArticleNumber) {
        this.decisionArticleNumber = decisionArticleNumber;
    }

    /** 
     * Get the 'ArticlePartNumber' element value. Номер части статьи КоАП России, УК России
     * 
     * @return value
     */
    public String getArticlePartNumber() {
        return articlePartNumber;
    }

    /** 
     * Set the 'ArticlePartNumber' element value. Номер части статьи КоАП России, УК России
     * 
     * @param articlePartNumber
     */
    public void setArticlePartNumber(String articlePartNumber) {
        this.articlePartNumber = articlePartNumber;
    }
}
