
package ru.acs.fts.schemas.album.declarationconformity;

/** 
 * ����������
 */
public class AppendsType
{
    private String appendNumber;
    private String appendFormNumber;

    /** 
     * Get the 'AppendNumber' element value. ���������� ����� ����������
     * 
     * @return value
     */
    public String getAppendNumber() {
        return appendNumber;
    }

    /** 
     * Set the 'AppendNumber' element value. ���������� ����� ����������
     * 
     * @param appendNumber
     */
    public void setAppendNumber(String appendNumber) {
        this.appendNumber = appendNumber;
    }

    /** 
     * Get the 'AppendFormNumber' element value. ����� ������ ���������� (����������� � ������ ������� ����������)
     * 
     * @return value
     */
    public String getAppendFormNumber() {
        return appendFormNumber;
    }

    /** 
     * Set the 'AppendFormNumber' element value. ����� ������ ���������� (����������� � ������ ������� ����������)
     * 
     * @param appendFormNumber
     */
    public void setAppendFormNumber(String appendFormNumber) {
        this.appendFormNumber = appendFormNumber;
    }
}
