
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;

/** 
 * Весовые параметры ТС
 */
public class WeightType
{
    private List<String> pinList = new ArrayList<String>();
    private String total;
    private String pinCount;
    private List<String> distanceList = new ArrayList<String>();
    private String cargo;

    /** 
     * Get the list of 'Pin' element items. Список нагрузок на каждую ось, т
     * 
     * @return list
     */
    public List<String> getPinList() {
        return pinList;
    }

    /** 
     * Set the list of 'Pin' element items. Список нагрузок на каждую ось, т
     * 
     * @param list
     */
    public void setPinList(List<String> list) {
        pinList = list;
    }

    /** 
     * Get the 'Total' element value. Суммарная нагрузка на оси ТС
     * 
     * @return value
     */
    public String getTotal() {
        return total;
    }

    /** 
     * Set the 'Total' element value. Суммарная нагрузка на оси ТС
     * 
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /** 
     * Get the 'PinCount' element value. Количество осей ТС
     * 
     * @return value
     */
    public String getPinCount() {
        return pinCount;
    }

    /** 
     * Set the 'PinCount' element value. Количество осей ТС
     * 
     * @param pinCount
     */
    public void setPinCount(String pinCount) {
        this.pinCount = pinCount;
    }

    /** 
     * Get the list of 'Distance' element items. Список расстояний между осями, м
     * 
     * @return list
     */
    public List<String> getDistanceList() {
        return distanceList;
    }

    /** 
     * Set the list of 'Distance' element items. Список расстояний между осями, м
     * 
     * @param list
     */
    public void setDistanceList(List<String> list) {
        distanceList = list;
    }

    /** 
     * Get the 'Cargo' element value. Вес груза, т
     * 
     * @return value
     */
    public String getCargo() {
        return cargo;
    }

    /** 
     * Set the 'Cargo' element value. Вес груза, т
     * 
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
