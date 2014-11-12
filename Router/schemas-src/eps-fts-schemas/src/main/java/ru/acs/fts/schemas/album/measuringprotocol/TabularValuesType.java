
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * Табличные данные
 */
public class TabularValuesType
{
    private String volumeCoefficient;
    private String tabularLength;
    private String tabularVolume1;
    private String tabularDiameter;
    private String tabularVolume4;
    private String lengthRatio;

    /** 
     * Get the 'VolumeCoefficient' element value. Коэффициент на объем коры
     * 
     * @return value
     */
    public String getVolumeCoefficient() {
        return volumeCoefficient;
    }

    /** 
     * Set the 'VolumeCoefficient' element value. Коэффициент на объем коры
     * 
     * @param volumeCoefficient
     */
    public void setVolumeCoefficient(String volumeCoefficient) {
        this.volumeCoefficient = volumeCoefficient;
    }

    /** 
     * Get the 'TabularLength' element value. Табличная принятая длина, м
     * 
     * @return value
     */
    public String getTabularLength() {
        return tabularLength;
    }

    /** 
     * Set the 'TabularLength' element value. Табличная принятая длина, м
     * 
     * @param tabularLength
     */
    public void setTabularLength(String tabularLength) {
        this.tabularLength = tabularLength;
    }

    /** 
     * Get the 'TabularVolume1' element value. Объем бревна с применением таблицы 1 ГОСТ 2708
     * 
     * @return value
     */
    public String getTabularVolume1() {
        return tabularVolume1;
    }

    /** 
     * Set the 'TabularVolume1' element value. Объем бревна с применением таблицы 1 ГОСТ 2708
     * 
     * @param tabularVolume1
     */
    public void setTabularVolume1(String tabularVolume1) {
        this.tabularVolume1 = tabularVolume1;
    }

    /** 
     * Get the 'TabularDiameter' element value. Толщина бревна с учетом округления по таблицам
     * 
     * @return value
     */
    public String getTabularDiameter() {
        return tabularDiameter;
    }

    /** 
     * Set the 'TabularDiameter' element value. Толщина бревна с учетом округления по таблицам
     * 
     * @param tabularDiameter
     */
    public void setTabularDiameter(String tabularDiameter) {
        this.tabularDiameter = tabularDiameter;
    }

    /** 
     * Get the 'TabularVolume4' element value. Объем бревна с применением таблицы 4 ГОСТ 2708
     * 
     * @return value
     */
    public String getTabularVolume4() {
        return tabularVolume4;
    }

    /** 
     * Set the 'TabularVolume4' element value. Объем бревна с применением таблицы 4 ГОСТ 2708
     * 
     * @param tabularVolume4
     */
    public void setTabularVolume4(String tabularVolume4) {
        this.tabularVolume4 = tabularVolume4;
    }

    /** 
     * Get the 'LengthRatio' element value. Отношение фактической и табличной принятой длин
     * 
     * @return value
     */
    public String getLengthRatio() {
        return lengthRatio;
    }

    /** 
     * Set the 'LengthRatio' element value. Отношение фактической и табличной принятой длин
     * 
     * @param lengthRatio
     */
    public void setLengthRatio(String lengthRatio) {
        this.lengthRatio = lengthRatio;
    }
}
