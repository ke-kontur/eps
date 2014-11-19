
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительная информация, для которой не предусмотрено специальных элементов
 */
public class AdditionalDataType
{
    private String positionNumber;
    private List<String> additionalInformationList = new ArrayList<String>();

    /** 
     * Get the 'PositionNumber' element value. Номер графы
     * 
     * @return value
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /** 
     * Set the 'PositionNumber' element value. Номер графы
     * 
     * @param positionNumber
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    /** 
     * Get the list of 'AdditionalInformation' element items. Дополнительные данные
     * 
     * @return list
     */
    public List<String> getAdditionalInformationList() {
        return additionalInformationList;
    }

    /** 
     * Set the list of 'AdditionalInformation' element items. Дополнительные данные
     * 
     * @param list
     */
    public void setAdditionalInformationList(List<String> list) {
        additionalInformationList = list;
    }
}
