
package ru.acs.fts.schemas.album.paymenttransactionreport;

/** 
 * Номер документа
 */
public class DocumentNumberType
{
    private String terminalID;
    private String chequeNumber;
    private String terminalKind;

    /** 
     * Get the 'TerminalID' element value. Уникальный идентификационный номер электронного терминала платежного теримнала, банкомата
     * 
     * @return value
     */
    public String getTerminalID() {
        return terminalID;
    }

    /** 
     * Set the 'TerminalID' element value. Уникальный идентификационный номер электронного терминала платежного теримнала, банкомата
     * 
     * @param terminalID
     */
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    /** 
     * Get the 'ChequeNumber' element value. Номер чека, сформированного электронным терминалом, платежным терминалом, банкоматом
     * 
     * @return value
     */
    public String getChequeNumber() {
        return chequeNumber;
    }

    /** 
     * Set the 'ChequeNumber' element value. Номер чека, сформированного электронным терминалом, платежным терминалом, банкоматом
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    /** 
     * Get the 'TerminalKind' element value. Вид устройства приема платежей: 1 - электронный терминал; 2 - платежный терминал; 3 - банкомат; 4 - зарезервировано
     * 
     * @return value
     */
    public String getTerminalKind() {
        return terminalKind;
    }

    /** 
     * Set the 'TerminalKind' element value. Вид устройства приема платежей: 1 - электронный терминал; 2 - платежный терминал; 3 - банкомат; 4 - зарезервировано
     * 
     * @param terminalKind
     */
    public void setTerminalKind(String terminalKind) {
        this.terminalKind = terminalKind;
    }
}
