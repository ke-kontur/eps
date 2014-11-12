
package ru.acs.fts.schemas.album.transportmeanschassispassport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ConformanceCertificateType;

/** 
 * �������� � ����� ������������� ��������
 */
public class PShTSDataType extends AutomobileBaseType
{
    private String engineModel;
    private String enginePowerKvtQuanity;
    private String enginePowerHpQuanity;
    private String engineModeCode;
    private String colorCode;
    private String colorName;
    private String ekoclass;
    private ConformanceCertificateType conformanceCertificate;
    private List<TransportColorListType> chassisColorList = new ArrayList<TransportColorListType>();

    /** 
     * Get the 'EngineModel' element value. ������ ���������
     * 
     * @return value
     */
    public String getEngineModel() {
        return engineModel;
    }

    /** 
     * Set the 'EngineModel' element value. ������ ���������
     * 
     * @param engineModel
     */
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /** 
     * Get the 'EnginePowerKvtQuanity' element value. �������� ��������� � ����������
     * 
     * @return value
     */
    public String getEnginePowerKvtQuanity() {
        return enginePowerKvtQuanity;
    }

    /** 
     * Set the 'EnginePowerKvtQuanity' element value. �������� ��������� � ����������
     * 
     * @param enginePowerKvtQuanity
     */
    public void setEnginePowerKvtQuanity(String enginePowerKvtQuanity) {
        this.enginePowerKvtQuanity = enginePowerKvtQuanity;
    }

    /** 
     * Get the 'EnginePowerHpQuanity' element value. �������� ��������� � ��������� �����
     * 
     * @return value
     */
    public String getEnginePowerHpQuanity() {
        return enginePowerHpQuanity;
    }

    /** 
     * Set the 'EnginePowerHpQuanity' element value. �������� ��������� � ��������� �����
     * 
     * @param enginePowerHpQuanity
     */
    public void setEnginePowerHpQuanity(String enginePowerHpQuanity) {
        this.enginePowerHpQuanity = enginePowerHpQuanity;
    }

    /** 
     * Get the 'EngineModeCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getEngineModeCode() {
        return engineModeCode;
    }

    /** 
     * Set the 'EngineModeCode' element value. ��� ���� ���������
     * 
     * @param engineModeCode
     */
    public void setEngineModeCode(String engineModeCode) {
        this.engineModeCode = engineModeCode;
    }

    /** 
     * Get the 'ColorCode' element value. ��� ����� ������, ������
     * 
     * @return value
     */
    public String getColorCode() {
        return colorCode;
    }

    /** 
     * Set the 'ColorCode' element value. ��� ����� ������, ������
     * 
     * @param colorCode
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    /** 
     * Get the 'ColorName' element value. ������������ ����� ������, ������
     * 
     * @return value
     */
    public String getColorName() {
        return colorName;
    }

    /** 
     * Set the 'ColorName' element value. ������������ ����� ������, ������
     * 
     * @param colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /** 
     * Get the 'Ekoclass' element value. ������������� ����� ("0"-�������, "1" - ������, "2" - ������, "3" - ������, "4" - ���������, "5" - �����)
     * 
     * @return value
     */
    public String getEkoclass() {
        return ekoclass;
    }

    /** 
     * Set the 'Ekoclass' element value. ������������� ����� ("0"-�������, "1" - ������, "2" - ������, "3" - ������, "4" - ���������, "5" - �����)
     * 
     * @param ekoclass
     */
    public void setEkoclass(String ekoclass) {
        this.ekoclass = ekoclass;
    }

    /** 
     * Get the 'ConformanceCertificate' element value. ��������� ��������� ���� �� /����������� ������������
     * 
     * @return value
     */
    public ConformanceCertificateType getConformanceCertificate() {
        return conformanceCertificate;
    }

    /** 
     * Set the 'ConformanceCertificate' element value. ��������� ��������� ���� �� /����������� ������������
     * 
     * @param conformanceCertificate
     */
    public void setConformanceCertificate(
            ConformanceCertificateType conformanceCertificate) {
        this.conformanceCertificate = conformanceCertificate;
    }

    /** 
     * Get the list of 'ChassisColorList' element items. ������ ������ �����. ����������� ���������� ��������  ������,  ���� ���� - ������������.
     * 
     * @return list
     */
    public List<TransportColorListType> getChassisColorList() {
        return chassisColorList;
    }

    /** 
     * Set the list of 'ChassisColorList' element items. ������ ������ �����. ����������� ���������� ��������  ������,  ���� ���� - ������������.
     * 
     * @param list
     */
    public void setChassisColorList(List<TransportColorListType> list) {
        chassisColorList = list;
    }
}
