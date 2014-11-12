
package ru.acs.fts.schemas.album.transportmeanspassport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.commonleaftypescust.TransportCategoryCodeType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ConformanceCertificateType;

/** 
 * Сведения о транспортном средстве
 */
public class PTSDataType extends AutomobileBaseType
{
    private String kind;
    private TransportCategoryCodeType transportCategoryCode;
    private String transportMeansColorCode;
    private String engineModel;
    private String enginePowerKvtQuanity;
    private String enginePowerHpQuanity;
    private String maxWeightQuantity;
    private String minWeightQuantity;
    private String engineModeCode;
    private String ekoclass;
    private String specialMark;
    private ConformanceCertificateType conformanceCertificate;
    private List<TransportColorListType> transportMeansColorList = new ArrayList<TransportColorListType>();

    /** 
     * Get the 'Kind' element value. Тип транспортного средства
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Тип транспортного средства
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
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
     * Get the 'EngineModeCode' element value. Код типа двигателя
     * 
     * @return value
     */
    public String getEngineModeCode() {
        return engineModeCode;
    }

    /** 
     * Set the 'EngineModeCode' element value. Код типа двигателя
     * 
     * @param engineModeCode
     */
    public void setEngineModeCode(String engineModeCode) {
        this.engineModeCode = engineModeCode;
    }

    /** 
     * Get the 'Ekoclass' element value. Экологический класс ("0"-нулевой, "1" - первый, "2" - второй, "3" - третий, "4" - четвертый, "5" - пятый)
     * 
     * @return value
     */
    public String getEkoclass() {
        return ekoclass;
    }

    /** 
     * Set the 'Ekoclass' element value. Экологический класс ("0"-нулевой, "1" - первый, "2" - второй, "3" - третий, "4" - четвертый, "5" - пятый)
     * 
     * @param ekoclass
     */
    public void setEkoclass(String ekoclass) {
        this.ekoclass = ekoclass;
    }

    /** 
     * Get the 'SpecialMark' element value. Особые отметки
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. Особые отметки
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /** 
     * Get the 'ConformanceCertificate' element value. Реквизиты Одобрения типа ТС /Сертификата соответствия
     * 
     * @return value
     */
    public ConformanceCertificateType getConformanceCertificate() {
        return conformanceCertificate;
    }

    /** 
     * Set the 'ConformanceCertificate' element value. Реквизиты Одобрения типа ТС /Сертификата соответствия
     * 
     * @param conformanceCertificate
     */
    public void setConformanceCertificate(
            ConformanceCertificateType conformanceCertificate) {
        this.conformanceCertificate = conformanceCertificate;
    }

    /** 
     * Get the list of 'TransportMeansColorList' element items. Список цветов ТС, шасси ТС. Заполняется названиями основных  цветов,  если цвет - многоцветный.
     * 
     * @return list
     */
    public List<TransportColorListType> getTransportMeansColorList() {
        return transportMeansColorList;
    }

    /** 
     * Set the list of 'TransportMeansColorList' element items. Список цветов ТС, шасси ТС. Заполняется названиями основных  цветов,  если цвет - многоцветный.
     * 
     * @param list
     */
    public void setTransportMeansColorList(List<TransportColorListType> list) {
        transportMeansColorList = list;
    }
}
