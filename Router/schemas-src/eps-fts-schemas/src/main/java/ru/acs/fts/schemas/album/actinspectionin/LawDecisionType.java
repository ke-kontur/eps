
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * ������ ���� �� ������� �������� �������� ��.  ����� ������������ ����� ���� ��������, ����������� �� ���� �������
 */
public class LawDecisionType
{
    private String articleNumber;
    private String articlePartNumber;
    private String decisionDesc;
    private String recordNumber;
    private String priznInfo;

    /** 
     * Get the 'ArticleNumber' element value. ����� ������ ���� ��, ����������������� ��������������� �� ���������� ����������������� �������������� (��� �������� PriznInfo = "false")
     * 
     * @return value
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /** 
     * Set the 'ArticleNumber' element value. ����� ������ ���� ��, ����������������� ��������������� �� ���������� ����������������� �������������� (��� �������� PriznInfo = "false")
     * 
     * @param articleNumber
     */
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    /** 
     * Get the 'ArticlePartNumber' element value. ����� ����� ������ ���� ��  (��� �������� PriznInfo = "false")
     * 
     * @return value
     */
    public String getArticlePartNumber() {
        return articlePartNumber;
    }

    /** 
     * Set the 'ArticlePartNumber' element value. ����� ����� ������ ���� ��  (��� �������� PriznInfo = "false")
     * 
     * @param articlePartNumber
     */
    public void setArticlePartNumber(String articlePartNumber) {
        this.articlePartNumber = articlePartNumber;
    }

    /** 
     * Get the 'DecisionDesc' element value. ���������� �� �������� �������� (PriznInfo = "true"). ����� ������������ ����� ���� ��������, ����������� �� ���� ������� (PriznInfo = "false")
     * 
     * @return value
     */
    public String getDecisionDesc() {
        return decisionDesc;
    }

    /** 
     * Set the 'DecisionDesc' element value. ���������� �� �������� �������� (PriznInfo = "true"). ����� ������������ ����� ���� ��������, ����������� �� ���� ������� (PriznInfo = "false")
     * 
     * @param decisionDesc
     */
    public void setDecisionDesc(String decisionDesc) {
        this.decisionDesc = decisionDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'PriznInfo' element value. ������� ����������: false - ���������� �� �������� ��������; true - ����� ������������ ����� ���� ��������, ����������� �� ���� �������
     * 
     * @return value
     */
    public String getPriznInfo() {
        return priznInfo;
    }

    /** 
     * Set the 'PriznInfo' element value. ������� ����������: false - ���������� �� �������� ��������; true - ����� ������������ ����� ���� ��������, ����������� �� ���� �������
     * 
     * @param priznInfo
     */
    public void setPriznInfo(String priznInfo) {
        this.priznInfo = priznInfo;
    }
}
