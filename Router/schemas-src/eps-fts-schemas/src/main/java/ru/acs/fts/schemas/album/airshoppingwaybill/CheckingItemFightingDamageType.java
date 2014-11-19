
package ru.acs.fts.schemas.album.airshoppingwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� ������� ��� � �����
 */
public class CheckingItemFightingDamageType
{
    private PersonBaseType boardConductorDeparting;
    private PersonBaseType transOrganizationDeparting;
    private PersonBaseType transOrganizationArrival;
    private PersonBaseType boardConductorArrival;

    /** 
     * Get the 'BoardConductorDeparting' element value. ������� ���� ���������� ��� ������
     * 
     * @return value
     */
    public PersonBaseType getBoardConductorDeparting() {
        return boardConductorDeparting;
    }

    /** 
     * Set the 'BoardConductorDeparting' element value. ������� ���� ���������� ��� ������
     * 
     * @param boardConductorDeparting
     */
    public void setBoardConductorDeparting(
            PersonBaseType boardConductorDeparting) {
        this.boardConductorDeparting = boardConductorDeparting;
    }

    /** 
     * Get the 'TransOrganizationDeparting' element value. ������� ������������ ����������� ��� ������
     * 
     * @return value
     */
    public PersonBaseType getTransOrganizationDeparting() {
        return transOrganizationDeparting;
    }

    /** 
     * Set the 'TransOrganizationDeparting' element value. ������� ������������ ����������� ��� ������
     * 
     * @param transOrganizationDeparting
     */
    public void setTransOrganizationDeparting(
            PersonBaseType transOrganizationDeparting) {
        this.transOrganizationDeparting = transOrganizationDeparting;
    }

    /** 
     * Get the 'TransOrganizationArrival' element value. ������� ������������ ����������� ��� �������
     * 
     * @return value
     */
    public PersonBaseType getTransOrganizationArrival() {
        return transOrganizationArrival;
    }

    /** 
     * Set the 'TransOrganizationArrival' element value. ������� ������������ ����������� ��� �������
     * 
     * @param transOrganizationArrival
     */
    public void setTransOrganizationArrival(
            PersonBaseType transOrganizationArrival) {
        this.transOrganizationArrival = transOrganizationArrival;
    }

    /** 
     * Get the 'BoardConductorArrival' element value. ������� ���� ���������� ��� �������
     * 
     * @return value
     */
    public PersonBaseType getBoardConductorArrival() {
        return boardConductorArrival;
    }

    /** 
     * Set the 'BoardConductorArrival' element value. ������� ���� ���������� ��� �������
     * 
     * @param boardConductorArrival
     */
    public void setBoardConductorArrival(PersonBaseType boardConductorArrival) {
        this.boardConductorArrival = boardConductorArrival;
    }
}
