
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Объект интеллектуальной собственности
 */
public class OISsType
{
    private String OISID;
    private String relevance;
    private String messageR;
    private List<MarkUpType> brandOwnerList = new ArrayList<MarkUpType>();
    private List<MarkUpType> OISDescriptionMarkedList = new ArrayList<MarkUpType>();
    private List<MarkUpType> tradeMarkMarkedList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'OISID' element value. Системный идентификатор ОИС
     * 
     * @return value
     */
    public String getOISID() {
        return OISID;
    }

    /** 
     * Set the 'OISID' element value. Системный идентификатор ОИС
     * 
     * @param OISID
     */
    public void setOISID(String OISID) {
        this.OISID = OISID;
    }

    /** 
     * Get the 'Relevance' element value. Степень соответствия ОИС описанию товара (оценка достоверности). Минимальное значение 1, максимальное значение не ограничено (релевантность 0 приведет к отсутствию товара в списке)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. Степень соответствия ОИС описанию товара (оценка достоверности). Минимальное значение 1, максимальное значение не ограничено (релевантность 0 приведет к отсутствию товара в списке)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the 'MessageR' element value. Сообщение о совпадении/несовпадении сведений, заявленных в 8, 9,14 гр. с данными из Реестра
     * 
     * @return value
     */
    public String getMessageR() {
        return messageR;
    }

    /** 
     * Set the 'MessageR' element value. Сообщение о совпадении/несовпадении сведений, заявленных в 8, 9,14 гр. с данными из Реестра
     * 
     * @param messageR
     */
    public void setMessageR(String messageR) {
        this.messageR = messageR;
    }

    /** 
     * Get the list of 'BrandOwner' element items. Правообладатель (собственник). Размеченный текст
     * 
     * @return list
     */
    public List<MarkUpType> getBrandOwnerList() {
        return brandOwnerList;
    }

    /** 
     * Set the list of 'BrandOwner' element items. Правообладатель (собственник). Размеченный текст
     * 
     * @param list
     */
    public void setBrandOwnerList(List<MarkUpType> list) {
        brandOwnerList = list;
    }

    /** 
     * Get the list of 'OISDescriptionMarked' element items. Размеченное текстовое описание ОИС
     * 
     * @return list
     */
    public List<MarkUpType> getOISDescriptionMarkedList() {
        return OISDescriptionMarkedList;
    }

    /** 
     * Set the list of 'OISDescriptionMarked' element items. Размеченное текстовое описание ОИС
     * 
     * @param list
     */
    public void setOISDescriptionMarkedList(List<MarkUpType> list) {
        OISDescriptionMarkedList = list;
    }

    /** 
     * Get the list of 'TradeMarkMarked' element items. Выделение по ТМ для ОИС (размеченный текст)
     * 
     * @return list
     */
    public List<MarkUpType> getTradeMarkMarkedList() {
        return tradeMarkMarkedList;
    }

    /** 
     * Set the list of 'TradeMarkMarked' element items. Выделение по ТМ для ОИС (размеченный текст)
     * 
     * @param list
     */
    public void setTradeMarkMarkedList(List<MarkUpType> list) {
        tradeMarkMarkedList = list;
    }
}
