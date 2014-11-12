
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonleaftypescust.CustomsControlKind;

/** 
 * ����������� ��� ��� �������� c������� � ���� ����������� �������� ��� �������� �� ��� �������
 */
public class WHCustomsControlType
{
    private CustomsControlKind kind;
    private LocalDate date;
    private String reason;
    private LocalDate keepingLimit;
    private WHCustomInspectorType inspector;

    /** 
     * Get the 'Kind' element value. ��� ���� ��
     * 
     * @return value
     */
    public CustomsControlKind getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. ��� ���� ��
     * 
     * @param kind
     */
    public void setKind(CustomsControlKind kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'Date' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Reason' element value. ��������� ���������� ���� / ���������� �� �����
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ��������� ���������� ���� / ���������� �� �����
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'KeepingLimit' element value. ���� �� �� �������� ���� ��
     * 
     * @return value
     */
    public LocalDate getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. ���� �� �� �������� ���� ��
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(LocalDate keepingLimit) {
        this.keepingLimit = keepingLimit;
    }

    /** 
     * Get the 'Inspector' element value. ��������� ����������� ������, ����������� ���� ��
     * 
     * @return value
     */
    public WHCustomInspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. ��������� ����������� ������, ����������� ���� ��
     * 
     * @param inspector
     */
    public void setInspector(WHCustomInspectorType inspector) {
        this.inspector = inspector;
    }
}
