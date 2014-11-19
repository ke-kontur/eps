
package ru.acs.fts.schemas.album.sem_oisresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.OISsType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * Информация о товарах. В случае отсутствия информация по товарам не найдена
 */
public class ResultOISGoodsType extends ResultGoodsType
{
    private String messageDoc;
    private String messageIP;
    private String messageTov;
    private List<OISsType> OISList = new ArrayList<OISsType>();

    /** 
     * Get the 'MessageDoc' element value. Сообщение о наличии/ отсутствии кодов разрешительных документов
     * 
     * @return value
     */
    public String getMessageDoc() {
        return messageDoc;
    }

    /** 
     * Set the 'MessageDoc' element value. Сообщение о наличии/ отсутствии кодов разрешительных документов
     * 
     * @param messageDoc
     */
    public void setMessageDoc(String messageDoc) {
        this.messageDoc = messageDoc;
    }

    /** 
     * Get the 'MessageIP' element value. Сообщение о наличии/ отсутствии буквы "И" при наличии декларируемого товара в Реестре ОИС
     * 
     * @return value
     */
    public String getMessageIP() {
        return messageIP;
    }

    /** 
     * Set the 'MessageIP' element value. Сообщение о наличии/ отсутствии буквы "И" при наличии декларируемого товара в Реестре ОИС
     * 
     * @param messageIP
     */
    public void setMessageIP(String messageIP) {
        this.messageIP = messageIP;
    }

    /** 
     * Get the 'MessageTov' element value. Сообщение о совпадении заявленных сведений о товаре с данными из Реестра ОИС, но с отличием в наименовании товара -&gt;с пометкой о том, что товары для данного товарного знака в таможенном Реестре заявлены другие.
     * 
     * @return value
     */
    public String getMessageTov() {
        return messageTov;
    }

    /** 
     * Set the 'MessageTov' element value. Сообщение о совпадении заявленных сведений о товаре с данными из Реестра ОИС, но с отличием в наименовании товара -&gt;с пометкой о том, что товары для данного товарного знака в таможенном Реестре заявлены другие.
     * 
     * @param messageTov
     */
    public void setMessageTov(String messageTov) {
        this.messageTov = messageTov;
    }

    /** 
     * Get the list of 'OISs' element items. Набор ОИС
     * 
     * @return list
     */
    public List<OISsType> getOISList() {
        return OISList;
    }

    /** 
     * Set the list of 'OISs' element items. Набор ОИС
     * 
     * @param list
     */
    public void setOISList(List<OISsType> list) {
        OISList = list;
    }
}
