
package ru.acs.fts.schemas.album.mistakeletter;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.TransportDocRegNumType;

/** 
 * Ошибка в регистрационном номере накладной
 */
public class WaybillRegNumberMistakeType
{
    private TransportDocRegNumType mistakeValue;
    private TransportDocRegNumType validValue;

    /** 
     * Get the 'MistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @return value
     */
    public TransportDocRegNumType getMistakeValue() {
        return mistakeValue;
    }

    /** 
     * Set the 'MistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @param mistakeValue
     */
    public void setMistakeValue(TransportDocRegNumType mistakeValue) {
        this.mistakeValue = mistakeValue;
    }

    /** 
     * Get the 'ValidValue' element value. Правильное значение. Если не указано, то считается, что регистрационный номер должен был отсутсвовать вовсе
     * 
     * @return value
     */
    public TransportDocRegNumType getValidValue() {
        return validValue;
    }

    /** 
     * Set the 'ValidValue' element value. Правильное значение. Если не указано, то считается, что регистрационный номер должен был отсутсвовать вовсе
     * 
     * @param validValue
     */
    public void setValidValue(TransportDocRegNumType validValue) {
        this.validValue = validValue;
    }
}
