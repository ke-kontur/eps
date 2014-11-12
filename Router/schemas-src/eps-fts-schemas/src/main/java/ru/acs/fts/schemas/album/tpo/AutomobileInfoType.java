
package ru.acs.fts.schemas.album.tpo;

/** 
 * Данные об автомобиле
 */
public class AutomobileInfoType
{
    private String model;
    private String mark;
    private String offtakeYear;
    private String engineVolumeQuanity;
    private String VINID;
    private String enginePower;
    private String markCode;
    private String enginePowerKVt;

    /** 
     * Get the 'Model' element value. Модель
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Модель
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. Марка
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Марка
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'OfftakeYear' element value. Год выпуска
     * 
     * @return value
     */
    public String getOfftakeYear() {
        return offtakeYear;
    }

    /** 
     * Set the 'OfftakeYear' element value. Год выпуска
     * 
     * @param offtakeYear
     */
    public void setOfftakeYear(String offtakeYear) {
        this.offtakeYear = offtakeYear;
    }

    /** 
     * Get the 'EngineVolumeQuanity' element value. Объем двигателя, куб. см
     * 
     * @return value
     */
    public String getEngineVolumeQuanity() {
        return engineVolumeQuanity;
    }

    /** 
     * Set the 'EngineVolumeQuanity' element value. Объем двигателя, куб. см
     * 
     * @param engineVolumeQuanity
     */
    public void setEngineVolumeQuanity(String engineVolumeQuanity) {
        this.engineVolumeQuanity = engineVolumeQuanity;
    }

    /** 
     * Get the 'VINID' element value. Идентификационный номер (VIN)
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Идентификационный номер (VIN)
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'EnginePower' element value. Мощность двигателя в лошадиных силах
     * 
     * @return value
     */
    public String getEnginePower() {
        return enginePower;
    }

    /** 
     * Set the 'EnginePower' element value. Мощность двигателя в лошадиных силах
     * 
     * @param enginePower
     */
    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    /** 
     * Get the 'MarkCode' element value. Код марки 
     * 
     * @return value
     */
    public String getMarkCode() {
        return markCode;
    }

    /** 
     * Set the 'MarkCode' element value. Код марки 
     * 
     * @param markCode
     */
    public void setMarkCode(String markCode) {
        this.markCode = markCode;
    }

    /** 
     * Get the 'EnginePowerKVt' element value. Мощность двигателя в КВт
     * 
     * @return value
     */
    public String getEnginePowerKVt() {
        return enginePowerKVt;
    }

    /** 
     * Set the 'EnginePowerKVt' element value. Мощность двигателя в КВт
     * 
     * @param enginePowerKVt
     */
    public void setEnginePowerKVt(String enginePowerKVt) {
        this.enginePowerKVt = enginePowerKVt;
    }
}
