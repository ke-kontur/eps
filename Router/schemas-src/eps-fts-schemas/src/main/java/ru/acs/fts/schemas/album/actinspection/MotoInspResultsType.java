
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.AutoMotoParametersType;

/** 
 * Результаты досмотра мотоцикла (мопеда) (товарная позиция 8711 по ТН ВЭД ТС)
 */
public class MotoInspResultsType extends AutoMotoParametersType
{
    private String arriveMode;
    private String motoKind;
    private String engineKind;
    private String frame;
    private String frontBrake;
    private String rearBrake;
    private String elDriveGlass;
    private String elHeatingHandle;
    private List<String> opticList = new ArrayList<String>();
    private String adjustDevice;

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

    /** 
     * Get the 'MotoKind' element value. Тип мотоцикла. "0" - мотоцикл, "1" - мопед, "2" - скутер
     * 
     * @return value
     */
    public String getMotoKind() {
        return motoKind;
    }

    /** 
     * Set the 'MotoKind' element value. Тип мотоцикла. "0" - мотоцикл, "1" - мопед, "2" - скутер
     * 
     * @param motoKind
     */
    public void setMotoKind(String motoKind) {
        this.motoKind = motoKind;
    }

    /** 
     * Get the 'EngineKind' element value. Тип двигателя: "1" - двухтактный, "2" -четырехтактный, "3" - прочее
     * 
     * @return value
     */
    public String getEngineKind() {
        return engineKind;
    }

    /** 
     * Set the 'EngineKind' element value. Тип двигателя: "1" - двухтактный, "2" -четырехтактный, "3" - прочее
     * 
     * @param engineKind
     */
    public void setEngineKind(String engineKind) {
        this.engineKind = engineKind;
    }

    /** 
     * Get the 'Frame' element value. Рама (материал): "1" - сталь, "2" - титан, "3" - алюминий, "4" - прочее
     * 
     * @return value
     */
    public String getFrame() {
        return frame;
    }

    /** 
     * Set the 'Frame' element value. Рама (материал): "1" - сталь, "2" - титан, "3" - алюминий, "4" - прочее
     * 
     * @param frame
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /** 
     * Get the 'FrontBrake' element value. Передние тормоза: "1" - дисковые, "2" - барабанные, "3" - прочее
     * 
     * @return value
     */
    public String getFrontBrake() {
        return frontBrake;
    }

    /** 
     * Set the 'FrontBrake' element value. Передние тормоза: "1" - дисковые, "2" - барабанные, "3" - прочее
     * 
     * @param frontBrake
     */
    public void setFrontBrake(String frontBrake) {
        this.frontBrake = frontBrake;
    }

    /** 
     * Get the 'RearBrake' element value. Задние тормоза: "1" - дисковые, "2" - барабанные, "3" - прочее
     * 
     * @return value
     */
    public String getRearBrake() {
        return rearBrake;
    }

    /** 
     * Set the 'RearBrake' element value. Задние тормоза: "1" - дисковые, "2" - барабанные, "3" - прочее
     * 
     * @param rearBrake
     */
    public void setRearBrake(String rearBrake) {
        this.rearBrake = rearBrake;
    }

    /** 
     * Get the 'ElDriveGlass' element value. Электропривод лобового стекла: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getElDriveGlass() {
        return elDriveGlass;
    }

    /** 
     * Set the 'ElDriveGlass' element value. Электропривод лобового стекла: "0" - нет, "1" - есть
     * 
     * @param elDriveGlass
     */
    public void setElDriveGlass(String elDriveGlass) {
        this.elDriveGlass = elDriveGlass;
    }

    /** 
     * Get the 'ElHeatingHandle' element value. Электроподогрев ручек: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getElHeatingHandle() {
        return elHeatingHandle;
    }

    /** 
     * Set the 'ElHeatingHandle' element value. Электроподогрев ручек: "0" - нет, "1" - есть
     * 
     * @param elHeatingHandle
     */
    public void setElHeatingHandle(String elHeatingHandle) {
        this.elHeatingHandle = elHeatingHandle;
    }

    /** 
     * Get the list of 'Optic' element items. Оптика
     * 
     * @return list
     */
    public List<String> getOpticList() {
        return opticList;
    }

    /** 
     * Set the list of 'Optic' element items. Оптика
     * 
     * @param list
     */
    public void setOpticList(List<String> list) {
        opticList = list;
    }

    /** 
     * Get the 'AdjustDevice' element value. Наличие регулировки подвески: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getAdjustDevice() {
        return adjustDevice;
    }

    /** 
     * Set the 'AdjustDevice' element value. Наличие регулировки подвески: "0" - нет, "1" - есть
     * 
     * @param adjustDevice
     */
    public void setAdjustDevice(String adjustDevice) {
        this.adjustDevice = adjustDevice;
    }
}
