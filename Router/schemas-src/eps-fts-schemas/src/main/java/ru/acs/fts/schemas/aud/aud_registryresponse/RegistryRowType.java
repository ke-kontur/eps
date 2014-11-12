
package ru.acs.fts.schemas.aud.aud_registryresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentIdWithVersionType;

/** 
 * Сведения о документах  пакета
 */
public class RegistryRowType
{
    private boolean isActualDocumentIndicator;
    private String archiveContainerDocumentId;
    private AUDArchiveDocumentIdWithVersionType archiveDocInfo;
    private AUDAppliedDocumentInfoType appliedDocInfo;

    /** 
     * Get the 'IsActualDocumentIndicator' element value. Признак: является ли документ актуальным (true) или нет (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. Признак: является ли документ актуальным (true) или нет (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

    /** 
     * Get the 'ArchiveContainerDocumentId' element value. Архивный идентификатор документа-контейнера, содержащего данный документ. Указывается в случае, если документ был передан в архив на хранение не в виде самостоятельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @return value
     */
    public String getArchiveContainerDocumentId() {
        return archiveContainerDocumentId;
    }

    /** 
     * Set the 'ArchiveContainerDocumentId' element value. Архивный идентификатор документа-контейнера, содержащего данный документ. Указывается в случае, если документ был передан в архив на хранение не в виде самостоятельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @param archiveContainerDocumentId
     */
    public void setArchiveContainerDocumentId(String archiveContainerDocumentId) {
        this.archiveContainerDocumentId = archiveContainerDocumentId;
    }

    /** 
     * Get the 'ArchiveDocInfo' element value. Архивные  идентификаторы  документа
     * 
     * @return value
     */
    public AUDArchiveDocumentIdWithVersionType getArchiveDocInfo() {
        return archiveDocInfo;
    }

    /** 
     * Set the 'ArchiveDocInfo' element value. Архивные  идентификаторы  документа
     * 
     * @param archiveDocInfo
     */
    public void setArchiveDocInfo(
            AUDArchiveDocumentIdWithVersionType archiveDocInfo) {
        this.archiveDocInfo = archiveDocInfo;
    }

    /** 
     * Get the 'AppliedDocInfo' element value. Прикладная  информация  о документе
     * 
     * @return value
     */
    public AUDAppliedDocumentInfoType getAppliedDocInfo() {
        return appliedDocInfo;
    }

    /** 
     * Set the 'AppliedDocInfo' element value. Прикладная  информация  о документе
     * 
     * @param appliedDocInfo
     */
    public void setAppliedDocInfo(AUDAppliedDocumentInfoType appliedDocInfo) {
        this.appliedDocInfo = appliedDocInfo;
    }
}
