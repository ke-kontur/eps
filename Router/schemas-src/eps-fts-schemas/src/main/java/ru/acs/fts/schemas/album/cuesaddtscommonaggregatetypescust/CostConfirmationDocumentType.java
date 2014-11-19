
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������, �������������� ���������� ��������
 */
public class CostConfirmationDocumentType
{
    private String previousCostAppriaseMethod;
    private List<String> methodConditionList = new ArrayList<String>();

    /** 
     * Get the 'PreviousCostAppriaseMethod' element value. ���������� ����� ����������� ���������� ���������. (��� ������ 6)
     * 
     * @return value
     */
    public String getPreviousCostAppriaseMethod() {
        return previousCostAppriaseMethod;
    }

    /** 
     * Set the 'PreviousCostAppriaseMethod' element value. ���������� ����� ����������� ���������� ���������. (��� ������ 6)
     * 
     * @param previousCostAppriaseMethod
     */
    public void setPreviousCostAppriaseMethod(String previousCostAppriaseMethod) {
        this.previousCostAppriaseMethod = previousCostAppriaseMethod;
    }

    /** 
     * Get the list of 'MethodCondition' element items. ������� ���������� ���������������� ������ (1-5)  ��� ������ 6 ��� ������ �������
     * 
     * @return list
     */
    public List<String> getMethodConditionList() {
        return methodConditionList;
    }

    /** 
     * Set the list of 'MethodCondition' element items. ������� ���������� ���������������� ������ (1-5)  ��� ������ 6 ��� ������ �������
     * 
     * @param list
     */
    public void setMethodConditionList(List<String> list) {
        methodConditionList = list;
    }
}
