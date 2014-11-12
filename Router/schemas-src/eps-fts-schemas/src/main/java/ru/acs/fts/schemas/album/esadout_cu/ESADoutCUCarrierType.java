
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DriverInformationType;

/** 
 * Сведения о перевозчике
 */
public class ESADoutCUCarrierType extends CUOrganizationType
{
    private DriverInformationType ESADoutCUDriverInformation;

    /** 
     * Get the 'ESADout_CUDriverInformation' element value. Информация о водителях транспортных средств. Заполняется при транзите товаров автомобильным транспортом
     * 
     * @return value
     */
    public DriverInformationType getESADoutCUDriverInformation() {
        return ESADoutCUDriverInformation;
    }

    /** 
     * Set the 'ESADout_CUDriverInformation' element value. Информация о водителях транспортных средств. Заполняется при транзите товаров автомобильным транспортом
     * 
     * @param ESADoutCUDriverInformation
     */
    public void setESADoutCUDriverInformation(
            DriverInformationType ESADoutCUDriverInformation) {
        this.ESADoutCUDriverInformation = ESADoutCUDriverInformation;
    }
}
