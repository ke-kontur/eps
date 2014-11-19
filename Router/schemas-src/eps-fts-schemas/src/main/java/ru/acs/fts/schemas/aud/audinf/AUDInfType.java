
package ru.acs.fts.schemas.aud.audinf;

/** 
 * ���������� ���
 */
public class AUDInfType
{
    private String archiveClientId;
    private String customsCode;

    /** 
     * Get the 'ArchiveClientId' element value. ������������� ������� ������.
     * 
     * @return value
     */
    public String getArchiveClientId() {
        return archiveClientId;
    }

    /** 
     * Set the 'ArchiveClientId' element value. ������������� ������� ������.
     * 
     * @param archiveClientId
     */
    public void setArchiveClientId(String archiveClientId) {
        this.archiveClientId = archiveClientId;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������ �� (�� "��������������  �� � �� ����������� �������������" ���).
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������ �� (�� "��������������  �� � �� ����������� �������������" ���).
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }
}
