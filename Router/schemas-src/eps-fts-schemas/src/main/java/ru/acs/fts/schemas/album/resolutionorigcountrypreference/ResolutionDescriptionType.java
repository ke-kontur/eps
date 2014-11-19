
package ru.acs.fts.schemas.album.resolutionorigcountrypreference;

import java.util.ArrayList;
import java.util.List;

/** 
 * Решение
 */
public class ResolutionDescriptionType
{
    private String decisionSign;
    private String decisionMeaning;
    private List<InfoCountryCodeType> infoCountryCodeList = new ArrayList<InfoCountryCodeType>();

    /** 
     * Get the 'DecisionSign' element value. Признак решения (1 - о стране происхождения, 0 - о предоставлении тарифных преференций)
     * 
     * @return value
     */
    public String getDecisionSign() {
        return decisionSign;
    }

    /** 
     * Set the 'DecisionSign' element value. Признак решения (1 - о стране происхождения, 0 - о предоставлении тарифных преференций)
     * 
     * @param decisionSign
     */
    public void setDecisionSign(String decisionSign) {
        this.decisionSign = decisionSign;
    }

    /** 
     * Get the 'DecisionMeaning' element value. Значение решения (1 - заявленные сведения о СП приняты, 2 - заявленные сведения о СП скорректированы, 3 - тарифная преференция предоставлена, 4 - тарифная преференция не предоставлена)
     * 
     * @return value
     */
    public String getDecisionMeaning() {
        return decisionMeaning;
    }

    /** 
     * Set the 'DecisionMeaning' element value. Значение решения (1 - заявленные сведения о СП приняты, 2 - заявленные сведения о СП скорректированы, 3 - тарифная преференция предоставлена, 4 - тарифная преференция не предоставлена)
     * 
     * @param decisionMeaning
     */
    public void setDecisionMeaning(String decisionMeaning) {
        this.decisionMeaning = decisionMeaning;
    }

    /** 
     * Get the list of 'InfoCountryCode' element items. Сведения о СП
     * 
     * @return list
     */
    public List<InfoCountryCodeType> getInfoCountryCodeList() {
        return infoCountryCodeList;
    }

    /** 
     * Set the list of 'InfoCountryCode' element items. Сведения о СП
     * 
     * @param list
     */
    public void setInfoCountryCodeList(List<InfoCountryCodeType> list) {
        infoCountryCodeList = list;
    }
}
