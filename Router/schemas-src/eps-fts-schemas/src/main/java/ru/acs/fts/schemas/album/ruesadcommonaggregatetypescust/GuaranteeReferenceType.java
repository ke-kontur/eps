
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ��������.
 */
public class GuaranteeReferenceType
{
    private String GRN;
    private String otherGuaranteeNumber;
    private String accessCode;
    private String notValid4EC;
    private List<LimitationNonECType> limitationNonECList = new ArrayList<LimitationNonECType>();

    /** 
     * Get the 'GRN' element value. ��������������� ����� �������� (GRN) ����������� � ������ ������������� �������� NCTS.
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. ��������������� ����� �������� (GRN) ����������� � ������ ������������� �������� NCTS.
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'OtherGuaranteeNumber' element value. ����� ������������ �����������.
     * 
     * @return value
     */
    public String getOtherGuaranteeNumber() {
        return otherGuaranteeNumber;
    }

    /** 
     * Set the 'OtherGuaranteeNumber' element value. ����� ������������ �����������.
     * 
     * @param otherGuaranteeNumber
     */
    public void setOtherGuaranteeNumber(String otherGuaranteeNumber) {
        this.otherGuaranteeNumber = otherGuaranteeNumber;
    }

    /** 
     * Get the 'AccessCode' element value. ��� ������� ��� GRN ����������� � ������ ������������� �������� NCTS.
     * 
     * @return value
     */
    public String getAccessCode() {
        return accessCode;
    }

    /** 
     * Set the 'AccessCode' element value. ��� ������� ��� GRN ����������� � ������ ������������� �������� NCTS.
     * 
     * @param accessCode
     */
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    /** 
     * Get the 'NotValid4EC' element value. ������� ����������� ��� ����� �� ����������� � ������ ������������� �������� NCTS. 0 - ��� ����������� 1 - ���� �����������
     * 
     * @return value
     */
    public String getNotValid4EC() {
        return notValid4EC;
    }

    /** 
     * Set the 'NotValid4EC' element value. ������� ����������� ��� ����� �� ����������� � ������ ������������� �������� NCTS. 0 - ��� ����������� 1 - ���� �����������
     * 
     * @param notValid4EC
     */
    public void setNotValid4EC(String notValid4EC) {
        this.notValid4EC = notValid4EC;
    }

    /** 
     * Get the list of 'LimitationNonEC' element items. ����������� �������� �������� ��� ��.
     * 
     * @return list
     */
    public List<LimitationNonECType> getLimitationNonECList() {
        return limitationNonECList;
    }

    /** 
     * Set the list of 'LimitationNonEC' element items. ����������� �������� �������� ��� ��.
     * 
     * @param list
     */
    public void setLimitationNonECList(List<LimitationNonECType> list) {
        limitationNonECList = list;
    }
}
