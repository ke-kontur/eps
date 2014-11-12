
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;

/** 
 * Изменение
 */
public class ChangeDetailsType
{
    private String goodsNumeric;
    private String GRNumber;
    private List<String> previousDataList = new ArrayList<String>();
    private List<String> correctDataList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @return list
     */
    public List<String> getPreviousDataList() {
        return previousDataList;
    }

    /** 
     * Set the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @param list
     */
    public void setPreviousDataList(List<String> list) {
        previousDataList = list;
    }

    /** 
     * Get the list of 'CorrectData' element items. Измененные и (или) дополненные сведения
     * 
     * @return list
     */
    public List<String> getCorrectDataList() {
        return correctDataList;
    }

    /** 
     * Set the list of 'CorrectData' element items. Измененные и (или) дополненные сведения
     * 
     * @param list
     */
    public void setCorrectDataList(List<String> list) {
        correctDataList = list;
    }
}
