
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� ������ �� ������������� ���������
 */
public class WHDocumentCancelationType
{
    private LocalDate cancelDate;
    private String cancelReason;
    private WHCustomInspectorType inspector;

    /** 
     * Get the 'CancelDate' element value. ���� �������������
     * 
     * @return value
     */
    public LocalDate getCancelDate() {
        return cancelDate;
    }

    /** 
     * Set the 'CancelDate' element value. ���� �������������
     * 
     * @param cancelDate
     */
    public void setCancelDate(LocalDate cancelDate) {
        this.cancelDate = cancelDate;
    }

    /** 
     * Get the 'CancelReason' element value. ������� �������������
     * 
     * @return value
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /** 
     * Set the 'CancelReason' element value. ������� �������������
     * 
     * @param cancelReason
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /** 
     * Get the 'Inspector' element value. ��������� ����������� ������, �������������� �����
     * 
     * @return value
     */
    public WHCustomInspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. ��������� ����������� ������, �������������� �����
     * 
     * @param inspector
     */
    public void setInspector(WHCustomInspectorType inspector) {
        this.inspector = inspector;
    }
}
