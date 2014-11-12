
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.commonleaftypescust.TransportCategoryCodeType;

/** 
 * Сведения о транспортном средстве 
 */
public class CDITransportMeansType extends AutomobileBaseType
{
    private String transportStateSignID;
    private String transportMeansColorCode;
    private String enginePowerKvtQuanity;
    private String enginePowerHpQuanity;
    private String maxWeightQuantity;
    private String minWeightQuantity;
    private TransportCategoryCodeType transportCategoryCode;
    private String engineModel;
    private String kind;

    /** 
     * Get the 'TransportStateSignID' element value. Государственный знак транспортного средства
     * 
     * @return value
     */
    public String getTransportStateSignID() {
        return transportStateSignID;
    }

    /** 
     * Set the 'TransportStateSignID' element value. Государственный знак транспортного средства
     * 
     * @param transportStateSignID
     */
    public void setTransportStateSignID(String transportStateSignID) {
        this.transportStateSignID = transportStateSignID;
    }

    /** 
     * Get the 'TransportMeansColorCode' element value. Код цвета транспортного средства
     * 
     * @return value
     */
    public String getTransportMeansColorCode() {
        return transportMeansColorCode;
    }

    /** 
     * Set the 'TransportMeansColorCode' element value. Код цвета транспортного средства
     * 
     * @param transportMeansColorCode
     */
    public void setTransportMeansColorCode(String transportMeansColorCode) {
        this.transportMeansColorCode = transportMeansColorCode;
    }

    /** 
     * Get the 'EnginePowerKvtQuanity' element value. Мощность двигателя в киловаттах
     * 
     * @return value
     */
    public String getEnginePowerKvtQuanity() {
        return enginePowerKvtQuanity;
    }

    /** 
     * Set the 'EnginePowerKvtQuanity' element value. Мощность двигателя в киловаттах
     * 
     * @param enginePowerKvtQuanity
     */
    public void setEnginePowerKvtQuanity(String enginePowerKvtQuanity) {
        this.enginePowerKvtQuanity = enginePowerKvtQuanity;
    }

    /** 
     * Get the 'EnginePowerHpQuanity' element value. Мощность двигателя в лошадиных силах
     * 
     * @return value
     */
    public String getEnginePowerHpQuanity() {
        return enginePowerHpQuanity;
    }

    /** 
     * Set the 'EnginePowerHpQuanity' element value. Мощность двигателя в лошадиных силах
     * 
     * @param enginePowerHpQuanity
     */
    public void setEnginePowerHpQuanity(String enginePowerHpQuanity) {
        this.enginePowerHpQuanity = enginePowerHpQuanity;
    }

    /** 
     * Get the 'MaxWeightQuantity' element value. Разрешенная максимальная масса ТС в кг
     * 
     * @return value
     */
    public String getMaxWeightQuantity() {
        return maxWeightQuantity;
    }

    /** 
     * Set the 'MaxWeightQuantity' element value. Разрешенная максимальная масса ТС в кг
     * 
     * @param maxWeightQuantity
     */
    public void setMaxWeightQuantity(String maxWeightQuantity) {
        this.maxWeightQuantity = maxWeightQuantity;
    }

    /** 
     * Get the 'MinWeightQuantity' element value. Масса без нагрузки в кг
     * 
     * @return value
     */
    public String getMinWeightQuantity() {
        return minWeightQuantity;
    }

    /** 
     * Set the 'MinWeightQuantity' element value. Масса без нагрузки в кг
     * 
     * @param minWeightQuantity
     */
    public void setMinWeightQuantity(String minWeightQuantity) {
        this.minWeightQuantity = minWeightQuantity;
    }

    /** 
     * Get the 'TransportCategoryCode' element value. Категория транспортного средства
     * 
     * @return value
     */
    public TransportCategoryCodeType getTransportCategoryCode() {
        return transportCategoryCode;
    }

    /** 
     * Set the 'TransportCategoryCode' element value. Категория транспортного средства
     * 
     * @param transportCategoryCode
     */
    public void setTransportCategoryCode(
            TransportCategoryCodeType transportCategoryCode) {
        this.transportCategoryCode = transportCategoryCode;
    }

    /** 
     * Get the 'EngineModel' element value. Модель двигателя
     * 
     * @return value
     */
    public String getEngineModel() {
        return engineModel;
    }

    /** 
     * Set the 'EngineModel' element value. Модель двигателя
     * 
     * @param engineModel
     */
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /** 
     * Get the 'Kind' element value. Тип ТС
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Тип ТС
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
