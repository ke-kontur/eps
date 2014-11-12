
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * ����� ����������
 */
public class DestinationType
{
    private String importExport;
    private String nameCountry;

    /** 
     * Get the 'ImportExport' element value. ���� �������� ���� "true" - "���� - ���������� �����",  "false" - "����� - ����� ����������"
     * 
     * @return value
     */
    public String getImportExport() {
        return importExport;
    }

    /** 
     * Set the 'ImportExport' element value. ���� �������� ���� "true" - "���� - ���������� �����",  "false" - "����� - ����� ����������"
     * 
     * @param importExport
     */
    public void setImportExport(String importExport) {
        this.importExport = importExport;
    }

    /** 
     * Get the 'NameCountry' element value. �������� ����������� ������/������ ����������
     * 
     * @return value
     */
    public String getNameCountry() {
        return nameCountry;
    }

    /** 
     * Set the 'NameCountry' element value. �������� ����������� ������/������ ����������
     * 
     * @param nameCountry
     */
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
