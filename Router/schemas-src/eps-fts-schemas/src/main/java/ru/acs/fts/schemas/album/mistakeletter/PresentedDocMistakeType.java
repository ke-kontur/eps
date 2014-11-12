
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * ����������� ��� ��� �������� ���������� ������ � ���������� ��������������� ���������
 */
public class PresentedDocMistakeType
{
    private String prDocumentOrderNumber;
    private DocModeCodeMistakeType docModeCodeMistake;
    private DocNameMistakeType docNameMistake;
    private DocNumberMistakeType docNumberMistake;
    private DocDateMistakeType docDateMistake;

    /** 
     * Get the 'PrDocumentOrderNumber' element value. ���������� ����� ��������� � ��������������� ������ ���������� ������ � �������� �� ����� ��-1
     * 
     * @return value
     */
    public String getPrDocumentOrderNumber() {
        return prDocumentOrderNumber;
    }

    /** 
     * Set the 'PrDocumentOrderNumber' element value. ���������� ����� ��������� � ��������������� ������ ���������� ������ � �������� �� ����� ��-1
     * 
     * @param prDocumentOrderNumber
     */
    public void setPrDocumentOrderNumber(String prDocumentOrderNumber) {
        this.prDocumentOrderNumber = prDocumentOrderNumber;
    }

    /** 
     * Get the 'DocModeCodeMistake' element value. ������ � ���� ���� ���������
     * 
     * @return value
     */
    public DocModeCodeMistakeType getDocModeCodeMistake() {
        return docModeCodeMistake;
    }

    /** 
     * Set the 'DocModeCodeMistake' element value. ������ � ���� ���� ���������
     * 
     * @param docModeCodeMistake
     */
    public void setDocModeCodeMistake(DocModeCodeMistakeType docModeCodeMistake) {
        this.docModeCodeMistake = docModeCodeMistake;
    }

    /** 
     * Get the 'DocNameMistake' element value. ������ � ������������ ���������
     * 
     * @return value
     */
    public DocNameMistakeType getDocNameMistake() {
        return docNameMistake;
    }

    /** 
     * Set the 'DocNameMistake' element value. ������ � ������������ ���������
     * 
     * @param docNameMistake
     */
    public void setDocNameMistake(DocNameMistakeType docNameMistake) {
        this.docNameMistake = docNameMistake;
    }

    /** 
     * Get the 'DocNumberMistake' element value. ������ � ������ ���������
     * 
     * @return value
     */
    public DocNumberMistakeType getDocNumberMistake() {
        return docNumberMistake;
    }

    /** 
     * Set the 'DocNumberMistake' element value. ������ � ������ ���������
     * 
     * @param docNumberMistake
     */
    public void setDocNumberMistake(DocNumberMistakeType docNumberMistake) {
        this.docNumberMistake = docNumberMistake;
    }

    /** 
     * Get the 'DocDateMistake' element value. ������ � ���� ���������
     * 
     * @return value
     */
    public DocDateMistakeType getDocDateMistake() {
        return docDateMistake;
    }

    /** 
     * Set the 'DocDateMistake' element value. ������ � ���� ���������
     * 
     * @param docDateMistake
     */
    public void setDocDateMistake(DocDateMistakeType docDateMistake) {
        this.docDateMistake = docDateMistake;
    }
}
