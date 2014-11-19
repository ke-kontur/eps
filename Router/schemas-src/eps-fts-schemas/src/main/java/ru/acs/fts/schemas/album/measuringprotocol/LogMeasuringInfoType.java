
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об измерениях бревна методом концевых сечений, срединного сечения, с использованием таблиц объемов ГОСТ 2708
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
     * Get the 'LogSerialNumber' element value. Номер бревна по порядку измеряемого сортимента
     * 
     * @return value
     */
    public String getLogSerialNumber() {
        return logSerialNumber;
    }

    /** 
     * Set the 'LogSerialNumber' element value. Номер бревна по порядку измеряемого сортимента
     * 
     * @param logSerialNumber
     */
    public void setLogSerialNumber(String logSerialNumber) {
        this.logSerialNumber = logSerialNumber;
    }

    /** 
     * Get the 'FactLength' element value. Измеренная фактическая длина, м
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. Измеренная фактическая длина, м
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }

    /** 
     * Get the 'FactVolume' element value. Фактический объем бревна (с учетом коры)
     * 
     * @return value
     */
    public String getFactVolume() {
        return factVolume;
    }

    /** 
     * Set the 'FactVolume' element value. Фактический объем бревна (с учетом коры)
     * 
     * @param factVolume
     */
    public void setFactVolume(String factVolume) {
        this.factVolume = factVolume;
    }

    /** 
     * Get the 'NominalVolume' element value. Номинальный объем бревна (без учета коры) / Номинальный объем бревна с применением таблиц объемов 1 ГОСТ2708
     * 
     * @return value
     */
    public String getNominalVolume() {
        return nominalVolume;
    }

    /** 
     * Set the 'NominalVolume' element value. Номинальный объем бревна (без учета коры) / Номинальный объем бревна с применением таблиц объемов 1 ГОСТ2708
     * 
     * @param nominalVolume
     */
    public void setNominalVolume(String nominalVolume) {
        this.nominalVolume = nominalVolume;
    }

    /** 
     * Get the 'NominalVolume2' element value. Номинальный объем бревна с применением таблиц объемов 4 ГОСТ2708
     * 
     * @return value
     */
    public String getNominalVolume2() {
        return nominalVolume2;
    }

    /** 
     * Set the 'NominalVolume2' element value. Номинальный объем бревна с применением таблиц объемов 4 ГОСТ2708
     * 
     * @param nominalVolume2
     */
    public void setNominalVolume2(String nominalVolume2) {
        this.nominalVolume2 = nominalVolume2;
    }

    /** 
     * Get the 'LogRise' element value. Сбег
     * 
     * @return value
     */
    public String getLogRise() {
        return logRise;
    }

    /** 
     * Set the 'LogRise' element value. Сбег
     * 
     * @param logRise
     */
    public void setLogRise(String logRise) {
        this.logRise = logRise;
    }

    /** 
     * Get the list of 'MeasuringDetails' element items. Результаты измерений
     * 
     * @return list
     */
    public List<MeasuringDetailsType> getMeasuringDetailList() {
        return measuringDetailList;
    }

    /** 
     * Set the list of 'MeasuringDetails' element items. Результаты измерений
     * 
     * @param list
     */
    public void setMeasuringDetailList(List<MeasuringDetailsType> list) {
        measuringDetailList = list;
    }

    /** 
     * Get the 'TabularValues' element value. Табличные данные
     * 
     * @return value
     */
    public TabularValuesType getTabularValues() {
        return tabularValues;
    }

    /** 
     * Set the 'TabularValues' element value. Табличные данные
     * 
     * @param tabularValues
     */
    public void setTabularValues(TabularValuesType tabularValues) {
        this.tabularValues = tabularValues;
    }
}
