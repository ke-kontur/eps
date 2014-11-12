
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * ����� ����������/�������� � ���
 */
public class TIRDestinationType extends TDDestinationBaseType
{
    private String destinationPlaceName;

    /** 
     * Get the 'DestinationPlaceName' element value. ������������ ����� ����������
     * 
     * @return value
     */
    public String getDestinationPlaceName() {
        return destinationPlaceName;
    }

    /** 
     * Set the 'DestinationPlaceName' element value. ������������ ����� ����������
     * 
     * @param destinationPlaceName
     */
    public void setDestinationPlaceName(String destinationPlaceName) {
        this.destinationPlaceName = destinationPlaceName;
    }
}
