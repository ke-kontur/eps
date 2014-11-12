
package ru.acs.fts.schemas.album.minfinmetalstoneinout;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ������
 */
public class ProductDescriptionType
{
    private String product;
    private String weight;
    private String ETNVEDCode;
    private String price;
    private String currency;
    private SupplementaryQuantityType count;

    /** 
     * Get the 'Product' element value. �����
     * 
     * @return value
     */
    public String getProduct() {
        return product;
    }

    /** 
     * Set the 'Product' element value. �����
     * 
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /** 
     * Get the 'Weight' element value. ����� ������
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. ����� ������
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'ETNVEDCode' element value. ��� ������ �� ��� ���
     * 
     * @return value
     */
    public String getETNVEDCode() {
        return ETNVEDCode;
    }

    /** 
     * Set the 'ETNVEDCode' element value. ��� ������ �� ��� ���
     * 
     * @param ETNVEDCode
     */
    public void setETNVEDCode(String ETNVEDCode) {
        this.ETNVEDCode = ETNVEDCode;
    }

    /** 
     * Get the 'Price' element value. ����������� ���������
     * 
     * @return value
     */
    public String getPrice() {
        return price;
    }

    /** 
     * Set the 'Price' element value. ����������� ���������
     * 
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** 
     * Get the 'Currency' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'Count' element value. ���������� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. ���������� ������
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }
}
