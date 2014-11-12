
package ru.acs.fts.schemas.album.reqadditionaldocuments;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительные документы
 */
public class AddDocumtentType
{
    private String position;
    private List<String> descriptionList = new ArrayList<String>();
    private String kindDocuments;
    private String codeKindDocuments;
    private List<String> notationList = new ArrayList<String>();

    /** 
     * Get the 'Position' element value. Порядковый номер
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'Description' element items. Описание
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. Описание
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'KindDocuments' element value. Вид документа
     * 
     * @return value
     */
    public String getKindDocuments() {
        return kindDocuments;
    }

    /** 
     * Set the 'KindDocuments' element value. Вид документа
     * 
     * @param kindDocuments
     */
    public void setKindDocuments(String kindDocuments) {
        this.kindDocuments = kindDocuments;
    }

    /** 
     * Get the 'CodeKindDocuments' element value. Код вида документа
     * 
     * @return value
     */
    public String getCodeKindDocuments() {
        return codeKindDocuments;
    }

    /** 
     * Set the 'CodeKindDocuments' element value. Код вида документа
     * 
     * @param codeKindDocuments
     */
    public void setCodeKindDocuments(String codeKindDocuments) {
        this.codeKindDocuments = codeKindDocuments;
    }

    /** 
     * Get the list of 'Notation' element items. Примечание
     * 
     * @return list
     */
    public List<String> getNotationList() {
        return notationList;
    }

    /** 
     * Set the list of 'Notation' element items. Примечание
     * 
     * @param list
     */
    public void setNotationList(List<String> list) {
        notationList = list;
    }
}
