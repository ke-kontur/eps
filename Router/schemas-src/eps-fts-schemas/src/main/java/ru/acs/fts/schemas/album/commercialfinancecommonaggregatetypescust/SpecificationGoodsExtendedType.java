
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Описание и дополнительные характеристики товаров из спецификации к контракту
 */
public class SpecificationGoodsExtendedType extends SpecificationGoodsType
{
    private AdditionalGoodsDescriptionType additionalGoodsDescription;

    /** 
     * Get the 'AdditionalGoodsDescription' element value. Дополнительные характеристики товаров
     * 
     * @return value
     */
    public AdditionalGoodsDescriptionType getAdditionalGoodsDescription() {
        return additionalGoodsDescription;
    }

    /** 
     * Set the 'AdditionalGoodsDescription' element value. Дополнительные характеристики товаров
     * 
     * @param additionalGoodsDescription
     */
    public void setAdditionalGoodsDescription(
            AdditionalGoodsDescriptionType additionalGoodsDescription) {
        this.additionalGoodsDescription = additionalGoodsDescription;
    }
}
