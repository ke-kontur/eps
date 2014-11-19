
package ru.acs.fts.schemas.album.doreginfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHDocumentRegisterNumberType;

/** 
 * �����������  � ����������� ���������� ��
 */
public class DORegInfoType extends BaseDocType
{
    private LocalDate regDate;
    private String regTime;
    private String formReport;
    private WHCustomInspectorType customInspector;
    private WHDocumentRegisterNumberType registerNumberReport;
    private String documentModeID;

    /** 
     * Get the 'RegDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� �����������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getRegTime() {
        return regTime;
    }

    /** 
     * Set the 'RegTime' element value. ����� �����������
     * 
     * @param regTime
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    /** 
     * Get the 'FormReport' element value. ����� ������: 1- ��1; 2 - ��2; 3 - ��3.
     * 
     * @return value
     */
    public String getFormReport() {
        return formReport;
    }

    /** 
     * Set the 'FormReport' element value. ����� ������: 1- ��1; 2 - ��2; 3 - ��3.
     * 
     * @param formReport
     */
    public void setFormReport(String formReport) {
        this.formReport = formReport;
    }

    /** 
     * Get the 'CustomInspector' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomInspector() {
        return customInspector;
    }

    /** 
     * Set the 'CustomInspector' element value. ����������� ���� ����������� ������
     * 
     * @param customInspector
     */
    public void setCustomInspector(WHCustomInspectorType customInspector) {
        this.customInspector = customInspector;
    }

    /** 
     * Get the 'RegisterNumberReport' element value. ��������������� ����� ������ ��1/��2/��3
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getRegisterNumberReport() {
        return registerNumberReport;
    }

    /** 
     * Set the 'RegisterNumberReport' element value. ��������������� ����� ������ ��1/��2/��3
     * 
     * @param registerNumberReport
     */
    public void setRegisterNumberReport(
            WHDocumentRegisterNumberType registerNumberReport) {
        this.registerNumberReport = registerNumberReport;
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
