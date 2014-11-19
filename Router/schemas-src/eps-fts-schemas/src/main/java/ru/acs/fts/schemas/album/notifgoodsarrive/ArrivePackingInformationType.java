
package ru.acs.fts.schemas.album.notifgoodsarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHPackingInformationType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHPalleteInformationType;

/** 
 * Информация об упаковках
 */
public class ArrivePackingInformationType
{
    private String pakageQuantity;
    private String pakageTypeCode;
    private String pakagePartQuantity;
    private List<WHPackingInformationType> packingInformationList = new ArrayList<WHPackingInformationType>();
    private List<WHPackingInformationType> cargoList = new ArrayList<WHPackingInformationType>();
    private List<WHPalleteInformationType> palleteList = new ArrayList<WHPalleteInformationType>();

    /** 
     * Get the 'PakageQuantity' element value. Общее количество грузовых мест, полностью занятых товаром.
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. Общее количество грузовых мест, полностью занятых товаром.
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'PakageTypeCode' element value. Код наличия упаковки товара: 0 - Без упаковки; 1 - С упаковкой;  2 - Без упаковки в оборудованных емкостях транспортного средства
     * 
     * @return value
     */
    public String getPakageTypeCode() {
        return pakageTypeCode;
    }

    /** 
     * Set the 'PakageTypeCode' element value. Код наличия упаковки товара: 0 - Без упаковки; 1 - С упаковкой;  2 - Без упаковки в оборудованных емкостях транспортного средства
     * 
     * @param pakageTypeCode
     */
    public void setPakageTypeCode(String pakageTypeCode) {
        this.pakageTypeCode = pakageTypeCode;
    }

    /** 
     * Get the 'PakagePartQuantity' element value. Общее количество грузовых мест, частично занятых товаром.
     * 
     * @return value
     */
    public String getPakagePartQuantity() {
        return pakagePartQuantity;
    }

    /** 
     * Set the 'PakagePartQuantity' element value. Общее количество грузовых мест, частично занятых товаром.
     * 
     * @param pakagePartQuantity
     */
    public void setPakagePartQuantity(String pakagePartQuantity) {
        this.pakagePartQuantity = pakagePartQuantity;
    }

    /** 
     * Get the list of 'PackingInformation' element items. Информация об упаковках
     * 
     * @return list
     */
    public List<WHPackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. Информация об упаковках
     * 
     * @param list
     */
    public void setPackingInformationList(List<WHPackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the list of 'Cargo' element items. Сведения о виде груза (при перевозе товара без упаковки)
     * 
     * @return list
     */
    public List<WHPackingInformationType> getCargoList() {
        return cargoList;
    }

    /** 
     * Set the list of 'Cargo' element items. Сведения о виде груза (при перевозе товара без упаковки)
     * 
     * @param list
     */
    public void setCargoList(List<WHPackingInformationType> list) {
        cargoList = list;
    }

    /** 
     * Get the list of 'Pallete' element items. Информация о поддонах и паллетах
     * 
     * @return list
     */
    public List<WHPalleteInformationType> getPalleteList() {
        return palleteList;
    }

    /** 
     * Set the list of 'Pallete' element items. Информация о поддонах и паллетах
     * 
     * @param list
     */
    public void setPalleteList(List<WHPalleteInformationType> list) {
        palleteList = list;
    }
}
