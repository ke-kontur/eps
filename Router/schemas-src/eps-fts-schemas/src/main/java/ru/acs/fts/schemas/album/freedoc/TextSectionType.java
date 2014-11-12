
package ru.acs.fts.schemas.album.freedoc;

/** 
 * ��������� ������ ���������
 */
public class TextSectionType extends TextParagrType
{
    private String sectionName;

    /** 
     * Get the 'SectionName' element value. ������������ �������
     * 
     * @return value
     */
    public String getSectionName() {
        return sectionName;
    }

    /** 
     * Set the 'SectionName' element value. ������������ �������
     * 
     * @param sectionName
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
