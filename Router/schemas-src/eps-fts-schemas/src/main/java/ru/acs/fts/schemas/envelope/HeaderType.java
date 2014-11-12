
package ru.acs.fts.schemas.envelope;

import java.util.ArrayList;
import java.util.List;

/** 
 * Общий заголовок конверта
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2001/06/soap-envelope" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HeaderType">
 *   &lt;xs:sequence>
 *     &lt;xs:any maxOccurs="unbounded" processContents="skip"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HeaderType
{
    private List<Object> anyList = new ArrayList<Object>();

    /** 
     * Get the list of 'HeaderType' complexType items. Заголовки конверта
     * 
     * @return list
     */
    public List<Object> getAnyList() {
        return anyList;
    }

    /** 
     * Set the list of 'HeaderType' complexType items. Заголовки конверта
     * 
     * @param list
     */
    public void setAnyList(List<Object> list) {
        anyList = list;
    }
}
