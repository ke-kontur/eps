
package ru.acs.fts.schemas.album.addinfoforeigntradecontract;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContractListType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<ESADContractListType> contractList = new ArrayList<ESADContractListType>();

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ��������������  ������ / ����� ������ �� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ��������������  ������ / ����� ������ �� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'ContractList' element items. �������� �� �������������� ����������. 
     * 
     * @return list
     */
    public List<ESADContractListType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'ContractList' element items. �������� �� �������������� ����������. 
     * 
     * @param list
     */
    public void setContractList(List<ESADContractListType> list) {
        contractList = list;
    }
}
