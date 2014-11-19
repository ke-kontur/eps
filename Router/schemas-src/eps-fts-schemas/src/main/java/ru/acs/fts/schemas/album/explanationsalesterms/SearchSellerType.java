
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����� �������� ��� ������� ������� ������ ��� ����� �� ������ �������������� �������������
 */
public class SearchSellerType
{
    private String middleman;
    private String commercial;
    private String exchange;
    private String otherwise;
    private String commentsOtherwise;

    /** 
     * Get the 'Middleman' element value. ������� ������� ����������
     * 
     * @return value
     */
    public String getMiddleman() {
        return middleman;
    }

    /** 
     * Set the 'Middleman' element value. ������� ������� ����������
     * 
     * @param middleman
     */
    public void setMiddleman(String middleman) {
        this.middleman = middleman;
    }

    /** 
     * Get the 'Commercial' element value. ������� ������������� ��������� ����������
     * 
     * @return value
     */
    public String getCommercial() {
        return commercial;
    }

    /** 
     * Set the 'Commercial' element value. ������� ������������� ��������� ����������
     * 
     * @param commercial
     */
    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    /** 
     * Get the 'Exchange' element value. ������� ������ �������� �� �����
     * 
     * @return value
     */
    public String getExchange() {
        return exchange;
    }

    /** 
     * Set the 'Exchange' element value. ������� ������ �������� �� �����
     * 
     * @param exchange
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /** 
     * Get the 'Otherwise' element value. ������� ������ �������� ���� �������
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. ������� ������ �������� ���� �������
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'CommentsOtherwise' element value. ���� ������� (������� ������)
     * 
     * @return value
     */
    public String getCommentsOtherwise() {
        return commentsOtherwise;
    }

    /** 
     * Set the 'CommentsOtherwise' element value. ���� ������� (������� ������)
     * 
     * @param commentsOtherwise
     */
    public void setCommentsOtherwise(String commentsOtherwise) {
        this.commentsOtherwise = commentsOtherwise;
    }
}
