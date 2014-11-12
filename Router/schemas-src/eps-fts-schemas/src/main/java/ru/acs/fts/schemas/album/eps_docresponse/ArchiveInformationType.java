
package ru.acs.fts.schemas.album.eps_docresponse;

import org.joda.time.LocalDate;

/** 
 * ���������� �� ������
 */
public class ArchiveInformationType
{
    private String archDocAlbum;
    private LocalDate archDocDate;

    /** 
     * Get the 'ArchDocAlbum' element value. ����� ������ ������� ��������
     * 
     * @return value
     */
    public String getArchDocAlbum() {
        return archDocAlbum;
    }

    /** 
     * Set the 'ArchDocAlbum' element value. ����� ������ ������� ��������
     * 
     * @param archDocAlbum
     */
    public void setArchDocAlbum(String archDocAlbum) {
        this.archDocAlbum = archDocAlbum;
    }

    /** 
     * Get the 'ArchDocDate' element value. ���� ��������� ��������� � ����������� ����� ����������
     * 
     * @return value
     */
    public LocalDate getArchDocDate() {
        return archDocDate;
    }

    /** 
     * Set the 'ArchDocDate' element value. ���� ��������� ��������� � ����������� ����� ����������
     * 
     * @param archDocDate
     */
    public void setArchDocDate(LocalDate archDocDate) {
        this.archDocDate = archDocDate;
    }
}
