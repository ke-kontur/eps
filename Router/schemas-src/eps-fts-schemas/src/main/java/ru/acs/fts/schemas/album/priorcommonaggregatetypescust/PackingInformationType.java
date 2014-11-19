
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * �������� �� �������� �������. ���, ����������. ����������
 */
public class PackingInformationType
{
    private String packingCode;
    private String pakingQuantity;
    private String packingMark;

    /** 
     * Get the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. ��� ���� �������� ������� � ������������ �  ��������������� ����� �����, �������� � ����������� ����������.
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PakingQuantity' element value. ���������� ��������.
     * 
     * @return value
     */
    public String getPakingQuantity() {
        return pakingQuantity;
    }

    /** 
     * Set the 'PakingQuantity' element value. ���������� ��������.
     * 
     * @param pakingQuantity
     */
    public void setPakingQuantity(String pakingQuantity) {
        this.pakingQuantity = pakingQuantity;
    }

    /** 
     * Get the 'PackingMark' element value. ���������� �������� ����
     * 
     * @return value
     */
    public String getPackingMark() {
        return packingMark;
    }

    /** 
     * Set the 'PackingMark' element value. ���������� �������� ����
     * 
     * @param packingMark
     */
    public void setPackingMark(String packingMark) {
        this.packingMark = packingMark;
    }
}
