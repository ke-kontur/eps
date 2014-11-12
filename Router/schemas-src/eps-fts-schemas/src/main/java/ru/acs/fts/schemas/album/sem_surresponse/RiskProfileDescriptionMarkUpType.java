
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.MarkUpType;

/** 
 * Размеченное текстовое описание неформализованных индикаторов профиля риска
 */
public class RiskProfileDescriptionMarkUpType
{
    private String code;
    private List<MarkUpType> markupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'Code' element value. Код неформализованного индикатора
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код неформализованного индикатора
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the list of 'Markup' element items. Текстовое описание
     * 
     * @return list
     */
    public List<MarkUpType> getMarkupList() {
        return markupList;
    }

    /** 
     * Set the list of 'Markup' element items. Текстовое описание
     * 
     * @param list
     */
    public void setMarkupList(List<MarkUpType> list) {
        markupList = list;
    }
}
