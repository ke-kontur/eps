
package ru.acs.fts.schemas.aud.aud_registryresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentIdWithVersionType;

/** 
 * —ведени€ о документах  пакета
 */
public class RegistryRowType
{
    private boolean isActualDocumentIndicator;
    private String archiveContainerDocumentId;
    private AUDArchiveDocumentIdWithVersionType archiveDocInfo;
    private AUDAppliedDocumentInfoType appliedDocInfo;

    /** 
     * Get the 'IsActualDocumentIndicator' element value. ѕризнак: €вл€етс€ ли документ актуальным (true) или нет (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. ѕризнак: €вл€етс€ ли документ актуальным (true) или нет (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

    /** 
     * Get the 'ArchiveContainerDocumentId' element value. јрхивный идентификатор документа-контейнера, содержащего данный документ. ”казываетс€ в случае, если документ был передан в архив на хранение не в виде самосто€тельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @return value
     */
    public String getArchiveContainerDocumentId() {
        return archiveContainerDocumentId;
    }

    /** 
     * Set the 'ArchiveContainerDocumentId' element value. јрхивный идентификатор документа-контейнера, содержащего данный документ. ”казываетс€ в случае, если документ был передан в архив на хранение не в виде самосто€тельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @param archiveContainerDocumentId
     */
    public void setArchiveContainerDocumentId(String archiveContainerDocumentId) {
        this.archiveContainerDocumentId = archiveContainerDocumentId;
    }

    /** 
     * Get the 'ArchiveDocInfo' element value. јрхивные  идентификаторы  документа
     * 
     * @return value
     */
    public AUDArchiveDocumentIdWithVersionType getArchiveDocInfo() {
        return archiveDocInfo;
    }

    /** 
     * Set the 'ArchiveDocInfo' element value. јрхивные  идентификаторы  документа
     * 
     * @param archiveDocInfo
     */
    public void setArchiveDocInfo(
            AUDArchiveDocumentIdWithVersionType archiveDocInfo) {
        this.archiveDocInfo = archiveDocInfo;
    }

    /** 
     * Get the 'AppliedDocInfo' element value. ѕрикладна€  информаци€  о документе
     * 
     * @return value
     */
    public AUDAppliedDocumentInfoType getAppliedDocInfo() {
        return appliedDocInfo;
    }

    /** 
     * Set the 'AppliedDocInfo' element value. ѕрикладна€  информаци€  о документе
     * 
     * @param appliedDocInfo
     */
    public void setAppliedDocInfo(AUDAppliedDocumentInfoType appliedDocInfo) {
        this.appliedDocInfo = appliedDocInfo;
    }
}
