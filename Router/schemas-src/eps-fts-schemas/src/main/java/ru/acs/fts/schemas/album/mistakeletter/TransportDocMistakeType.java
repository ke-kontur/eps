
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * Комплексный тип для описания выявленной ошибки в реквизитах транспортного документа
 */
public class TransportDocMistakeType extends PresentedDocMistakeType
{
    private WaybillRegNumberMistakeType waybillRegNumberMistake;

    /** 
     * Get the 'WaybillRegNumberMistake' element value. Ошибка в регистрационном номере накладной
     * 
     * @return value
     */
    public WaybillRegNumberMistakeType getWaybillRegNumberMistake() {
        return waybillRegNumberMistake;
    }

    /** 
     * Set the 'WaybillRegNumberMistake' element value. Ошибка в регистрационном номере накладной
     * 
     * @param waybillRegNumberMistake
     */
    public void setWaybillRegNumberMistake(
            WaybillRegNumberMistakeType waybillRegNumberMistake) {
        this.waybillRegNumberMistake = waybillRegNumberMistake;
    }
}
