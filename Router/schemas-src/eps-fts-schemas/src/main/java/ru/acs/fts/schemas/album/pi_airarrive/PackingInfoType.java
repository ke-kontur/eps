
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * �������� �� �������� � �������� ������
 */
public class PackingInfoType
{
    private String packingCode;
    private String packingQuantity;
    private String packingDescription;
    private String packagePartQuantity;

    /** 
     * Get the 'PackingCode' element value. ��� ���� ��������/��������� ����� ������� � ������������ � ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. ��� ���� ��������/��������� ����� ������� � ������������ � ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }

    /** 
     * Get the 'PackingQuantity' element value. ���������� �������� ����/��������
     * 
     * @return value
     */
    public String getPackingQuantity() {
        return packingQuantity;
    }

    /** 
     * Set the 'PackingQuantity' element value. ���������� �������� ����/��������
     * 
     * @param packingQuantity
     */
    public void setPackingQuantity(String packingQuantity) {
        this.packingQuantity = packingQuantity;
    }

    /** 
     * Get the 'PackingDescription' element value. �������� �������� ����/ ��������
     * 
     * @return value
     */
    public String getPackingDescription() {
        return packingDescription;
    }

    /** 
     * Set the 'PackingDescription' element value. �������� �������� ����/ ��������
     * 
     * @param packingDescription
     */
    public void setPackingDescription(String packingDescription) {
        this.packingDescription = packingDescription;
    }

    /** 
     * Get the 'PackagePartQuantity' element value. ���������� �������� ����/��������, �������� ������� �������
     * 
     * @return value
     */
    public String getPackagePartQuantity() {
        return packagePartQuantity;
    }

    /** 
     * Set the 'PackagePartQuantity' element value. ���������� �������� ����/��������, �������� ������� �������
     * 
     * @param packagePartQuantity
     */
    public void setPackagePartQuantity(String packagePartQuantity) {
        this.packagePartQuantity = packagePartQuantity;
    }
}
