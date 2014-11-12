
package ru.acs.fts.schemas.album.goodstranshipment;

/** 
 * �������� ������� �����������
 */
public class DamageIndicatorsType
{
    private String isCargoApartmentDamaged;
    private String isSealsDamaged;

    /** 
     * Get the 'IsCargoApartmentDamaged' element value. ������� ����������� ��������� ���������
     * 
     * @return value
     */
    public String getIsCargoApartmentDamaged() {
        return isCargoApartmentDamaged;
    }

    /** 
     * Set the 'IsCargoApartmentDamaged' element value. ������� ����������� ��������� ���������
     * 
     * @param isCargoApartmentDamaged
     */
    public void setIsCargoApartmentDamaged(String isCargoApartmentDamaged) {
        this.isCargoApartmentDamaged = isCargoApartmentDamaged;
    }

    /** 
     * Get the 'IsSealsDamaged' element value. ������� ����������� �����
     * 
     * @return value
     */
    public String getIsSealsDamaged() {
        return isSealsDamaged;
    }

    /** 
     * Set the 'IsSealsDamaged' element value. ������� ����������� �����
     * 
     * @param isSealsDamaged
     */
    public void setIsSealsDamaged(String isSealsDamaged) {
        this.isSealsDamaged = isSealsDamaged;
    }
}
