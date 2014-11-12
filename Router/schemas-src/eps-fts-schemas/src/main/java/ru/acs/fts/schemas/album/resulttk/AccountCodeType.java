
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Учетный талон
 */
public class AccountCodeType
{
    private String accountCodeID;
    private String accountCodeNumber;
    private String accountCodeCreateDate;
    private String inspectionID;
    private String information;
    private PersonBaseType driver;
    private PersonBaseType accountCodeEmployee;

    /** 
     * Get the 'AccountCodeID' element value. Идентификатор учетного талона
     * 
     * @return value
     */
    public String getAccountCodeID() {
        return accountCodeID;
    }

    /** 
     * Set the 'AccountCodeID' element value. Идентификатор учетного талона
     * 
     * @param accountCodeID
     */
    public void setAccountCodeID(String accountCodeID) {
        this.accountCodeID = accountCodeID;
    }

    /** 
     * Get the 'AccountCodeNumber' element value. Номер учетного талона
     * 
     * @return value
     */
    public String getAccountCodeNumber() {
        return accountCodeNumber;
    }

    /** 
     * Set the 'AccountCodeNumber' element value. Номер учетного талона
     * 
     * @param accountCodeNumber
     */
    public void setAccountCodeNumber(String accountCodeNumber) {
        this.accountCodeNumber = accountCodeNumber;
    }

    /** 
     * Get the 'AccountCodeCreateDate' element value. Дата/время выдачи учетного талона
     * 
     * @return value
     */
    public String getAccountCodeCreateDate() {
        return accountCodeCreateDate;
    }

    /** 
     * Set the 'AccountCodeCreateDate' element value. Дата/время выдачи учетного талона
     * 
     * @param accountCodeCreateDate
     */
    public void setAccountCodeCreateDate(String accountCodeCreateDate) {
        this.accountCodeCreateDate = accountCodeCreateDate;
    }

    /** 
     * Get the 'InspectionID' element value. Идентификатор листа учета (связь с документом "Сведения из транспортного контроля")
     * 
     * @return value
     */
    public String getInspectionID() {
        return inspectionID;
    }

    /** 
     * Set the 'InspectionID' element value. Идентификатор листа учета (связь с документом "Сведения из транспортного контроля")
     * 
     * @param inspectionID
     */
    public void setInspectionID(String inspectionID) {
        this.inspectionID = inspectionID;
    }

    /** 
     * Get the 'Information' element value. Примечание
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. Примечание
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'Driver' element value. Водитель
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. Водитель
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'AccountCodeEmployee' element value. Инспектор, выдавший Учетный талон
     * 
     * @return value
     */
    public PersonBaseType getAccountCodeEmployee() {
        return accountCodeEmployee;
    }

    /** 
     * Set the 'AccountCodeEmployee' element value. Инспектор, выдавший Учетный талон
     * 
     * @param accountCodeEmployee
     */
    public void setAccountCodeEmployee(PersonBaseType accountCodeEmployee) {
        this.accountCodeEmployee = accountCodeEmployee;
    }
}
