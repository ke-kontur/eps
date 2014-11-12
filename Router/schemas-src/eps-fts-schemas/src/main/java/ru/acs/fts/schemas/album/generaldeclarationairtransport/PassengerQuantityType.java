
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * ���������� � ���������� ����������
 */
public class PassengerQuantityType
{
    private String departurePass;
    private String transferDepartPass;
    private String destinationPass;
    private String transferDestinationPass;

    /** 
     * Get the 'DeparturePass' element value. ���������� ���������� ��������  � ������ �����������
     * 
     * @return value
     */
    public String getDeparturePass() {
        return departurePass;
    }

    /** 
     * Set the 'DeparturePass' element value. ���������� ���������� ��������  � ������ �����������
     * 
     * @param departurePass
     */
    public void setDeparturePass(String departurePass) {
        this.departurePass = departurePass;
    }

    /** 
     * Get the 'TransferDepartPass' element value. ���-�� ������������ ���������� � ��������� ������
     * 
     * @return value
     */
    public String getTransferDepartPass() {
        return transferDepartPass;
    }

    /** 
     * Set the 'TransferDepartPass' element value. ���-�� ������������ ���������� � ��������� ������
     * 
     * @param transferDepartPass
     */
    public void setTransferDepartPass(String transferDepartPass) {
        this.transferDepartPass = transferDepartPass;
    }

    /** 
     * Get the 'DestinationPass' element value. ���������� ���������� ���������  � ��������� ����������
     * 
     * @return value
     */
    public String getDestinationPass() {
        return destinationPass;
    }

    /** 
     * Set the 'DestinationPass' element value. ���������� ���������� ���������  � ��������� ����������
     * 
     * @param destinationPass
     */
    public void setDestinationPass(String destinationPass) {
        this.destinationPass = destinationPass;
    }

    /** 
     * Get the 'TransferDestinationPass' element value. ���������� ������������ ���������� � ��������� ����������
     * 
     * @return value
     */
    public String getTransferDestinationPass() {
        return transferDestinationPass;
    }

    /** 
     * Set the 'TransferDestinationPass' element value. ���������� ������������ ���������� � ��������� ����������
     * 
     * @param transferDestinationPass
     */
    public void setTransferDestinationPass(String transferDestinationPass) {
        this.transferDestinationPass = transferDestinationPass;
    }
}
