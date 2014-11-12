
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Гарантия.
 */
public class GuaranteeType
{
    private String measureCode;
    private List<GuaranteeReferenceType> guaranteeReferenceList = new ArrayList<GuaranteeReferenceType>();

    /** 
     * Get the 'MeasureCode' element value. Код меры обеспечения по Классификатору мер обеспечения.
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры обеспечения по Классификатору мер обеспечения.
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the list of 'GuaranteeReference' element items. Реквизиты гарантии.
     * 
     * @return list
     */
    public List<GuaranteeReferenceType> getGuaranteeReferenceList() {
        return guaranteeReferenceList;
    }

    /** 
     * Set the list of 'GuaranteeReference' element items. Реквизиты гарантии.
     * 
     * @param list
     */
    public void setGuaranteeReferenceList(List<GuaranteeReferenceType> list) {
        guaranteeReferenceList = list;
    }
}
