
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * ����� ���������� �������: ������������ �����/��� ������������ �� �������
 */
public class PIDestinationPlaceType
{
    private String destinationRWStationCode;
    private String destinationRWStationName;
    private String destinantionPlaceName;

    /** 
     * Get the 'DestinationRWStationCode' element value. ��� �/� ������� ����������
     * 
     * @return value
     */
    public String getDestinationRWStationCode() {
        return destinationRWStationCode;
    }

    /** 
     * Set the 'DestinationRWStationCode' element value. ��� �/� ������� ����������
     * 
     * @param destinationRWStationCode
     */
    public void setDestinationRWStationCode(String destinationRWStationCode) {
        this.destinationRWStationCode = destinationRWStationCode;
    }

    /** 
     * Get the 'DestinationRWStationName' element value. ������������ ��������������� ������� ����������
     * 
     * @return value
     */
    public String getDestinationRWStationName() {
        return destinationRWStationName;
    }

    /** 
     * Set the 'DestinationRWStationName' element value. ������������ ��������������� ������� ����������
     * 
     * @param destinationRWStationName
     */
    public void setDestinationRWStationName(String destinationRWStationName) {
        this.destinationRWStationName = destinationRWStationName;
    }

    /** 
     * Get the 'DestinantionPlaceName' element value. ������������ ����� ����������
     * 
     * @return value
     */
    public String getDestinantionPlaceName() {
        return destinantionPlaceName;
    }

    /** 
     * Set the 'DestinantionPlaceName' element value. ������������ ����� ����������
     * 
     * @param destinantionPlaceName
     */
    public void setDestinantionPlaceName(String destinantionPlaceName) {
        this.destinantionPlaceName = destinantionPlaceName;
    }
}
