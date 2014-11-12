
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ������� ��� ���������  ��
 */
public class TransportMeansOwnerType
{
    private String ownerModeCode;
    private int choiceSelect = -1;
    private static final int TRANSPORT_OWNER_PERSON_CHOICE = 0;
    private static final int TRANSPORT_OWNER_ORGANIZATION_CHOICE = 1;
    private TransportOwnerPersonType transportOwnerPerson;
    private TransportOwnerOrganizationType transportOwnerOrganization;

    /** 
     * Get the 'OwnerModeCode' element value. ��� ���� ��������� (����.-"�",�����.-"�")
     * 
     * @return value
     */
    public String getOwnerModeCode() {
        return ownerModeCode;
    }

    /** 
     * Set the 'OwnerModeCode' element value. ��� ���� ��������� (����.-"�",�����.-"�")
     * 
     * @param ownerModeCode
     */
    public void setOwnerModeCode(String ownerModeCode) {
        this.ownerModeCode = ownerModeCode;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if TransportOwnerPerson is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTransportOwnerPerson() {
        return choiceSelect == TRANSPORT_OWNER_PERSON_CHOICE;
    }

    /** 
     * Get the 'TransportOwnerPerson' element value. �������� ������������� �������� - ���������� ����.
     * 
     * @return value
     */
    public TransportOwnerPersonType getTransportOwnerPerson() {
        return transportOwnerPerson;
    }

    /** 
     * Set the 'TransportOwnerPerson' element value. �������� ������������� �������� - ���������� ����.
     * 
     * @param transportOwnerPerson
     */
    public void setTransportOwnerPerson(
            TransportOwnerPersonType transportOwnerPerson) {
        setChoiceSelect(TRANSPORT_OWNER_PERSON_CHOICE);
        this.transportOwnerPerson = transportOwnerPerson;
    }

    /** 
     * Check if TransportOwnerOrganization is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTransportOwnerOrganization() {
        return choiceSelect == TRANSPORT_OWNER_ORGANIZATION_CHOICE;
    }

    /** 
     * Get the 'TransportOwnerOrganization' element value. �������� �� - ����������� ����.
     * 
     * @return value
     */
    public TransportOwnerOrganizationType getTransportOwnerOrganization() {
        return transportOwnerOrganization;
    }

    /** 
     * Set the 'TransportOwnerOrganization' element value. �������� �� - ����������� ����.
     * 
     * @param transportOwnerOrganization
     */
    public void setTransportOwnerOrganization(
            TransportOwnerOrganizationType transportOwnerOrganization) {
        setChoiceSelect(TRANSPORT_OWNER_ORGANIZATION_CHOICE);
        this.transportOwnerOrganization = transportOwnerOrganization;
    }
}
