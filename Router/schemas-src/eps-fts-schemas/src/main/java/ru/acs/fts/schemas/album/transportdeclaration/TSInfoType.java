
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * Транспортное средство
 */
public class TSInfoType
{
    private String mark;
    private String model;
    private String kind;
    private String regNumber;
    private String countryName;
    private String VINID;

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
     * Get the 'Kind' element value. Тип транспортного средства
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Тип транспортного средства
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'RegNumber' element value. Номер регистрации
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Номер регистрации
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'CountryName' element value. Страна регистрации транспортного средства. Если страна, в которой зарегистрировано ТС, на момент декларирования неизвестна, то указываются два нуля "00"
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Страна регистрации транспортного средства. Если страна, в которой зарегистрировано ТС, на момент декларирования неизвестна, то указываются два нуля "00"
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
}
