
package ru.acs.fts.schemas.album.dealpassport;

/** 
 * Номер паспорта сделки, оформленного до 18.06.2004
 */
public class DPoldNumberType
{
    private String typeOfDP;
    private String bankOKPO;
    private String oldReNumber;
    private String oldPart4;

    /** 
     * Get the 'TypeOfDP' element value. Тип ПС: 1 - экспорт, 2 - импорт.
     * 
     * @return value
     */
    public String getTypeOfDP() {
        return typeOfDP;
    }

    /** 
     * Set the 'TypeOfDP' element value. Тип ПС: 1 - экспорт, 2 - импорт.
     * 
     * @param typeOfDP
     */
    public void setTypeOfDP(String typeOfDP) {
        this.typeOfDP = typeOfDP;
    }

    /** 
     * Get the 'BankOKPO' element value. Номер банка (подразделения), оформившего ПС
     * 
     * @return value
     */
    public String getBankOKPO() {
        return bankOKPO;
    }

    /** 
     * Set the 'BankOKPO' element value. Номер банка (подразделения), оформившего ПС
     * 
     * @param bankOKPO
     */
    public void setBankOKPO(String bankOKPO) {
        this.bankOKPO = bankOKPO;
    }

    /** 
     * Get the 'OldReNumber' element value. Номер, присвоенный ПС при переоформлении
     * 
     * @return value
     */
    public String getOldReNumber() {
        return oldReNumber;
    }

    /** 
     * Set the 'OldReNumber' element value. Номер, присвоенный ПС при переоформлении
     * 
     * @param oldReNumber
     */
    public void setOldReNumber(String oldReNumber) {
        this.oldReNumber = oldReNumber;
    }

    /** 
     * Get the 'OldPart4' element value. Четвертая часть номера ПС из десяти цифр
     * 
     * @return value
     */
    public String getOldPart4() {
        return oldPart4;
    }

    /** 
     * Set the 'OldPart4' element value. Четвертая часть номера ПС из десяти цифр
     * 
     * @param oldPart4
     */
    public void setOldPart4(String oldPart4) {
        this.oldPart4 = oldPart4;
    }
}
