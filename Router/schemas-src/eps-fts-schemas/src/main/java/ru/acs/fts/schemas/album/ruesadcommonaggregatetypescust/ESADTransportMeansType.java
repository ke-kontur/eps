
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ДТ и ТД. Транспортные средства на границе / внутри страны. 
 */
public class ESADTransportMeansType
{
    private List<String> transportModeCodeList = new ArrayList<String>();
    private String transportNationalityCode;

    /** 
     * Get the list of 'TransportModeCode' element items. Код вида перевозки/ транспортного средства по классификатору видов транспорта и транспортировки товаров. При заполнении 25 графы должен создаваться только один элемент.
     * 
     * @return list
     */
    public List<String> getTransportModeCodeList() {
        return transportModeCodeList;
    }

    /** 
     * Set the list of 'TransportModeCode' element items. Код вида перевозки/ транспортного средства по классификатору видов транспорта и транспортировки товаров. При заполнении 25 графы должен создаваться только один элемент.
     * 
     * @param list
     */
    public void setTransportModeCodeList(List<String> list) {
        transportModeCodeList = list;
    }

    /** 
     * Get the 'TransportNationalityCode' element value. Буквенный код страны принадлежности транспортных средств по общероссийскому классификатору стран мира. 00-разные/неизвестна
     * 
     * @return value
     */
    public String getTransportNationalityCode() {
        return transportNationalityCode;
    }

    /** 
     * Set the 'TransportNationalityCode' element value. Буквенный код страны принадлежности транспортных средств по общероссийскому классификатору стран мира. 00-разные/неизвестна
     * 
     * @param transportNationalityCode
     */
    public void setTransportNationalityCode(String transportNationalityCode) {
        this.transportNationalityCode = transportNationalityCode;
    }
}
