
package ru.acs.fts.schemas.album.do3report;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private DO3GoodInputType input;
    private List<DO3GoodOutputType> outputList = new ArrayList<DO3GoodOutputType>();

    /** 
     * Get the 'Input' element value. ������
     * 
     * @return value
     */
    public DO3GoodInputType getInput() {
        return input;
    }

    /** 
     * Set the 'Input' element value. ������
     * 
     * @param input
     */
    public void setInput(DO3GoodInputType input) {
        this.input = input;
    }

    /** 
     * Get the list of 'Output' element items. ������
     * 
     * @return list
     */
    public List<DO3GoodOutputType> getOutputList() {
        return outputList;
    }

    /** 
     * Set the list of 'Output' element items. ������
     * 
     * @param list
     */
    public void setOutputList(List<DO3GoodOutputType> list) {
        outputList = list;
    }
}
