
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Заявление таможенного представителя, используемое в качестве пассажирской таможенной декларации
 */
public class RepresentativeApplicationType extends BaseDocType
{
    private String destinationCountry;
    private String totalGoodsNumber;
    private RepresentativeType representative;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения. Буквенный код по классификатору стран мира
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения. Буквенный код по классификатору стран мира
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. Всего наименований товаров
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Всего наименований товаров
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'Representative' element value. Таможенный представитель
     * 
     * @return value
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. Таможенный представитель
     * 
     * @param representative
     */
    public void setRepresentative(RepresentativeType representative) {
        this.representative = representative;
    }

    /** 
     * Get the list of 'Consignment' element items. Сведения о партии
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Сведения о партии
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
