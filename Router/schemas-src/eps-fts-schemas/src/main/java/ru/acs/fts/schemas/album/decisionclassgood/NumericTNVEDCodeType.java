
package ru.acs.fts.schemas.album.decisionclassgood;

/** 
 * �������� � ������ ������ �� �� � ���������� ���� ������ �� �� ��� ��
 */
public class NumericTNVEDCodeType
{
    private String TNVEDCode;
    private String goodsNumeric;

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ��� ��, ���������� � ��
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ��� ��, ���������� � ��
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }
}
