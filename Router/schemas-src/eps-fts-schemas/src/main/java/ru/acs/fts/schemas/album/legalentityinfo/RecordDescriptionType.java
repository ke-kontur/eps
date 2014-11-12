
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о записях, внесенных в ЕГРЮЛ
 */
public class RecordDescriptionType extends ReferenceInfoType
{
    private String recordSign;
    private LocalDate inputDate;
    private String recordRegNum;
    private String blankSeries;
    private String blankNum;
    private RegOrganType regOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'RecordSign' element value. Признак того, что запись действующая
     * 
     * @return value
     */
    public String getRecordSign() {
        return recordSign;
    }

    /** 
     * Set the 'RecordSign' element value. Признак того, что запись действующая
     * 
     * @param recordSign
     */
    public void setRecordSign(String recordSign) {
        this.recordSign = recordSign;
    }

    /** 
     * Get the 'InputDate' element value. Дата внесения сведений о выданном свидетельстве в ЕГРЮЛ / Дата внесения сведений в ЕГРЮЛ о признании записи недействительной
     * 
     * @return value
     */
    public LocalDate getInputDate() {
        return inputDate;
    }

    /** 
     * Set the 'InputDate' element value. Дата внесения сведений о выданном свидетельстве в ЕГРЮЛ / Дата внесения сведений в ЕГРЮЛ о признании записи недействительной
     * 
     * @param inputDate
     */
    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    /** 
     * Get the 'RecordRegNum' element value. Государственный регистрационный номер записи, на основании которой внесены сведения о выданном свидетельстве / Государственный регистрационный номер записи, на основании которой внесены сведения о признании данной записи недействительной
     * 
     * @return value
     */
    public String getRecordRegNum() {
        return recordRegNum;
    }

    /** 
     * Set the 'RecordRegNum' element value. Государственный регистрационный номер записи, на основании которой внесены сведения о выданном свидетельстве / Государственный регистрационный номер записи, на основании которой внесены сведения о признании данной записи недействительной
     * 
     * @param recordRegNum
     */
    public void setRecordRegNum(String recordRegNum) {
        this.recordRegNum = recordRegNum;
    }

    /** 
     * Get the 'BlankSeries' element value. Серия бланка свидетельства
     * 
     * @return value
     */
    public String getBlankSeries() {
        return blankSeries;
    }

    /** 
     * Set the 'BlankSeries' element value. Серия бланка свидетельства
     * 
     * @param blankSeries
     */
    public void setBlankSeries(String blankSeries) {
        this.blankSeries = blankSeries;
    }

    /** 
     * Get the 'BlankNum' element value. Номер бланка свидетельства
     * 
     * @return value
     */
    public String getBlankNum() {
        return blankNum;
    }

    /** 
     * Set the 'BlankNum' element value. Номер бланка свидетельства
     * 
     * @param blankNum
     */
    public void setBlankNum(String blankNum) {
        this.blankNum = blankNum;
    }

    /** 
     * Get the 'RegOrgan' element value. Сведения о регистрирующем органе
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. Сведения о регистрирующем органе
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
