
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * ���� ���������� � ����, ����������� ���
 */
public class DTSFilledPersonType extends ESADFilledPersonType
{
    private LocalDate filledDate;
    private String regNumberDoc;
    private String securityLabelCode;

    /** 
     * Get the 'FilledDate' element value. ���� ���������� ���
     * 
     * @return value
     */
    public LocalDate getFilledDate() {
        return filledDate;
    }

    /** 
     * Set the 'FilledDate' element value. ���� ���������� ���
     * 
     * @param filledDate
     */
    public void setFilledDate(LocalDate filledDate) {
        this.filledDate = filledDate;
    }

    /** 
     * Get the 'RegNumberDoc' element value. ��������� ����� ����������� ���������� � ������������ � �������� (�����������) ����� ��������� ���������� ���������� ��� ����������� �������������  � ���������� ��������
     * 
     * @return value
     */
    public String getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. ��������� ����� ����������� ���������� � ������������ � �������� (�����������) ����� ��������� ���������� ���������� ��� ����������� �������������  � ���������� ��������
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(String regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'SecurityLabelCode' element value. ��� �������� �������� ��� ��
     * 
     * @return value
     */
    public String getSecurityLabelCode() {
        return securityLabelCode;
    }

    /** 
     * Set the 'SecurityLabelCode' element value. ��� �������� �������� ��� ��
     * 
     * @param securityLabelCode
     */
    public void setSecurityLabelCode(String securityLabelCode) {
        this.securityLabelCode = securityLabelCode;
    }
}
