
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * �������� � �������������� �������������� ������� �� ������������ � ���������
 */
public class SpecificationGoodsExtendedType extends SpecificationGoodsType
{
    private AdditionalGoodsDescriptionType additionalGoodsDescription;

    /** 
     * Get the 'AdditionalGoodsDescription' element value. �������������� �������������� �������
     * 
     * @return value
     */
    public AdditionalGoodsDescriptionType getAdditionalGoodsDescription() {
        return additionalGoodsDescription;
    }

    /** 
     * Set the 'AdditionalGoodsDescription' element value. �������������� �������������� �������
     * 
     * @param additionalGoodsDescription
     */
    public void setAdditionalGoodsDescription(
            AdditionalGoodsDescriptionType additionalGoodsDescription) {
        this.additionalGoodsDescription = additionalGoodsDescription;
    }
}
