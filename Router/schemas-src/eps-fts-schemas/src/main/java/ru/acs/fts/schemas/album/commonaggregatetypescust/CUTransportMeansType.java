
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Транспортные средства на границе / внутри страны
 */
public class CUTransportMeansType
{
    private String transportModeCode;
    private String transportNationalityCode;

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

    /** 
     * Get the 'TransportNationalityCode' element value. Буквенный код страны принадлежности (регистрации) транспортных средств по классификатору стран мира. 99-разные, 00-неизвестна
     * 
     * @return value
     */
    public String getTransportNationalityCode() {
        return transportNationalityCode;
    }

    /** 
     * Set the 'TransportNationalityCode' element value. Буквенный код страны принадлежности (регистрации) транспортных средств по классификатору стран мира. 99-разные, 00-неизвестна
     * 
     * @param transportNationalityCode
     */
    public void setTransportNationalityCode(String transportNationalityCode) {
        this.transportNationalityCode = transportNationalityCode;
    }
}
