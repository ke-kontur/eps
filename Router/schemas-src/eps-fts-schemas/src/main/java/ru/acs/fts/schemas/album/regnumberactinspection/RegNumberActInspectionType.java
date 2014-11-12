
package ru.acs.fts.schemas.album.regnumberactinspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Регистрационный номер акта таможенного досмотра/осмотра
 */
public class RegNumberActInspectionType extends BaseDocType
{
    private List<String> actNumberList = new ArrayList<String>();
    private LocalDate inspectionDate;
    private String documentModeID;

    /** 
     * Get the list of 'ActNumber' element items. Номер акта таможенного досмотра
     * 
     * @return list
     */
    public List<String> getActNumberList() {
        return actNumberList;
    }

    /** 
     * Set the list of 'ActNumber' element items. Номер акта таможенного досмотра
     * 
     * @param list
     */
    public void setActNumberList(List<String> list) {
        actNumberList = list;
    }

    /** 
     * Get the 'InspectionDate' element value. Дата таможенного досмотра
     * 
     * @return value
     */
    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    /** 
     * Set the 'InspectionDate' element value. Дата таможенного досмотра
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
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
