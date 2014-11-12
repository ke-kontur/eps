
package ru.acs.fts.schemas.album.revealingtransportpp;

import org.joda.time.LocalDate;

/** 
 * ��������� ����������
 */
public class ServiceInfoType
{
    private String transportID;
    private LocalDate crossDate;
    private String customsID;
    private String customsProcedure;

    /** 
     * Get the 'TransportID' element value. ������������� ��������� �  ��������/������
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. ������������� ��������� �  ��������/������
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'CrossDate' element value. ���� ������ ���������� (��� ��� ��)/���� ������������ ������� �� ��������� ������ (��� ����-�)
     * 
     * @return value
     */
    public LocalDate getCrossDate() {
        return crossDate;
    }

    /** 
     * Set the 'CrossDate' element value. ���� ������ ���������� (��� ��� ��)/���� ������������ ������� �� ��������� ������ (��� ����-�)
     * 
     * @param crossDate
     */
    public void setCrossDate(LocalDate crossDate) {
        this.crossDate = crossDate;
    }

    /** 
     * Get the 'CustomsID' element value. ��� ����������� ������ (����)
     * 
     * @return value
     */
    public String getCustomsID() {
        return customsID;
    }

    /** 
     * Set the 'CustomsID' element value. ��� ����������� ������ (����)
     * 
     * @param customsID
     */
    public void setCustomsID(String customsID) {
        this.customsID = customsID;
    }

    /** 
     * Get the 'CustomsProcedure' element value. ����������� �����������: �� (��������)/ �� (������)
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ����������� �����������: �� (��������)/ �� (������)
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }
}
