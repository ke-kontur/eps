
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ����� � ����� �������� ������������� ��������
 */
public class TransportMeansPassportType
{
    private String series;
    private String PTSNumber;
    private String regionCode;

    /** 
     * Get the 'Series' element value. ����� �������� ������������� ��������
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. ����� �������� ������������� ��������
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'PTSNumber' element value. ����� �������� ������������� ��������
     * 
     * @return value
     */
    public String getPTSNumber() {
        return PTSNumber;
    }

    /** 
     * Set the 'PTSNumber' element value. ����� �������� ������������� ��������
     * 
     * @param PTSNumber
     */
    public void setPTSNumber(String PTSNumber) {
        this.PTSNumber = PTSNumber;
    }

    /** 
     * Get the 'RegionCode' element value. ��� �������
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. ��� �������
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
