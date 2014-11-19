
package ru.acs.fts.schemas.album.dealpassport;

/** 
 * ����� �������� ������, ������������ �� 18.06.2004
 */
public class DPoldNumberType
{
    private String typeOfDP;
    private String bankOKPO;
    private String oldReNumber;
    private String oldPart4;

    /** 
     * Get the 'TypeOfDP' element value. ��� ��: 1 - �������, 2 - ������.
     * 
     * @return value
     */
    public String getTypeOfDP() {
        return typeOfDP;
    }

    /** 
     * Set the 'TypeOfDP' element value. ��� ��: 1 - �������, 2 - ������.
     * 
     * @param typeOfDP
     */
    public void setTypeOfDP(String typeOfDP) {
        this.typeOfDP = typeOfDP;
    }

    /** 
     * Get the 'BankOKPO' element value. ����� ����� (�������������), ����������� ��
     * 
     * @return value
     */
    public String getBankOKPO() {
        return bankOKPO;
    }

    /** 
     * Set the 'BankOKPO' element value. ����� ����� (�������������), ����������� ��
     * 
     * @param bankOKPO
     */
    public void setBankOKPO(String bankOKPO) {
        this.bankOKPO = bankOKPO;
    }

    /** 
     * Get the 'OldReNumber' element value. �����, ����������� �� ��� ��������������
     * 
     * @return value
     */
    public String getOldReNumber() {
        return oldReNumber;
    }

    /** 
     * Set the 'OldReNumber' element value. �����, ����������� �� ��� ��������������
     * 
     * @param oldReNumber
     */
    public void setOldReNumber(String oldReNumber) {
        this.oldReNumber = oldReNumber;
    }

    /** 
     * Get the 'OldPart4' element value. ��������� ����� ������ �� �� ������ ����
     * 
     * @return value
     */
    public String getOldPart4() {
        return oldPart4;
    }

    /** 
     * Set the 'OldPart4' element value. ��������� ����� ������ �� �� ������ ����
     * 
     * @param oldPart4
     */
    public void setOldPart4(String oldPart4) {
        this.oldPart4 = oldPart4;
    }
}
