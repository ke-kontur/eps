
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * ќписание перевозочных приспособлений
 */
public class WorkToolType
{
    private String railwayCode;
    private String workToolID;
    private String containerModeDescription;

    /** 
     * Get the 'RailwayCode' element value.  од железнодорожной дороги - владельца перевозочного приспособлени€. Ќе указываетс€, если приспособление не принадлежит железным дорогам
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value.  од железнодорожной дороги - владельца перевозочного приспособлени€. Ќе указываетс€, если приспособление не принадлежит железным дорогам
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'WorkToolID' element value. «нак и номер перевозочного приспособлени€
     * 
     * @return value
     */
    public String getWorkToolID() {
        return workToolID;
    }

    /** 
     * Set the 'WorkToolID' element value. «нак и номер перевозочного приспособлени€
     * 
     * @param workToolID
     */
    public void setWorkToolID(String workToolID) {
        this.workToolID = workToolID;
    }

    /** 
     * Get the 'ContainerModeDescription' element value. ќписание вида контейнера
     * 
     * @return value
     */
    public String getContainerModeDescription() {
        return containerModeDescription;
    }

    /** 
     * Set the 'ContainerModeDescription' element value. ќписание вида контейнера
     * 
     * @param containerModeDescription
     */
    public void setContainerModeDescription(String containerModeDescription) {
        this.containerModeDescription = containerModeDescription;
    }
}
