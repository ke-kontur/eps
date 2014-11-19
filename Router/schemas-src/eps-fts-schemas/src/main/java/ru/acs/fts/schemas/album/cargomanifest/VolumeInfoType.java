
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * ����� ������
 */
public class VolumeInfoType
{
    private String goodsVolume;
    private String volumeUnitQualifierCode;
    private String volumeUnitQualifierName;

    /** 
     * Get the 'GoodsVolume' element value. ����� �����, ���������� ����������� ������� ��� �������� ������ ���������
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. ����� �����, ���������� ����������� ������� ��� �������� ������ ���������
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the 'VolumeUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @return value
     */
    public String getVolumeUnitQualifierCode() {
        return volumeUnitQualifierCode;
    }

    /** 
     * Set the 'VolumeUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @param volumeUnitQualifierCode
     */
    public void setVolumeUnitQualifierCode(String volumeUnitQualifierCode) {
        this.volumeUnitQualifierCode = volumeUnitQualifierCode;
    }

    /** 
     * Get the 'VolumeUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @return value
     */
    public String getVolumeUnitQualifierName() {
        return volumeUnitQualifierName;
    }

    /** 
     * Set the 'VolumeUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @param volumeUnitQualifierName
     */
    public void setVolumeUnitQualifierName(String volumeUnitQualifierName) {
        this.volumeUnitQualifierName = volumeUnitQualifierName;
    }
}
