
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;
import ru.acs.fts.schemas.album.commonleaftypescust.TransportCategoryCodeType;

/** 
 * �������� ������������� ��������. �������� � ������������ ��������.
 */
public class ESADTransportMeanCardType extends AutomobileBaseType
{
    private String goodsNumeric;
    private String goodsTNVEDCode;
    private String TMSign;
    private String exportA2CountryCode;
    private String exportN3CountryCode;
    private String transportMeansTypeCode;
    private TransportCategoryCodeType transportCategoryCode;
    private String seatsQuantity;
    private String engineModel;
    private String gearboxID;
    private List<String> axleIDList = new ArrayList<String>();
    private String colorCode;
    private String enginePowerHpQuanity;
    private String enginePowerKvtQuanity;
    private String engineModeCode;
    private String moverModeCodeType;
    private String ekoclass;
    private String maxWeightQuantity;
    private String minWeightQuantity;
    private String maximumConstructiveVelocity;
    private String widthmm;
    private String heightmm;
    private String lengthmm;
    private String passedKilometerQuantity;
    private String approvalNumber;
    private LocalDate approvalDate;
    private String approvalOrganization;
    private List<String> colorListElementList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� �� / ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� �� / ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'TMSign' element value. �������: - "�" (��); - "�" (�����); - "�" (���������� ������).
     * 
     * @return value
     */
    public String getTMSign() {
        return TMSign;
    }

    /** 
     * Set the 'TMSign' element value. �������: - "�" (��); - "�" (�����); - "�" (���������� ������).
     * 
     * @param TMSign
     */
    public void setTMSign(String TMSign) {
        this.TMSign = TMSign;
    }

    /** 
     * Get the 'ExportA2CountryCode' element value. ��������� ��� ������ ������
     * 
     * @return value
     */
    public String getExportA2CountryCode() {
        return exportA2CountryCode;
    }

    /** 
     * Set the 'ExportA2CountryCode' element value. ��������� ��� ������ ������
     * 
     * @param exportA2CountryCode
     */
    public void setExportA2CountryCode(String exportA2CountryCode) {
        this.exportA2CountryCode = exportA2CountryCode;
    }

    /** 
     * Get the 'ExportN3CountryCode' element value. �������� ��� ������ ������
     * 
     * @return value
     */
    public String getExportN3CountryCode() {
        return exportN3CountryCode;
    }

    /** 
     * Set the 'ExportN3CountryCode' element value. �������� ��� ������ ������
     * 
     * @param exportN3CountryCode
     */
    public void setExportN3CountryCode(String exportN3CountryCode) {
        this.exportN3CountryCode = exportN3CountryCode;
    }

    /** 
     * Get the 'TransportMeansTypeCode' element value. ��� ����
     * 
     * @return value
     */
    public String getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /** 
     * Set the 'TransportMeansTypeCode' element value. ��� ����
     * 
     * @param transportMeansTypeCode
     */
    public void setTransportMeansTypeCode(String transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
    }

    /** 
     * Get the 'TransportCategoryCode' element value. ��� ��������� ��.
     * 
     * @return value
     */
    public TransportCategoryCodeType getTransportCategoryCode() {
        return transportCategoryCode;
    }

    /** 
     * Set the 'TransportCategoryCode' element value. ��� ��������� ��.
     * 
     * @param transportCategoryCode
     */
    public void setTransportCategoryCode(
            TransportCategoryCodeType transportCategoryCode) {
        this.transportCategoryCode = transportCategoryCode;
    }

    /** 
     * Get the 'SeatsQuantity' element value. ���������� ����, ������� ����� ��������
     * 
     * @return value
     */
    public String getSeatsQuantity() {
        return seatsQuantity;
    }

    /** 
     * Set the 'SeatsQuantity' element value. ���������� ����, ������� ����� ��������
     * 
     * @param seatsQuantity
     */
    public void setSeatsQuantity(String seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
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
     * Get the 'GearboxID' element value. ����� ������� �������
     * 
     * @return value
     */
    public String getGearboxID() {
        return gearboxID;
    }

    /** 
     * Set the 'GearboxID' element value. ����� ������� �������
     * 
     * @param gearboxID
     */
    public void setGearboxID(String gearboxID) {
        this.gearboxID = gearboxID;
    }

    /** 
     * Get the list of 'AxleID' element items. �����(�) �����(��)
     * 
     * @return list
     */
    public List<String> getAxleIDList() {
        return axleIDList;
    }

    /** 
     * Set the list of 'AxleID' element items. �����(�) �����(��)
     * 
     * @param list
     */
    public void setAxleIDList(List<String> list) {
        axleIDList = list;
    }

    /** 
     * Get the 'ColorCode' element value. ��� ����� ������������� ��������
     * 
     * @return value
     */
    public String getColorCode() {
        return colorCode;
    }

    /** 
     * Set the 'ColorCode' element value. ��� ����� ������������� ��������
     * 
     * @param colorCode
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
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
     * Get the 'MoverModeCodeType' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getMoverModeCodeType() {
        return moverModeCodeType;
    }

    /** 
     * Set the 'MoverModeCodeType' element value. ��� ���� ���������
     * 
     * @param moverModeCodeType
     */
    public void setMoverModeCodeType(String moverModeCodeType) {
        this.moverModeCodeType = moverModeCodeType;
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
     * Get the 'MaximumConstructiveVelocity' element value. ������������ �������������� ��������
     * 
     * @return value
     */
    public String getMaximumConstructiveVelocity() {
        return maximumConstructiveVelocity;
    }

    /** 
     * Set the 'MaximumConstructiveVelocity' element value. ������������ �������������� ��������
     * 
     * @param maximumConstructiveVelocity
     */
    public void setMaximumConstructiveVelocity(
            String maximumConstructiveVelocity) {
        this.maximumConstructiveVelocity = maximumConstructiveVelocity;
    }

    /** 
     * Get the 'Widthmm' element value. ������, ��
     * 
     * @return value
     */
    public String getWidthmm() {
        return widthmm;
    }

    /** 
     * Set the 'Widthmm' element value. ������, ��
     * 
     * @param widthmm
     */
    public void setWidthmm(String widthmm) {
        this.widthmm = widthmm;
    }

    /** 
     * Get the 'Heightmm' element value. ������, ��
     * 
     * @return value
     */
    public String getHeightmm() {
        return heightmm;
    }

    /** 
     * Set the 'Heightmm' element value. ������, ��
     * 
     * @param heightmm
     */
    public void setHeightmm(String heightmm) {
        this.heightmm = heightmm;
    }

    /** 
     * Get the 'Lengthmm' element value. �����, ��
     * 
     * @return value
     */
    public String getLengthmm() {
        return lengthmm;
    }

    /** 
     * Set the 'Lengthmm' element value. �����, ��
     * 
     * @param lengthmm
     */
    public void setLengthmm(String lengthmm) {
        this.lengthmm = lengthmm;
    }

    /** 
     * Get the 'PassedKilometerQuantity' element value. � ������� ������ �������� ����������/�������� ���������/����������
     * 
     * @return value
     */
    public String getPassedKilometerQuantity() {
        return passedKilometerQuantity;
    }

    /** 
     * Set the 'PassedKilometerQuantity' element value. � ������� ������ �������� ����������/�������� ���������/����������
     * 
     * @param passedKilometerQuantity
     */
    public void setPassedKilometerQuantity(String passedKilometerQuantity) {
        this.passedKilometerQuantity = passedKilometerQuantity;
    }

    /** 
     * Get the 'ApprovalNumber' element value.  ����� ��������� ���� ��/ ���������� � ������������ / ����������� ������������.
     * 
     * @return value
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /** 
     * Set the 'ApprovalNumber' element value.  ����� ��������� ���� ��/ ���������� � ������������ / ����������� ������������.
     * 
     * @param approvalNumber
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    /** 
     * Get the 'ApprovalDate' element value.  ���� ��������� / ���������� / �����������
     * 
     * @return value
     */
    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    /** 
     * Set the 'ApprovalDate' element value.  ���� ��������� / ���������� / �����������
     * 
     * @param approvalDate
     */
    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    /** 
     * Get the 'ApprovalOrganization' element value. �����������, �������� ��������� / ���������� / ����������
     * 
     * @return value
     */
    public String getApprovalOrganization() {
        return approvalOrganization;
    }

    /** 
     * Set the 'ApprovalOrganization' element value. �����������, �������� ��������� / ���������� / ����������
     * 
     * @param approvalOrganization
     */
    public void setApprovalOrganization(String approvalOrganization) {
        this.approvalOrganization = approvalOrganization;
    }

    /** 
     * Get the list of 'ColorListElement' element items. ������� ��  ������ �����. ����������� ��� ��,  ����� ��� �������� ColorCode = 905 (������������)
     * 
     * @return list
     */
    public List<String> getColorListElementList() {
        return colorListElementList;
    }

    /** 
     * Set the list of 'ColorListElement' element items. ������� ��  ������ �����. ����������� ��� ��,  ����� ��� �������� ColorCode = 905 (������������)
     * 
     * @param list
     */
    public void setColorListElementList(List<String> list) {
        colorListElementList = list;
    }
}
