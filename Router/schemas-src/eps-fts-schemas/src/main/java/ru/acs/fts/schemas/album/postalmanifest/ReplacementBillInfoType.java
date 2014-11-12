
package ru.acs.fts.schemas.album.postalmanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о заменяющей накладной
 */
public class ReplacementBillInfoType
{
    private String formingAircompany;
    private String submitAirport;
    private List<String> remarkList = new ArrayList<String>();
    private String operatorSupplyCountry;

    /** 
     * Get the 'FormingAircompany' element value. Авиакомпания, составляющая заменяющую накладную
     * 
     * @return value
     */
    public String getFormingAircompany() {
        return formingAircompany;
    }

    /** 
     * Set the 'FormingAircompany' element value. Авиакомпания, составляющая заменяющую накладную
     * 
     * @param formingAircompany
     */
    public void setFormingAircompany(String formingAircompany) {
        this.formingAircompany = formingAircompany;
    }

    /** 
     * Get the 'SubmitAirport' element value. Аэропорт подачи заменяющей накладной
     * 
     * @return value
     */
    public String getSubmitAirport() {
        return submitAirport;
    }

    /** 
     * Set the 'SubmitAirport' element value. Аэропорт подачи заменяющей накладной
     * 
     * @param submitAirport
     */
    public void setSubmitAirport(String submitAirport) {
        this.submitAirport = submitAirport;
    }

    /** 
     * Get the list of 'Remarks' element items. Замечания, касающиеся найденных депеш
     * 
     * @return list
     */
    public List<String> getRemarkList() {
        return remarkList;
    }

    /** 
     * Set the list of 'Remarks' element items. Замечания, касающиеся найденных депеш
     * 
     * @param list
     */
    public void setRemarkList(List<String> list) {
        remarkList = list;
    }

    /** 
     * Get the 'OperatorSupplyCountry' element value. Назначенный оператор страны подачи депеш
     * 
     * @return value
     */
    public String getOperatorSupplyCountry() {
        return operatorSupplyCountry;
    }

    /** 
     * Set the 'OperatorSupplyCountry' element value. Назначенный оператор страны подачи депеш
     * 
     * @param operatorSupplyCountry
     */
    public void setOperatorSupplyCountry(String operatorSupplyCountry) {
        this.operatorSupplyCountry = operatorSupplyCountry;
    }
}
