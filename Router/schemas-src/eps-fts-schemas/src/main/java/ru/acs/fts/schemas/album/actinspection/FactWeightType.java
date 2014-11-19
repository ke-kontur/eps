
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Фактический вес товаров
 */
public class FactWeightType
{
    private String netto;
    private String brutto;
    private String FWMethod;
    private String WFMetodsComments;
    private String weighPlacesNumber;
    private List<String> placeWeightList = new ArrayList<String>();

    /** 
     * Get the 'Netto' element value. Вес товара неттто, кг
     * 
     * @return value
     */
    public String getNetto() {
        return netto;
    }

    /** 
     * Set the 'Netto' element value. Вес товара неттто, кг
     * 
     * @param netto
     */
    public void setNetto(String netto) {
        this.netto = netto;
    }

    /** 
     * Get the 'Brutto' element value. Вес товара брутто, кг
     * 
     * @return value
     */
    public String getBrutto() {
        return brutto;
    }

    /** 
     * Set the 'Brutto' element value. Вес товара брутто, кг
     * 
     * @param brutto
     */
    public void setBrutto(String brutto) {
        this.brutto = brutto;
    }

    /** 
     * Get the 'FWMethod' element value. Способ определения фактического веса товаров: "0" - фактическое взвешивание,  "1" - определение среднего веса одного места взвешиванием нескольких мест, "2" - расчетный метод, "3" - прочее.
     * 
     * @return value
     */
    public String getFWMethod() {
        return FWMethod;
    }

    /** 
     * Set the 'FWMethod' element value. Способ определения фактического веса товаров: "0" - фактическое взвешивание,  "1" - определение среднего веса одного места взвешиванием нескольких мест, "2" - расчетный метод, "3" - прочее.
     * 
     * @param FWMethod
     */
    public void setFWMethod(String FWMethod) {
        this.FWMethod = FWMethod;
    }

    /** 
     * Get the 'WFMetodsComments' element value. Описание "прочего" метода определения фактического веса товаров
     * 
     * @return value
     */
    public String getWFMetodsComments() {
        return WFMetodsComments;
    }

    /** 
     * Set the 'WFMetodsComments' element value. Описание "прочего" метода определения фактического веса товаров
     * 
     * @param WFMetodsComments
     */
    public void setWFMetodsComments(String WFMetodsComments) {
        this.WFMetodsComments = WFMetodsComments;
    }

    /** 
     * Get the 'WeighPlacesNumber' element value. Количество взвешенных мест
     * 
     * @return value
     */
    public String getWeighPlacesNumber() {
        return weighPlacesNumber;
    }

    /** 
     * Set the 'WeighPlacesNumber' element value. Количество взвешенных мест
     * 
     * @param weighPlacesNumber
     */
    public void setWeighPlacesNumber(String weighPlacesNumber) {
        this.weighPlacesNumber = weighPlacesNumber;
    }

    /** 
     * Get the list of 'PlaceWeight' element items. Вес одного места
     * 
     * @return list
     */
    public List<String> getPlaceWeightList() {
        return placeWeightList;
    }

    /** 
     * Set the list of 'PlaceWeight' element items. Вес одного места
     * 
     * @param list
     */
    public void setPlaceWeightList(List<String> list) {
        placeWeightList = list;
    }
}
