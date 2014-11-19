
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;

/** 
 * �������� � ������
 */
public class GoodsInfoType extends GoodsBaseType
{
    private String nameENG;
    private String productGuid;
    private String UUID;
    private QuantityType quantity;
    private PackingInfoType packingInfo;

    /** 
     * Get the 'NameENG' element value. ������������ ������ �� ���������� �����
     * 
     * @return value
     */
    public String getNameENG() {
        return nameENG;
    }

    /** 
     * Set the 'NameENG' element value. ������������ ������ �� ���������� �����
     * 
     * @param nameENG
     */
    public void setNameENG(String nameENG) {
        this.nameENG = nameENG;
    }

    /** 
     * Get the 'ProductGuid' element value. ���������� ������������� ���������, �������� ��������� ������ ��� ���������
     * 
     * @return value
     */
    public String getProductGuid() {
        return productGuid;
    }

    /** 
     * Set the 'ProductGuid' element value. ���������� ������������� ���������, �������� ��������� ������ ��� ���������
     * 
     * @param productGuid
     */
    public void setProductGuid(String productGuid) {
        this.productGuid = productGuid;
    }

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
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(QuantityType quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'PackingInfo' element value. �������� �� �������� �������.
     * 
     * @return value
     */
    public PackingInfoType getPackingInfo() {
        return packingInfo;
    }

    /** 
     * Set the 'PackingInfo' element value. �������� �� �������� �������.
     * 
     * @param packingInfo
     */
    public void setPackingInfo(PackingInfoType packingInfo) {
        this.packingInfo = packingInfo;
    }
}
