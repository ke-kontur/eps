
package ru.acs.fts.schemas.album.packinglist;

/** 
 * �������� �� �������� �������. 
 */
public class PackingInfoType
{
    private String packingCode;
    private String pakingQuantity;
    private String packingDescription;

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
     * Get the 'PackingDescription' element value. �������� ��������.
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. �������� ��������.
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }
}
