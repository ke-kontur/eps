
package ru.acs.fts.schemas.album.goodscheckreport;

/** 
 * �������� � �������
 */
public class MarksType
{
    private String nameMarks;
    private String value;

    /** 
     * Get the 'NameMarks' element value. ������������ ������
     * 
     * @return value
     */
    public String getNameMarks() {
        return nameMarks;
    }

    /** 
     * Set the 'NameMarks' element value. ������������ ������
     * 
     * @param nameMarks
     */
    public void setNameMarks(String nameMarks) {
        this.nameMarks = nameMarks;
    }

    /** 
     * Get the 'Value' element value. ����������� ������. 0- �����������, 1 - ����
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. ����������� ������. 0- �����������, 1 - ����
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
