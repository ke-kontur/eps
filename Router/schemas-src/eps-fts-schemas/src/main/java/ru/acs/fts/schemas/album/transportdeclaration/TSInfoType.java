
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
    private String transportNationalityCode;
    private String countryName;
    private String VINID;
    private String transportModeCode;

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
     * Get the 'TransportNationalityCode' element value. Буквенный код страны принадлежности (регистрации) транспортных средств по классификатору стран мира. 00-неизвестна
     * 
     * @return value
     */
    public String getTransportNationalityCode() {
        return transportNationalityCode;
    }

    /** 
     * Set the 'TransportNationalityCode' element value. Буквенный код страны принадлежности (регистрации) транспортных средств по классификатору стран мира. 00-неизвестна
     * 
     * @param transportNationalityCode
     */
    public void setTransportNationalityCode(String transportNationalityCode) {
        this.transportNationalityCode = transportNationalityCode;
    }

    /** 
     * Get the 'CountryName' element value. Краткое наименование страны регистрации ТСМП в соответствии с классификатором стран мира.
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Краткое наименование страны регистрации ТСМП в соответствии с классификатором стран мира.
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

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }
}
