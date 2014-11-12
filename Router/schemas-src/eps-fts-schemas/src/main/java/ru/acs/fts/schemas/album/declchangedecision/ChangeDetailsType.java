
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������
 */
public class ChangeDetailsType
{
    private String goodsNumeric;
    private String GRNumber;
    private List<String> previousDataList = new ArrayList<String>();
    private List<String> correctDataList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GRNumber' element value. ����������� ����� (���������� �����)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. ����������� ����� (���������� �����)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the list of 'PreviousData' element items. ����� ��������� ��������
     * 
     * @return list
     */
    public List<String> getPreviousDataList() {
        return previousDataList;
    }

    /** 
     * Set the list of 'PreviousData' element items. ����� ��������� ��������
     * 
     * @param list
     */
    public void setPreviousDataList(List<String> list) {
        previousDataList = list;
    }

    /** 
     * Get the list of 'CorrectData' element items. ���������� � (���) ����������� ��������
     * 
     * @return list
     */
    public List<String> getCorrectDataList() {
        return correctDataList;
    }

    /** 
     * Set the list of 'CorrectData' element items. ���������� � (���) ����������� ��������
     * 
     * @param list
     */
    public void setCorrectDataList(List<String> list) {
        correctDataList = list;
    }
}
