
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������.
 */
public class GuaranteeType
{
    private String measureCode;
    private List<GuaranteeReferenceType> guaranteeReferenceList = new ArrayList<GuaranteeReferenceType>();

    /** 
     * Get the 'MeasureCode' element value. ��� ���� ����������� �� �������������� ��� �����������.
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. ��� ���� ����������� �� �������������� ��� �����������.
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the list of 'GuaranteeReference' element items. ��������� ��������.
     * 
     * @return list
     */
    public List<GuaranteeReferenceType> getGuaranteeReferenceList() {
        return guaranteeReferenceList;
    }

    /** 
     * Set the list of 'GuaranteeReference' element items. ��������� ��������.
     * 
     * @param list
     */
    public void setGuaranteeReferenceList(List<GuaranteeReferenceType> list) {
        guaranteeReferenceList = list;
    }
}
