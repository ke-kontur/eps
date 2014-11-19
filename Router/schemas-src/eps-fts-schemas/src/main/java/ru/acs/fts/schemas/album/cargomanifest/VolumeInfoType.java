
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * Объем товара
 */
public class VolumeInfoType
{
    private String goodsVolume;
    private String volumeUnitQualifierCode;
    private String volumeUnitQualifierName;

    /** 
     * Get the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the 'VolumeUnitQualifierCode' element value. Код единицы измерения объема
     * 
     * @return value
     */
    public String getVolumeUnitQualifierCode() {
        return volumeUnitQualifierCode;
    }

    /** 
     * Set the 'VolumeUnitQualifierCode' element value. Код единицы измерения объема
     * 
     * @param volumeUnitQualifierCode
     */
    public void setVolumeUnitQualifierCode(String volumeUnitQualifierCode) {
        this.volumeUnitQualifierCode = volumeUnitQualifierCode;
    }

    /** 
     * Get the 'VolumeUnitQualifierName' element value. Наименование единицы измерения объема
     * 
     * @return value
     */
    public String getVolumeUnitQualifierName() {
        return volumeUnitQualifierName;
    }

    /** 
     * Set the 'VolumeUnitQualifierName' element value. Наименование единицы измерения объема
     * 
     * @param volumeUnitQualifierName
     */
    public void setVolumeUnitQualifierName(String volumeUnitQualifierName) {
        this.volumeUnitQualifierName = volumeUnitQualifierName;
    }
}
