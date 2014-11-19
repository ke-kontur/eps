
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Документы, подтверждающие заявленные сведения
 */
public class CostConfirmationDocumentType
{
    private String previousCostAppriaseMethod;
    private List<String> methodConditionList = new ArrayList<String>();

    /** 
     * Get the 'PreviousCostAppriaseMethod' element value. Предыдущий метод определения таможенной стоимости. (для метода 6)
     * 
     * @return value
     */
    public String getPreviousCostAppriaseMethod() {
        return previousCostAppriaseMethod;
    }

    /** 
     * Set the 'PreviousCostAppriaseMethod' element value. Предыдущий метод определения таможенной стоимости. (для метода 6)
     * 
     * @param previousCostAppriaseMethod
     */
    public void setPreviousCostAppriaseMethod(String previousCostAppriaseMethod) {
        this.previousCostAppriaseMethod = previousCostAppriaseMethod;
    }

    /** 
     * Get the list of 'MethodCondition' element items. Условия применения соответствующего метода (1-5)  для метода 6 при гибком подходе
     * 
     * @return list
     */
    public List<String> getMethodConditionList() {
        return methodConditionList;
    }

    /** 
     * Set the list of 'MethodCondition' element items. Условия применения соответствующего метода (1-5)  для метода 6 при гибком подходе
     * 
     * @param list
     */
    public void setMethodConditionList(List<String> list) {
        methodConditionList = list;
    }
}
