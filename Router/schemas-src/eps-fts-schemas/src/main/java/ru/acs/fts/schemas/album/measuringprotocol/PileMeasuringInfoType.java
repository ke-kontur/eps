
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * Результаты измерений штабеля
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
     * Get the 'PileSerialNumber' element value. Номер штабеля
     * 
     * @return value
     */
    public String getPileSerialNumber() {
        return pileSerialNumber;
    }

    /** 
     * Set the 'PileSerialNumber' element value. Номер штабеля
     * 
     * @param pileSerialNumber
     */
    public void setPileSerialNumber(String pileSerialNumber) {
        this.pileSerialNumber = pileSerialNumber;
    }

    /** 
     * Get the 'NominalLength' element value. Номинальная длина бревен штабеля, указанная в представленных документах, м
     * 
     * @return value
     */
    public String getNominalLength() {
        return nominalLength;
    }

    /** 
     * Set the 'NominalLength' element value. Номинальная длина бревен штабеля, указанная в представленных документах, м
     * 
     * @param nominalLength
     */
    public void setNominalLength(String nominalLength) {
        this.nominalLength = nominalLength;
    }

    /** 
     * Get the 'MeasuredLogsQuantity' element value. Количество бревен штабеля, у которых измерялась их фактическая длина
     * 
     * @return value
     */
    public String getMeasuredLogsQuantity() {
        return measuredLogsQuantity;
    }

    /** 
     * Set the 'MeasuredLogsQuantity' element value. Количество бревен штабеля, у которых измерялась их фактическая длина
     * 
     * @param measuredLogsQuantity
     */
    public void setMeasuredLogsQuantity(String measuredLogsQuantity) {
        this.measuredLogsQuantity = measuredLogsQuantity;
    }

    /** 
     * Get the 'LengthDifference' element value. Разность между наибольшим  и наименьшим  значениями у измеренных длин бревен, м
     * 
     * @return value
     */
    public String getLengthDifference() {
        return lengthDifference;
    }

    /** 
     * Set the 'LengthDifference' element value. Разность между наибольшим  и наименьшим  значениями у измеренных длин бревен, м
     * 
     * @param lengthDifference
     */
    public void setLengthDifference(String lengthDifference) {
        this.lengthDifference = lengthDifference;
    }

    /** 
     * Get the 'FactLength' element value. Измеренная фактическая длина штабеля, м
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. Измеренная фактическая длина штабеля, м
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }

    /** 
     * Get the 'SideHeight1' element value. Высота штабеля, измеренная с его первой боковой стороны
     * 
     * @return value
     */
    public String getSideHeight1() {
        return sideHeight1;
    }

    /** 
     * Set the 'SideHeight1' element value. Высота штабеля, измеренная с его первой боковой стороны
     * 
     * @param sideHeight1
     */
    public void setSideHeight1(String sideHeight1) {
        this.sideHeight1 = sideHeight1;
    }

    /** 
     * Get the 'SideHeight2' element value. Высота штабеля, измеренная с его второй боковой стороны
     * 
     * @return value
     */
    public String getSideHeight2() {
        return sideHeight2;
    }

    /** 
     * Set the 'SideHeight2' element value. Высота штабеля, измеренная с его второй боковой стороны
     * 
     * @param sideHeight2
     */
    public void setSideHeight2(String sideHeight2) {
        this.sideHeight2 = sideHeight2;
    }

    /** 
     * Get the 'PileHeight' element value. Измеренная высота штабеля, м
     * 
     * @return value
     */
    public String getPileHeight() {
        return pileHeight;
    }

    /** 
     * Set the 'PileHeight' element value. Измеренная высота штабеля, м
     * 
     * @param pileHeight
     */
    public void setPileHeight(String pileHeight) {
        this.pileHeight = pileHeight;
    }

    /** 
     * Get the 'LowerLayerHeight' element value. Толщина нижних подкладок, м
     * 
     * @return value
     */
    public String getLowerLayerHeight() {
        return lowerLayerHeight;
    }

    /** 
     * Set the 'LowerLayerHeight' element value. Толщина нижних подкладок, м
     * 
     * @param lowerLayerHeight
     */
    public void setLowerLayerHeight(String lowerLayerHeight) {
        this.lowerLayerHeight = lowerLayerHeight;
    }

    /** 
     * Get the 'RubbishLayerHeight' element value. Толщина слоя мусора, м
     * 
     * @return value
     */
    public String getRubbishLayerHeight() {
        return rubbishLayerHeight;
    }

    /** 
     * Set the 'RubbishLayerHeight' element value. Толщина слоя мусора, м
     * 
     * @param rubbishLayerHeight
     */
    public void setRubbishLayerHeight(String rubbishLayerHeight) {
        this.rubbishLayerHeight = rubbishLayerHeight;
    }

    /** 
     * Get the 'InnerLayer' element value. Сумма средних толщин прокладок, уложенных внутри штабеля и под "шапкой", м
     * 
     * @return value
     */
    public String getInnerLayer() {
        return innerLayer;
    }

    /** 
     * Set the 'InnerLayer' element value. Сумма средних толщин прокладок, уложенных внутри штабеля и под "шапкой", м
     * 
     * @param innerLayer
     */
    public void setInnerLayer(String innerLayer) {
        this.innerLayer = innerLayer;
    }

    /** 
     * Get the 'PileHeightCalculated' element value. Расчетная высота штабеля, м
     * 
     * @return value
     */
    public String getPileHeightCalculated() {
        return pileHeightCalculated;
    }

    /** 
     * Set the 'PileHeightCalculated' element value. Расчетная высота штабеля, м
     * 
     * @param pileHeightCalculated
     */
    public void setPileHeightCalculated(String pileHeightCalculated) {
        this.pileHeightCalculated = pileHeightCalculated;
    }

    /** 
     * Get the 'PileWidth' element value. Измеренная ширина штабеля, м
     * 
     * @return value
     */
    public String getPileWidth() {
        return pileWidth;
    }

    /** 
     * Set the 'PileWidth' element value. Измеренная ширина штабеля, м
     * 
     * @param pileWidth
     */
    public void setPileWidth(String pileWidth) {
        this.pileWidth = pileWidth;
    }

    /** 
     * Get the 'BarkNominalVolume' element value. Измеренный складочный номинальный объем штабеля с учетом номинальной длины бревен штабеля, объема их коры и пустот между ними 
     * 
     * @return value
     */
    public String getBarkNominalVolume() {
        return barkNominalVolume;
    }

    /** 
     * Set the 'BarkNominalVolume' element value. Измеренный складочный номинальный объем штабеля с учетом номинальной длины бревен штабеля, объема их коры и пустот между ними 
     * 
     * @param barkNominalVolume
     */
    public void setBarkNominalVolume(String barkNominalVolume) {
        this.barkNominalVolume = barkNominalVolume;
    }

    /** 
     * Get the 'FactlVolumeVL' element value. Измеренный складочный фактический объем штабеля с учетом фактической длины штабеля, объема коры бревен и пустот между ними 
     * 
     * @return value
     */
    public String getFactlVolumeVL() {
        return factlVolumeVL;
    }

    /** 
     * Set the 'FactlVolumeVL' element value. Измеренный складочный фактический объем штабеля с учетом фактической длины штабеля, объема коры бревен и пустот между ними 
     * 
     * @param factlVolumeVL
     */
    public void setFactlVolumeVL(String factlVolumeVL) {
        this.factlVolumeVL = factlVolumeVL;
    }

    /** 
     * Get the 'WidthSpan' element value. Диапазон толщин бревен, см
     * 
     * @return value
     */
    public String getWidthSpan() {
        return widthSpan;
    }

    /** 
     * Set the 'WidthSpan' element value. Диапазон толщин бревен, см
     * 
     * @param widthSpan
     */
    public void setWidthSpan(String widthSpan) {
        this.widthSpan = widthSpan;
    }

    /** 
     * Get the 'LoadingForm' element value. Форма погрузки штабеля
     * 
     * @return value
     */
    public String getLoadingForm() {
        return loadingForm;
    }

    /** 
     * Set the 'LoadingForm' element value. Форма погрузки штабеля
     * 
     * @param loadingForm
     */
    public void setLoadingForm(String loadingForm) {
        this.loadingForm = loadingForm;
    }

    /** 
     * Get the 'WoodCoefficient' element value. Принятое табличное значение переводного коэффициента (коэффициента полнодревесности)
     * 
     * @return value
     */
    public String getWoodCoefficient() {
        return woodCoefficient;
    }

    /** 
     * Set the 'WoodCoefficient' element value. Принятое табличное значение переводного коэффициента (коэффициента полнодревесности)
     * 
     * @param woodCoefficient
     */
    public void setWoodCoefficient(String woodCoefficient) {
        this.woodCoefficient = woodCoefficient;
    }

    /** 
     * Get the 'BarkCoefficient' element value. Принятое табличное значение коэффициента на кору
     * 
     * @return value
     */
    public String getBarkCoefficient() {
        return barkCoefficient;
    }

    /** 
     * Set the 'BarkCoefficient' element value. Принятое табличное значение коэффициента на кору
     * 
     * @param barkCoefficient
     */
    public void setBarkCoefficient(String barkCoefficient) {
        this.barkCoefficient = barkCoefficient;
    }

    /** 
     * Get the 'NominalVolume' element value. Измеренный плотный (номинальный) объем штабеля с учетом номинальной длины бревен без учета объема их коры и пустот между ними 
     * 
     * @return value
     */
    public String getNominalVolume() {
        return nominalVolume;
    }

    /** 
     * Set the 'NominalVolume' element value. Измеренный плотный (номинальный) объем штабеля с учетом номинальной длины бревен без учета объема их коры и пустот между ними 
     * 
     * @param nominalVolume
     */
    public void setNominalVolume(String nominalVolume) {
        this.nominalVolume = nominalVolume;
    }

    /** 
     * Get the 'FactlVolumeVKL' element value. Измеренный фактический объем бревен штабеля с учетом фактической длины штабеля и объема коры бревен
     * 
     * @return value
     */
    public String getFactlVolumeVKL() {
        return factlVolumeVKL;
    }

    /** 
     * Set the 'FactlVolumeVKL' element value. Измеренный фактический объем бревен штабеля с учетом фактической длины штабеля и объема коры бревен
     * 
     * @param factlVolumeVKL
     */
    public void setFactlVolumeVKL(String factlVolumeVKL) {
        this.factlVolumeVKL = factlVolumeVKL;
    }

    /** 
     * Get the list of 'LogFactLength' element items. Фактическая длина измеренного бревна
     * 
     * @return list
     */
    public List<LogFactLengthType> getLogFactLengthList() {
        return logFactLengthList;
    }

    /** 
     * Set the list of 'LogFactLength' element items. Фактическая длина измеренного бревна
     * 
     * @param list
     */
    public void setLogFactLengthList(List<LogFactLengthType> list) {
        logFactLengthList = list;
    }

    /** 
     * Get the list of 'PileMeasuringResults' element items. Итоговые значения измерений для штабеля
     * 
     * @return list
     */
    public List<MeasuringResultsType> getPileMeasuringResultList() {
        return pileMeasuringResultList;
    }

    /** 
     * Set the list of 'PileMeasuringResults' element items. Итоговые значения измерений для штабеля
     * 
     * @param list
     */
    public void setPileMeasuringResultList(List<MeasuringResultsType> list) {
        pileMeasuringResultList = list;
    }
}
