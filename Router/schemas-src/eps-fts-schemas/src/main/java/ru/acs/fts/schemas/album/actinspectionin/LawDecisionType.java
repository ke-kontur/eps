
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * Статьи КОАП по которым выявлены признаки АП.  Общая описательная часть акта досмотра, относящаяся ко всем товарам
 */
public class LawDecisionType
{
    private String articleNumber;
    private String articlePartNumber;
    private String decisionDesc;
    private String recordNumber;
    private String priznInfo;

    /** 
     * Get the 'ArticleNumber' element value. Номер статьи КоАП РФ, предусматривающей ответственность за совершение административного правонарушения (для значения PriznInfo = "false")
     * 
     * @return value
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /** 
     * Set the 'ArticleNumber' element value. Номер статьи КоАП РФ, предусматривающей ответственность за совершение административного правонарушения (для значения PriznInfo = "false")
     * 
     * @param articleNumber
     */
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    /** 
     * Get the 'ArticlePartNumber' element value. Номер части статьи КоАП РФ  (для значения PriznInfo = "false")
     * 
     * @return value
     */
    public String getArticlePartNumber() {
        return articlePartNumber;
    }

    /** 
     * Set the 'ArticlePartNumber' element value. Номер части статьи КоАП РФ  (для значения PriznInfo = "false")
     * 
     * @param articlePartNumber
     */
    public void setArticlePartNumber(String articlePartNumber) {
        this.articlePartNumber = articlePartNumber;
    }

    /** 
     * Get the 'DecisionDesc' element value. Примечание по принятым решениям (PriznInfo = "true"). Общая описательная часть акта досмотра, относящаяся ко всем товарам (PriznInfo = "false")
     * 
     * @return value
     */
    public String getDecisionDesc() {
        return decisionDesc;
    }

    /** 
     * Set the 'DecisionDesc' element value. Примечание по принятым решениям (PriznInfo = "true"). Общая описательная часть акта досмотра, относящаяся ко всем товарам (PriznInfo = "false")
     * 
     * @param decisionDesc
     */
    public void setDecisionDesc(String decisionDesc) {
        this.decisionDesc = decisionDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'PriznInfo' element value. Признак информации: false - примечания по принятым решениям; true - общая описательная часть акта досмотра, относящаяся ко всем товарам
     * 
     * @return value
     */
    public String getPriznInfo() {
        return priznInfo;
    }

    /** 
     * Set the 'PriznInfo' element value. Признак информации: false - примечания по принятым решениям; true - общая описательная часть акта досмотра, относящаяся ко всем товарам
     * 
     * @param priznInfo
     */
    public void setPriznInfo(String priznInfo) {
        this.priznInfo = priznInfo;
    }
}
