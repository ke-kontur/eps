
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ���������� ���������.
 */
public class AUDResultInfoType
{
    private String resultCode;
    private String description;

    /** 
     * Get the 'ResultCode' element value. ��� ���������� ���������.
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ��� ���������� ���������.
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'Description' element value. ��������� �������� ���������� ���������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ��������� �������� ���������� ���������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
