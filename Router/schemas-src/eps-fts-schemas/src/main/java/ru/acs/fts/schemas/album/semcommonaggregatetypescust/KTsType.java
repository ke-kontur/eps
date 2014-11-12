
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Категория товаров, включенных во внутрисистемный список товаров, запрещенных или ограниченных к перемещению через таможенную границу РФ
 */
public class KTsType
{
    private String description;
    private String KTID;
    private String requisites;
    private String relevance;
    private List<MarkUpType> descriptionMarkupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'Description' element value. Текстовое описание КТ
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Текстовое описание КТ
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'KTID' element value. Системный идентификатор KT
     * 
     * @return value
     */
    public String getKTID() {
        return KTID;
    }

    /** 
     * Set the 'KTID' element value. Системный идентификатор KT
     * 
     * @param KTID
     */
    public void setKTID(String KTID) {
        this.KTID = KTID;
    }

    /** 
     * Get the 'Requisites' element value. Реквизиты пункта КТ
     * 
     * @return value
     */
    public String getRequisites() {
        return requisites;
    }

    /** 
     * Set the 'Requisites' element value. Реквизиты пункта КТ
     * 
     * @param requisites
     */
    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    /** 
     * Get the 'Relevance' element value. Степень соответствия текстового описания объекта КТ (KTID) текстовому описанию товара(GOODS_INDEX). Минимальное значение 1, максимальное значение не ограничено (релевантность 0 приведет к отсутствию товара в списке)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. Степень соответствия текстового описания объекта КТ (KTID) текстовому описанию товара(GOODS_INDEX). Минимальное значение 1, максимальное значение не ограничено (релевантность 0 приведет к отсутствию товара в списке)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the list of 'DescriptionMarkup' element items. Размеченное текстовое описание КТ
     * 
     * @return list
     */
    public List<MarkUpType> getDescriptionMarkupList() {
        return descriptionMarkupList;
    }

    /** 
     * Set the list of 'DescriptionMarkup' element items. Размеченное текстовое описание КТ
     * 
     * @param list
     */
    public void setDescriptionMarkupList(List<MarkUpType> list) {
        descriptionMarkupList = list;
    }
}
