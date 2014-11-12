
package ru.acs.fts.schemas.album.transmissionlist;

/** 
 * Сведения о контейнерах
 */
public class ContainerType
{
    private String railwayCode;
    private String containerID;
    private String containerKind;
    private String containerModeDescription;
    private String containerCapacity;
    private String containerCapacityUnitQualifierCode;

    /** 
     * Get the 'RailwayCode' element value. Код железнодорожной дороги - владельца контейнера. Не указывается, если контейнер не принадлежит железным дорогам
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. Код железнодорожной дороги - владельца контейнера. Не указывается, если контейнер не принадлежит железным дорогам
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'ContainerID' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainerID() {
        return containerID;
    }

    /** 
     * Set the 'ContainerID' element value. Номер контейнера
     * 
     * @param containerID
     */
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /** 
     * Get the 'ContainerKind' element value. Тип контейнера в соответствии с Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getContainerKind() {
        return containerKind;
    }

    /** 
     * Set the 'ContainerKind' element value. Тип контейнера в соответствии с Классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param containerKind
     */
    public void setContainerKind(String containerKind) {
        this.containerKind = containerKind;
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

    /** 
     * Get the 'ContainerCapacity' element value. Емкость контейнера
     * 
     * @return value
     */
    public String getContainerCapacity() {
        return containerCapacity;
    }

    /** 
     * Set the 'ContainerCapacity' element value. Емкость контейнера
     * 
     * @param containerCapacity
     */
    public void setContainerCapacity(String containerCapacity) {
        this.containerCapacity = containerCapacity;
    }

    /** 
     * Get the 'ContainerCapacityUnitQualifierCode' element value. Название единицы измерения емкости контейнера
     * 
     * @return value
     */
    public String getContainerCapacityUnitQualifierCode() {
        return containerCapacityUnitQualifierCode;
    }

    /** 
     * Set the 'ContainerCapacityUnitQualifierCode' element value. Название единицы измерения емкости контейнера
     * 
     * @param containerCapacityUnitQualifierCode
     */
    public void setContainerCapacityUnitQualifierCode(
            String containerCapacityUnitQualifierCode) {
        this.containerCapacityUnitQualifierCode = containerCapacityUnitQualifierCode;
    }
}
