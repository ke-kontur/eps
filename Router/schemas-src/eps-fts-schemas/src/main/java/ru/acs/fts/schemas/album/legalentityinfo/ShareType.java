
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * Доля в уставном капитале
 */
public class ShareType
{
    private String numerator;
    private String denumerator;
    private String percent;
    private String decimalFraction;
    private String nominalCost;
    private String pledgeSign;
    private RecordDataType recordData;

    /** 
     * Get the 'Numerator' element value. Размер доли в простых дробях. Числитель
     * 
     * @return value
     */
    public String getNumerator() {
        return numerator;
    }

    /** 
     * Set the 'Numerator' element value. Размер доли в простых дробях. Числитель
     * 
     * @param numerator
     */
    public void setNumerator(String numerator) {
        this.numerator = numerator;
    }

    /** 
     * Get the 'Denumerator' element value. Размер доли в простых дробях. Знаменатель
     * 
     * @return value
     */
    public String getDenumerator() {
        return denumerator;
    }

    /** 
     * Set the 'Denumerator' element value. Размер доли в простых дробях. Знаменатель
     * 
     * @param denumerator
     */
    public void setDenumerator(String denumerator) {
        this.denumerator = denumerator;
    }

    /** 
     * Get the 'Percent' element value. Размер доли в процентах, %
     * 
     * @return value
     */
    public String getPercent() {
        return percent;
    }

    /** 
     * Set the 'Percent' element value. Размер доли в процентах, %
     * 
     * @param percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }

    /** 
     * Get the 'DecimalFraction' element value. Размер доли в десятичных дробях
     * 
     * @return value
     */
    public String getDecimalFraction() {
        return decimalFraction;
    }

    /** 
     * Set the 'DecimalFraction' element value. Размер доли в десятичных дробях
     * 
     * @param decimalFraction
     */
    public void setDecimalFraction(String decimalFraction) {
        this.decimalFraction = decimalFraction;
    }

    /** 
     * Get the 'NominalCost' element value. Номинальная стоимость в рублях
     * 
     * @return value
     */
    public String getNominalCost() {
        return nominalCost;
    }

    /** 
     * Set the 'NominalCost' element value. Номинальная стоимость в рублях
     * 
     * @param nominalCost
     */
    public void setNominalCost(String nominalCost) {
        this.nominalCost = nominalCost;
    }

    /** 
     * Get the 'PledgeSign' element value. Признак нахождения доли в залоге или в ином обременении
     * 
     * @return value
     */
    public String getPledgeSign() {
        return pledgeSign;
    }

    /** 
     * Set the 'PledgeSign' element value. Признак нахождения доли в залоге или в ином обременении
     * 
     * @param pledgeSign
     */
    public void setPledgeSign(String pledgeSign) {
        this.pledgeSign = pledgeSign;
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
