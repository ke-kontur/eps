
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ����������� ������� �����
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RevealingProtocolGroup">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="AlertedSign"/>
 *     &lt;xs:element type="ns:RevealingProtocolIndicator" name="Indicators" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RevealingProtocolGroup
{
    private String alertedSign;
    private List<RevealingProtocolIndicator> indicatorList = new ArrayList<RevealingProtocolIndicator>();

    /** 
     * Get the 'AlertedSign' element value. ������� ������������ �� ���� ������ (true- ���������, false - �� ���������)
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. ������� ������������ �� ���� ������ (true- ���������, false - �� ���������)
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
    }

    /** 
     * Get the list of 'Indicators' element items. ���������� ������
     * 
     * @return list
     */
    public List<RevealingProtocolIndicator> getIndicatorList() {
        return indicatorList;
    }

    /** 
     * Set the list of 'Indicators' element items. ���������� ������
     * 
     * @param list
     */
    public void setIndicatorList(List<RevealingProtocolIndicator> list) {
        indicatorList = list;
    }
}
