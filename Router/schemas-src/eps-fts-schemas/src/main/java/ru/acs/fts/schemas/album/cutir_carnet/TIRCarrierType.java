
package ru.acs.fts.schemas.album.cutir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DriverInformationType;

/** 
 * Перевозчик / Держатель книжки МДП
 */
public class TIRCarrierType extends CUOrganizationType
{
    private String TIRHolderID;
    private DriverInformationType CUDriverInformation;

    /** 
     * Get the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

    /** 
     * Get the 'CUDriverInformation' element value. Информация о водителе транспортного средства
     * 
     * @return value
     */
    public DriverInformationType getCUDriverInformation() {
        return CUDriverInformation;
    }

    /** 
     * Set the 'CUDriverInformation' element value. Информация о водителе транспортного средства
     * 
     * @param CUDriverInformation
     */
    public void setCUDriverInformation(DriverInformationType CUDriverInformation) {
        this.CUDriverInformation = CUDriverInformation;
    }
}
