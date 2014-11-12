
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ��������� �������
 */
public class PileMeasuringInfoType
{
    private String pileSerialNumber;
    private String nominalLength;
    private String measuredLogsQuantity;
    private String lengthDifference;
    private String factLength;
    private String sideHeight1;
    private String sideHeight2;
    private String pileHeight;
    private String lowerLayerHeight;
    private String rubbishLayerHeight;
    private String innerLayer;
    private String pileHeightCalculated;
    private String pileWidth;
    private String barkNominalVolume;
    private String factlVolumeVL;
    private String widthSpan;
    private String loadingForm;
    private String woodCoefficient;
    private String barkCoefficient;
    private String nominalVolume;
    private String factlVolumeVKL;
    private List<LogFactLengthType> logFactLengthList = new ArrayList<LogFactLengthType>();
    private List<MeasuringResultsType> pileMeasuringResultList = new ArrayList<MeasuringResultsType>();

    /** 
     * Get the 'PileSerialNumber' element value. ����� �������
     * 
     * @return value
     */
    public String getPileSerialNumber() {
        return pileSerialNumber;
    }

    /** 
     * Set the 'PileSerialNumber' element value. ����� �������
     * 
     * @param pileSerialNumber
     */
    public void setPileSerialNumber(String pileSerialNumber) {
        this.pileSerialNumber = pileSerialNumber;
    }

    /** 
     * Get the 'NominalLength' element value. ����������� ����� ������ �������, ��������� � �������������� ����������, �
     * 
     * @return value
     */
    public String getNominalLength() {
        return nominalLength;
    }

    /** 
     * Set the 'NominalLength' element value. ����������� ����� ������ �������, ��������� � �������������� ����������, �
     * 
     * @param nominalLength
     */
    public void setNominalLength(String nominalLength) {
        this.nominalLength = nominalLength;
    }

    /** 
     * Get the 'MeasuredLogsQuantity' element value. ���������� ������ �������, � ������� ���������� �� ����������� �����
     * 
     * @return value
     */
    public String getMeasuredLogsQuantity() {
        return measuredLogsQuantity;
    }

    /** 
     * Set the 'MeasuredLogsQuantity' element value. ���������� ������ �������, � ������� ���������� �� ����������� �����
     * 
     * @param measuredLogsQuantity
     */
    public void setMeasuredLogsQuantity(String measuredLogsQuantity) {
        this.measuredLogsQuantity = measuredLogsQuantity;
    }

    /** 
     * Get the 'LengthDifference' element value. �������� ����� ����������  � ����������  ���������� � ���������� ���� ������, �
     * 
     * @return value
     */
    public String getLengthDifference() {
        return lengthDifference;
    }

    /** 
     * Set the 'LengthDifference' element value. �������� ����� ����������  � ����������  ���������� � ���������� ���� ������, �
     * 
     * @param lengthDifference
     */
    public void setLengthDifference(String lengthDifference) {
        this.lengthDifference = lengthDifference;
    }

    /** 
     * Get the 'FactLength' element value. ���������� ����������� ����� �������, �
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. ���������� ����������� ����� �������, �
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }

    /** 
     * Get the 'SideHeight1' element value. ������ �������, ���������� � ��� ������ ������� �������
     * 
     * @return value
     */
    public String getSideHeight1() {
        return sideHeight1;
    }

    /** 
     * Set the 'SideHeight1' element value. ������ �������, ���������� � ��� ������ ������� �������
     * 
     * @param sideHeight1
     */
    public void setSideHeight1(String sideHeight1) {
        this.sideHeight1 = sideHeight1;
    }

    /** 
     * Get the 'SideHeight2' element value. ������ �������, ���������� � ��� ������ ������� �������
     * 
     * @return value
     */
    public String getSideHeight2() {
        return sideHeight2;
    }

    /** 
     * Set the 'SideHeight2' element value. ������ �������, ���������� � ��� ������ ������� �������
     * 
     * @param sideHeight2
     */
    public void setSideHeight2(String sideHeight2) {
        this.sideHeight2 = sideHeight2;
    }

    /** 
     * Get the 'PileHeight' element value. ���������� ������ �������, �
     * 
     * @return value
     */
    public String getPileHeight() {
        return pileHeight;
    }

    /** 
     * Set the 'PileHeight' element value. ���������� ������ �������, �
     * 
     * @param pileHeight
     */
    public void setPileHeight(String pileHeight) {
        this.pileHeight = pileHeight;
    }

    /** 
     * Get the 'LowerLayerHeight' element value. ������� ������ ���������, �
     * 
     * @return value
     */
    public String getLowerLayerHeight() {
        return lowerLayerHeight;
    }

    /** 
     * Set the 'LowerLayerHeight' element value. ������� ������ ���������, �
     * 
     * @param lowerLayerHeight
     */
    public void setLowerLayerHeight(String lowerLayerHeight) {
        this.lowerLayerHeight = lowerLayerHeight;
    }

    /** 
     * Get the 'RubbishLayerHeight' element value. ������� ���� ������, �
     * 
     * @return value
     */
    public String getRubbishLayerHeight() {
        return rubbishLayerHeight;
    }

    /** 
     * Set the 'RubbishLayerHeight' element value. ������� ���� ������, �
     * 
     * @param rubbishLayerHeight
     */
    public void setRubbishLayerHeight(String rubbishLayerHeight) {
        this.rubbishLayerHeight = rubbishLayerHeight;
    }

    /** 
     * Get the 'InnerLayer' element value. ����� ������� ������ ���������, ��������� ������ ������� � ��� "������", �
     * 
     * @return value
     */
    public String getInnerLayer() {
        return innerLayer;
    }

    /** 
     * Set the 'InnerLayer' element value. ����� ������� ������ ���������, ��������� ������ ������� � ��� "������", �
     * 
     * @param innerLayer
     */
    public void setInnerLayer(String innerLayer) {
        this.innerLayer = innerLayer;
    }

    /** 
     * Get the 'PileHeightCalculated' element value. ��������� ������ �������, �
     * 
     * @return value
     */
    public String getPileHeightCalculated() {
        return pileHeightCalculated;
    }

    /** 
     * Set the 'PileHeightCalculated' element value. ��������� ������ �������, �
     * 
     * @param pileHeightCalculated
     */
    public void setPileHeightCalculated(String pileHeightCalculated) {
        this.pileHeightCalculated = pileHeightCalculated;
    }

    /** 
     * Get the 'PileWidth' element value. ���������� ������ �������, �
     * 
     * @return value
     */
    public String getPileWidth() {
        return pileWidth;
    }

    /** 
     * Set the 'PileWidth' element value. ���������� ������ �������, �
     * 
     * @param pileWidth
     */
    public void setPileWidth(String pileWidth) {
        this.pileWidth = pileWidth;
    }

    /** 
     * Get the 'BarkNominalVolume' element value. ���������� ���������� ����������� ����� ������� � ������ ����������� ����� ������ �������, ������ �� ���� � ������ ����� ���� 
     * 
     * @return value
     */
    public String getBarkNominalVolume() {
        return barkNominalVolume;
    }

    /** 
     * Set the 'BarkNominalVolume' element value. ���������� ���������� ����������� ����� ������� � ������ ����������� ����� ������ �������, ������ �� ���� � ������ ����� ���� 
     * 
     * @param barkNominalVolume
     */
    public void setBarkNominalVolume(String barkNominalVolume) {
        this.barkNominalVolume = barkNominalVolume;
    }

    /** 
     * Get the 'FactlVolumeVL' element value. ���������� ���������� ����������� ����� ������� � ������ ����������� ����� �������, ������ ���� ������ � ������ ����� ���� 
     * 
     * @return value
     */
    public String getFactlVolumeVL() {
        return factlVolumeVL;
    }

    /** 
     * Set the 'FactlVolumeVL' element value. ���������� ���������� ����������� ����� ������� � ������ ����������� ����� �������, ������ ���� ������ � ������ ����� ���� 
     * 
     * @param factlVolumeVL
     */
    public void setFactlVolumeVL(String factlVolumeVL) {
        this.factlVolumeVL = factlVolumeVL;
    }

    /** 
     * Get the 'WidthSpan' element value. �������� ������ ������, ��
     * 
     * @return value
     */
    public String getWidthSpan() {
        return widthSpan;
    }

    /** 
     * Set the 'WidthSpan' element value. �������� ������ ������, ��
     * 
     * @param widthSpan
     */
    public void setWidthSpan(String widthSpan) {
        this.widthSpan = widthSpan;
    }

    /** 
     * Get the 'LoadingForm' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getLoadingForm() {
        return loadingForm;
    }

    /** 
     * Set the 'LoadingForm' element value. ����� �������� �������
     * 
     * @param loadingForm
     */
    public void setLoadingForm(String loadingForm) {
        this.loadingForm = loadingForm;
    }

    /** 
     * Get the 'WoodCoefficient' element value. �������� ��������� �������� ����������� ������������ (������������ ����������������)
     * 
     * @return value
     */
    public String getWoodCoefficient() {
        return woodCoefficient;
    }

    /** 
     * Set the 'WoodCoefficient' element value. �������� ��������� �������� ����������� ������������ (������������ ����������������)
     * 
     * @param woodCoefficient
     */
    public void setWoodCoefficient(String woodCoefficient) {
        this.woodCoefficient = woodCoefficient;
    }

    /** 
     * Get the 'BarkCoefficient' element value. �������� ��������� �������� ������������ �� ����
     * 
     * @return value
     */
    public String getBarkCoefficient() {
        return barkCoefficient;
    }

    /** 
     * Set the 'BarkCoefficient' element value. �������� ��������� �������� ������������ �� ����
     * 
     * @param barkCoefficient
     */
    public void setBarkCoefficient(String barkCoefficient) {
        this.barkCoefficient = barkCoefficient;
    }

    /** 
     * Get the 'NominalVolume' element value. ���������� ������� (�����������) ����� ������� � ������ ����������� ����� ������ ��� ����� ������ �� ���� � ������ ����� ���� 
     * 
     * @return value
     */
    public String getNominalVolume() {
        return nominalVolume;
    }

    /** 
     * Set the 'NominalVolume' element value. ���������� ������� (�����������) ����� ������� � ������ ����������� ����� ������ ��� ����� ������ �� ���� � ������ ����� ���� 
     * 
     * @param nominalVolume
     */
    public void setNominalVolume(String nominalVolume) {
        this.nominalVolume = nominalVolume;
    }

    /** 
     * Get the 'FactlVolumeVKL' element value. ���������� ����������� ����� ������ ������� � ������ ����������� ����� ������� � ������ ���� ������
     * 
     * @return value
     */
    public String getFactlVolumeVKL() {
        return factlVolumeVKL;
    }

    /** 
     * Set the 'FactlVolumeVKL' element value. ���������� ����������� ����� ������ ������� � ������ ����������� ����� ������� � ������ ���� ������
     * 
     * @param factlVolumeVKL
     */
    public void setFactlVolumeVKL(String factlVolumeVKL) {
        this.factlVolumeVKL = factlVolumeVKL;
    }

    /** 
     * Get the list of 'LogFactLength' element items. ����������� ����� ����������� ������
     * 
     * @return list
     */
    public List<LogFactLengthType> getLogFactLengthList() {
        return logFactLengthList;
    }

    /** 
     * Set the list of 'LogFactLength' element items. ����������� ����� ����������� ������
     * 
     * @param list
     */
    public void setLogFactLengthList(List<LogFactLengthType> list) {
        logFactLengthList = list;
    }

    /** 
     * Get the list of 'PileMeasuringResults' element items. �������� �������� ��������� ��� �������
     * 
     * @return list
     */
    public List<MeasuringResultsType> getPileMeasuringResultList() {
        return pileMeasuringResultList;
    }

    /** 
     * Set the list of 'PileMeasuringResults' element items. �������� �������� ��������� ��� �������
     * 
     * @param list
     */
    public void setPileMeasuringResultList(List<MeasuringResultsType> list) {
        pileMeasuringResultList = list;
    }
}
