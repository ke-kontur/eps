
package ru.acs.fts.schemas.aud.aud_registryrequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

public class AUDRegistryRequestType extends AUDBaseEnvelopeType
{
    private LocalDate dateBegin;
    private LocalDate dateStop;
    private String dateIndicatior;
    private String documentModeID;

    /** 
     * Get the 'DateBegin' element value. ����  ������  ����������  ����������
     * 
     * @return value
     */
    public LocalDate getDateBegin() {
        return dateBegin;
    }

    /** 
     * Set the 'DateBegin' element value. ����  ������  ����������  ����������
     * 
     * @param dateBegin
     */
    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    /** 
     * Get the 'DateStop' element value. ����  ���������  ����������  ����������
     * 
     * @return value
     */
    public LocalDate getDateStop() {
        return dateStop;
    }

    /** 
     * Set the 'DateStop' element value. ����  ���������  ����������  ����������
     * 
     * @param dateStop
     */
    public void setDateStop(LocalDate dateStop) {
        this.dateStop = dateStop;
    }

    /** 
     * Get the 'DateIndicatior' element value. �������  ��������� ���. 1-���� ���������� ������ � ������ 2- ���� ����������� ���
     * 
     * @return value
     */
    public String getDateIndicatior() {
        return dateIndicatior;
    }

    /** 
     * Set the 'DateIndicatior' element value. �������  ��������� ���. 1-���� ���������� ������ � ������ 2- ���� ����������� ���
     * 
     * @param dateIndicatior
     */
    public void setDateIndicatior(String dateIndicatior) {
        this.dateIndicatior = dateIndicatior;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
