
package ru.acs.fts.schemas.album.reqadditionaldocuments;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������������� ���������
 */
public class AddDocumtentType
{
    private String position;
    private List<String> descriptionList = new ArrayList<String>();
    private String kindDocuments;
    private String codeKindDocuments;
    private List<String> notationList = new ArrayList<String>();

    /** 
     * Get the 'Position' element value. ���������� �����
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� �����
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'Description' element items. ��������
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. ��������
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'KindDocuments' element value. ��� ���������
     * 
     * @return value
     */
    public String getKindDocuments() {
        return kindDocuments;
    }

    /** 
     * Set the 'KindDocuments' element value. ��� ���������
     * 
     * @param kindDocuments
     */
    public void setKindDocuments(String kindDocuments) {
        this.kindDocuments = kindDocuments;
    }

    /** 
     * Get the 'CodeKindDocuments' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getCodeKindDocuments() {
        return codeKindDocuments;
    }

    /** 
     * Set the 'CodeKindDocuments' element value. ��� ���� ���������
     * 
     * @param codeKindDocuments
     */
    public void setCodeKindDocuments(String codeKindDocuments) {
        this.codeKindDocuments = codeKindDocuments;
    }

    /** 
     * Get the list of 'Notation' element items. ����������
     * 
     * @return list
     */
    public List<String> getNotationList() {
        return notationList;
    }

    /** 
     * Set the list of 'Notation' element items. ����������
     * 
     * @param list
     */
    public void setNotationList(List<String> list) {
        notationList = list;
    }
}
