
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ��������� ������� �����
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RevealingProtocolIndicator">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="Name"/>
 *     &lt;xs:element type="xs:string" name="Description" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="Value"/>
 *     &lt;xs:element type="xs:string" name="AlertedSign"/>
 *     &lt;xs:choice>
 *       &lt;xs:element type="ns:RevealingProtocolAlertedInfo" name="AlertedInformation" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;xs:element name="ConsignmentAlertedInformation" minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class ConsignmentAlertedInformation -->
 *       &lt;/xs:element>
 *     &lt;/xs:choice>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RevealingProtocolIndicator
{
    private String name;
    private String description;
    private String value;
    private String alertedSign;
    private int choiceSelect = -1;
    private static final int ALERTED_INFORMATION_LIST_CHOICE = 0;
    private static final int CONSIGNMENT_ALERTED_INFORMATION_LIST_CHOICE = 1;
    private List<RevealingProtocolAlertedInfo> alertedInformationList = new ArrayList<RevealingProtocolAlertedInfo>();
    private List<ConsignmentAlertedInformation> consignmentAlertedInformationList = new ArrayList<ConsignmentAlertedInformation>();

    /** 
     * Get the 'Name' element value. ������������ ���������� ��
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ���������� ��
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Description' element value. �������� ���������� ��
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ���������� ��
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'Value' element value. �������� ���������� � ��
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. �������� ���������� � ��
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������). ����� ��� ���� �������� �� ���������
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������). ����� ��� ���� �������� �� ���������
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
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
     * Check if AlertedInformationList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifAlertedInformationList() {
        return choiceSelect == ALERTED_INFORMATION_LIST_CHOICE;
    }

    /** 
     * Get the list of 'AlertedInformation' element items. ���������� �� �� � ��������� �������� � ����������� �������� ������������
     * 
     * @return list
     */
    public List<RevealingProtocolAlertedInfo> getAlertedInformationList() {
        return alertedInformationList;
    }

    /** 
     * Set the list of 'AlertedInformation' element items. ���������� �� �� � ��������� �������� � ����������� �������� ������������
     * 
     * @param list
     */
    public void setAlertedInformationList(
            List<RevealingProtocolAlertedInfo> list) {
        setChoiceSelect(ALERTED_INFORMATION_LIST_CHOICE);
        alertedInformationList = list;
    }

    /** 
     * Check if ConsignmentAlertedInformationList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifConsignmentAlertedInformationList() {
        return choiceSelect == CONSIGNMENT_ALERTED_INFORMATION_LIST_CHOICE;
    }

    /** 
     * Get the list of 'ConsignmentAlertedInformation' element items.
     * 
     * @return list
     */
    public List<ConsignmentAlertedInformation> getConsignmentAlertedInformationList() {
        return consignmentAlertedInformationList;
    }

    /** 
     * Set the list of 'ConsignmentAlertedInformation' element items.
     * 
     * @param list
     */
    public void setConsignmentAlertedInformationList(
            List<ConsignmentAlertedInformation> list) {
        setChoiceSelect(CONSIGNMENT_ALERTED_INFORMATION_LIST_CHOICE);
        consignmentAlertedInformationList = list;
    }
    /** 
     * ���������� �� ��/����������� ��/��������� �� � ��������� �������� � ����������� �������� ������������
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsignmentAlertedInformation" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="LotID"/>
     *       &lt;xs:element type="xs:string" name="AlertedSign"/>
     *       &lt;xs:element type="ns:RevealingProtocolAlertedInfo" name="AlertedInformation" minOccurs="0" maxOccurs="unbounded"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class ConsignmentAlertedInformation
    {
        private String lotID;
        private String alertedSign;
        private List<RevealingProtocolAlertedInfo> alertedInformationList = new ArrayList<RevealingProtocolAlertedInfo>();

        /** 
         * Get the 'LotID' element value. ������������� ���������� ������ �������
         * 
         * @return value
         */
        public String getLotID() {
            return lotID;
        }

        /** 
         * Set the 'LotID' element value. ������������� ���������� ������ �������
         * 
         * @param lotID
         */
        public void setLotID(String lotID) {
            this.lotID = lotID;
        }

        /** 
         * Get the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������). ����� ��� ���� �������� �� �������� ������ ��������� (��)
         * 
         * @return value
         */
        public String getAlertedSign() {
            return alertedSign;
        }

        /** 
         * Set the 'AlertedSign' element value. ������� ��������� (true - ����������, false - ������������). ����� ��� ���� �������� �� �������� ������ ��������� (��)
         * 
         * @param alertedSign
         */
        public void setAlertedSign(String alertedSign) {
            this.alertedSign = alertedSign;
        }

        /** 
         * Get the list of 'AlertedInformation' element items. ���������� �� �� � ��������� �������� � ����������� �������� ������������
         * 
         * @return list
         */
        public List<RevealingProtocolAlertedInfo> getAlertedInformationList() {
            return alertedInformationList;
        }

        /** 
         * Set the list of 'AlertedInformation' element items. ���������� �� �� � ��������� �������� � ����������� �������� ������������
         * 
         * @param list
         */
        public void setAlertedInformationList(
                List<RevealingProtocolAlertedInfo> list) {
            alertedInformationList = list;
        }
    }
}
