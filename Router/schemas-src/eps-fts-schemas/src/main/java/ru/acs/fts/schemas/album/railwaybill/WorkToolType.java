
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Описание перевозочных приспособлений
 */
public class WorkToolType
{
    private String railwayCode;
    private String workToolID;
    private String containerModeDescription;

    /** 
     * Get the 'RailwayCode' element value. Код железнодорожной дороги - владельца перевозочного приспособления. Не указывается, если приспособление не принадлежит железным дорогам
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. Код железнодорожной дороги - владельца перевозочного приспособления. Не указывается, если приспособление не принадлежит железным дорогам
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'WorkToolID' element value. Знак и номер перевозочного приспособления
     * 
     * @return value
     */
    public String getWorkToolID() {
        return workToolID;
    }

    /** 
     * Set the 'WorkToolID' element value. Знак и номер перевозочного приспособления
     * 
     * @param workToolID
     */
    public void setWorkToolID(String workToolID) {
        this.workToolID = workToolID;
    }

    /** 
     * Get the 'ContainerModeDescription' element value. Описание вида контейнера
     * 
     * @return value
     */
    public String getContainerModeDescription() {
        return containerModeDescription;
    }

    /** 
     * Set the 'ContainerModeDescription' element value. Описание вида контейнера
     * 
     * @param containerModeDescription
     */
    public void setContainerModeDescription(String containerModeDescription) {
        this.containerModeDescription = containerModeDescription;
    }
}
