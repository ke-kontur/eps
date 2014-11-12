
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Описание транспортного средства/контейнера для перевозки товара
 */
public class TransportMeansType
{
    private String number;
    private String modeCode;
    private String nationalityCode;
    private String moverIndicator;

    /** 
     * Get the 'Number' element value. Номер транспортного средства
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер транспортного средства
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ModeCode' element value. Код вида транспортного средства
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. Код вида транспортного средства
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'NationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'NationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    /** 
     * Get the 'MoverIndicator' element value. Признак ведущего транспортного средства
     * 
     * @return value
     */
    public String getMoverIndicator() {
        return moverIndicator;
    }

    /** 
     * Set the 'MoverIndicator' element value. Признак ведущего транспортного средства
     * 
     * @param moverIndicator
     */
    public void setMoverIndicator(String moverIndicator) {
        this.moverIndicator = moverIndicator;
    }
}
