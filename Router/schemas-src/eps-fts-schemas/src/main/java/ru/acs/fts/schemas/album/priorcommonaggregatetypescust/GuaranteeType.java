
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Гарантия
 */
public class GuaranteeType
{
    private String measureCode;
    private List<GuaranteeDocumentType> guaranteeDocumentList = new ArrayList<GuaranteeDocumentType>();

    /** 
     * Get the 'MeasureCode' element value. Код меры обеспечения
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры обеспечения
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the list of 'GuaranteeDocument' element items. Реквизиты гарантии
     * 
     * @return list
     */
    public List<GuaranteeDocumentType> getGuaranteeDocumentList() {
        return guaranteeDocumentList;
    }

    /** 
     * Set the list of 'GuaranteeDocument' element items. Реквизиты гарантии
     * 
     * @param list
     */
    public void setGuaranteeDocumentList(List<GuaranteeDocumentType> list) {
        guaranteeDocumentList = list;
    }
}
