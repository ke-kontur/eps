
package ru.acs.fts.schemas.album.reportclosecontrol;

import org.joda.time.LocalDate;

/** 
 * ������� ��������
 */
public class CloseReasonType
{
    private String reasonCode;
    private String inspectorNotice;
    private String LNP;
    private LocalDate closeDate;
    private NormativeDocumentType closeNormativeDoc;

    /** 
     * Get the 'ReasonCode' element value. ��� ������� �������� � ������������ �� ������������ ������ ��������
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. ��� ������� �������� � ������������ �� ������������ ������ ��������
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the 'InspectorNotice' element value. ���������� ����������
     * 
     * @return value
     */
    public String getInspectorNotice() {
        return inspectorNotice;
    }

    /** 
     * Set the 'InspectorNotice' element value. ���������� ����������
     * 
     * @param inspectorNotice
     */
    public void setInspectorNotice(String inspectorNotice) {
        this.inspectorNotice = inspectorNotice;
    }

    /** 
     * Get the 'LNP' element value. ��� ����������, ���������� ���
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ��� ����������, ���������� ���
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'CloseDate' element value. ���� �������� ������ �� ���
     * 
     * @return value
     */
    public LocalDate getCloseDate() {
        return closeDate;
    }

    /** 
     * Set the 'CloseDate' element value. ���� �������� ������ �� ���
     * 
     * @param closeDate
     */
    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    /** 
     * Get the 'CloseNormativeDoc' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @return value
     */
    public NormativeDocumentType getCloseNormativeDoc() {
        return closeNormativeDoc;
    }

    /** 
     * Set the 'CloseNormativeDoc' element value. ����������� ��������, � ������������ � ������� ����������� ��������
     * 
     * @param closeNormativeDoc
     */
    public void setCloseNormativeDoc(NormativeDocumentType closeNormativeDoc) {
        this.closeNormativeDoc = closeNormativeDoc;
    }
}
