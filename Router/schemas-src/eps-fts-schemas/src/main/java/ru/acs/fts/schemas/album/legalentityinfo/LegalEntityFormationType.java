
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения об образовании юридического лица
 */
public class LegalEntityFormationType extends ReferenceInfoType
{
    private LocalDate regDate;
    private String regNum;
    private RecordDataType recordData;
    private RegOrganType regOrgan;

    /** 
     * Get the 'RegDate' element value. Дата регистрации юридического лица при образовании
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата регистрации юридического лица при образовании
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. Регистрационный номер, присвоенный юридическому лицу при образовании
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Регистрационный номер, присвоенный юридическому лицу при образовании
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
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

    /** 
     * Get the 'RegOrgan' element value. Орган, зарегистрировавший создание ЮЛ
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. Орган, зарегистрировавший создание ЮЛ
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}
