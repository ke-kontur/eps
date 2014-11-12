
package ru.acs.fts.schemas.aud.aud_putdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentWithBodyType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Запрос на размещение документов на хранение.
 */
public class AUDPutDocumentRequestType extends AUDBaseEnvelopeType
{
    private String prevVersionArchiveDocumentId;
    private String refArchivePacketId;
    private String customsCode;
    private String refExtArchivePacketId;
    private String refExtArchiveDocumentId;
    private AUDAppliedDocumentWithBodyType appliedDocumentWithBody;
    private AUDAppliedPacketInfoType appliedPacketInfo;
    private List<AUDAppliedDocumentInfoWithVersionRefType> embeddedDocumentAppliedInfoList = new ArrayList<AUDAppliedDocumentInfoWithVersionRefType>();
    private String documentModeID;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если размещаемый на хранение документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если размещаемый на хранение документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }

    /** 
     * Get the 'RefArchivePacketId' element value. Архивный идентификатор пакета документов. Указывается в случае, если требуется выполнить изменение уже существующего в архиве пакета (изменение его атрибутов или состава), а не создать в архиве новый пакет документов.
     * 
     * @return value
     */
    public String getRefArchivePacketId() {
        return refArchivePacketId;
    }

    /** 
     * Set the 'RefArchivePacketId' element value. Архивный идентификатор пакета документов. Указывается в случае, если требуется выполнить изменение уже существующего в архиве пакета (изменение его атрибутов или состава), а не создать в архиве новый пакет документов.
     * 
     * @param refArchivePacketId
     */
    public void setRefArchivePacketId(String refArchivePacketId) {
        this.refArchivePacketId = refArchivePacketId;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, к которому относится документ. Указывается в случае, если источником запроса является клиент архива типа "Оператор архива" и требуется, чтобы размещаемый на хранение документ относился к определенному таможенному органу.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, к которому относится документ. Указывается в случае, если источником запроса является клиент архива типа "Оператор архива" и требуется, чтобы размещаемый на хранение документ относился к определенному таможенному органу.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RefExtArchivePacketId' element value. Ссылочный архивный идентификатор пакета документов. Указывается в случае, если документ ранее был размещен в другом пакете  документов
     * 
     * @return value
     */
    public String getRefExtArchivePacketId() {
        return refExtArchivePacketId;
    }

    /** 
     * Set the 'RefExtArchivePacketId' element value. Ссылочный архивный идентификатор пакета документов. Указывается в случае, если документ ранее был размещен в другом пакете  документов
     * 
     * @param refExtArchivePacketId
     */
    public void setRefExtArchivePacketId(String refExtArchivePacketId) {
        this.refExtArchivePacketId = refExtArchivePacketId;
    }

    /** 
     * Get the 'RefExtArchiveDocumentId' element value. Ссылочный архивный идентификатор документа. Указывается в случае, если документ ранее был размещен в другом пакете  документов
     * 
     * @return value
     */
    public String getRefExtArchiveDocumentId() {
        return refExtArchiveDocumentId;
    }

    /** 
     * Set the 'RefExtArchiveDocumentId' element value. Ссылочный архивный идентификатор документа. Указывается в случае, если документ ранее был размещен в другом пакете  документов
     * 
     * @param refExtArchiveDocumentId
     */
    public void setRefExtArchiveDocumentId(String refExtArchiveDocumentId) {
        this.refExtArchiveDocumentId = refExtArchiveDocumentId;
    }

    /** 
     * Get the 'AppliedDocumentWithBody' element value. Передаваемый на хранение прикладной документ: информация о документе и тело документа.
     * 
     * @return value
     */
    public AUDAppliedDocumentWithBodyType getAppliedDocumentWithBody() {
        return appliedDocumentWithBody;
    }

    /** 
     * Set the 'AppliedDocumentWithBody' element value. Передаваемый на хранение прикладной документ: информация о документе и тело документа.
     * 
     * @param appliedDocumentWithBody
     */
    public void setAppliedDocumentWithBody(
            AUDAppliedDocumentWithBodyType appliedDocumentWithBody) {
        this.appliedDocumentWithBody = appliedDocumentWithBody;
    }

    /** 
     * Get the 'AppliedPacketInfo' element value. Информация прикладной системы о пакете документов.
     * 
     * @return value
     */
    public AUDAppliedPacketInfoType getAppliedPacketInfo() {
        return appliedPacketInfo;
    }

    /** 
     * Set the 'AppliedPacketInfo' element value. Информация прикладной системы о пакете документов.
     * 
     * @param appliedPacketInfo
     */
    public void setAppliedPacketInfo(AUDAppliedPacketInfoType appliedPacketInfo) {
        this.appliedPacketInfo = appliedPacketInfo;
    }

    /** 
     * Get the list of 'EmbeddedDocumentAppliedInfo' element items. Информация о прикладном документе, вложенном в передаваемый на хранение документ-контейнер. Указывается обязательно в том и только в том случае, если передаваемый на хранение в архив документ представляет собой документ-контейнер ('ED_Container'). Указывается для каждого документа, вложенного в документ-контейнер.
     * 
     * @return list
     */
    public List<AUDAppliedDocumentInfoWithVersionRefType> getEmbeddedDocumentAppliedInfoList() {
        return embeddedDocumentAppliedInfoList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentAppliedInfo' element items. Информация о прикладном документе, вложенном в передаваемый на хранение документ-контейнер. Указывается обязательно в том и только в том случае, если передаваемый на хранение в архив документ представляет собой документ-контейнер ('ED_Container'). Указывается для каждого документа, вложенного в документ-контейнер.
     * 
     * @param list
     */
    public void setEmbeddedDocumentAppliedInfoList(
            List<AUDAppliedDocumentInfoWithVersionRefType> list) {
        embeddedDocumentAppliedInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
