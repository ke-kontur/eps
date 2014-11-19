
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * �������� ������������ ��������������
 */
public class WorkToolType
{
    private String railwayCode;
    private String workToolID;
    private String containerModeDescription;

    /** 
     * Get the 'RailwayCode' element value. ��� ��������������� ������ - ��������� ������������� ��������������. �� �����������, ���� �������������� �� ����������� �������� �������
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. ��� ��������������� ������ - ��������� ������������� ��������������. �� �����������, ���� �������������� �� ����������� �������� �������
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'WorkToolID' element value. ���� � ����� ������������� ��������������
     * 
     * @return value
     */
    public String getWorkToolID() {
        return workToolID;
    }

    /** 
     * Set the 'WorkToolID' element value. ���� � ����� ������������� ��������������
     * 
     * @param workToolID
     */
    public void setWorkToolID(String workToolID) {
        this.workToolID = workToolID;
    }

    /** 
     * Get the 'ContainerModeDescription' element value. �������� ���� ����������
     * 
     * @return value
     */
    public String getContainerModeDescription() {
        return containerModeDescription;
    }

    /** 
     * Set the 'ContainerModeDescription' element value. �������� ���� ����������
     * 
     * @param containerModeDescription
     */
    public void setContainerModeDescription(String containerModeDescription) {
        this.containerModeDescription = containerModeDescription;
    }
}
