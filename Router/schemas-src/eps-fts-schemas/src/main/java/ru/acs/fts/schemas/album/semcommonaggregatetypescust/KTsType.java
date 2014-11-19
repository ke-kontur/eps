
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� �������, ���������� �� ��������������� ������ �������, ����������� ��� ������������ � ����������� ����� ���������� ������� ��
 */
public class KTsType
{
    private String description;
    private String KTID;
    private String requisites;
    private String relevance;
    private List<MarkUpType> descriptionMarkupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'Description' element value. ��������� �������� ��
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ��������� �������� ��
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'KTID' element value. ��������� ������������� KT
     * 
     * @return value
     */
    public String getKTID() {
        return KTID;
    }

    /** 
     * Set the 'KTID' element value. ��������� ������������� KT
     * 
     * @param KTID
     */
    public void setKTID(String KTID) {
        this.KTID = KTID;
    }

    /** 
     * Get the 'Requisites' element value. ��������� ������ ��
     * 
     * @return value
     */
    public String getRequisites() {
        return requisites;
    }

    /** 
     * Set the 'Requisites' element value. ��������� ������ ��
     * 
     * @param requisites
     */
    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    /** 
     * Get the 'Relevance' element value. ������� ������������ ���������� �������� ������� �� (KTID) ���������� �������� ������(GOODS_INDEX). ����������� �������� 1, ������������ �������� �� ���������� (������������� 0 �������� � ���������� ������ � ������)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. ������� ������������ ���������� �������� ������� �� (KTID) ���������� �������� ������(GOODS_INDEX). ����������� �������� 1, ������������ �������� �� ���������� (������������� 0 �������� � ���������� ������ � ������)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the list of 'DescriptionMarkup' element items. ����������� ��������� �������� ��
     * 
     * @return list
     */
    public List<MarkUpType> getDescriptionMarkupList() {
        return descriptionMarkupList;
    }

    /** 
     * Set the list of 'DescriptionMarkup' element items. ����������� ��������� �������� ��
     * 
     * @param list
     */
    public void setDescriptionMarkupList(List<MarkUpType> list) {
        descriptionMarkupList = list;
    }
}
