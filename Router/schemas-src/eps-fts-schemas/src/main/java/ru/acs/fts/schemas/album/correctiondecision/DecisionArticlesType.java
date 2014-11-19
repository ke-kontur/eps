
package ru.acs.fts.schemas.album.correctiondecision;

/** 
 * ���� �� ���������������� ���������������, ��������� ����
 */
public class DecisionArticlesType
{
    private String decisionArticleNumber;
    private String articlePartNumber;

    /** 
     * Get the 'DecisionArticleNumber' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������), ���������� ������� ���������� ��������� (�� ������)
     * 
     * @return value
     */
    public String getDecisionArticleNumber() {
        return decisionArticleNumber;
    }

    /** 
     * Set the 'DecisionArticleNumber' element value. ����� ������ ������� ���������� ��������� �� ���������������� ��������������� (���� ������), ���������� ������� ���������� ��������� (�� ������)
     * 
     * @param decisionArticleNumber
     */
    public void setDecisionArticleNumber(String decisionArticleNumber) {
        this.decisionArticleNumber = decisionArticleNumber;
    }

    /** 
     * Get the 'ArticlePartNumber' element value. ����� ����� ������ ���� ������, �� ������
     * 
     * @return value
     */
    public String getArticlePartNumber() {
        return articlePartNumber;
    }

    /** 
     * Set the 'ArticlePartNumber' element value. ����� ����� ������ ���� ������, �� ������
     * 
     * @param articlePartNumber
     */
    public void setArticlePartNumber(String articlePartNumber) {
        this.articlePartNumber = articlePartNumber;
    }
}
