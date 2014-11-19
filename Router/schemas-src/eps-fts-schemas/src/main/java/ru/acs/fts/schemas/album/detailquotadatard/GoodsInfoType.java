
package ru.acs.fts.schemas.album.detailquotadatard;

/** 
 * �������� � ������
 */
public class GoodsInfoType
{
    private String goodsCategoryCode;
    private String goodsTNVED;
    private String goodsDescription;
    private String commercialName;
    private String internationalName;
    private String producerName;
    private String originCountryCode;
    private QuantitativeCharactType quantitativeCharact;

    /** 
     * Get the 'GoodsCategoryCode' element value. ��� ��������� ������
     * 
     * @return value
     */
    public String getGoodsCategoryCode() {
        return goodsCategoryCode;
    }

    /** 
     * Set the 'GoodsCategoryCode' element value. ��� ��������� ������
     * 
     * @param goodsCategoryCode
     */
    public void setGoodsCategoryCode(String goodsCategoryCode) {
        this.goodsCategoryCode = goodsCategoryCode;
    }

    /** 
     * Get the 'GoodsTNVED' element value. ��� �����
     * 
     * @return value
     */
    public String getGoodsTNVED() {
        return goodsTNVED;
    }

    /** 
     * Set the 'GoodsTNVED' element value. ��� �����
     * 
     * @param goodsTNVED
     */
    public void setGoodsTNVED(String goodsTNVED) {
        this.goodsTNVED = goodsTNVED;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� (������������) ������
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� (������������) ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'CommercialName' element value. �������� ������������
     * 
     * @return value
     */
    public String getCommercialName() {
        return commercialName;
    }

    /** 
     * Set the 'CommercialName' element value. �������� ������������
     * 
     * @param commercialName
     */
    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    /** 
     * Get the 'InternationalName' element value. ������������� ������������
     * 
     * @return value
     */
    public String getInternationalName() {
        return internationalName;
    }

    /** 
     * Set the 'InternationalName' element value. ������������� ������������
     * 
     * @param internationalName
     */
    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName;
    }

    /** 
     * Get the 'ProducerName' element value. ������������ ������������
     * 
     * @return value
     */
    public String getProducerName() {
        return producerName;
    }

    /** 
     * Set the 'ProducerName' element value. ������������ ������������
     * 
     * @param producerName
     */
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� ������
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� ������
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'QuantitativeCharact' element value. �������������� ��������������
     * 
     * @return value
     */
    public QuantitativeCharactType getQuantitativeCharact() {
        return quantitativeCharact;
    }

    /** 
     * Set the 'QuantitativeCharact' element value. �������������� ��������������
     * 
     * @param quantitativeCharact
     */
    public void setQuantitativeCharact(
            QuantitativeCharactType quantitativeCharact) {
        this.quantitativeCharact = quantitativeCharact;
    }
}
