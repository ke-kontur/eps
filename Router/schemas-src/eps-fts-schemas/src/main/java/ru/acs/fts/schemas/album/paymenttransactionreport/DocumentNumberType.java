
package ru.acs.fts.schemas.album.paymenttransactionreport;

/** 
 * ����� ���������
 */
public class DocumentNumberType
{
    private String terminalID;
    private String chequeNumber;
    private String terminalKind;

    /** 
     * Get the 'TerminalID' element value. ���������� ����������������� ����� ������������ ��������� ���������� ���������, ���������
     * 
     * @return value
     */
    public String getTerminalID() {
        return terminalID;
    }

    /** 
     * Set the 'TerminalID' element value. ���������� ����������������� ����� ������������ ��������� ���������� ���������, ���������
     * 
     * @param terminalID
     */
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    /** 
     * Get the 'ChequeNumber' element value. ����� ����, ��������������� ����������� ����������, ��������� ����������, ����������
     * 
     * @return value
     */
    public String getChequeNumber() {
        return chequeNumber;
    }

    /** 
     * Set the 'ChequeNumber' element value. ����� ����, ��������������� ����������� ����������, ��������� ����������, ����������
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    /** 
     * Get the 'TerminalKind' element value. ��� ���������� ������ ��������: 1 - ����������� ��������; 2 - ��������� ��������; 3 - ��������; 4 - ���������������
     * 
     * @return value
     */
    public String getTerminalKind() {
        return terminalKind;
    }

    /** 
     * Set the 'TerminalKind' element value. ��� ���������� ������ ��������: 1 - ����������� ��������; 2 - ��������� ��������; 3 - ��������; 4 - ���������������
     * 
     * @param terminalKind
     */
    public void setTerminalKind(String terminalKind) {
        this.terminalKind = terminalKind;
    }
}
