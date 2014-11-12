
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� �������������� �������� � ����������
 */
public class HistoryCooperationType
{
    private String additionalContract;
    private String cooperationEarly;
    private String constantPartner;
    private String putInformationCost;
    private String commentsPutInformationCos;
    private KindCooperationType kindCooperation;
    private SearchSellerType searchSeller;
    private ChoiceSellerType choiceSeller;

    /** 
     * Get the 'AdditionalContract' element value. ������� ������� � ���������� (��. ����� 1 ���-1) ����� ��������� (��. ����� 2 ���-1) �������������� (�������� �� ��������� ������ � ������������� ���� ������) ������������
     * 
     * @return value
     */
    public String getAdditionalContract() {
        return additionalContract;
    }

    /** 
     * Set the 'AdditionalContract' element value. ������� ������� � ���������� (��. ����� 1 ���-1) ����� ��������� (��. ����� 2 ���-1) �������������� (�������� �� ��������� ������ � ������������� ���� ������) ������������
     * 
     * @param additionalContract
     */
    public void setAdditionalContract(String additionalContract) {
        this.additionalContract = additionalContract;
    }

    /** 
     * Get the 'CooperationEarly' element value. ������� ������������� ����� �������������� ����� ��������� � �����������
     * 
     * @return value
     */
    public String getCooperationEarly() {
        return cooperationEarly;
    }

    /** 
     * Set the 'CooperationEarly' element value. ������� ������������� ����� �������������� ����� ��������� � �����������
     * 
     * @param cooperationEarly
     */
    public void setCooperationEarly(String cooperationEarly) {
        this.cooperationEarly = cooperationEarly;
    }

    /** 
     * Get the 'ConstantPartner' element value. ������� ����, ��� ���������� � �������� �������� ����������� ����������
     * 
     * @return value
     */
    public String getConstantPartner() {
        return constantPartner;
    }

    /** 
     * Set the 'ConstantPartner' element value. ������� ����, ��� ���������� � �������� �������� ����������� ����������
     * 
     * @param constantPartner
     */
    public void setConstantPartner(String constantPartner) {
        this.constantPartner = constantPartner;
    }

    /** 
     * Get the 'PutInformationCost' element value. ������� �������� �������� ������������ ������ � �������� �� ������������ (������������) ������� � (���) �������� �� �� ������� �� ������� � ���������� ���������
     * 
     * @return value
     */
    public String getPutInformationCost() {
        return putInformationCost;
    }

    /** 
     * Set the 'PutInformationCost' element value. ������� �������� �������� ������������ ������ � �������� �� ������������ (������������) ������� � (���) �������� �� �� ������� �� ������� � ���������� ���������
     * 
     * @param putInformationCost
     */
    public void setPutInformationCost(String putInformationCost) {
        this.putInformationCost = putInformationCost;
    }

    /** 
     * Get the 'CommentsPutInformationCos' element value. ������ � �������� �� ������������ (������������) ������� � (���) �������� �� �� ������� �� ������� � ���������� ���������
     * 
     * @return value
     */
    public String getCommentsPutInformationCos() {
        return commentsPutInformationCos;
    }

    /** 
     * Set the 'CommentsPutInformationCos' element value. ������ � �������� �� ������������ (������������) ������� � (���) �������� �� �� ������� �� ������� � ���������� ���������
     * 
     * @param commentsPutInformationCos
     */
    public void setCommentsPutInformationCos(String commentsPutInformationCos) {
        this.commentsPutInformationCos = commentsPutInformationCos;
    }

    /** 
     * Get the 'KindCooperation' element value. ��� ��������������
     * 
     * @return value
     */
    public KindCooperationType getKindCooperation() {
        return kindCooperation;
    }

    /** 
     * Set the 'KindCooperation' element value. ��� ��������������
     * 
     * @param kindCooperation
     */
    public void setKindCooperation(KindCooperationType kindCooperation) {
        this.kindCooperation = kindCooperation;
    }

    /** 
     * Get the 'SearchSeller' element value. ����� �������� ��� ������� ������� ������ ��� ����� �� ������ �������������� �������������
     * 
     * @return value
     */
    public SearchSellerType getSearchSeller() {
        return searchSeller;
    }

    /** 
     * Set the 'SearchSeller' element value. ����� �������� ��� ������� ������� ������ ��� ����� �� ������ �������������� �������������
     * 
     * @param searchSeller
     */
    public void setSearchSeller(SearchSellerType searchSeller) {
        this.searchSeller = searchSeller;
    }

    /** 
     * Get the 'ChoiceSeller' element value. ��� ������ ������ ���� ��������, ���������
     * 
     * @return value
     */
    public ChoiceSellerType getChoiceSeller() {
        return choiceSeller;
    }

    /** 
     * Set the 'ChoiceSeller' element value. ��� ������ ������ ���� ��������, ���������
     * 
     * @param choiceSeller
     */
    public void setChoiceSeller(ChoiceSellerType choiceSeller) {
        this.choiceSeller = choiceSeller;
    }
}
