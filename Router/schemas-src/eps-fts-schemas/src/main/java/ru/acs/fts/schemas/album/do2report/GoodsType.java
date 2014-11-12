
package ru.acs.fts.schemas.album.do2report;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private List<DO2GoodInputType> inputList = new ArrayList<DO2GoodInputType>();
    private DO2GoodOutputType output;
    private DO2GoodResultType result;

    /** 
     * Get the list of 'Input' element items. ������.                         �������������� �������� (���, ���������, ���.�������) ����������� �� ������ ��1 � ������ ������ �� �������������� ������� ��2
     * 
     * @return list
     */
    public List<DO2GoodInputType> getInputList() {
        return inputList;
    }

    /** 
     * Set the list of 'Input' element items. ������.                         �������������� �������� (���, ���������, ���.�������) ����������� �� ������ ��1 � ������ ������ �� �������������� ������� ��2
     * 
     * @param list
     */
    public void setInputList(List<DO2GoodInputType> list) {
        inputList = list;
    }

    /** 
     * Get the 'Output' element value. ������
     * 
     * @return value
     */
    public DO2GoodOutputType getOutput() {
        return output;
    }

    /** 
     * Set the 'Output' element value. ������
     * 
     * @param output
     */
    public void setOutput(DO2GoodOutputType output) {
        this.output = output;
    }

    /** 
     * Get the 'Result' element value. �������
     * 
     * @return value
     */
    public DO2GoodResultType getResult() {
        return result;
    }

    /** 
     * Set the 'Result' element value. �������
     * 
     * @param result
     */
    public void setResult(DO2GoodResultType result) {
        this.result = result;
    }
}
