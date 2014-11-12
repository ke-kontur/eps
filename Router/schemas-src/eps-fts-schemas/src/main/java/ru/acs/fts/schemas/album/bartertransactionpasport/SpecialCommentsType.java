
package ru.acs.fts.schemas.album.bartertransactionpasport;

/** 
 * ������ �������
 */
public class SpecialCommentsType
{
    private String explanations;
    private String exportAmount;
    private String importAmount;

    /** 
     * Get the 'Explanations' element value. ����������, �� ���������� � ������ ������ ��������, ����������� ������ �������������� �������
     * 
     * @return value
     */
    public String getExplanations() {
        return explanations;
    }

    /** 
     * Set the 'Explanations' element value. ����������, �� ���������� � ������ ������ ��������, ����������� ������ �������������� �������
     * 
     * @param explanations
     */
    public void setExplanations(String explanations) {
        this.explanations = explanations;
    }

    /** 
     * Get the 'ExportAmount' element value. ����������� ����� ��������, ���. ��.
     * 
     * @return value
     */
    public String getExportAmount() {
        return exportAmount;
    }

    /** 
     * Set the 'ExportAmount' element value. ����������� ����� ��������, ���. ��.
     * 
     * @param exportAmount
     */
    public void setExportAmount(String exportAmount) {
        this.exportAmount = exportAmount;
    }

    /** 
     * Get the 'ImportAmount' element value. ����������� ����� �������, ���. ��.
     * 
     * @return value
     */
    public String getImportAmount() {
        return importAmount;
    }

    /** 
     * Set the 'ImportAmount' element value. ����������� ����� �������, ���. ��.
     * 
     * @param importAmount
     */
    public void setImportAmount(String importAmount) {
        this.importAmount = importAmount;
    }
}
