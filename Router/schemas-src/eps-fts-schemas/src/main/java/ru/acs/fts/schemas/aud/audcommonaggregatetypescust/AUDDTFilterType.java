
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ��������������� ����� ����������� ���������. ����������� ��� ���� ���������� ������� ��������� ������, ����������� � �� ���������� ������ ���
 */
public class AUDDTFilterType
{
    private String customsCode;
    private String GTDNumber;
    private AUDDateFilterParamsType registrationDate;

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��������� �� ������� �����������.
     * 
     * @return value
     */
    public String getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��������� �� ������� �����������.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(String GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'RegistrationDate' element value. ����  ����������� ���������
     * 
     * @return value
     */
    public AUDDateFilterParamsType getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ����  ����������� ���������
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(AUDDateFilterParamsType registrationDate) {
        this.registrationDate = registrationDate;
    }
}
