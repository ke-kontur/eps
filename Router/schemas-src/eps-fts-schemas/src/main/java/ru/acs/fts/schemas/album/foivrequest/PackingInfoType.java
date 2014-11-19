
package ru.acs.fts.schemas.album.foivrequest;

/** 
 * �������� �� �������� �������
 */
public class PackingInfoType
{
    private String UUID;
    private String packingCode;
    private String pakingQuantity;

    /** 
     * Get the 'UUID' element value. ������������� ��������
     * 
     * @return value
     */
    public String getUUID() {
        return UUID;
    }

    /** 
     * Set the 'UUID' element value. ������������� ��������
     * 
     * @param UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

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
}
