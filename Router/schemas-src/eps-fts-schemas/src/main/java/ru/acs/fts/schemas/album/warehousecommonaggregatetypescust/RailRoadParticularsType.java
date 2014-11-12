
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания подробностей для железнодорожного транспорта
 */
public class RailRoadParticularsType
{
    private String railStation;

    /** 
     * Get the 'RailStation' element value. Код станции отправления (для прибытия) или назначения (для убытия)
     * 
     * @return value
     */
    public String getRailStation() {
        return railStation;
    }

    /** 
     * Set the 'RailStation' element value. Код станции отправления (для прибытия) или назначения (для убытия)
     * 
     * @param railStation
     */
    public void setRailStation(String railStation) {
        this.railStation = railStation;
    }
}
