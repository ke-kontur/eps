
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����� ������
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
     * Get the 'Sample' element value. ������� ������ ������ �� �������
     * 
     * @return value
     */
    public String getSample() {
        return sample;
    }

    /** 
     * Set the 'Sample' element value. ������� ������ ������ �� �������
     * 
     * @param sample
     */
    public void setSample(String sample) {
        this.sample = sample;
    }

    /** 
     * Get the 'Description' element value. ������� ������ ������ �� ��������
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ������� ������ ������ �� ��������
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'Standard' element value. ������� ������ ������ � ������������ � ������������ �����������
     * 
     * @return value
     */
    public String getStandard() {
        return standard;
    }

    /** 
     * Set the 'Standard' element value. ������� ������ ������ � ������������ � ������������ �����������
     * 
     * @param standard
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /** 
     * Get the 'CommentsStandard' element value. � ������������ � ������������ ����������� (������� ��������, ��� ������, ���������������� ��� ���������� ���������)
     * 
     * @return value
     */
    public String getCommentsStandard() {
        return commentsStandard;
    }

    /** 
     * Set the 'CommentsStandard' element value. � ������������ � ������������ ����������� (������� ��������, ��� ������, ���������������� ��� ���������� ���������)
     * 
     * @param commentsStandard
     */
    public void setCommentsStandard(String commentsStandard) {
        this.commentsStandard = commentsStandard;
    }

    /** 
     * Get the 'Otherwise' element value. ���� �������
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. ���� �������
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'OtherwiseComments' element value. ���� ������� (������� ������)
     * 
     * @return value
     */
    public String getOtherwiseComments() {
        return otherwiseComments;
    }

    /** 
     * Set the 'OtherwiseComments' element value. ���� ������� (������� ������)
     * 
     * @param otherwiseComments
     */
    public void setOtherwiseComments(String otherwiseComments) {
        this.otherwiseComments = otherwiseComments;
    }
}
