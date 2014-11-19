
package ru.acs.fts.schemas.aud.aud_packetdoclistresponse;

import java.math.BigInteger;
import org.joda.time.DateTime;

/** 
 * Информация о документе архива
 */
public class ArchiveDocInfoType
{
    private String archiveDocID;
    private String appliedDocID;
    private String docDescription;
    private DateTime createDateTime;
    private BigInteger docVersion;

    /** 
     * Get the 'ArchiveDocID' element value. Архивный  идентификатор документа
     * 
     * @return value
     */
    public String getArchiveDocID() {
        return archiveDocID;
    }

    /** 
     * Set the 'ArchiveDocID' element value. Архивный  идентификатор документа
     * 
     * @param archiveDocID
     */
    public void setArchiveDocID(String archiveDocID) {
        this.archiveDocID = archiveDocID;
    }

    /** 
     * Get the 'AppliedDocID' element value. Прикладной идентификатор документа
     * 
     * @return value
     */
    public String getAppliedDocID() {
        return appliedDocID;
    }

    /** 
     * Set the 'AppliedDocID' element value. Прикладной идентификатор документа
     * 
     * @param appliedDocID
     */
    public void setAppliedDocID(String appliedDocID) {
        this.appliedDocID = appliedDocID;
    }

    /** 
     * Get the 'DocDescription' element value. Описаное документа
     * 
     * @return value
     */
    public String getDocDescription() {
        return docDescription;
    }

    /** 
     * Set the 'DocDescription' element value. Описаное документа
     * 
     * @param docDescription
     */
    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    /** 
     * Get the 'CreateDateTime' element value. Дата время размещения документа в архиве
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. Дата время размещения документа в архиве
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'DocVersion' element value. Номер версии документа
     * 
     * @return value
     */
    public BigInteger getDocVersion() {
        return docVersion;
    }

    /** 
     * Set the 'DocVersion' element value. Номер версии документа
     * 
     * @param docVersion
     */
    public void setDocVersion(BigInteger docVersion) {
        this.docVersion = docVersion;
    }
}
