
package ru.acs.fts.schemas.album.sem_ktresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.KTsType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * Информация о товарах. В случае отсутствия информация по товарам не найдена
 */
public class ResultKTGoodsType extends ResultGoodsType
{
    private String messageDoc;
    private List<KTsType> KTList = new ArrayList<KTsType>();

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
     * Get the list of 'KTs' element items. Категории товаров, включенных во внутрисистемный список товаров, запрещенных или ограниченных к перемещению через таможенную границу РФ
     * 
     * @return list
     */
    public List<KTsType> getKTList() {
        return KTList;
    }

    /** 
     * Set the list of 'KTs' element items. Категории товаров, включенных во внутрисистемный список товаров, запрещенных или ограниченных к перемещению через таможенную границу РФ
     * 
     * @param list
     */
    public void setKTList(List<KTsType> list) {
        KTList = list;
    }
}
