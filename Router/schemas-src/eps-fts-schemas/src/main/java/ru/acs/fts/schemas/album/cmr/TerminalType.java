
package ru.acs.fts.schemas.album.cmr;

/** 
 * ������������ � �������������� ������ / ���������
 */
public class TerminalType
{
    private String terminalName;
    private String placeName;
    private String countryName;
    private String countryCode;

    /** 
     * Get the 'TerminalName' element value. ������������ ������
     * 
     * @return value
     */
    public String getTerminalName() {
        return terminalName;
    }

    /** 
     * Set the 'TerminalName' element value. ������������ ������
     * 
     * @param terminalName
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /** 
     * Get the 'PlaceName' element value. ��������������� ������
     * 
     * @return value
     */
    public String getPlaceName() {
        return placeName;
    }

    /** 
     * Set the 'PlaceName' element value. ��������������� ������
     * 
     * @param placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /** 
     * Get the 'CountryName' element value. ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��������� ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
