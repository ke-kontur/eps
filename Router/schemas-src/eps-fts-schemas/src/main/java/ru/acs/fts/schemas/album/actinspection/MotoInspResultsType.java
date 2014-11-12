
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.AutoMotoParametersType;

/** 
 * ���������� �������� ��������� (������) (�������� ������� 8711 �� �� ��� ��)
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
     * Get the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }

    /** 
     * Get the 'MotoKind' element value. ��� ���������. "0" - ��������, "1" - �����, "2" - ������
     * 
     * @return value
     */
    public String getMotoKind() {
        return motoKind;
    }

    /** 
     * Set the 'MotoKind' element value. ��� ���������. "0" - ��������, "1" - �����, "2" - ������
     * 
     * @param motoKind
     */
    public void setMotoKind(String motoKind) {
        this.motoKind = motoKind;
    }

    /** 
     * Get the 'EngineKind' element value. ��� ���������: "1" - �����������, "2" -��������������, "3" - ������
     * 
     * @return value
     */
    public String getEngineKind() {
        return engineKind;
    }

    /** 
     * Set the 'EngineKind' element value. ��� ���������: "1" - �����������, "2" -��������������, "3" - ������
     * 
     * @param engineKind
     */
    public void setEngineKind(String engineKind) {
        this.engineKind = engineKind;
    }

    /** 
     * Get the 'Frame' element value. ���� (��������): "1" - �����, "2" - �����, "3" - ��������, "4" - ������
     * 
     * @return value
     */
    public String getFrame() {
        return frame;
    }

    /** 
     * Set the 'Frame' element value. ���� (��������): "1" - �����, "2" - �����, "3" - ��������, "4" - ������
     * 
     * @param frame
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /** 
     * Get the 'FrontBrake' element value. �������� �������: "1" - ��������, "2" - ����������, "3" - ������
     * 
     * @return value
     */
    public String getFrontBrake() {
        return frontBrake;
    }

    /** 
     * Set the 'FrontBrake' element value. �������� �������: "1" - ��������, "2" - ����������, "3" - ������
     * 
     * @param frontBrake
     */
    public void setFrontBrake(String frontBrake) {
        this.frontBrake = frontBrake;
    }

    /** 
     * Get the 'RearBrake' element value. ������ �������: "1" - ��������, "2" - ����������, "3" - ������
     * 
     * @return value
     */
    public String getRearBrake() {
        return rearBrake;
    }

    /** 
     * Set the 'RearBrake' element value. ������ �������: "1" - ��������, "2" - ����������, "3" - ������
     * 
     * @param rearBrake
     */
    public void setRearBrake(String rearBrake) {
        this.rearBrake = rearBrake;
    }

    /** 
     * Get the 'ElDriveGlass' element value. ������������� �������� ������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getElDriveGlass() {
        return elDriveGlass;
    }

    /** 
     * Set the 'ElDriveGlass' element value. ������������� �������� ������: "0" - ���, "1" - ����
     * 
     * @param elDriveGlass
     */
    public void setElDriveGlass(String elDriveGlass) {
        this.elDriveGlass = elDriveGlass;
    }

    /** 
     * Get the 'ElHeatingHandle' element value. ��������������� �����: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getElHeatingHandle() {
        return elHeatingHandle;
    }

    /** 
     * Set the 'ElHeatingHandle' element value. ��������������� �����: "0" - ���, "1" - ����
     * 
     * @param elHeatingHandle
     */
    public void setElHeatingHandle(String elHeatingHandle) {
        this.elHeatingHandle = elHeatingHandle;
    }

    /** 
     * Get the list of 'Optic' element items. ������
     * 
     * @return list
     */
    public List<String> getOpticList() {
        return opticList;
    }

    /** 
     * Set the list of 'Optic' element items. ������
     * 
     * @param list
     */
    public void setOpticList(List<String> list) {
        opticList = list;
    }

    /** 
     * Get the 'AdjustDevice' element value. ������� ����������� ��������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getAdjustDevice() {
        return adjustDevice;
    }

    /** 
     * Set the 'AdjustDevice' element value. ������� ����������� ��������: "0" - ���, "1" - ����
     * 
     * @param adjustDevice
     */
    public void setAdjustDevice(String adjustDevice) {
        this.adjustDevice = adjustDevice;
    }
}
