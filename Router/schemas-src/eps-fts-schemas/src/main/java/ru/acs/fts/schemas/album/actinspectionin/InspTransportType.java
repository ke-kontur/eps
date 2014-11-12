
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * �������� � ������������  ���������
 */
public class InspTransportType
{
    private String arriveMode;
    private InspTransportMeanType inspTransportMean;
    private ContainerType container;

    /** 
     * Get the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }

    /** 
     * Get the 'InspTransportMean' element value. �������� ������������� ��������
     * 
     * @return value
     */
    public InspTransportMeanType getInspTransportMean() {
        return inspTransportMean;
    }

    /** 
     * Set the 'InspTransportMean' element value. �������� ������������� ��������
     * 
     * @param inspTransportMean
     */
    public void setInspTransportMean(InspTransportMeanType inspTransportMean) {
        this.inspTransportMean = inspTransportMean;
    }

    /** 
     * Get the 'Container' element value. �������� � �����������.
     * 
     * @return value
     */
    public ContainerType getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. �������� � �����������.
     * 
     * @param container
     */
    public void setContainer(ContainerType container) {
        this.container = container;
    }
}
