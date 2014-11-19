
package ru.acs.fts.schemas.album.do2report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private List<DO2GoodInputType> inputList = new ArrayList<DO2GoodInputType>();
    private DO2GoodOutputType output;
    private DO2GoodResultType result;

    /** 
     * Get the list of 'Input' element items. Приход.                         Количественные сведения (вес, стоимость, доп.единицы) указываются по отчету ДО1 с учетом выдачи по предшествующим отчетам ДО2
     * 
     * @return list
     */
    public List<DO2GoodInputType> getInputList() {
        return inputList;
    }

    /** 
     * Set the list of 'Input' element items. Приход.                         Количественные сведения (вес, стоимость, доп.единицы) указываются по отчету ДО1 с учетом выдачи по предшествующим отчетам ДО2
     * 
     * @param list
     */
    public void setInputList(List<DO2GoodInputType> list) {
        inputList = list;
    }

    /** 
     * Get the 'Output' element value. Расход
     * 
     * @return value
     */
    public DO2GoodOutputType getOutput() {
        return output;
    }

    /** 
     * Set the 'Output' element value. Расход
     * 
     * @param output
     */
    public void setOutput(DO2GoodOutputType output) {
        this.output = output;
    }

    /** 
     * Get the 'Result' element value. Остаток
     * 
     * @return value
     */
    public DO2GoodResultType getResult() {
        return result;
    }

    /** 
     * Set the 'Result' element value. Остаток
     * 
     * @param result
     */
    public void setResult(DO2GoodResultType result) {
        this.result = result;
    }
}
