
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

public class AUDDocumentInfoWithPacketSyncType
        extends
            AUDDocumentInfoWithPacketType
{
    private String documenVersionChaintId;
    private List<AUDEmbeddedDocumentArchiveInfoSyncType> embeddedDocumentArchiveInfoSyncList = new ArrayList<AUDEmbeddedDocumentArchiveInfoSyncType>();

    /** 
     * Get the 'DocumenVersionChaintId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @return value
     */
    public String getDocumenVersionChaintId() {
        return documenVersionChaintId;
    }

    /** 
     * Set the 'DocumenVersionChaintId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @param documenVersionChaintId
     */
    public void setDocumenVersionChaintId(String documenVersionChaintId) {
        this.documenVersionChaintId = documenVersionChaintId;
    }

    /** 
     * Get the list of 'EmbeddedDocumentArchiveInfoSync' element items. Информация о прикладном документе, вложенном в передаваемый на хранение документ-контейнер. Указывается обязательно в том и только в том случае, если передаваемый на хранение в архив документ представляет собой документ-контейнер ('ED_Container'). Указывается для каждого документа, вложенного в документ-контейнер.
     * 
     * @return list
     */
    public List<AUDEmbeddedDocumentArchiveInfoSyncType> getEmbeddedDocumentArchiveInfoSyncList() {
        return embeddedDocumentArchiveInfoSyncList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentArchiveInfoSync' element items. Информация о прикладном документе, вложенном в передаваемый на хранение документ-контейнер. Указывается обязательно в том и только в том случае, если передаваемый на хранение в архив документ представляет собой документ-контейнер ('ED_Container'). Указывается для каждого документа, вложенного в документ-контейнер.
     * 
     * @param list
     */
    public void setEmbeddedDocumentArchiveInfoSyncList(
            List<AUDEmbeddedDocumentArchiveInfoSyncType> list) {
        embeddedDocumentArchiveInfoSyncList = list;
    }
}
