
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос на тестирование ПР/ППР/ЦПР/ПЦПР
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PRTestRequestType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="UserName"/>
 *         &lt;xs:element type="xs:string" name="TestName"/>
 *         &lt;xs:element type="xs:string" name="TestComment" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="CustomsCode"/>
 *         &lt;xs:element type="xs:string" name="UserSubdivisionCode" minOccurs="0"/>
 *         &lt;xs:element name="TestPeriod" maxOccurs="unbounded">
 *           &lt;!-- Reference to inner class TestPeriod -->
 *         &lt;/xs:element>
 *         &lt;xs:choice minOccurs="0">
 *           &lt;!-- Reference to inner class Choice -->
 *         &lt;/xs:choice>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="R102000E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PRTestRequestType extends BaseDocType
{
    private String userName;
    private String testName;
    private String testComment;
    private String customsCode;
    private String userSubdivisionCode;
    private List<TestPeriod> testPeriodList = new ArrayList<TestPeriod>();
    private Choice choice;
    private String documentModeID;

    /** 
     * Get the 'UserName' element value. Имя пользователя, отправившего запрос на тестирование из КПС «Ведение БДПР»
     * 
     * @return value
     */
    public String getUserName() {
        return userName;
    }

    /** 
     * Set the 'UserName' element value. Имя пользователя, отправившего запрос на тестирование из КПС «Ведение БДПР»
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * Get the 'TestName' element value. Уникальный идентификатор теста, задаваемый пользователем
     * 
     * @return value
     */
    public String getTestName() {
        return testName;
    }

    /** 
     * Set the 'TestName' element value. Уникальный идентификатор теста, задаваемый пользователем
     * 
     * @param testName
     */
    public void setTestName(String testName) {
        this.testName = testName;
    }

    /** 
     * Get the 'TestComment' element value. Комментарий к тесту, задаваемый пользователем
     * 
     * @return value
     */
    public String getTestComment() {
        return testComment;
    }

    /** 
     * Set the 'TestComment' element value. Комментарий к тесту, задаваемый пользователем
     * 
     * @param testComment
     */
    public void setTestComment(String testComment) {
        this.testComment = testComment;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'UserSubdivisionCode' element value. Код структурного подразделения пользователя, отправившего запрос на тестирование из КПС Ведение БДПР
     * 
     * @return value
     */
    public String getUserSubdivisionCode() {
        return userSubdivisionCode;
    }

    /** 
     * Set the 'UserSubdivisionCode' element value. Код структурного подразделения пользователя, отправившего запрос на тестирование из КПС Ведение БДПР
     * 
     * @param userSubdivisionCode
     */
    public void setUserSubdivisionCode(String userSubdivisionCode) {
        this.userSubdivisionCode = userSubdivisionCode;
    }

    /** 
     * Get the list of 'TestPeriod' element items.
     * 
     * @return list
     */
    public List<TestPeriod> getTestPeriodList() {
        return testPeriodList;
    }

    /** 
     * Set the list of 'TestPeriod' element items.
     * 
     * @param list
     */
    public void setTestPeriodList(List<TestPeriod> list) {
        testPeriodList = list;
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
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
    /** 
     * Периоды тестирования
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TestPeriod" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:date" name="TestStart"/>
     *       &lt;xs:element type="xs:date" name="TestEnd"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TestPeriod
    {
        private LocalDate testStart;
        private LocalDate testEnd;

        /** 
         * Get the 'TestStart' element value. Дата начала периода тестирования, соответствует дате регистрации ДТ
         * 
         * @return value
         */
        public LocalDate getTestStart() {
            return testStart;
        }

        /** 
         * Set the 'TestStart' element value. Дата начала периода тестирования, соответствует дате регистрации ДТ
         * 
         * @param testStart
         */
        public void setTestStart(LocalDate testStart) {
            this.testStart = testStart;
        }

        /** 
         * Get the 'TestEnd' element value. Дата окончания периода тестирования, соответствует дате регистрации ДТ
         * 
         * @return value
         */
        public LocalDate getTestEnd() {
            return testEnd;
        }

        /** 
         * Set the 'TestEnd' element value. Дата окончания периода тестирования, соответствует дате регистрации ДТ
         * 
         * @param testEnd
         */
        public void setTestEnd(LocalDate testEnd) {
            this.testEnd = testEnd;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element type="ns:GTDIDType" name="DTNumber"/>
     *   &lt;xs:element type="ns1:ServiceInfoType" name="ServiceInfo"/>
     *   &lt;xs:element type="ns1:TIRIDType" name="TIRID"/>
     *   &lt;xs:element type="ns1:TDTSType" name="TDTS"/>
     *   &lt;xs:element type="ns1:MPOType" name="MPO"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int DT_NUMBER_CHOICE = 0;
        private static final int SERVICE_INFO_CHOICE = 1;
        private static final int TIRID_CHOICE = 2;
        private static final int TDTS_CHOICE = 3;
        private static final int MPO_CHOICE = 4;
        private GTDIDType DTNumber;
        private ServiceInfoType serviceInfo;
        private TIRIDType TIRID;
        private TDTSType TDTS;
        private MPOType MPO;

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
         * Check if DTNumber is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDTNumber() {
            return choiceSelect == DT_NUMBER_CHOICE;
        }

        /** 
         * Get the 'DTNumber' element value. Регистрационный номер ДТ/ТД/ПП/документа ВХ/реестра экспресс-грузов, по которой необходимо провести тестирование. Заполняется только при запросе детальной информации по тестированию конкретного документа
         * 
         * @return value
         */
        public GTDIDType getDTNumber() {
            return DTNumber;
        }

        /** 
         * Set the 'DTNumber' element value. Регистрационный номер ДТ/ТД/ПП/документа ВХ/реестра экспресс-грузов, по которой необходимо провести тестирование. Заполняется только при запросе детальной информации по тестированию конкретного документа
         * 
         * @param DTNumber
         */
        public void setDTNumber(GTDIDType DTNumber) {
            setChoiceSelect(DT_NUMBER_CHOICE);
            this.DTNumber = DTNumber;
        }

        /** 
         * Check if ServiceInfo is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifServiceInfo() {
            return choiceSelect == SERVICE_INFO_CHOICE;
        }

        /** 
         * Get the 'ServiceInfo' element value. Служебная информация по ПИ
         * 
         * @return value
         */
        public ServiceInfoType getServiceInfo() {
            return serviceInfo;
        }

        /** 
         * Set the 'ServiceInfo' element value. Служебная информация по ПИ
         * 
         * @param serviceInfo
         */
        public void setServiceInfo(ServiceInfoType serviceInfo) {
            setChoiceSelect(SERVICE_INFO_CHOICE);
            this.serviceInfo = serviceInfo;
        }

        /** 
         * Check if TIRID is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTIRID() {
            return choiceSelect == TIRID_CHOICE;
        }

        /** 
         * Get the 'TIRID' element value. Номер книжки МДП. Если нетрег. номера ТД для транзита
         * 
         * @return value
         */
        public TIRIDType getTIRID() {
            return TIRID;
        }

        /** 
         * Set the 'TIRID' element value. Номер книжки МДП. Если нетрег. номера ТД для транзита
         * 
         * @param TIRID
         */
        public void setTIRID(TIRIDType TIRID) {
            setChoiceSelect(TIRID_CHOICE);
            this.TIRID = TIRID;
        }

        /** 
         * Check if TDTS is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTDTS() {
            return choiceSelect == TDTS_CHOICE;
        }

        /** 
         * Get the 'TDTS' element value.
         * 
         * @return value
         */
        public TDTSType getTDTS() {
            return TDTS;
        }

        /** 
         * Set the 'TDTS' element value.
         * 
         * @param TDTS
         */
        public void setTDTS(TDTSType TDTS) {
            setChoiceSelect(TDTS_CHOICE);
            this.TDTS = TDTS;
        }

        /** 
         * Check if MPO is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifMPO() {
            return choiceSelect == MPO_CHOICE;
        }

        /** 
         * Get the 'MPO' element value.
         * 
         * @return value
         */
        public MPOType getMPO() {
            return MPO;
        }

        /** 
         * Set the 'MPO' element value.
         * 
         * @param MPO
         */
        public void setMPO(MPOType MPO) {
            setChoiceSelect(MPO_CHOICE);
            this.MPO = MPO;
        }
    }
}
