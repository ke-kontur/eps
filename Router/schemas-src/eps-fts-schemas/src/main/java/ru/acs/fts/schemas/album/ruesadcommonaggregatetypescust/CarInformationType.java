
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Сведения о комплектации автомобиля
 */
public class CarInformationType
{
    private String arriveType;
    private String VINID;
    private AutoInspResultsType autoInspResults;

    /** 
     * Get the 'ArriveType' element value. Прибытие: 1 - своим ходом, 2 - на транспортном средстве, 3 - в контейнере
     * 
     * @return value
     */
    public String getArriveType() {
        return arriveType;
    }

    /** 
     * Set the 'ArriveType' element value. Прибытие: 1 - своим ходом, 2 - на транспортном средстве, 3 - в контейнере
     * 
     * @param arriveType
     */
    public void setArriveType(String arriveType) {
        this.arriveType = arriveType;
    }

    /** 
     * Get the 'VINID' element value. Идентификационный номер (VIN) транспортного средства
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Идентификационный номер (VIN) транспортного средства
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'AutoInspResults' element value. Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
     * 
     * @return value
     */
    public AutoInspResultsType getAutoInspResults() {
        return autoInspResults;
    }

    /** 
     * Set the 'AutoInspResults' element value. Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
     * 
     * @param autoInspResults
     */
    public void setAutoInspResults(AutoInspResultsType autoInspResults) {
        this.autoInspResults = autoInspResults;
    }
}
