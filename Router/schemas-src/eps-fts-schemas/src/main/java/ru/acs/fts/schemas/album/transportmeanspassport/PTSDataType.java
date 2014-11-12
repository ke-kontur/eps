
package ru.acs.fts.schemas.album.transportmeanspassport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.commonleaftypescust.TransportCategoryCodeType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ConformanceCertificateType;

/** 
 * �������� � ������������ ��������
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
     * Get the 'Kind' element value. ��� ������������� ��������
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. ��� ������������� ��������
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'TransportCategoryCode' element value. ��������� ������������� ��������
     * 
     * @return value
     */
    public TransportCategoryCodeType getTransportCategoryCode() {
        return transportCategoryCode;
    }

    /** 
     * Set the 'TransportCategoryCode' element value. ��������� ������������� ��������
     * 
     * @param transportCategoryCode
     */
    public void setTransportCategoryCode(
            TransportCategoryCodeType transportCategoryCode) {
        this.transportCategoryCode = transportCategoryCode;
    }

    /** 
     * Get the 'TransportMeansColorCode' element value. ��� ����� ������������� ��������
     * 
     * @return value
     */
    public String getTransportMeansColorCode() {
        return transportMeansColorCode;
    }

    /** 
     * Set the 'TransportMeansColorCode' element value. ��� ����� ������������� ��������
     * 
     * @param transportMeansColorCode
     */
    public void setTransportMeansColorCode(String transportMeansColorCode) {
        this.transportMeansColorCode = transportMeansColorCode;
    }

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
     * Get the 'MaxWeightQuantity' element value. ����������� ������������ ����� �� � ��
     * 
     * @return value
     */
    public String getMaxWeightQuantity() {
        return maxWeightQuantity;
    }

    /** 
     * Set the 'MaxWeightQuantity' element value. ����������� ������������ ����� �� � ��
     * 
     * @param maxWeightQuantity
     */
    public void setMaxWeightQuantity(String maxWeightQuantity) {
        this.maxWeightQuantity = maxWeightQuantity;
    }

    /** 
     * Get the 'MinWeightQuantity' element value. ����� ��� �������� � ��
     * 
     * @return value
     */
    public String getMinWeightQuantity() {
        return minWeightQuantity;
    }

    /** 
     * Set the 'MinWeightQuantity' element value. ����� ��� �������� � ��
     * 
     * @param minWeightQuantity
     */
    public void setMinWeightQuantity(String minWeightQuantity) {
        this.minWeightQuantity = minWeightQuantity;
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
     * Get the 'SpecialMark' element value. ������ �������
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. ������ �������
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
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
     * Get the list of 'TransportMeansColorList' element items. ������ ������ ��, ����� ��. ����������� ���������� ��������  ������,  ���� ���� - ������������.
     * 
     * @return list
     */
    public List<TransportColorListType> getTransportMeansColorList() {
        return transportMeansColorList;
    }

    /** 
     * Set the list of 'TransportMeansColorList' element items. ������ ������ ��, ����� ��. ����������� ���������� ��������  ������,  ���� ���� - ������������.
     * 
     * @param list
     */
    public void setTransportMeansColorList(List<TransportColorListType> list) {
        transportMeansColorList = list;
    }
}
