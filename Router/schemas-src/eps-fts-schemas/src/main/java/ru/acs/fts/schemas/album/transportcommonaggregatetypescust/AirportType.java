
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * �������� �� ��������� (������)
 */
public class AirportType
{
    private String name;
    private String IATACode;

    /** 
     * Get the 'Name' element value. ��������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'IATACode' element value. ��� ����
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. ��� ����
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }
}
