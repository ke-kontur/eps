
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Реквизиты гарантии.
 */
public class GuaranteeReferenceType
{
    private String GRN;
    private String otherGuaranteeNumber;
    private String accessCode;
    private String notValid4EC;
    private List<LimitationNonECType> limitationNonECList = new ArrayList<LimitationNonECType>();

    /** 
     * Get the 'GRN' element value. Регистрационный номер гарантии (GRN) заполняется в случае использования гарантии NCTS.
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. Регистрационный номер гарантии (GRN) заполняется в случае использования гарантии NCTS.
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'OtherGuaranteeNumber' element value. Номер гарантийного сертификата.
     * 
     * @return value
     */
    public String getOtherGuaranteeNumber() {
        return otherGuaranteeNumber;
    }

    /** 
     * Set the 'OtherGuaranteeNumber' element value. Номер гарантийного сертификата.
     * 
     * @param otherGuaranteeNumber
     */
    public void setOtherGuaranteeNumber(String otherGuaranteeNumber) {
        this.otherGuaranteeNumber = otherGuaranteeNumber;
    }

    /** 
     * Get the 'AccessCode' element value. Код доступа для GRN заполняется в случае использования гарантии NCTS.
     * 
     * @return value
     */
    public String getAccessCode() {
        return accessCode;
    }

    /** 
     * Set the 'AccessCode' element value. Код доступа для GRN заполняется в случае использования гарантии NCTS.
     * 
     * @param accessCode
     */
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    /** 
     * Get the 'NotValid4EC' element value. Признак ограничения для стран ЕС заполняется в случае использования гарантии NCTS. 0 - нет ограничений 1 - есть ограничения
     * 
     * @return value
     */
    public String getNotValid4EC() {
        return notValid4EC;
    }

    /** 
     * Set the 'NotValid4EC' element value. Признак ограничения для стран ЕС заполняется в случае использования гарантии NCTS. 0 - нет ограничений 1 - есть ограничения
     * 
     * @param notValid4EC
     */
    public void setNotValid4EC(String notValid4EC) {
        this.notValid4EC = notValid4EC;
    }

    /** 
     * Get the list of 'LimitationNonEC' element items. Ограничение действия гарантии вне ЕС.
     * 
     * @return list
     */
    public List<LimitationNonECType> getLimitationNonECList() {
        return limitationNonECList;
    }

    /** 
     * Set the list of 'LimitationNonEC' element items. Ограничение действия гарантии вне ЕС.
     * 
     * @param list
     */
    public void setLimitationNonECList(List<LimitationNonECType> list) {
        limitationNonECList = list;
    }
}
