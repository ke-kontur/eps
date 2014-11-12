
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Данные об автомобилях. Базовый класс для 31й гр. и  Карточки транспортного средства
 */
public class AutomobileBaseType
{
    private String model;
    private String mark;
    private String markCode;
    private String offtakeYear;
    private String engineVolumeQuanity;
    private String VINID;
    private String bodyID;
    private String engineID;
    private String chassisID;
    private String cabID;

    /** 
     * Get the 'Model' element value. Марка, модель
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Марка, модель
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. Наименование марки в оригинале
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Наименование марки в оригинале
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
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
     * Get the 'OfftakeYear' element value. Год изготовления транспортного средства
     * 
     * @return value
     */
    public String getOfftakeYear() {
        return offtakeYear;
    }

    /** 
     * Set the 'OfftakeYear' element value. Год изготовления транспортного средства
     * 
     * @param offtakeYear
     */
    public void setOfftakeYear(String offtakeYear) {
        this.offtakeYear = offtakeYear;
    }

    /** 
     * Get the 'EngineVolumeQuanity' element value. Рабочий объем двигателя, куб. см
     * 
     * @return value
     */
    public String getEngineVolumeQuanity() {
        return engineVolumeQuanity;
    }

    /** 
     * Set the 'EngineVolumeQuanity' element value. Рабочий объем двигателя, куб. см
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
     * Get the 'BodyID' element value. Идентификационный номер кузова (прицепа), присвоенные и нанесенные на них  организацией-изготовителем
     * 
     * @return value
     */
    public String getBodyID() {
        return bodyID;
    }

    /** 
     * Set the 'BodyID' element value. Идентификационный номер кузова (прицепа), присвоенные и нанесенные на них  организацией-изготовителем
     * 
     * @param bodyID
     */
    public void setBodyID(String bodyID) {
        this.bodyID = bodyID;
    }

    /** 
     * Get the 'EngineID' element value. Присвоенный организацией - изготовителем идентификационный номер двигателя, нанесенный на блоке двигателя. Идентификационный номер может состоять из групп раздельных цифр, из которых последняя группа, состоящая из двух цифр, указывает год выпуска двигателя
     * 
     * @return value
     */
    public String getEngineID() {
        return engineID;
    }

    /** 
     * Set the 'EngineID' element value. Присвоенный организацией - изготовителем идентификационный номер двигателя, нанесенный на блоке двигателя. Идентификационный номер может состоять из групп раздельных цифр, из которых последняя группа, состоящая из двух цифр, указывает год выпуска двигателя
     * 
     * @param engineID
     */
    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    /** 
     * Get the 'ChassisID' element value. Идентификационный номер шасси (рамы), присвоенные и нанесенные на них организацией-изготовителем
     * 
     * @return value
     */
    public String getChassisID() {
        return chassisID;
    }

    /** 
     * Set the 'ChassisID' element value. Идентификационный номер шасси (рамы), присвоенные и нанесенные на них организацией-изготовителем
     * 
     * @param chassisID
     */
    public void setChassisID(String chassisID) {
        this.chassisID = chassisID;
    }

    /** 
     * Get the 'CabID' element value. Идентификационный номер кабины
     * 
     * @return value
     */
    public String getCabID() {
        return cabID;
    }

    /** 
     * Set the 'CabID' element value. Идентификационный номер кабины
     * 
     * @param cabID
     */
    public void setCabID(String cabID) {
        this.cabID = cabID;
    }
}
