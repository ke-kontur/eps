
package ru.acs.fts.schemas.album.foivrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Запрос (ФОИВ)
 */
public class FOIVRequestType extends BaseDocType
{
    private String ID;
    private String startDateTime;
    private String endDateTime;
    private String period;
    private String permitCode;
    private String responseStatus;
    private String responseInfo;
    private List<TransportType> transportList = new ArrayList<TransportType>();
    private DocumentBaseType document;
    private Choice choice;
    private String documentModeID;

    /** 
     * Get the 'ID' element value. Идентификатор запроса/записи
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Идентификатор запроса/записи
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'StartDateTime' element value. Дата/время начала периода поиска
     * 
     * @return value
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Set the 'StartDateTime' element value. Дата/время начала периода поиска
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Get the 'EndDateTime' element value. Дата/время окончания периода поиска
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. Дата/время окончания периода поиска
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'Period' element value. Период поиска: 1 - Весь период; 2 - Полгода; 3 - 3 месяца; 4 - 2 месяца; 5 - 1 месяц
     * 
     * @return value
     */
    public String getPeriod() {
        return period;
    }

    /** 
     * Set the 'Period' element value. Период поиска: 1 - Весь период; 2 - Полгода; 3 - 3 месяца; 4 - 2 месяца; 5 - 1 месяц
     * 
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /** 
     * Get the 'PermitCode' element value. Признак: 1 - разрешение; 2 - спецразрешение (карточка)
     * 
     * @return value
     */
    public String getPermitCode() {
        return permitCode;
    }

    /** 
     * Set the 'PermitCode' element value. Признак: 1 - разрешение; 2 - спецразрешение (карточка)
     * 
     * @param permitCode
     */
    public void setPermitCode(String permitCode) {
        this.permitCode = permitCode;
    }

    /** 
     * Get the 'ResponseStatus' element value. Признак получения ответа на запрос
     * 
     * @return value
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /** 
     * Set the 'ResponseStatus' element value. Признак получения ответа на запрос
     * 
     * @param responseStatus
     */
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    /** 
     * Get the 'ResponseInfo' element value. Текст ошибки, выявленной при обработке данных, полученных по запросу
     * 
     * @return value
     */
    public String getResponseInfo() {
        return responseInfo;
    }

    /** 
     * Set the 'ResponseInfo' element value. Текст ошибки, выявленной при обработке данных, полученных по запросу
     * 
     * @param responseInfo
     */
    public void setResponseInfo(String responseInfo) {
        this.responseInfo = responseInfo;
    }

    /** 
     * Get the list of 'Transport' element items. Сведения о транспортном средстве
     * 
     * @return list
     */
    public List<TransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. Сведения о транспортном средстве
     * 
     * @param list
     */
    public void setTransportList(List<TransportType> list) {
        transportList = list;
    }

    /** 
     * Get the 'Document' element value. Сведения о документе
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Сведения о документе
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
    /** 
     * DocChoice
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int INSPECTION_INFO_CHOICE = 0;
        private static final int CHECK_REQUEST_DATA_CHOICE = 1;
        private InspectionInfoType inspectionInfo;
        private CheckRequestDataType checkRequestData;

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
         * Check if InspectionInfo is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifInspectionInfo() {
            return choiceSelect == INSPECTION_INFO_CHOICE;
        }

        /** 
         * Get the 'InspectionInfo' element value. Запрос о необходимости предоставления дополнительных сведений и о возможности принятия решения
         * 
         * @return value
         */
        public InspectionInfoType getInspectionInfo() {
            return inspectionInfo;
        }

        /** 
         * Set the 'InspectionInfo' element value. Запрос о необходимости предоставления дополнительных сведений и о возможности принятия решения
         * 
         * @param inspectionInfo
         */
        public void setInspectionInfo(InspectionInfoType inspectionInfo) {
            setChoiceSelect(INSPECTION_INFO_CHOICE);
            this.inspectionInfo = inspectionInfo;
        }

        /** 
         * Check if CheckRequestData is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCheckRequestData() {
            return choiceSelect == CHECK_REQUEST_DATA_CHOICE;
        }

        /** 
         * Get the 'CheckRequestData' element value. Данные запроса на поиск информации о разрешении
         * 
         * @return value
         */
        public CheckRequestDataType getCheckRequestData() {
            return checkRequestData;
        }

        /** 
         * Set the 'CheckRequestData' element value. Данные запроса на поиск информации о разрешении
         * 
         * @param checkRequestData
         */
        public void setCheckRequestData(CheckRequestDataType checkRequestData) {
            setChoiceSelect(CHECK_REQUEST_DATA_CHOICE);
            this.checkRequestData = checkRequestData;
        }
    }
}
