
package ru.acs.fts.schemas.album.regnumberactinspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� ����� ���� ����������� ��������/�������
 */
public class RegNumberActInspectionType extends BaseDocType
{
    private List<String> actNumberList = new ArrayList<String>();
    private LocalDate inspectionDate;
    private String documentModeID;

    /** 
     * Get the list of 'ActNumber' element items. ����� ���� ����������� ��������
     * 
     * @return list
     */
    public List<String> getActNumberList() {
        return actNumberList;
    }

    /** 
     * Set the list of 'ActNumber' element items. ����� ���� ����������� ��������
     * 
     * @param list
     */
    public void setActNumberList(List<String> list) {
        actNumberList = list;
    }

    /** 
     * Get the 'InspectionDate' element value. ���� ����������� ��������
     * 
     * @return value
     */
    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    /** 
     * Set the 'InspectionDate' element value. ���� ����������� ��������
     * 
     * @param inspectionDate
     */
    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
