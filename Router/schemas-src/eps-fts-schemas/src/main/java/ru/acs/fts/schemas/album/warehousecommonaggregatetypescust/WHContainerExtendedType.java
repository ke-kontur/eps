
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для расширенного описания контейнера
 */
public class WHContainerExtendedType extends WHContainerInformationType
{
    private WHAngarType keepingPlace;

    /** 
     * Get the 'KeepingPlace' element value. Информация о хранении контейнера
     * 
     * @return value
     */
    public WHAngarType getKeepingPlace() {
        return keepingPlace;
    }

    /** 
     * Set the 'KeepingPlace' element value. Информация о хранении контейнера
     * 
     * @param keepingPlace
     */
    public void setKeepingPlace(WHAngarType keepingPlace) {
        this.keepingPlace = keepingPlace;
    }
}
