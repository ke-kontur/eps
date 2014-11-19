
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� ������������ �������� ����������
 */
public class WHContainerExtendedType extends WHContainerInformationType
{
    private WHAngarType keepingPlace;

    /** 
     * Get the 'KeepingPlace' element value. ���������� � �������� ����������
     * 
     * @return value
     */
    public WHAngarType getKeepingPlace() {
        return keepingPlace;
    }

    /** 
     * Set the 'KeepingPlace' element value. ���������� � �������� ����������
     * 
     * @param keepingPlace
     */
    public void setKeepingPlace(WHAngarType keepingPlace) {
        this.keepingPlace = keepingPlace;
    }
}
