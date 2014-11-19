
package ru.acs.fts.schemas.album.oez_report;

/** 
 * ������� 3. ������ 2. �����, ���������� � ���������� ����������� �������, ���������� ��� ���������� ����� ��������� ���������� ����, � ������������ ������ ��������
 */
public class Table3Section2GoodsType extends GoodsWithoutStatusBaseType
{
    private String goodsSign;
    private String STZGoodsProduct;
    private String quantity;
    private String residentsGoodsQuantity;
    private Table3Section2WasteProductsUsageType wasteProductsUsage;

    /** 
     * Get the 'GoodsSign' element value. ���: 1 - ������ �������������(����������) �� ����������� �������, 2 - ������ �������������(����������) � �������������� ����������� �������, 3 - ������ �������������(����������) �� ������� ��
     * 
     * @return value
     */
    public String getGoodsSign() {
        return goodsSign;
    }

    /** 
     * Set the 'GoodsSign' element value. ���: 1 - ������ �������������(����������) �� ����������� �������, 2 - ������ �������������(����������) � �������������� ����������� �������, 3 - ������ �������������(����������) �� ������� ��
     * 
     * @param goodsSign
     */
    public void setGoodsSign(String goodsSign) {
        this.goodsSign = goodsSign;
    }

    /** 
     * Get the 'STZGoodsProduct' element value. ������, ������������� �� �������, ���������� ��� ���������� ��������� ���
     * 
     * @return value
     */
    public String getSTZGoodsProduct() {
        return STZGoodsProduct;
    }

    /** 
     * Set the 'STZGoodsProduct' element value. ������, ������������� �� �������, ���������� ��� ���������� ��������� ���
     * 
     * @param STZGoodsProduct
     */
    public void setSTZGoodsProduct(String STZGoodsProduct) {
        this.STZGoodsProduct = STZGoodsProduct;
    }

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
    }

    /** 
     * Get the 'WasteProductsUsage' element value. ������������ ���������� ����������� � ��������
     * 
     * @return value
     */
    public Table3Section2WasteProductsUsageType getWasteProductsUsage() {
        return wasteProductsUsage;
    }

    /** 
     * Set the 'WasteProductsUsage' element value. ������������ ���������� ����������� � ��������
     * 
     * @param wasteProductsUsage
     */
    public void setWasteProductsUsage(
            Table3Section2WasteProductsUsageType wasteProductsUsage) {
        this.wasteProductsUsage = wasteProductsUsage;
    }
}
