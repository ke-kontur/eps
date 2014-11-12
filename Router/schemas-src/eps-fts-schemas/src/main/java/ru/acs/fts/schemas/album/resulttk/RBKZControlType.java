
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения из листа транспортного контроля
 */
public class RBKZControlType
{
    private String isTG;
    private String isKG;
    private String isOG;
    private String accountCode;
    private String permitSeries;
    private String currency;
    private UsingPassType transitPermit;
    private CheckType roadCheck;
    private CheckType penaltyCheck;
    private DocumentBaseType resolution;
    private List<CheckViolationType> suitabilityList = new ArrayList<CheckViolationType>();
    private UsingPassType passTG;
    private UsingPassType passKG;
    private UsingPassType passOG;

    /** 
     * Get the 'IsTG' element value. Признак тяжеловесного груза
     * 
     * @return value
     */
    public String getIsTG() {
        return isTG;
    }

    /** 
     * Set the 'IsTG' element value. Признак тяжеловесного груза
     * 
     * @param isTG
     */
    public void setIsTG(String isTG) {
        this.isTG = isTG;
    }

    /** 
     * Get the 'IsKG' element value. Признак крупно-габаритного груза
     * 
     * @return value
     */
    public String getIsKG() {
        return isKG;
    }

    /** 
     * Set the 'IsKG' element value. Признак крупно-габаритного груза
     * 
     * @param isKG
     */
    public void setIsKG(String isKG) {
        this.isKG = isKG;
    }

    /** 
     * Get the 'IsOG' element value. Признак опасного груза
     * 
     * @return value
     */
    public String getIsOG() {
        return isOG;
    }

    /** 
     * Set the 'IsOG' element value. Признак опасного груза
     * 
     * @param isOG
     */
    public void setIsOG(String isOG) {
        this.isOG = isOG;
    }

    /** 
     * Get the 'AccountCode' element value. Номер учетного талона
     * 
     * @return value
     */
    public String getAccountCode() {
        return accountCode;
    }

    /** 
     * Set the 'AccountCode' element value. Номер учетного талона
     * 
     * @param accountCode
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /** 
     * Get the 'PermitSeries' element value. Серия разрешения (FREE - Б(бесплатный); PAID - П(платный))
     * 
     * @return value
     */
    public String getPermitSeries() {
        return permitSeries;
    }

    /** 
     * Set the 'PermitSeries' element value. Серия разрешения (FREE - Б(бесплатный); PAID - П(платный))
     * 
     * @param permitSeries
     */
    public void setPermitSeries(String permitSeries) {
        this.permitSeries = permitSeries;
    }

    /** 
     * Get the 'Currency' element value. Валюта
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'TransitPermit' element value. Наличие разрешения на поездку
     * 
     * @return value
     */
    public UsingPassType getTransitPermit() {
        return transitPermit;
    }

    /** 
     * Set the 'TransitPermit' element value. Наличие разрешения на поездку
     * 
     * @param transitPermit
     */
    public void setTransitPermit(UsingPassType transitPermit) {
        this.transitPermit = transitPermit;
    }

    /** 
     * Get the 'RoadCheck' element value. Квитанция об оплате дорожных сборов
     * 
     * @return value
     */
    public CheckType getRoadCheck() {
        return roadCheck;
    }

    /** 
     * Set the 'RoadCheck' element value. Квитанция об оплате дорожных сборов
     * 
     * @param roadCheck
     */
    public void setRoadCheck(CheckType roadCheck) {
        this.roadCheck = roadCheck;
    }

    /** 
     * Get the 'PenaltyCheck' element value. Квитанция об оплате штрафа
     * 
     * @return value
     */
    public CheckType getPenaltyCheck() {
        return penaltyCheck;
    }

    /** 
     * Set the 'PenaltyCheck' element value. Квитанция об оплате штрафа
     * 
     * @param penaltyCheck
     */
    public void setPenaltyCheck(CheckType penaltyCheck) {
        this.penaltyCheck = penaltyCheck;
    }

    /** 
     * Get the 'Resolution' element value. Постановление
     * 
     * @return value
     */
    public DocumentBaseType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. Постановление
     * 
     * @param resolution
     */
    public void setResolution(DocumentBaseType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the list of 'Suitability' element items. Наличие разрешений/документов об оплате/соответствие параметрам, указанным в разрешении
     * 
     * @return list
     */
    public List<CheckViolationType> getSuitabilityList() {
        return suitabilityList;
    }

    /** 
     * Set the list of 'Suitability' element items. Наличие разрешений/документов об оплате/соответствие параметрам, указанным в разрешении
     * 
     * @param list
     */
    public void setSuitabilityList(List<CheckViolationType> list) {
        suitabilityList = list;
    }

    /** 
     * Get the 'PassTG' element value. Наличие разрешения на перевозку ТГ
     * 
     * @return value
     */
    public UsingPassType getPassTG() {
        return passTG;
    }

    /** 
     * Set the 'PassTG' element value. Наличие разрешения на перевозку ТГ
     * 
     * @param passTG
     */
    public void setPassTG(UsingPassType passTG) {
        this.passTG = passTG;
    }

    /** 
     * Get the 'PassKG' element value. Наличие разрешения на перевозку КГ
     * 
     * @return value
     */
    public UsingPassType getPassKG() {
        return passKG;
    }

    /** 
     * Set the 'PassKG' element value. Наличие разрешения на перевозку КГ
     * 
     * @param passKG
     */
    public void setPassKG(UsingPassType passKG) {
        this.passKG = passKG;
    }

    /** 
     * Get the 'PassOG' element value. Наличие разрешения на перевозку ОГ
     * 
     * @return value
     */
    public UsingPassType getPassOG() {
        return passOG;
    }

    /** 
     * Set the 'PassOG' element value. Наличие разрешения на перевозку ОГ
     * 
     * @param passOG
     */
    public void setPassOG(UsingPassType passOG) {
        this.passOG = passOG;
    }
}
