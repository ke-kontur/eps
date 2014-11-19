
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Группа индикаторов профиля риска
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
     * Get the 'AlertedSign' element value. Признак срабатывания по всей группе (true- срабоатло, false - не сработало)
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. Признак срабатывания по всей группе (true- срабоатло, false - не сработало)
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
    }

    /** 
     * Get the list of 'Indicators' element items. Индикаторы группы
     * 
     * @return list
     */
    public List<RevealingProtocolIndicator> getIndicatorList() {
        return indicatorList;
    }

    /** 
     * Set the list of 'Indicators' element items. Индикаторы группы
     * 
     * @param list
     */
    public void setIndicatorList(List<RevealingProtocolIndicator> list) {
        indicatorList = list;
    }
}
