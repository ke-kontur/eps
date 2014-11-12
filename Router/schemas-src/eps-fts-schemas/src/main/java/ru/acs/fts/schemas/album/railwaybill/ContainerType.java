
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * �������� � ����������
 */
public class ContainerType
{
    private String railwayCode;
    private String containerID;
    private String containerModeDescription;
    private String containerCapacity;
    private String containerCapacityUnitQualifierCode;

    /** 
     * Get the 'RailwayCode' element value. ��� ��������������� ������ - ��������� ����������. �� �����������, ���� ��������� �� ����������� �������� �������
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. ��� ��������������� ������ - ��������� ����������. �� �����������, ���� ��������� �� ����������� �������� �������
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'ContainerID' element value. ����� ����������
     * 
     * @return value
     */
    public String getContainerID() {
        return containerID;
    }

    /** 
     * Set the 'ContainerID' element value. ����� ����������
     * 
     * @param containerID
     */
    public void setContainerID(String containerID) {
        this.containerID = containerID;
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

    /** 
     * Get the 'ContainerCapacity' element value. ������� ����������
     * 
     * @return value
     */
    public String getContainerCapacity() {
        return containerCapacity;
    }

    /** 
     * Set the 'ContainerCapacity' element value. ������� ����������
     * 
     * @param containerCapacity
     */
    public void setContainerCapacity(String containerCapacity) {
        this.containerCapacity = containerCapacity;
    }

    /** 
     * Get the 'ContainerCapacityUnitQualifierCode' element value. �������� ������� ��������� ������� ����������
     * 
     * @return value
     */
    public String getContainerCapacityUnitQualifierCode() {
        return containerCapacityUnitQualifierCode;
    }

    /** 
     * Set the 'ContainerCapacityUnitQualifierCode' element value. �������� ������� ��������� ������� ����������
     * 
     * @param containerCapacityUnitQualifierCode
     */
    public void setContainerCapacityUnitQualifierCode(
            String containerCapacityUnitQualifierCode) {
        this.containerCapacityUnitQualifierCode = containerCapacityUnitQualifierCode;
    }
}
