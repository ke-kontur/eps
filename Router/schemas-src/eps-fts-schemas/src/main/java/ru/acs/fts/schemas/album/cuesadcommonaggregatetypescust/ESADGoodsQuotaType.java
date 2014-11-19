
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �����
 */
public class ESADGoodsQuotaType
{
    private List<ESADProductQuantityQuotaType> ESADProductQuantityQuotaList = new ArrayList<ESADProductQuantityQuotaType>();
    private ESADCurrencyQuotaType ESADCurrencyQuota;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the list of 'ESADProductQuantityQuota' element items. �������� �� ������� �����, ���������� � ���������� ��������. ����������� � ������, ���� ����� ����������� � �������� ���������
     * 
     * @return list
     */
    public List<ESADProductQuantityQuotaType> getESADProductQuantityQuotaList() {
        return ESADProductQuantityQuotaList;
    }

    /** 
     * Set the list of 'ESADProductQuantityQuota' element items. �������� �� ������� �����, ���������� � ���������� ��������. ����������� � ������, ���� ����� ����������� � �������� ���������
     * 
     * @param list
     */
    public void setESADProductQuantityQuotaList(
            List<ESADProductQuantityQuotaType> list) {
        ESADProductQuantityQuotaList = list;
    }

    /** 
     * Get the 'ESADCurrencyQuota' element value. �������� �� ������� ����� � ����������� ���������. ����������� � ������, ���� ����� ����������� � ����������� ���������
     * 
     * @return value
     */
    public ESADCurrencyQuotaType getESADCurrencyQuota() {
        return ESADCurrencyQuota;
    }

    /** 
     * Set the 'ESADCurrencyQuota' element value. �������� �� ������� ����� � ����������� ���������. ����������� � ������, ���� ����� ����������� � ����������� ���������
     * 
     * @param ESADCurrencyQuota
     */
    public void setESADCurrencyQuota(ESADCurrencyQuotaType ESADCurrencyQuota) {
        this.ESADCurrencyQuota = ESADCurrencyQuota;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� �������������� ������ � ������� ���������, ����������� ��� �������� �����. ��� ��
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� �������������� ������ � ������� ���������, ����������� ��� �������� �����. ��� ��
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}
