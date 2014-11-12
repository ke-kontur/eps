
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ��� ������ ������ ���� ��������, ���������
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
     * Get the 'Producer' element value. ������� ����, ��� �������� �������� �������������� �������
     * 
     * @return value
     */
    public String getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. ������� ����, ��� �������� �������� �������������� �������
     * 
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'OfficialRepresentativeProducer' element value. ������� ����, ��� �������� �������� ����������� �������������� �������������
     * 
     * @return value
     */
    public String getOfficialRepresentativeProducer() {
        return officialRepresentativeProducer;
    }

    /** 
     * Set the 'OfficialRepresentativeProducer' element value. ������� ����, ��� �������� �������� ����������� �������������� �������������
     * 
     * @param officialRepresentativeProducer
     */
    public void setOfficialRepresentativeProducer(
            String officialRepresentativeProducer) {
        this.officialRepresentativeProducer = officialRepresentativeProducer;
    }

    /** 
     * Get the 'Guarantee' element value. ������� ����, ��� �������� ������������� ����������� ������������ �������
     * 
     * @return value
     */
    public String getGuarantee() {
        return guarantee;
    }

    /** 
     * Set the 'Guarantee' element value. ������� ����, ��� �������� ������������� ����������� ������������ �������
     * 
     * @param guarantee
     */
    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    /** 
     * Get the 'ProfitableTerm' element value. ������� ����, ��� ���� ���������� ����� �������� ������� ������� �������, ������������ � ������� ����������� �����
     * 
     * @return value
     */
    public String getProfitableTerm() {
        return profitableTerm;
    }

    /** 
     * Set the 'ProfitableTerm' element value. ������� ����, ��� ���� ���������� ����� �������� ������� ������� �������, ������������ � ������� ����������� �����
     * 
     * @param profitableTerm
     */
    public void setProfitableTerm(String profitableTerm) {
        this.profitableTerm = profitableTerm;
    }

    /** 
     * Get the 'CommentsProfitableTerm' element value. ���� ���������� ����� �������� ������� ������� �������, ������������ � ������� ����������� �����.(������� �����������)
     * 
     * @return value
     */
    public String getCommentsProfitableTerm() {
        return commentsProfitableTerm;
    }

    /** 
     * Set the 'CommentsProfitableTerm' element value. ���� ���������� ����� �������� ������� ������� �������, ������������ � ������� ����������� �����.(������� �����������)
     * 
     * @param commentsProfitableTerm
     */
    public void setCommentsProfitableTerm(String commentsProfitableTerm) {
        this.commentsProfitableTerm = commentsProfitableTerm;
    }

    /** 
     * Get the 'Otherwise' element value. ������� ������ �������� �� ���� ��������
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. ������� ������ �������� �� ���� ��������
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'OtherwiseComments' element value. ���� ������� (�������)
     * 
     * @return value
     */
    public String getOtherwiseComments() {
        return otherwiseComments;
    }

    /** 
     * Set the 'OtherwiseComments' element value. ���� ������� (�������)
     * 
     * @param otherwiseComments
     */
    public void setOtherwiseComments(String otherwiseComments) {
        this.otherwiseComments = otherwiseComments;
    }
}
