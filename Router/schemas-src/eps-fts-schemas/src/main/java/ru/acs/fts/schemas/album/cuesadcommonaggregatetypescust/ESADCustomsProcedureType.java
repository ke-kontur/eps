
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ���������
 */
public class ESADCustomsProcedureType
{
    private String mainCustomsModeCode;
    private String precedingCustomsModeCode;
    private String goodsTransferFeature;

    /** 
     * Get the 'MainCustomsModeCode' element value. ��� ���������� ���������� ��������� � ������������ � ��������������� ����� ����������  �������� / "00" - ��� ��������
     * 
     * @return value
     */
    public String getMainCustomsModeCode() {
        return mainCustomsModeCode;
    }

    /** 
     * Set the 'MainCustomsModeCode' element value. ��� ���������� ���������� ��������� � ������������ � ��������������� ����� ����������  �������� / "00" - ��� ��������
     * 
     * @param mainCustomsModeCode
     */
    public void setMainCustomsModeCode(String mainCustomsModeCode) {
        this.mainCustomsModeCode = mainCustomsModeCode;
    }

    /** 
     * Get the 'PrecedingCustomsModeCode' element value. ��� �������������� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� / "00" - ��� ��������
     * 
     * @return value
     */
    public String getPrecedingCustomsModeCode() {
        return precedingCustomsModeCode;
    }

    /** 
     * Set the 'PrecedingCustomsModeCode' element value. ��� �������������� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� / "00" - ��� ��������
     * 
     * @param precedingCustomsModeCode
     */
    public void setPrecedingCustomsModeCode(String precedingCustomsModeCode) {
        this.precedingCustomsModeCode = precedingCustomsModeCode;
    }

    /** 
     * Get the 'GoodsTransferFeature' element value. ����������� ����������� ������� � ������������ � ��������������� ������������ ����������� �������
     * 
     * @return value
     */
    public String getGoodsTransferFeature() {
        return goodsTransferFeature;
    }

    /** 
     * Set the 'GoodsTransferFeature' element value. ����������� ����������� ������� � ������������ � ��������������� ������������ ����������� �������
     * 
     * @param goodsTransferFeature
     */
    public void setGoodsTransferFeature(String goodsTransferFeature) {
        this.goodsTransferFeature = goodsTransferFeature;
    }
}
