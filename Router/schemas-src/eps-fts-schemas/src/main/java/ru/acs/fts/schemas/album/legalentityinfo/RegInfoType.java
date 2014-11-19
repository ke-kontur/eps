
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * Сведения об учете в органе
 */
public class RegInfoType
{
    private LocalDate regDate;
    private LocalDate taxRegDateEnd;
    private String regNum;
    private RFOrganizationFeaturesType regData;
    private RegOrganType taxOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'RegDate' element value. Дата постановки на учет в налоговом органе / Дата регистрации юридического лица в качестве страхователя
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата постановки на учет в налоговом органе / Дата регистрации юридического лица в качестве страхователя
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'TaxRegDateEnd' element value. Дата снятия с учета в налоговом органе
     * 
     * @return value
     */
    public LocalDate getTaxRegDateEnd() {
        return taxRegDateEnd;
    }

    /** 
     * Set the 'TaxRegDateEnd' element value. Дата снятия с учета в налоговом органе
     * 
     * @param taxRegDateEnd
     */
    public void setTaxRegDateEnd(LocalDate taxRegDateEnd) {
        this.taxRegDateEnd = taxRegDateEnd;
    }

    /** 
     * Get the 'RegNum' element value. Регистрационный номер в органе
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Регистрационный номер в органе
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'RegData' element value. Регистрационные данные
     * 
     * @return value
     */
    public RFOrganizationFeaturesType getRegData() {
        return regData;
    }

    /** 
     * Set the 'RegData' element value. Регистрационные данные
     * 
     * @param regData
     */
    public void setRegData(RFOrganizationFeaturesType regData) {
        this.regData = regData;
    }

    /** 
     * Get the 'TaxOrgan' element value. Сведения о налоговом органе, осуществившем постановку на учет юридического лица
     * 
     * @return value
     */
    public RegOrganType getTaxOrgan() {
        return taxOrgan;
    }

    /** 
     * Set the 'TaxOrgan' element value. Сведения о налоговом органе, осуществившем постановку на учет юридического лица
     * 
     * @param taxOrgan
     */
    public void setTaxOrgan(RegOrganType taxOrgan) {
        this.taxOrgan = taxOrgan;
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
