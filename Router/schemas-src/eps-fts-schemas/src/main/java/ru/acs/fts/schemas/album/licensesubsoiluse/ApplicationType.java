
package ru.acs.fts.schemas.album.licensesubsoiluse;

/** 
 * �������� � �����������, � ������� ����� ���������� � �������� ������ ���������� �������/������ ������� ����
 */
public class ApplicationType
{
    private String KIndApplication;
    private String numberApplication;
    private String sheetApplication;

    /** 
     * Get the 'KIndApplication' element value. ��� ����������: true - ����������, ����������� ������� ���������� �������; false- ����������, ����������� ������� ������� ���� 
     * 
     * @return value
     */
    public String getKIndApplication() {
        return KIndApplication;
    }

    /** 
     * Set the 'KIndApplication' element value. ��� ����������: true - ����������, ����������� ������� ���������� �������; false- ����������, ����������� ������� ������� ���� 
     * 
     * @param KIndApplication
     */
    public void setKIndApplication(String KIndApplication) {
        this.KIndApplication = KIndApplication;
    }

    /** 
     * Get the 'NumberApplication' element value. ����� ���������� 
     * 
     * @return value
     */
    public String getNumberApplication() {
        return numberApplication;
    }

    /** 
     * Set the 'NumberApplication' element value. ����� ���������� 
     * 
     * @param numberApplication
     */
    public void setNumberApplication(String numberApplication) {
        this.numberApplication = numberApplication;
    }

    /** 
     * Get the 'SheetApplication' element value. ���������� ������ � ����������
     * 
     * @return value
     */
    public String getSheetApplication() {
        return sheetApplication;
    }

    /** 
     * Set the 'SheetApplication' element value. ���������� ������ � ����������
     * 
     * @param sheetApplication
     */
    public void setSheetApplication(String sheetApplication) {
        this.sheetApplication = sheetApplication;
    }
}
