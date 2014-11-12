
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Взаимосвязь между покупателем и продавцом. гр.7
 */
public class DTSBuyerSellerDependenceType
{
    private String column7A;
    private String column7B;
    private String column7C;
    private List<String> column7CDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'Column7A' element value. Графа 7а
     * 
     * @return value
     */
    public String getColumn7A() {
        return column7A;
    }

    /** 
     * Set the 'Column7A' element value. Графа 7а
     * 
     * @param column7A
     */
    public void setColumn7A(String column7A) {
        this.column7A = column7A;
    }

    /** 
     * Get the 'Column7B' element value. Графа 7б
     * 
     * @return value
     */
    public String getColumn7B() {
        return column7B;
    }

    /** 
     * Set the 'Column7B' element value. Графа 7б
     * 
     * @param column7B
     */
    public void setColumn7B(String column7B) {
        this.column7B = column7B;
    }

    /** 
     * Get the 'Column7C' element value. Графа 7в
     * 
     * @return value
     */
    public String getColumn7C() {
        return column7C;
    }

    /** 
     * Set the 'Column7C' element value. Графа 7в
     * 
     * @param column7C
     */
    public void setColumn7C(String column7C) {
        this.column7C = column7C;
    }

    /** 
     * Get the list of 'Column7CDescription' element items. Подробности в случае, если стоимость сделки близка к возможным проверочным величинам. гр. 7в - подробности
     * 
     * @return list
     */
    public List<String> getColumn7CDescriptionList() {
        return column7CDescriptionList;
    }

    /** 
     * Set the list of 'Column7CDescription' element items. Подробности в случае, если стоимость сделки близка к возможным проверочным величинам. гр. 7в - подробности
     * 
     * @param list
     */
    public void setColumn7CDescriptionList(List<String> list) {
        column7CDescriptionList = list;
    }
}
