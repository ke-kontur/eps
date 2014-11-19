
package ru.acs.fts.schemas.envelope;

import java.util.ArrayList;
import java.util.List;

/** 
 * —ведени€ о присоединени€х (используетс€ в случае, если передаютс€ бинарные данные)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:Attachments:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AttachmentsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:AttachmentType" name="Attachment" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AttachmentsType
{
    private List<AttachmentType> attachmentList = new ArrayList<AttachmentType>();

    /** 
     * Get the list of 'Attachment' element items. —ведени€ о присоединении
     * 
     * @return list
     */
    public List<AttachmentType> getAttachmentList() {
        return attachmentList;
    }

    /** 
     * Set the list of 'Attachment' element items. —ведени€ о присоединении
     * 
     * @param list
     */
    public void setAttachmentList(List<AttachmentType> list) {
        attachmentList = list;
    }
}
