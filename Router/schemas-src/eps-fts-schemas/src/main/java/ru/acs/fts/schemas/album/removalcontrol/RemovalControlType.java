
package ru.acs.fts.schemas.album.removalcontrol;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������������� ������ � ��������
 */
public class RemovalControlType extends BaseDocType
{
    private LocalDate remDate;
    private String remTime;
    private LocalDate createDocDate;
    private String createDocTime;
    private String coordReqNumber;
    private CustomsPersonType person;
    private GTDIDType DTNumber;
    private String documentModeID;

    /** 
     * Get the 'RemDate' element value. ���� ������ � ��������
     * 
     * @return value
     */
    public LocalDate getRemDate() {
        return remDate;
    }

    /** 
     * Set the 'RemDate' element value. ���� ������ � ��������
     * 
     * @param remDate
     */
    public void setRemDate(LocalDate remDate) {
        this.remDate = remDate;
    }

    /** 
     * Get the 'RemTime' element value. ����� ������ � ��������
     * 
     * @return value
     */
    public String getRemTime() {
        return remTime;
    }

    /** 
     * Set the 'RemTime' element value. ����� ������ � ��������
     * 
     * @param remTime
     */
    public void setRemTime(String remTime) {
        this.remTime = remTime;
    }

    /** 
     * Get the 'CreateDocDate' element value. ���� �������� ���������
     * 
     * @return value
     */
    public LocalDate getCreateDocDate() {
        return createDocDate;
    }

    /** 
     * Set the 'CreateDocDate' element value. ���� �������� ���������
     * 
     * @param createDocDate
     */
    public void setCreateDocDate(LocalDate createDocDate) {
        this.createDocDate = createDocDate;
    }

    /** 
     * Get the 'CreateDocTime' element value. ����� �������� ���������
     * 
     * @return value
     */
    public String getCreateDocTime() {
        return createDocTime;
    }

    /** 
     * Set the 'CreateDocTime' element value. ����� �������� ���������
     * 
     * @param createDocTime
     */
    public void setCreateDocTime(String createDocTime) {
        this.createDocTime = createDocTime;
    }

    /** 
     * Get the 'CoordReqNumber' element value. ���������� ����� �����������, ��������������� �� �� � �������� �� ����������
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. ���������� ����� �����������, ��������������� �� �� � �������� �� ����������
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the 'Person' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsPersonType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ���������� �����
     * 
     * @param person
     */
    public void setPerson(CustomsPersonType person) {
        this.person = person;
    }

    /** 
     * Get the 'DTNumber' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ��������������� ����� ��
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
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
