
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� ���������� ������ ������� �������� �������, ���������� �������, � �������������� ������ ������� ���� 2708
 */
public class LogMeasuringInfoType
{
    private String logSerialNumber;
    private String factLength;
    private String factVolume;
    private String nominalVolume;
    private String nominalVolume2;
    private String logRise;
    private List<MeasuringDetailsType> measuringDetailList = new ArrayList<MeasuringDetailsType>();
    private TabularValuesType tabularValues;

    /** 
     * Get the 'LogSerialNumber' element value. ����� ������ �� ������� ����������� ����������
     * 
     * @return value
     */
    public String getLogSerialNumber() {
        return logSerialNumber;
    }

    /** 
     * Set the 'LogSerialNumber' element value. ����� ������ �� ������� ����������� ����������
     * 
     * @param logSerialNumber
     */
    public void setLogSerialNumber(String logSerialNumber) {
        this.logSerialNumber = logSerialNumber;
    }

    /** 
     * Get the 'FactLength' element value. ���������� ����������� �����, �
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. ���������� ����������� �����, �
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }

    /** 
     * Get the 'FactVolume' element value. ����������� ����� ������ (� ������ ����)
     * 
     * @return value
     */
    public String getFactVolume() {
        return factVolume;
    }

    /** 
     * Set the 'FactVolume' element value. ����������� ����� ������ (� ������ ����)
     * 
     * @param factVolume
     */
    public void setFactVolume(String factVolume) {
        this.factVolume = factVolume;
    }

    /** 
     * Get the 'NominalVolume' element value. ����������� ����� ������ (��� ����� ����) / ����������� ����� ������ � ����������� ������ ������� 1 ����2708
     * 
     * @return value
     */
    public String getNominalVolume() {
        return nominalVolume;
    }

    /** 
     * Set the 'NominalVolume' element value. ����������� ����� ������ (��� ����� ����) / ����������� ����� ������ � ����������� ������ ������� 1 ����2708
     * 
     * @param nominalVolume
     */
    public void setNominalVolume(String nominalVolume) {
        this.nominalVolume = nominalVolume;
    }

    /** 
     * Get the 'NominalVolume2' element value. ����������� ����� ������ � ����������� ������ ������� 4 ����2708
     * 
     * @return value
     */
    public String getNominalVolume2() {
        return nominalVolume2;
    }

    /** 
     * Set the 'NominalVolume2' element value. ����������� ����� ������ � ����������� ������ ������� 4 ����2708
     * 
     * @param nominalVolume2
     */
    public void setNominalVolume2(String nominalVolume2) {
        this.nominalVolume2 = nominalVolume2;
    }

    /** 
     * Get the 'LogRise' element value. ����
     * 
     * @return value
     */
    public String getLogRise() {
        return logRise;
    }

    /** 
     * Set the 'LogRise' element value. ����
     * 
     * @param logRise
     */
    public void setLogRise(String logRise) {
        this.logRise = logRise;
    }

    /** 
     * Get the list of 'MeasuringDetails' element items. ���������� ���������
     * 
     * @return list
     */
    public List<MeasuringDetailsType> getMeasuringDetailList() {
        return measuringDetailList;
    }

    /** 
     * Set the list of 'MeasuringDetails' element items. ���������� ���������
     * 
     * @param list
     */
    public void setMeasuringDetailList(List<MeasuringDetailsType> list) {
        measuringDetailList = list;
    }

    /** 
     * Get the 'TabularValues' element value. ��������� ������
     * 
     * @return value
     */
    public TabularValuesType getTabularValues() {
        return tabularValues;
    }

    /** 
     * Set the 'TabularValues' element value. ��������� ������
     * 
     * @param tabularValues
     */
    public void setTabularValues(TabularValuesType tabularValues) {
        this.tabularValues = tabularValues;
    }
}
