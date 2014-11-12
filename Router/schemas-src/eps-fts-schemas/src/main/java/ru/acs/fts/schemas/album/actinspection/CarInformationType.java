
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.AutoInspResultsType;

/** 
 * Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
 */
public class CarInformationType extends AutoInspResultsType
{
    private String arriveMode;

    /** 
     * Get the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }
}
