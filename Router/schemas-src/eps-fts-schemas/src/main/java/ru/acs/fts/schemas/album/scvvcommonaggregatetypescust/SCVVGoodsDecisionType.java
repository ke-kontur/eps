
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * ����. �������� � ������  � ����������� �������������
 */
public class SCVVGoodsDecisionType extends SCVVGoodsType
{
    private String goodsDiscrepancyIndicator;

    /** 
     * Get the 'GoodsDiscrepancyIndicator' element value. ��� ��������� ����������� (00- ����������� �� ��������; 11-����� � ��������� ���������� ������� �� ������ � ���; 12 - ��� ������ �� ����� �� ��������� � ��������� � ���; 13 - �������� ��� ������ �� ���; 14 - �������� ��� ����� �� ���; 15 - ��������� ���������� ������ � ���; 16 - ���������� ��������� ������ �� ��������� � ���������� � ���)
     * 
     * @return value
     */
    public String getGoodsDiscrepancyIndicator() {
        return goodsDiscrepancyIndicator;
    }

    /** 
     * Set the 'GoodsDiscrepancyIndicator' element value. ��� ��������� ����������� (00- ����������� �� ��������; 11-����� � ��������� ���������� ������� �� ������ � ���; 12 - ��� ������ �� ����� �� ��������� � ��������� � ���; 13 - �������� ��� ������ �� ���; 14 - �������� ��� ����� �� ���; 15 - ��������� ���������� ������ � ���; 16 - ���������� ��������� ������ �� ��������� � ���������� � ���)
     * 
     * @param goodsDiscrepancyIndicator
     */
    public void setGoodsDiscrepancyIndicator(String goodsDiscrepancyIndicator) {
        this.goodsDiscrepancyIndicator = goodsDiscrepancyIndicator;
    }
}
