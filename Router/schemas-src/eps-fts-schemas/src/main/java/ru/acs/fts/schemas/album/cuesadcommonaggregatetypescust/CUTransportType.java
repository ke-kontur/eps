
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о местонахождении товаров - транспортное средство
 */
public class CUTransportType
{
    private String transporKind;
    private List<String> transporIdentifierList = new ArrayList<String>();

    /** 
     * Get the 'TransporKind' element value. Код вида транспортного средства в соответствии с классификатором видов транспорта и транспортировки товаров
     * 
     * @return value
     */
    public String getTransporKind() {
        return transporKind;
    }

    /** 
     * Set the 'TransporKind' element value. Код вида транспортного средства в соответствии с классификатором видов транспорта и транспортировки товаров
     * 
     * @param transporKind
     */
    public void setTransporKind(String transporKind) {
        this.transporKind = transporKind;
    }

    /** 
     * Get the list of 'TransporIdentifier' element items. Номер транспортного средства
     * 
     * @return list
     */
    public List<String> getTransporIdentifierList() {
        return transporIdentifierList;
    }

    /** 
     * Set the list of 'TransporIdentifier' element items. Номер транспортного средства
     * 
     * @param list
     */
    public void setTransporIdentifierList(List<String> list) {
        transporIdentifierList = list;
    }
}
