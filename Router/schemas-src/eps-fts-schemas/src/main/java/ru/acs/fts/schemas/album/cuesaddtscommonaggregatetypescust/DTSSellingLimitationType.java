
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ограничения на пользование товарами  и обязательства при продаже товаров. гр.8
 */
public class DTSSellingLimitationType
{
    private String column8A;
    private String column8B;
    private List<String> limitationDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'Column8A' element value. Графа 8а
     * 
     * @return value
     */
    public String getColumn8A() {
        return column8A;
    }

    /** 
     * Set the 'Column8A' element value. Графа 8а
     * 
     * @param column8A
     */
    public void setColumn8A(String column8A) {
        this.column8A = column8A;
    }

    /** 
     * Get the 'Column8B' element value. Графа 8б
     * 
     * @return value
     */
    public String getColumn8B() {
        return column8B;
    }

    /** 
     * Set the 'Column8B' element value. Графа 8б
     * 
     * @param column8B
     */
    public void setColumn8B(String column8B) {
        this.column8B = column8B;
    }

    /** 
     * Get the list of 'limitationDescription' element items. Подробности. Вид и содержание обязательств. Расчет стоимости
     * 
     * @return list
     */
    public List<String> getLimitationDescriptionList() {
        return limitationDescriptionList;
    }

    /** 
     * Set the list of 'limitationDescription' element items. Подробности. Вид и содержание обязательств. Расчет стоимости
     * 
     * @param list
     */
    public void setLimitationDescriptionList(List<String> list) {
        limitationDescriptionList = list;
    }
}
