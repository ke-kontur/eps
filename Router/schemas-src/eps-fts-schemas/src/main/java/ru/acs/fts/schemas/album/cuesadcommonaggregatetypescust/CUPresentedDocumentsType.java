
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ESAD.�������������� ���������
 */
public class CUPresentedDocumentsType extends CUESADPresentedDocumentsType
{
    private String TIRPageNumber;
    private String TIRHolderID;
    private String regNumberDocument;

    /** 
     * Get the 'TIRPageNumber' element value. ���������� ����� ����� ������ ���
     * 
     * @return value
     */
    public String getTIRPageNumber() {
        return TIRPageNumber;
    }

    /** 
     * Set the 'TIRPageNumber' element value. ���������� ����� ����� ������ ���
     * 
     * @param TIRPageNumber
     */
    public void setTIRPageNumber(String TIRPageNumber) {
        this.TIRPageNumber = TIRPageNumber;
    }

    /** 
     * Get the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

    /** 
     * Get the 'RegNumberDocument' element value. ��������������� ����� ����������� ���������, � ������� �� ��� ������������� ������������. ��� ��  
     * 
     * @return value
     */
    public String getRegNumberDocument() {
        return regNumberDocument;
    }

    /** 
     * Set the 'RegNumberDocument' element value. ��������������� ����� ����������� ���������, � ������� �� ��� ������������� ������������. ��� ��  
     * 
     * @param regNumberDocument
     */
    public void setRegNumberDocument(String regNumberDocument) {
        this.regNumberDocument = regNumberDocument;
    }
}
