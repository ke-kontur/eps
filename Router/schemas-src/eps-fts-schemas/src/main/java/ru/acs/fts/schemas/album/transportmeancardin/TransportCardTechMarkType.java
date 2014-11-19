
package ru.acs.fts.schemas.album.transportmeancardin;

import org.joda.time.LocalDate;

/** 
 * �������� ��. ���������� ������. ��������������� �������.
 */
public class TransportCardTechMarkType
{
    private LocalDate dateOut;
    private String timeOut;
    private LocalDate modificationDate;
    private String modificationTime;
    private String modificationIndicator;
    private String packetControlIndicator;
    private String PTSUseDateTime;
    private String PTSOutDateTime;

    /** 
     * Get the 'DateOut' element value. ���� �������� ������.
     * 
     * @return value
     */
    public LocalDate getDateOut() {
        return dateOut;
    }

    /** 
     * Set the 'DateOut' element value. ���� �������� ������.
     * 
     * @param dateOut
     */
    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }

    /** 
     * Get the 'TimeOut' element value. ����� �������� ������.
     * 
     * @return value
     */
    public String getTimeOut() {
        return timeOut;
    }

    /** 
     * Set the 'TimeOut' element value. ����� �������� ������.
     * 
     * @param timeOut
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /** 
     * Get the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /** 
     * Get the 'ModificationIndicator' element value. ������� ����������� ������.
     * 
     * @return value
     */
    public String getModificationIndicator() {
        return modificationIndicator;
    }

    /** 
     * Set the 'ModificationIndicator' element value. ������� ����������� ������.
     * 
     * @param modificationIndicator
     */
    public void setModificationIndicator(String modificationIndicator) {
        this.modificationIndicator = modificationIndicator;
    }

    /** 
     * Get the 'PacketControlIndicator' element value. ��������� ��������� ��������.
     * 
     * @return value
     */
    public String getPacketControlIndicator() {
        return packetControlIndicator;
    }

    /** 
     * Set the 'PacketControlIndicator' element value. ��������� ��������� ��������.
     * 
     * @param packetControlIndicator
     */
    public void setPacketControlIndicator(String packetControlIndicator) {
        this.packetControlIndicator = packetControlIndicator;
    }

    /** 
     * Get the 'PTSUseDateTime' element value. ���� /����� ������������� ������ ���/����
     * 
     * @return value
     */
    public String getPTSUseDateTime() {
        return PTSUseDateTime;
    }

    /** 
     * Set the 'PTSUseDateTime' element value. ���� /����� ������������� ������ ���/����
     * 
     * @param PTSUseDateTime
     */
    public void setPTSUseDateTime(String PTSUseDateTime) {
        this.PTSUseDateTime = PTSUseDateTime;
    }

    /** 
     * Get the 'PTSOutDateTime' element value. ���� /����� �������� ��� �������� � ���������� ����� ������� ���/����
     * 
     * @return value
     */
    public String getPTSOutDateTime() {
        return PTSOutDateTime;
    }

    /** 
     * Set the 'PTSOutDateTime' element value. ���� /����� �������� ��� �������� � ���������� ����� ������� ���/����
     * 
     * @param PTSOutDateTime
     */
    public void setPTSOutDateTime(String PTSOutDateTime) {
        this.PTSOutDateTime = PTSOutDateTime;
    }
}
